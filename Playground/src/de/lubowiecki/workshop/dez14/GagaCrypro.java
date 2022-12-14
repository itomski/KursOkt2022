package de.lubowiecki.workshop.dez14;

public class GagaCrypro implements CryptoUnit {

		
	private final String CODED = "EFCD678GHKLMIJN59 OPTU0123VWQRSXYZ4AB"; 
	
	@Override
	public String encode(String str) {
		
		StringBuilder sb = new StringBuilder(str.length());
		
		for(String s : str.toUpperCase().split("")) {
			int i = BASE.indexOf(s);
			sb.append(CODED.charAt(i));
		}
		
		return sb.toString();
	}

	@Override
	public String decode(String str) {
		
		StringBuilder sb = new StringBuilder(str.length());
		
		for(String s : str.toUpperCase().split("")) {
			int i = CODED.indexOf(s);
			sb.append(BASE.charAt(i));
		}
		
		return sb.toString();
	}
}
