public class TestStatic {
    private static int nextId=1;
    private int id;
	public TestStatic() {
		// TODO Auto-generated constructor stub
		id=nextId;
		nextId++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TestStatic a=new TestStatic();
        TestStatic b=new TestStatic();
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(TestStatic.getNextId());
	}

	public static int getNextId(){
		return nextId;
	}
}
