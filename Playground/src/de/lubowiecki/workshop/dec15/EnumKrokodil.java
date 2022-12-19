package de.lubowiecki.workshop.dec15;

import java.util.Arrays;

import static de.lubowiecki.workshop.dec15.KrokodocStatus.*;

public class EnumKrokodil {

	private final int[] zaehne;
	
	private final int krankerZahn;
	
	private final int ANZAHL_ZAEHNE = 32;
	
	public EnumKrokodil() {
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

	public KrokodocStatus zieheZahn(int auswahl) {
		
		if(auswahl <= 0 || auswahl > ANZAHL_ZAEHNE) {
			return FALSCHE_EINGABE;
		}
		else if(auswahl == krankerZahn) {
			return ZAHN_KRANK;
		}
		else if(zaehne[auswahl - 1] == 0) {
			return ZAHN_BEREITS_GEZOGEN;
		}
		
		zaehne[auswahl - 1] = 0;
		return ZAHN_GOZOGEN;
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
