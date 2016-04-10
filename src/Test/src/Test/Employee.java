package Test.src.Test;

import java.util.*;

public class Employee extends Person {

	// instance fields
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		hireDay = calendar.getTime();
		// TODO Auto-generated constructor stub
	}

	// a method
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public Date getHireDay(){
		return (Date) hireDay.clone();
	}
	
	public void raiseSalary(int pecentage){
		double pct = 1+pecentage/100;
		salary = salary * pct;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return String.format("an employee with a salary of $%.2f", salary);
	}
	
}
