package de.lubowiecki.enums;

import java.util.Iterator;

public class EnumTest {

	public static void main(String[] args) {
		
		UserStatus status = UserStatus.AKTIV;
		// status = new UserStatus(); // nicht möglich
		
		status = UserStatus.AKTIV;
		System.out.println(status.ordinal()); // Reihenfolge
		
		
		status = UserStatus.GEBLOCKT;
		System.out.println(status.ordinal());
		
		status = UserStatus.GELOESCHT;
		System.out.println(status.ordinal());
		
		status = UserStatus.AKTIV;
		System.out.println(status.ordinal());
		
		UserStatus status2 = UserStatus.GEBLOCKT;
		
		System.out.println(status.compareTo(status2));
		System.out.println(status2.compareTo(status));
		
		UserStatus[] stati = UserStatus.values(); // Liefert ein sortiertes Array von Enums
		for (UserStatus userStatus : stati) {
			System.out.println(userStatus);
		}

		status = UserStatus.valueOf("GEBLOCKT");
		System.out.println(status);
		
		
		status2 = UserStatus.GEBLOCKT;
		
		if(status2 == UserStatus.GEBLOCKT)
			System.out.println("WAHR");
		
		//status2 = null;
		
		switch(status2) {
		
			case AKTIV:
				System.out.println("ist aktiv");
				break;
				
			case GEBLOCKT:
				System.out.println("ist geblockt");
				break;
				
			case GELOESCHT:
				System.out.println("ist gelöscht");
				break;
		}
		
		
		System.out.println();
		
		System.out.println(EnumSingleton.INSTANCE.getZahl());
		
	}
	
	static boolean setzeStatus(int userId, UserStatus status) {
		//...
		return true;
	}

}
