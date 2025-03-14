package com.collectionframeworks;

public class Employe implements Comparable<Employe> {
	private int id;
	private String name;
	private double salary;
	
	
	public Employe(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int compareTo(Employe o) {
		if(this.getId()>o.getId()) {
			return -1;
		}else if(this.getId()<o.getId()) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
	

}
