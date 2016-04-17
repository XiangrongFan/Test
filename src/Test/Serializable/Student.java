package Test.Serializable;

import java.io.Serializable;

public class Student implements Serializable {   
//public class Student {   
	  
    private int id;// 学号   
    private String name;// 姓名   
    private int age;// 年龄   
    private String department; // 系别   
  
    public Student(int id, String name, int age, String department) {   
        this.id = id;   
        this.name = name;   
        this.age = age;   
        this.department = department;   
    }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

    
  
}   
