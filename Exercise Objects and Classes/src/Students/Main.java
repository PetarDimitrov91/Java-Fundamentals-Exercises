package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int countOfStudents = Integer.parseInt(console.nextLine());
		List<Student> listOfStudents = new ArrayList<>();

		for (int i = 1; i <= countOfStudents; i++) {
			String[] studentInfo = console.nextLine().split("\\s+");
			String firstName = studentInfo[0];
			String secondName = studentInfo[1];
			double grade = Double.parseDouble(studentInfo[2]);
			Student student = new Student(firstName, secondName, grade);
			listOfStudents.add(student);
		}
		listOfStudents.sort(Comparator.comparing(Student::getGrade).reversed());

		for (Student listOfStudent : listOfStudents) {
			System.out.println(listOfStudent);
		}
	}
}
