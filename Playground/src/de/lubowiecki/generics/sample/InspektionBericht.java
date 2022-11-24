package de.lubowiecki.generics.sample;

import java.time.LocalDate;
import java.time.LocalTime;

public class InspektionBericht implements IMitarbeiter, IKosten {
	
	private final LocalDate datum;
	
	private final LocalTime zeit;
	
	private final String berichtsText;
	
	private final double kosten;
	
	private final String mitarbeiterKuerzel;

	public InspektionBericht(LocalDate datum, LocalTime zeit, String berichtsText, double kosten, String mitarbeiterKuerzel) {
		this.datum = datum;
		this.zeit = zeit;
		this.berichtsText = berichtsText;
		this.kosten = kosten;
		this.mitarbeiterKuerzel = mitarbeiterKuerzel;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public LocalTime getZeit() {
		return zeit;
	}

	public String getBerichtsText() {
		return berichtsText;
	}

	public double getKosten() {
		return kosten;
	}

	public String getMitarbeiterKuerzel() {
		return mitarbeiterKuerzel;
	}
}
