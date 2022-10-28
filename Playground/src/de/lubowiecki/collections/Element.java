package de.lubowiecki.collections;

public class Element {
	
	private int value;
	
	private Element next;
	
	private Element prev;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}

	public Element getPrev() {
		return prev;
	}

	public void setPrev(Element prev) {
		this.prev = prev;
	}
}
