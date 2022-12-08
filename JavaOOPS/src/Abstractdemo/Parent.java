package Abstractdemo;

public abstract class Parent {
	int age;
	public Parent(int age) {
		this.age=age;
	}
	abstract void career();
	abstract void partner();
	// a class which have one or more abstract method must be declared as abstract.
	public static void print() {
		System.out.println("Hi i am static method");
	}

}
