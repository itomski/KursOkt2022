package de.lubowiecki.workshop.dec15;

import java.util.Arrays;

public class Krokodil {
	
	private final int[] zaehne;
	
	private final int krankerZahn;
	
	private final int ANZAHL_ZAEHNE = 32;
	
	public Krokodil() {
		zaehne = Utils.genZahnArray(ANZAHL_ZAEHNE);
		krankerZahn = Utils.istKrank(ANZAHL_ZAEHNE);
	}
	
	public String zeigeZaehne() {
		
		StringBuilder sb = new StringBuilder();
		for(int i : zaehne) {
			sb.append((i == 0) ? "__" : i);
			sb.append(" ");
		}
		return sb.toString();
	}

	public void zieheZahn(int auswahl) throws KrankerZahnErwischtException, ZahnBereitsGezogenException {
		
		if(auswahl <= 0 || auswahl > ANZAHL_ZAEHNE) {
			throw new IllegalArgumentException("Ungültige Eingabe.");
		}
		else if(auswahl == krankerZahn) {
			throw new KrankerZahnErwischtException();
		}
		else if(zaehne[auswahl - 1] == 0) {
			throw new ZahnBereitsGezogenException();
		}
		else {
			zaehne[auswahl - 1] = 0;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Krokodil [zaehne=");
		builder.append(Arrays.toString(zaehne));
		builder.append(", krankerZahn=");
		builder.append(krankerZahn);
		builder.append(", ANZAHL_ZAEHNE=");
		builder.append(ANZAHL_ZAEHNE);
		builder.append("]");
		return builder.toString();
	}
}
