package de.lubowiecki.patterns.composite;

public class CompositeTest {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(10, 15, 200);
		System.out.println(c1);
		
		c1.moveTo(1, 1);
		System.out.println(c1);
		
		Square s1 = new Square(2, 5, 50, 200);
		System.out.println(s1);
		
		s1.moveTo(100, 100);
		System.out.println(s1);
		
		System.out.println();
		
		//ElementGroup group = new ElementGroup(s1, c1, new Circle(15, 15, 45));
		ElementGroup group = new ElementGroup();
		group.add(s1);
		group.add(c1, new Circle(15, 15, 45)); // VarArg-Variante
		//group.remove(c1, s1);
		System.out.println(group);
		
		System.out.println();
		
		
		group.add(new Square(2, 5, 50, 200), new Square(50, 50, 100, 100), new Circle(70, 75, 45));
		group.moveTo(150, 150);
		
		System.out.println(group);
		
		System.out.println();
		
		ElementGroup group2 = new ElementGroup(new Circle(1, 1, 100), new Circle(10, 10, 100));
		group2.add(group); // ElementGroup ist auch ein Element
		group2.moveTo(200, 200);
		
		System.out.println(group2);
		
	}

}
