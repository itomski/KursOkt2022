package de.lubowiecki.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Peter", "Parker", Job.PRODUCT_OWNER));
		employees.add(new Employee("Carol", "Danvers", Job.DEVELOPER));
		employees.add(new Employee("Paul", "Hanson", Job.SCRUM_MASTER));
		employees.add(new Employee("Tony", "Stark", Job.DEVELOPER));
		employees.add(new Employee("Natasha", "Romanov", Job.SCRUM_MASTER));
		employees.add(new Employee("Bruce", "Banner", Job.DEVELOPER));
		employees.add(new Employee("Steve", "Rogers", Job.DEVELOPER));
		
		//Map<Job, List<Employee>> gruppiert = employees.stream().collect(Collectors.groupingBy(e -> e.getJob()));
		// Mit Methodenreferenz auch möglich...
		Map<Job, List<Employee>> gruppiert = employees.stream().collect(Collectors.groupingBy(Employee::getJob));
		
		System.out.println(gruppiert.get(Job.SCRUM_MASTER));
		
		System.out.println();
		
		Map<Boolean, List<Employee>> gruppiert2 = employees.stream().collect(Collectors.partitioningBy(e -> e.getFirstName().charAt(0) == 'P'));
		
		System.out.println(gruppiert2.get(true));
		
		System.out.println();
		
		System.out.println(gruppiert2.get(false));
		
		System.out.println();
		
		String str = Stream.of("Peter", "Bruce", "Carl").collect(Collectors.joining(", ", ">>>", "<<<"));
		System.out.println(str);
	}
}

enum Job {
	DEVELOPER, PRODUCT_OWNER, SCRUM_MASTER; 	
}

class Employee {
	
	private String firstName;
	
	private String lastName;
	
	private Job job;
	
	public Employee(String firstName, String lastName, Job job) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", job=");
		builder.append(job);
		builder.append("]");
		return builder.toString();
	}
}