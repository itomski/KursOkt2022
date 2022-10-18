package de.lubowiecki.products;

import java.util.List;

public interface CrudUserRepository {
	
	public boolean create(User user);
	
	public User find(int id);
	
	public List<User> findAll();
	
	public boolean delete(User user);
	
	public boolean delete(int id);
	
	public boolean update(User user);
}
