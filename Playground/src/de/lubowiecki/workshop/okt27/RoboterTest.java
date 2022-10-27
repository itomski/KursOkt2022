package de.lubowiecki.workshop.okt27;

public class RoboterTest {

	public static void main(String[] args) {
		
		// Aus der Klasse (Bauplan) wird ein Objekt (konkreter Vertreter der Gattung Roboter) erzeugt
		Roboter r1 = new Roboter(2014);
		
		// Immer wenn ein Objekt, welches KEIN String ist, als String verwendet werden soll
		// muss es zuerst in ein String konvertiert/umgewandelt werden
		// Die Konvertierung erfolgt automatisch mit der toString-Methode 
		System.out.println(r1); // Wird als String ausgegeben d.h. automatisch wird die toString-Methode ausgeführt
		
		String str = r1 + "..."; // auf r1 wird automatisch toString ausgeführt
		System.out.println(str);
		
		String str2 = r1.toString(); // Manuelle Konvertierung des Roboters in String
		System.out.println(str2);
		
		//Jedes Objekt besitzt eine toString-Methode!!!!
		
		Integer i = 100;
		str = i.toString(); // Integer hat die von Obejct geerbte toString-Methode geändert/überschrieben
		str = i + ""; // auf i wird automatisch toString ausgeführt
		System.out.println(i); // auf i wird automatisch toString ausgeführt
		System.out.println(str);
		
		System.out.println();
		
		Roboter r2 = new Roboter(2022);
		System.out.println(r2);
		
		// Methoden sind die Fähingkeiten eines Objektes
		r2.setZustand("Neuwertig"); // Setter sind die Fähigkeit den Zustand des Objektes zu verändern
		System.out.println(r2);
		
		// Getter sind die Fähigkeit den aktuellen Zustand einer Eigenschaft zurückzugeben
		System.out.println(r2.getZustand()); // Nur der Zustand wird geliefert, toString von Robeter wird nicht benutzt
		//System.out.println(r1.getZustand()); // Zustand von r1 wird geliefert
		
		String str3 = r2.getZustand(); // getZustand liefert einen String
		//String str4 = r2.getBaujahr(); // getBaujahr liefert einen int d.h. ist nicht kompatibel zu String
		
		
	}
}
