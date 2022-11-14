package de.lubowiecki.workshop.nov14;

public class Person {
	
	private final String vorname;
	private final String nachname;
	private final int alter;
	
	public Person(String vorname, String nachname, int alter) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getAlter() {
		return alter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [vorname=");
		builder.append(vorname);
		builder.append(", nachname=");
		builder.append(nachname);
		builder.append(", alter=");
		builder.append(alter);
		builder.append("]");
		return builder.toString();
	}
}
