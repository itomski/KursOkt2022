package de.lubowiecki.playground;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;

public class FmtTest {
	
	public static void main(String[] args) {
		
		FormatHelper.LOG.setLevel(Level.ALL);
		
		
		LocalDate date = LocalDate.now();
		System.out.println(date.format(FormatHelper.DATE_FML));
		new FmtTest().machWas();
		
		
		double sum = 10.0f + 7.0f + 12.0;
		
		byte b = 10;
		b++; // b = (byte)(b + 1); // ein Über- oder Unterlauf ist möglich
		b += 10; // b = (byte)(b + 10); // ein Über- oder Unterlauf ist möglich
		b = (byte)1000;
		
		char c1 = 'a';
		char c2 = 'b';
		int sumC = c1 + c2; // wird auf mind. int angehoben
		
		// byte < short < int < long < float < double
		//         char < int
		
		long l = '1';
		short s = (short)'c';
		
		FormatHelper.LOG.info("Main von FmtTest");
		
	}
	
	public void machWas() {
		
		LocalTime date = LocalTime.now();
		System.out.println(date.format(FormatHelper.TIME_FML));
		
		FormatHelper.LOG.info("machWas von FmtTest");
		
	}

}
