package Test.src.Test;

public class StaticTest {
	
	public static void main(String[] args){
		// fill the staff array with the Employee objects
		
		Employee2[] staff = new Employee2[3];
		staff[0] = new Employee2("Tom",40000);
		staff[1] = new Employee2("Dick",60000);
		staff[2] = new Employee2("Harry",65000);
		
		// print out information about all Employee objects
		for (Employee2 e : staff){
			e.setId();
			System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
		}
		
		int n = Employee2.getNextId();
		System.out.println("Next available id="+n);
	} 
}
