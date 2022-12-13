package de.lubowiecki.vererbung.interfaces.game;

public class BattleTest {

	public static void main(String[] args) {
		
		Infantry i1 = new Infantry();
		Infantry i2 = new Infantry();
		Cavalry c2 = new Cavalry();
		
		i1.moveTo(10, 20);
		c2.moveTo(11, 21);
		
		i1.attack(c2);
		

	}

}
