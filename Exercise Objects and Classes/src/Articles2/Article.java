package Articles2;

public class Article {
	private String title;
	private String content;
	private String author;

	public Article(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@Override

	public String toString() {
		return String.format("%s - %s: %s", title, content, author);
	}
}

