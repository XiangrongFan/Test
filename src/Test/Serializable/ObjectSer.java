package Test.Serializable;
import java.io.*;

public class ObjectSer {
	
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Student stu = new Student(981036,"LiuMing",18,"CSD");
		
		FileOutputStream fo = new FileOutputStream("data.ser");
		
		ObjectOutputStream so = new ObjectOutputStream(fo);
		
		try{
			so.writeObject(stu);
			so.close();
		}catch(IOException e){
			System.out.println(e);
		}
		
		stu = null;
		
		FileInputStream fi = new FileInputStream("data.ser");
		ObjectInputStream si = new ObjectInputStream(fi);
		
		try {
			stu = (Student) si.readObject();
			si.close();
		}catch (IOException e){
			System.out.println(e);
		}
		
		System.out.println("Student Info:");
		System.out.println("ID:"+stu.getId());
		System.out.println("Name:"+stu.getName());
		System.out.println("Age:"+stu.getAge());
		System.out.println("Dep:"+stu.getDepartment());
	}

}
