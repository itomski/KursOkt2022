package de.lubowiecki.patterns.adapter;

public class EMail implements Message {

	private String from;
	private String to;
	private String body;
	
	public EMail(String from, String to, String body) {
		this.from = from;
		this.to = to;
		this.body = body;
	}

	@Override
	public void compute() {
		System.out.println("--- SEND E-MAIL ---");
		System.out.println("--- FROM: " + from);
		System.out.println("--- TO: " + to);
		System.out.println("--- BODY: " + body);
		System.out.println();
	}
}
