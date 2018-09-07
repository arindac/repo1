package com.learn.git;

public class StartEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setAge(22);
		emp.setName("Arindam");
		emp.setSal(1000.00);
		System.out.println(emp);
	}
	
	public int createEmp() {
		Employee emp = new Employee();
		emp.setAge(22);
		emp.setName("Arindam");
		emp.setSal(1000.00);
		
		return 1;
		
	}
}
