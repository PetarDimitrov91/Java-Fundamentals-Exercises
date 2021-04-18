package Strudents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Student> students = new ArrayList<>();
		String input = console.nextLine();
		while (!input.equals("end")) {
			String[] studentData = input.split("\\s+");
			String firstName = studentData[0];
			String secondName = studentData[1];
			int age = Integer.parseInt(studentData[2]);
			String city = studentData[3];

			Student student = new Student(firstName, secondName, age, city);
			students.add(student);

			input = console.nextLine();
		}
		String filterCity = console.nextLine();
		for (Student student : students) {
			if (student.getHometown().equals(filterCity)) {
				System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
			}

		}
	}
}
