package Inheritance;

public class Box {
	double length;
	double width;
	double height;
	Box(){
		this.height=-1;
		this.length=-1;
		this.width=-1;
	}
	//cube
	Box(double side){
		this.height=side;
		this.length=side;
		this.width=side;
	}
	Box(double height,double width,double length){
		this.height=height;
		this.length=length;
		this.width=width;
	}
	Box(Box old){
		this.height=old.height;
		this.length=old.length;
		this.width=old.width;
	}
	public void information() {
		System.out.println("Running the box");
	}

}
