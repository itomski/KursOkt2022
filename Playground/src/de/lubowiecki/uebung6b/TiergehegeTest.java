package de.lubowiecki.uebung6b;

public class TiergehegeTest {

	public static void main(String[] args) {
		
		//Tiergehege gehege = new Tiergehege();
		Freigehege gehege = new Freigehege();
		
		gehege.aufnehmen(new Giraffe());
		gehege.aufnehmen(new Zebra());
		gehege.aufnehmen(new Giraffe());
		
		//gehege.starteFuetterung();
		gehege.starteNachtruhe();
	}

}
