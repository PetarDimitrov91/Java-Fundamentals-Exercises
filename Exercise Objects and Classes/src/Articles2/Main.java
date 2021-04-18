package Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int n = Integer.parseInt(console.nextLine());
		List<Article> listOfArticles = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			String[] article = console.nextLine().split(", ");
			String title = article[0];
			String content = article[1];
			String author = article[2];
			Article articles = new Article(title, content, author);
			listOfArticles.add(articles);
		}
		String command = console.nextLine();
		switch (command) {
			case "title":
				listOfArticles.sort(Comparator.comparing(Article::getTitle));
				break;
			case "content":
				listOfArticles.sort(Comparator.comparing(Article::getContent));
				break;
			case "author":
				listOfArticles.sort(Comparator.comparing(Article::getAuthor));
				break;
		}
		print(listOfArticles);
	}

	private static void print(List<Article> listOfArticles) {
		for (Article listOfArticle : listOfArticles) {
			System.out.println(listOfArticle);
		}
	}
}