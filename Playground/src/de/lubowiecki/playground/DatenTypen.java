package de.lubowiecki.playground;

public class DatenTypen {

	private static int zahl; // Klassenvariable
	private int andereZahl; // Instanzvariable
	
	
	public static void main(String[] args) {
		new DatenTypen().start();
	}
	
	public void start() {
		
		int zahl; // Deklaration: Lokale Variable
		
		System.out.println(DatenTypen.zahl);
		
		// this = Objekt auf dem die aktuelle Methode ausgeführt wurde
		System.out.println(this.andereZahl);
		
		DatenTypen dt2 = new DatenTypen();
		System.out.println(dt2.andereZahl);
		
		System.out.println(dt2.zahl); // Der Kompiler wird hier später DatenTypen.zahl verwenden
		
		// Lokale Variablen werden NICHT mit Standardwerten initialisiert
		// Können erst nach einer Initialisierung verwendet werden
		zahl = 100; // Initialisierung
		System.out.println(zahl);
		
		int[] arr = new int[10]; // Die Positionen im Array werden mit Standardwerten belegt
		
		int i = 1000000000;
		long l = 1000000000; // primitive wiedening von int auf long 
		l = 100000000000l;
		
		//Long l2 = 100; // Autoboxing int auf Integer, komplex widening von Integer auf Long (Nicht möglich!)

		Integer i2 = i; // Auto-Boxing
		i = i2; // Auto-Unboxing
		
		System.out.println();
		
		zahl = 10;
		System.out.println(zahl);
		zahl = 010; // oktal (Zahlen von 0 bis 7 erlaubt)
		System.out.println(zahl);
		zahl = 0b10; // binär (Zahlen 0 und 1 erlaubt)
		System.out.println(zahl);
		zahl = 0x1f; // hex (Zahlen 0 und 15 (0-9abcdef) erlaubt)
		System.out.println(zahl);
		
		System.out.println();
		zahl = 245;
		Integer.valueOf(zahl); // Integer i2 = zahl
		System.out.println(Integer.toBinaryString(zahl));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String zahlenStr = "123";
		int zahlInt = Integer.parseInt(zahlenStr);
		System.out.println(zahlInt);
		
		System.out.println();
		
		machWas(10); // 10 als Literal ist int
		
//		byte b = 10;
//		machWas(b);
		
//		machWas(10.0); // 10.0 als Literal ist double
		
		// 1. passender primitiver Typ
		// 2. primitive widening
		// 3. Autoboxing von primitiv zu komplex
		// 4. komplex widening (zum Elterntyp)
		// 5. VarArg - Immer als letztes
		
	}
	
	// Überladen von Methoden
	// Gleicher Name aber unterschiedliche Parameterlisten
	private void machWas(byte p) {
		System.out.println("byte");
	}
	
	private void machWas(short p) {
		System.out.println("short");
	}
	
//	private void machWas(int p) {
//		System.out.println("int");
//	}
	
//	private void machWas(long p) {
//		System.out.println("long");
//	}
	
//	private void machWas(float p) {
//		System.out.println("float");
//	}
	
//	private void machWas(double p) {
//		System.out.println("double");
//	}
	
	private void machWas(Byte p) {
		System.out.println("Byte");
	}
	
	private void machWas(Short p) {
		System.out.println("Short");
	}
	
//	private void machWas(Integer p) {
//		System.out.println("Integer");
//	}
	
	private void machWas(Float p) {
		System.out.println("Float");
	}
	
	private void machWas(Double p) {
		System.out.println("Double");
	}
	
//	private void machWas(Number p) {
//		System.out.println("Number");
//	}
//	
//	private void machWas(Object p) {
//		System.out.println("Object");
//	}
	
	// VarArg
//	private void machWas(int... p) {
//		System.out.println("int...");
//	}
	
	private void machWas(double... p) {
		System.out.println("double...");
	}
}
