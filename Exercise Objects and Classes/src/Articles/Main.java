package Articles;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String[] article = console.nextLine().split(", ");
		String title = article[0];
		String content = article[1];
		String author = article[2];
		Article articlesList = new Article(title, content, author);

		int n = Integer.parseInt(console.nextLine());
		for (int i = 1; i <= n; i++) {
			String[] command = console.nextLine().split(": ");

			switch (command[0]) {
				case "Edit":
					articlesList.setContent(command[1]);
					break;
				case "ChangeAuthor":
					articlesList.setAuthor(command[1]);
					break;
				case "Rename":
					articlesList.setTitle(command[1]);
					break;
			}

		}

		System.out.println(articlesList);

	}
}
