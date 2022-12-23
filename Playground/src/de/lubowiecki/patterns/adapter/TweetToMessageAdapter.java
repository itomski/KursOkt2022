package de.lubowiecki.patterns.adapter;

public class TweetToMessageAdapter implements Message {

	private Tweet tweet;
	
	public TweetToMessageAdapter(Tweet tweet) {
		this.tweet = tweet;
	}

	@Override
	public void compute() {
		System.out.println("--- SEND MESSAGE ---");
		System.out.println("--- FROM: " + tweet.getAuthor());
		System.out.println("--- TO: " + tweet.getGroup());
		System.out.println("--- BODY: " + tweet.getBody());
		System.out.println();
		
		//tweet.submit();
	}
}
