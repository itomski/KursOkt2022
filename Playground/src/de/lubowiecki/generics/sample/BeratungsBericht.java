package de.lubowiecki.generics.sample;

import java.time.LocalDate;
import java.time.LocalTime;

public class BeratungsBericht implements IMitarbeiter, IKosten {

	private final LocalDate datum;
	
	private final LocalTime zeit;
	
	private final String beratungsThema;
	
	private final String einschaetzung;
	
	private final double kosten;
	
	private final String mitarbeiterKuerzel;

	public BeratungsBericht(LocalDate datum, LocalTime zeit, String beratungsThema, String einschaetzung, double kosten, String mitarbeiterKuerzel) {
		this.datum = datum;
		this.zeit = zeit;
		this.beratungsThema = beratungsThema;
		this.einschaetzung = einschaetzung;
		this.kosten = kosten;
		this.mitarbeiterKuerzel = mitarbeiterKuerzel;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public LocalTime getZeit() {
		return zeit;
	}

	public String getBeratungsThema() {
		return beratungsThema;
	}

	public String getEinschaetzung() {
		return einschaetzung;
	}

	public double getKosten() {
		return kosten;
	}

	public String getMitarbeiterKuerzel() {
		return mitarbeiterKuerzel;
	}	
}
