package de.lubowiecki.playground;

import java.time.LocalDate;
import java.time.Month;

public class EnumTest {
	
	public static void main(String[] args) {
		
		KurzMonat von = KurzMonat.MAI;
		KurzMonat bis = KurzMonat.DEZ;
		
		int monatNow = LocalDate.now().getMonthValue() - 1;
		
		if(monatNow >= von.ordinal() && monatNow <= bis.ordinal()) {
			System.out.println("passt");
		}
		else {
			System.out.println("passt nicht");
		}
		
		LocalDate jetzt = LocalDate.now();
		Month jetztMonat = jetzt.getMonth();
		
		if(jetztMonat.compareTo(Month.MAY) >= 0) {
			System.out.println("passt");
		}
		else {
			System.out.println("passt nicht");
		}
	}

}

enum KurzMonat {
	JAN, FEB, MRZ, APR, MAI, JUN, JUL, AUG, SEP, OKT, NOV, DEZ;
}
