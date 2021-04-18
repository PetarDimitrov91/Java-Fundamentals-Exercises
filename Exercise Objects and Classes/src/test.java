import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		byte students = Byte.parseByte(console.nextLine());
		byte countOfLectures = Byte.parseByte(console.nextLine());
		byte initialBonus = Byte.parseByte(console.nextLine());

		int besStudentAttendance = Integer.MIN_VALUE;
		double maxBonus = Integer.MIN_VALUE;

		if(students == 0 || countOfLectures == 0)
		{
			System.out.println("Max Bonus: 0.");
			System.out.println("The student has attended 0 lectures.");
			return;
		}
		for (int i = 1; i <= students; i++) {
			int attendance = Integer.parseInt(console.nextLine());
			double bonus = (double) attendance / countOfLectures * (5 + initialBonus);
			if (bonus > maxBonus) {
				maxBonus = bonus;
				besStudentAttendance = attendance;
			}
		}
		System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
		System.out.printf("The student has attended %d lectures.", besStudentAttendance);
	}
}


