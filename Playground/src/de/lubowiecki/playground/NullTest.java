package de.lubowiecki.playground;

public class NullTest {

	public static void main(String[] args) {
		
		String s = null;
		
		if(s != null && s.length() > 0) {
			System.out.println(s);
		}
		
		Kompass k = Kompass.NORD;
		
		System.out.println();
		
		Printer p1 = new Printer();
		Printer p2 = new Printer();
		
		p1.setContent("Speisekarte");
		p1.setPages(10);
		
		p2.setContent("Handbuch: Kochen ohne Fett");
		p1.setPages(20);
		
		System.out.println(p1.getContent());
		System.out.println(p2.getContent());
		
		System.out.println();
		
		System.out.println(p1.getPages());
		System.out.println(p2.getPages());
		
		System.out.println();
		
		System.out.println("ABC" + 123 + "XYZ" + Kompass.SUED);
		
		StringBuilder sb = new StringBuilder();
		sb.append(false);
		sb.append(123); // Mehoden sind überladen
		sb.append("Moin");
		System.out.println(sb);
		
	}
	
	public static int machWas(String text) {
		
		if(text.length() > 2) {
			return 1;
		}
		
		return -1;
		// System.out.println("..."); // Kompilererror
	}
	
	public static void machWas(int num) {
		
		if(num > 10) {
			System.out.println("Zu groß");
			return;
		}
		
		System.out.println("Passend");
		return;
	}
}

class Printer {
	
	private static int pages;
	
	private String content;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		Printer.pages = pages;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

enum Kompass {
	OST, SUED, WEST, NORD;
}
