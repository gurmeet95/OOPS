package Abstractdemo;

public class Son extends Parent {
	public Son(int age) {
		super(age);
		this.age=age;
	}

	@Override
	void career() {
		System.out.println("I am going to be a engineer");
		
	}

	@Override
	void partner() {
		System.out.println(" I love coding" );
		
		
	}

}
