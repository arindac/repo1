package com.learn.git;

public class Employee {
	
	private String name;
	private int age;
	private double sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	
}
