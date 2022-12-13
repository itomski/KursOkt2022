package de.lubowiecki.lambdas;

import java.util.function.Consumer;

public class DefaultMethodTest {

	public static void main(String[] args) {
		
		final String TXT = "Das ist ein Haus von Nikigraus";
		
		Consumer<String> cons1 = s -> System.out.println(s);
		cons1.accept(TXT);
		
		Consumer<String> cons2 = s -> System.out.println(s.toUpperCase());
		cons2.accept(TXT);
		
		System.out.println();
		
		Consumer<String> cons3 = cons1.andThen(cons2); // Zwei Consumer wurden zu einem verbunden
		cons3.accept(TXT);
		
		System.out.println();
		
		Consumer<Object> oCons = o -> System.out.println(o.hashCode());
		cons3 = cons3.andThen(oCons);
		cons3.accept(TXT);
		
		
		Car c = new Car();
		c.goFaster(100);
		System.out.println(c.getSpeed());
		c.goFaster(100);
		System.out.println(c.getSpeed());
		c.goFaster(100);
		System.out.println(c.getSpeed());
		
		System.out.println();
		
		Schnecke s = new Schnecke();
		s.goFaster(100);
		
		
	}
}

interface Movable {
	
	// müssen überschrieben werden
	int getSpeed();
	
	void setSpeed(int speed);
	
	// Können, müssen aber nicht überschrieben werden
	default void goFaster(int plus) {
		int speed = getSpeed() + plus;
		setSpeed(speed);
	}
}

class Car implements Movable {
	
	private int speed;

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

class Schnecke implements Movable {

	@Override
	public int getSpeed() {
		return 1;
	}

	@Override
	public void setSpeed(int speed) {
		if(speed > 0)
			speed = 1;
		else
			speed = 0;
	}
	
	@Override
	public void goFaster(int plus) {
		throw new UnsupportedOperationException("Nicht verfügbar");
	}
}
