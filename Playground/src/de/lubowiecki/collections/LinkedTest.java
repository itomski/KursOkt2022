package de.lubowiecki.collections;

public class LinkedTest {
	
	public static void main(String[] args) {
	
		Element start = new Element();
		start.setValue(10);
		
		// (10)
		
		Element e = new Element();
		e.setValue(15);
		
		start.setNext(e); // erstes Element bekommt zweites Element als next zugewiesen
		e.setPrev(start); // zweites Element bekommt erstes Element als prev zugewiesen
		
		// (10)<->(15)
		
		e = new Element();
		e.setValue(1);
		
		start.getNext().setNext(e);
		e.setPrev(start.getNext());
		
		// (10)<->(15)<->(1)
		
		e = null;
		
		e = start;
		while(e.getValue() != 0) {
			System.out.println(e.getValue());
			if(e.getNext() != null)
				e = e.getNext();
			else
				break;
		}
		
	}
}
