package com.collectionframeworks;

import java.util.Comparator;

public class Employe2 {
	
		private int id;
		private String name;
		private double salary;
		
		
		public Employe2(int id, String name, double salary) {
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
		
		

	}



