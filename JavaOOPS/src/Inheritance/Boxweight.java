package Inheritance;

public class Boxweight extends Box {
	double weight;
	public Boxweight() {
		this.weight=-1;
	}
	public Boxweight(double length,double width,double height,double weight){
		//this.height=height;
		//this.length=length;
		//this.width=width;
		super(length,height,width); // wht is this,
		// call the parent class constructor 
		// use to initialise values present in parent class.
		this.weight=weight;
		
	}
	public Boxweight(Boxweight other) {
		super(other);
		weight=other.weight;
	}
	public Boxweight(double side,double weight) {
		super(side);
		this.weight=weight;
	}
	

}
