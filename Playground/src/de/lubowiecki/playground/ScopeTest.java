package de.lubowiecki.playground;

public class ScopeTest {
	
	private static int zahl;
	
	private int zahl3;

	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println(i);
		
		if(true) { // Unterblock von main
			
			//int i = 20; // Variable ist hier noch sichtbar, Redeklaration nicht erlaubt
			System.out.println(i);
			
			while(true) { // Unterblock von if
				System.out.println(i);
			}
		}
		
		if(true) {
			int j = 100;
			
			while(true) { // Unterblock von if
				//int j = 200; // Variable ist hier noch sichtbar, Redeklaration nicht erlaubt
				System.out.println(j);
			}
		}
		
		//System.out.println(j); // Variable ist NICHT mehr sichtbar (out-of-scope)
		int j = 300; // Variable ist NICHT mehr sichtbar, Redeklaration ist erlaubt
		
		
		// switch, for, while, do-while, try, catch, {}
		
		{ // definiert einen Scope
			
			int x = 100;
			
		} // Hier ist der Scope zu ende
		
		//System.out.println(x); // ist nicht mehr sichtbar
		
		
		int z = 100;
		machWas(200);
		
	}
	
	public static void machWas(int z) {
		System.out.println(z);
	}
	
	public static void setZahl(int z) {
		// z ist nur bis zum Ende der Methode sichtbar, danach wird es vom Stack entfernt
		// Klassenvariable zahl ist bis zum Ende des Programms verfügbar
		zahl = z; // Wert von z wird in zahl geschrieben und damit bis ende des Programms aufbewahrt
	}
	
	public static void setZahl2(int zahl) {
		ScopeTest.zahl = zahl; // Lokale Variable zahl wird in Klassenvariable zahl geschrieben
	}
	
	public void setZahl3(int zahl3) {
		// zahl3 ist nur bis zum Ende der Methode sichtbar, danach wird es vom Stack entfernt
		// this.zahl3 ist so lange verfügbar, wie das Objekt auf dem Heap verfügbar ist
		this.zahl3 = zahl3; // Lokale Variable zahl3 wird in Instanzvariable zahl3 geschrieben
	}
	
}
