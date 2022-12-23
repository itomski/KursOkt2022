package de.lubowiecki.patterns.adapter;

public class Tweet {
	
	private String author;
	private String group;
	private String body;
	
	public Tweet(String author, String group, String body) {
		super();
		this.author = author;
		this.group = group;
		this.body = body;
	}

	public void submit() {
		System.out.println("--- SEND TWEET ---");
		System.out.println("--- AUTHOR: " + author);
		System.out.println("--- group: " + group);
		System.out.println("--- BODY: " + body);
		System.out.println();
	}

	public String getAuthor() {
		return author;
	}

	public String getGroup() {
		return group;
	}

	public String getBody() {
		return body;
	}
}
