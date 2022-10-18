package de.lubowiecki.uebung6b;


public class Freigehege extends Tiergehege {
	
	@Override
	public void starteFuetterung() {
		System.out.println("Fütterung im Freien");
		super.starteFuetterung();
	}
	
	@Override
	public void starteNachtruhe() {
		System.out.println("Nachtruhe im Freien");
		for(Sozialisiert s : getListe()) {
			s.schlaeft();
			System.out.println("... im freien");
		}
	}
}
