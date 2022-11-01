package Polymorphism;

public class Circle extends Shapes {
	// this will rnn when object of circle is created
	// hence it is over ridding the parent method.
	//@Override // This is called annotation
	public static void area() {
		System.out.println("I am in circle");
	}
}
