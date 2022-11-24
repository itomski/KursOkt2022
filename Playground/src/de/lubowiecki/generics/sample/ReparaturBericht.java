package de.lubowiecki.generics.sample;

import java.time.LocalDateTime;

public class ReparaturBericht implements IKosten, IMitarbeiter {

	private final LocalDateTime zeitpunkt;
	
	private final String ersatzteile;
	
	private final double kosten;
	
	private final String mitarbeiterKuerzel;
	
	public ReparaturBericht(String ersatzteile, double kosten, String mitarbeiterKuerzel) {
		this.zeitpunkt = LocalDateTime.now();
		this.ersatzteile = ersatzteile;
		this.kosten = kosten;
		this.mitarbeiterKuerzel = mitarbeiterKuerzel;
	}

	public LocalDateTime getZeitpunkt() {
		return zeitpunkt;
	}

	public String getErsatzteile() {
		return ersatzteile;
	}

	@Override
	public String getMitarbeiterKuerzel() {
		return mitarbeiterKuerzel;
	}

	@Override
	public double getKosten() {
		return kosten;
	}

}
