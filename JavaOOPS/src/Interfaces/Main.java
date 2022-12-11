package Interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c1=new Car();
//		c1.acc();
//		c1.start();
//		c1.stop();
//	    Media c2=new Car();
//	    c2.stop();
//		
		NiceCar car=new NiceCar();
		car.start();
		car.startMusic();
		car.stopMusic();
		car.upgradeEnginee();
		car.start();
		car.stop();
		

	}

}
