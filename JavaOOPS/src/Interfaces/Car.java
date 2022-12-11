package Interfaces;

public class Car implements Break,Enginee{

	@Override
	public void start() {
		System.out.println("I start like normal car");
		
	}

	@Override
	public void stop() {
		
		System.out.println("I stop engineee like normal car");
	}

	@Override
	public void acc() {
		System.out.println("I accelerate like normal car");
		
	}

	@Override
	public void brake() {
		System.out.println("I brake like normal car");
		
	}

}
