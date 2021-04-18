package Exam2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogic {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int n = Integer.parseInt(console.nextLine());
		Map<String, Integer> heroesHealth = new TreeMap<>();
		Map<String, Integer> heroesMana = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			String[] heroes = console.nextLine().split("\\s+");
			String heroName = heroes[0];
			int heroHealth = Integer.parseInt(heroes[1]);
			int heroMana = Integer.parseInt(heroes[2]);
			heroesHealth.put(heroName, heroHealth);
			heroesMana.put(heroName, heroMana);
		}
		String command = console.nextLine();
		while (!command.equals("End")) {
			String[] commandData = command.split(" - ");
			String commandType = commandData[0];
			String heroName = commandData[1];
			switch (commandType) {
				case "CastSpell":
					int neededMana = Integer.parseInt(commandData[2]);
					String spellName = commandData[3];
					int currentMana = heroesMana.get(heroName);
					if (neededMana <= currentMana) {
						currentMana -= neededMana;
						heroesMana.put(heroName, currentMana);
						System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentMana);
					} else {
						System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
					}
					break;
				case "TakeDamage":
					int damage = Integer.parseInt(commandData[2]);
					String attacker = commandData[3];
					int currentHealth = heroesHealth.get(heroName) - damage;
					if (currentHealth > 0) {
						heroesHealth.put(heroName, currentHealth);
						System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHealth);
					} else {
						heroesHealth.remove(heroName);
						System.out.printf("%s has been killed by %s!%n", heroName, attacker);
					}
					break;
				case "Recharge":
					int amountMana = Integer.parseInt(commandData[2]);
					currentMana = heroesMana.get(heroName);
					int newMana = currentMana + amountMana;
					if (newMana > 200) {
						int rechargedFor = 200 - currentMana;
						newMana = 200;
						heroesMana.put(heroName, newMana);
						System.out.printf("%s recharged for %d MP!%n", heroName, rechargedFor);
					} else {
						heroesMana.put(heroName, newMana);
						System.out.printf("%s recharged for %d MP!%n", heroName, amountMana);
					}
					break;
				case "Heal":
					int amountHealth = Integer.parseInt(commandData[2]);
					currentHealth = heroesHealth.get(heroName);
					int newHealth = currentHealth + amountHealth;
					if (newHealth > 100) {
						int healedFor = 100 - currentHealth;
						newHealth = 100;
						heroesHealth.put(heroName, newHealth);
						System.out.printf("%s healed for %d HP!%n", heroName, healedFor);
					} else {
						heroesHealth.put(heroName, newHealth);
						System.out.printf("%s healed for %d HP!%n", heroName, amountHealth);
					}
					break;
			}
			command = console.nextLine();
		}
		Map<String, Integer> newHealth = new LinkedHashMap<>();

		heroesHealth.entrySet()
				.stream()
				.sorted((e1, e2) -> {
					int res = e2.getValue().compareTo(e1.getValue());
					if (res == 0) {
						res = e1.getKey().compareTo(e2.getKey());
					}
					return res;
				})
				.forEach(e-> newHealth.put(e.getKey(), e.getValue()));

		for (Map.Entry<String, Integer> stringIntegerEntry : newHealth.entrySet()) {
			System.out.println(stringIntegerEntry.getKey());
			System.out.println("  HP: " + stringIntegerEntry.getValue());
			System.out.println("  MP: " + heroesMana.get(stringIntegerEntry.getKey()));
		}

	}
}
