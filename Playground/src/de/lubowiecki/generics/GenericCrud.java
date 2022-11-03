package de.lubowiecki.generics;

import java.util.List;

// CRUD: Create Read Update Delete
public interface GenericCrud<T> {
	
	void insert(T p);
	
	void update(T p);
	
	void delete(T p);
	
	T find(int id);
	
	List<T> find();
}
