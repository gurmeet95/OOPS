package StaticExample;

public class Innerclass {
// outside classes can not be static.
	static class Test{
		String name;
		public Test(String name) {
			this.name=name;
		}
	}
	public static void main(String[] args) {
		Test obj=new Test("Gurmeet Chahal");
		Test obj1=new Test("Sumit Chahal");
		
		// if class test is not static then this obj will give error.
		// because that test class is itself depend on other class.
		//when we make it static that test class is not depend on any other clas.
		System.out.println(obj.name);
		System.out.println(obj1.name);
	}
	

}
