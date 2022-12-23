package de.lubowiecki.patterns.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		
		Server server = new Server();
		server.receive(new EMail("p.parker@shield.org", "t.stark@shield.org", "Hulk ist grün!"));
		
		//server.receive(new Tweet("pparker", "#kochenohnefett", "Das ist das neue Rezept für einen Chia-Salat"));
		
		Tweet tweet = new Tweet("pparker", "#kochenohnefett", "Das ist das neue Rezept für einen Chia-Salat");
		server.receive(new TweetToMessageAdapter(tweet));
	}
}
