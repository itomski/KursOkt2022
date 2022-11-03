package de.lubowiecki.scouts;

import java.time.LocalDate;

public class Scout implements Comparable<Scout> {
	
	private String firstName;
	
	private String lastName;
	
	private LocalDate birthDate;
	
	private int height;
	
	public Scout() {
	}
	
	public Scout(String firstName, String lastName, LocalDate birthDate, int height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.height = height;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public int compareTo(Scout s) {
		
//		1 wenn this älter ist als s
//		0 wenn this gleich alt ist wie s
//		-1 wenn this jünger ist wie s
		
//		System.out.println(birthDate + " vergleich mit " + s.birthDate);
//		
//		if(birthDate.isBefore(s.birthDate))
//			return 1;
//		
//		if(birthDate.isAfter(s.birthDate))
//			return -1;
//		
//		return 0;
		
//		1 wenn this größer ist als s
//		0 wenn this gleich groß ist wie s
//		-1 wenn this kleiner ist wie s
		
		System.out.println(height + " vergleich mit " + s.height);
		
//		if(height < s.height)
//			return 1;
//		
//		if(height > s.height)
//			return -1;
//		
//		return 0;
		
		return s.height - height;
		
	}
	
//	public int compareTo(Scout o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
