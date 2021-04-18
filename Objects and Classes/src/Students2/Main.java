package Students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		List<Student2> students = new ArrayList<>();
		String input = console.nextLine();
		while (!input.equals("end")) {
			String[] studentData = input.split("\\s+");
			String firstName = studentData[0];
			String secondName = studentData[1];
			int age = Integer.parseInt(studentData[2]);
			String city = studentData[3];

			if (IsStudentExisting(students, firstName, secondName)) {
				Student2 student = getStudent(students,firstName,secondName);
				student.setFirstName(firstName);
				student.setLastName(secondName);
				student.setAge(age);
				student.setCity(city);

			} else {
				Student2 student = new Student2(firstName, secondName, age, city);
				students.add(student);
			}


			input = console.nextLine();
		}
		String filterCity = console.nextLine();
		for (Student2 student : students) {
			if (student.getHometown().equals(filterCity)) {
				System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
			}

		}
	}

	private static Student2 getStudent(List<Student2> students, String firstName, String secondName) {
		Student2 existingStudent = null;
		for (Student2 student : students) {
			if(student.getFirstName().equals(firstName) && student.getLastName().equals(secondName))
				existingStudent = student;
		}
		return existingStudent;
	}

	private static boolean IsStudentExisting(List<Student2> students, String firstName, String secondName) {
		for (Student2 student : students) {
			if (student.getFirstName().equals(firstName) && student.getLastName().equals(secondName)) {
				return true;
			}
		}
		return false;
	}
}

