package de.lubowiecki.vererbung.interfaces.game;

public class Infantry extends AbstractUnit implements Militant {

	@Override
	public void transport(String thing) {
		// TODO Auto-generated method stub
		super.transport(thing);
	}
	
	@Override
	public void attack(Unit other) {
		System.out.println("Angriff zur Fuß");
	}
}
