package com.fundamenals;

import java.util.*;

public class StudentAcademy {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numberOfSubmits = Integer.parseInt(console.nextLine());
		Map<String, List<Double>> studentsGrades = new HashMap<>();
		for (int i = 1; i <= numberOfSubmits; i++) {
			String studentName = console.nextLine();
			double studentGrade = Double.parseDouble(console.nextLine());
			studentsGrades.putIfAbsent(studentName, new ArrayList<>());
			studentsGrades.get(studentName).add(studentGrade);
		}
		Map<String, Double> finalGrades = new TreeMap<>();
		for (Map.Entry<String, List<Double>> stringListEntry : studentsGrades.entrySet()) {
			List<Double> grades = stringListEntry.getValue();
			double average = grades.stream()
					.mapToDouble(a -> a)
					.average()
					.orElse(0.0);
			if (average >= 4.50) {
				finalGrades.put(stringListEntry.getKey(), average);
			}
		}

		finalGrades.entrySet().stream()
				.sorted(Map.Entry.<String,Double>comparingByValue().reversed())
				//.sorted((e1,e2)-> e2.getKey().compareTo(e1.getKey()))
				.forEach(e -> System.out.printf("%s -> %.2f%n",e.getKey(), e.getValue()));
	}
}
