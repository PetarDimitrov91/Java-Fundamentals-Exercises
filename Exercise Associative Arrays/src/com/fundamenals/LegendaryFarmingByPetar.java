package com.fundamenals;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarmingByPetar {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Map<String, Integer> legendaryMaterials = new TreeMap<>();
		legendaryMaterials.put("shards", 0);
		legendaryMaterials.put("fragments", 0);
		legendaryMaterials.put("motes", 0);
		Map<String, Integer> junkMaterials = new TreeMap<>();
		int shadowmourneMaterials = 0;
		int valanyrMaterials = 0;
		int dragonwrathMaterials = 0;
		out:
		while (shadowmourneMaterials < 250 && valanyrMaterials < 250 && dragonwrathMaterials < 250) {
			String input = console.nextLine().toLowerCase();
			int materialQuantity = 0;
			String material = "";
			List<String> materials = Arrays.stream(input.split("\\s+"))
					.collect(Collectors.toList());
			for (int i = 0; i < materials.size(); i++) {
				if (i % 2 == 0) {
					materialQuantity = Integer.parseInt(materials.get(i));
					material = materials.get(i + 1);
					switch (material) {
						case "shards":
							shadowmourneMaterials += materialQuantity;
							putInMap(material, materialQuantity, legendaryMaterials);
							if (legendaryMaterialIsObtained(shadowmourneMaterials)) {
								System.out.println("Schadowmourne obtained1");
								newMaterialQuantity(material, legendaryMaterials);
								break out;
							}
							break;
						case "fragments":
							valanyrMaterials += materialQuantity;
							putInMap(material, materialQuantity, legendaryMaterials);
							if (legendaryMaterialIsObtained(valanyrMaterials)) {
								System.out.println("Valanyr obtained!");
								newMaterialQuantity(material, legendaryMaterials);
								break out;
							}
							break;
						case "motes":
							dragonwrathMaterials += materialQuantity;
							putInMap(material, materialQuantity, legendaryMaterials);
							if (legendaryMaterialIsObtained(dragonwrathMaterials)) {
								System.out.println("Dragonwrath obtained!");
								newMaterialQuantity(material, legendaryMaterials);
								break out;
							}
							break;
						default:
							putInMap(material, materialQuantity, junkMaterials);
							break;
					}
				}
			}
		}
		legendaryMaterials.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
						.thenComparing(Map.Entry.comparingByKey()))
				.forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));

		junkMaterials.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByKey())
				.forEach(result -> System.out.printf("%s: %d%n", result.getKey(), result.getValue()));
	}

	private static void putInMap(String material, int materialQuantity, Map<String, Integer> materials) {
		if (!materials.containsKey(material)) {
			materials.put(material, materialQuantity);
		} else {
			materials.put(material, materials.get(material) + materialQuantity);
		}
	}

	private static boolean legendaryMaterialIsObtained(int materials) {
		return materials >= 250;
	}

	private static void newMaterialQuantity(String material, Map<String, Integer> legendaryMaterials) {
		int newQuantity = legendaryMaterials.get(material);
		legendaryMaterials.put(material, newQuantity - 250);
	}
}

