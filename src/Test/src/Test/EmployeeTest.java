package Test.src.Test;

import java.util.*;

public class EmployeeTest {

	public EmployeeTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		// fill the staff array with three Employee objects
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl Cracker", 7500, 1982, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		// raise everyone's salary by 5%
		for (Employee e : staff)
			e.raiseSalary(5);
		
		Date d = staff[0].getHireDay();
		double tenYearsInMilliSeconds = 10*365*24*60*60*1000;
		d.setTime(d.getTime()-(long)tenYearsInMilliSeconds);
		
		for (Employee e : staff)
			System.out.println("name="+ e.getName()+", salary=" + e.getSalary() + ", hireDay = " + e.getHireDay());
		
		// 
	}

}
