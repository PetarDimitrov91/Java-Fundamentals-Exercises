package com.fundamenals;

import java.util.Arrays;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int[] numbers = Arrays.stream(console.nextLine().split("\\s+"))
				.mapToInt(Integer::parseInt)
				.filter(n -> n >0)
				.toArray();


		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
//if (!studentsGrades.containsKey(studentName)) {
//				studentsGrades.put(studentName, studentGrade);
//				studentSubmits.put(studentName, 1);
//			} else {
//				studentsGrades.put(studentName, studentsGrades.get(studentName) + studentGrade);
//				studentSubmits.put(studentName, studentSubmits.get(studentName) + 1);
//			}