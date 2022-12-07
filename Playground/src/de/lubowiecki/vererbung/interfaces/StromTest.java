package de.lubowiecki.vererbung.interfaces;

public class StromTest {
	
	public static void main(String[] args) {
		
		StromGenerator sg1 = new StromGenerator();
		
		System.out.println("Test START...");
		
		System.out.println();
		System.out.println("Lampe");
		
		Lampe l1 = new Lampe();
		sg1.anschließen(l1);
		System.out.println("Verbunden:" + l1.isVerbunden());
		
		
		System.out.println();
		
		sg1.mitStromBeliefern();
		System.out.println("An:" + l1.isAn());
		
		
		System.out.println();
		
		sg1.ausschalten();
		System.out.println("An:" + l1.isAn());
		System.out.println("Verbunden:" + l1.isVerbunden());
		
		System.out.println();
		System.out.println("PowerBank");
		
		PowerBank pb = new PowerBank();
		
		sg1.anschließen(pb);
		System.out.println();
		
		sg1.mitStromBeliefern();
		System.out.println();
		
		sg1.ausschalten();
		System.out.println();
		
		System.out.println("... Test ENDE");
		
	}

}
