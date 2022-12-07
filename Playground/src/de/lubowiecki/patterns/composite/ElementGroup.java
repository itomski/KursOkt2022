package de.lubowiecki.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementGroup implements Element {
	
	private List<Element> elements;
	
	public ElementGroup(Element... elements) { // 0,* Elemente
		this.elements = new ArrayList<>(Arrays.asList(elements));
		
//		this.elements = new ArrayList<>();
//		for(Element e : elements) {
//			this.elements.add(e);
//		}
	}
	
	public void add(Element e) {
		elements.add(e);
	}
	
	public void add(Element... elements) { // VarArg liefert ein Array
		// Arrays.asList(elements) wandelt das Array aus den VarArgs in eine Liste um
		// addAll nimmt alle Elemente der Liste und fügt sie zu den bereits vorhandenen hinzu
		this.elements.addAll(Arrays.asList(elements));
	}
	
	public void remove(Element e) {
		elements.remove(e); // Entefernt das passende Element
	}
	
	public void remove(Element... elements) {  
		this.elements.removeAll(Arrays.asList(elements)); // Entefernt alle passenden Elemente
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ElementGroup [elements=");
		builder.append(elements);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void moveTo(int x, int y) {
		for(Element e : elements) {
			e.moveTo(x, y); // Die Gruppe delegiert die Bewegung an jedes einzelne Element weiter
		}
	}
}
