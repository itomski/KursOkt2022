package de.lubowiecki.scouts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ScoutApp {
	
	public static void main(String[] args) {
		
		Scout s1 = new Scout();
		s1.setFirstName("Peter");
		s1.setLastName("Parker");
		s1.setBirthDate(LocalDate.of(1998, 5, 15));
		s1.setHeight(182);
		
		Scout s2 = new Scout("Carol", "Danvers", LocalDate.of(2000, 7, 2), 176);
		
		Scout s3 = new Scout("Bruce", "Banner", LocalDate.of(1982, 12, 1), 200);
		
		Scout s4 = new Scout("Natasha", "Romanov", LocalDate.of(1998, 1, 2), 175);
		
		/*
		// [s1][s2][s3][s4]
		System.out.println(s1.compareTo(s2)); // 1
		// [s1][s2][s3][s4]
		System.out.println(s2.compareTo(s3)); // -1
		// [s1][s3][s2][s4]
		System.out.println(s2.compareTo(s4)); // -1
		// [s1][s3][s4][s2]
		System.out.println(s1.compareTo(s3)); // -1
		// [s3][s1][s4][s2]
		System.out.println(s1.compareTo(s4)); // -1
		// [s3][s4][s1][s2]
		System.out.println(s1.compareTo(s2)); // 1
		// [s3][s4][s1][s2]
		System.out.println(s3.compareTo(s4)); // 1
		// [s3][s4][s1][s2]
		System.out.println(s4.compareTo(s1)); // 1
		*/
		
//		Scout[] scoutsArr = {s1, s2, s3, s4};
//		
//		Arrays.sort(scoutsArr);
//		
//		for(Scout s : scoutsArr) {
//			System.out.println(s.getBirthDate());
//		}
		
		List<Scout> scoutsList = new ArrayList<>();
		scoutsList.add(s1);
		scoutsList.add(s2);
		scoutsList.add(s3);
		scoutsList.add(s4);
		
		Collections.sort(scoutsList);
		
		for(Scout s : scoutsList) {
			System.out.println(s.getHeight());
		}
		
	}

}
