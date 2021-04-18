package Exam2;

import java.util.Scanner;

public class PasswordReset {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		StringBuilder password = new StringBuilder(console.nextLine());
		String input = console.nextLine();
		while (!input.equals("Done")) {
			String[] inputData = input.split("\\s+");
			String command = inputData[0];
			switch (command){
				case "TakeOdd":
					StringBuilder newPassword = new StringBuilder();
					for (int i = 0; i < password.length() ; i++) {
						char currentCharacter = password.charAt(i);
						if(i % 2 != 0){
							newPassword.append(currentCharacter);
						}
					}
						password.setLength(0);
						password.append(newPassword);
					System.out.println(password);
					break;
				case "Cut":
					int index = Integer.parseInt(inputData[1]);
					int length = Integer.parseInt(inputData[2]);
					password.replace(index,index+length,"");
					System.out.println(password);
					break;
				case "Substitute":
					String substring = inputData[1];
					String substitute = inputData[2];
					if(password.toString().contains(substring)){
						String s = password.toString().replaceAll(substring, substitute);
						password.setLength(0);
						password.append(s);
						System.out.println(password);
					}else {
						System.out.println("Nothing to replace!");
					}
					break;
			}
			input = console.nextLine();
		}
		System.out.println("Your password is: " + password);

	}
}
