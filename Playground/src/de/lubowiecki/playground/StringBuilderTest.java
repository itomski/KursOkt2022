package de.lubowiecki.playground;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		final String breakLn = "\n";
		
		//StringBuilder sb = new StringBuilder(); // Capacity: 16
		//StringBuilder sb = new StringBuilder(1000);  // Capacity: 1000
		StringBuilder sb = new StringBuilder("AB"); // Capacity: 18 (Anzahl der Zeichen + 16)
		System.out.println(sb.capacity()); // Größe des internen byte-Arrays
		System.out.println(sb.length());
		
		System.out.println();
		
		sb.append("A");
		//sb.append(breakLn);
		sb.append("B");
		//sb.append(breakLn);
		sb.append("C");
		sb.append("D").append("E").append("F");
		sb.insert(0, "XYZ");
		sb.replace(5, 7, "<<<");
		sb.delete(0, 3);
		sb.append("#########");
		sb.append("@@"); // muss vergrößert werden. Neu = Alt * 2 + 2
		
		System.out.println();
		
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		System.out.println(sb);
		
//		"Hi".concat("...").toLowerCase().trim().contains("H");
//		int count = "Das ist das Haus von Nikigraus".split(" ").length;
		
		System.out.println();
		
		sb = new StringBuilder(0);
		sb.append("A");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		

	}

}
