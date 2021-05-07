

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int n = Integer.parseInt(console.nextLine());
		String regex = "(!)(?<name>[A-Z][a-z]{2,})\\1:\\[(?<message>[A-Za-z]{8,})\\]";
		Pattern pattern = Pattern.compile(regex);
		for (int i = 0; i <n ; i++) {
			String input = console.nextLine();
			Matcher matcher = pattern.matcher(input);
			if(matcher.find()){
				String message = matcher.group("message");
				System.out.print(matcher.group("name").replace("!","") +": ");
				for (int j = 0; j < message.length() ; j++) {
					int code = message.charAt(j);
					if (j == message.length()-1){
						System.out.print(code);
						System.out.println();
					}else {
					System.out.print(code + " ");
					}
				}
			}else {
				System.out.println("The message is invalid");
			}
		}
	}
}
