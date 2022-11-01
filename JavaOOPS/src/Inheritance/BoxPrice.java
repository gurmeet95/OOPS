package Inheritance;

public class BoxPrice extends Boxweight {
	double price;
	public BoxPrice() {
		super();
		this.price=-1;
	}
	public BoxPrice(BoxPrice other) {
		super(other);
		price=other.price;
		
	}
	public BoxPrice(double length,double width,double height,double weight,double price) {
		super(length,height,width,weight);
		this.price= price;
		
	}
	public BoxPrice(double side,double weight,double price) {
		super(side,weight);
		this.price=price;
	}

}
