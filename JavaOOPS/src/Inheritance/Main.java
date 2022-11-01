package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Box b1=new Box(4.1,5.3,6.7);
		//Box b2= new Box(b1);
		//System.out.println(b1.height +" "+b1.length+" "+b1.width);
		//System.out.println();
		//System.out.println(b2.height +" "+b2.length+" "+b2.width);
//		Boxweight bw1=new Boxweight();
//		System.out.println(bw1.height +" "+bw1.length+" "+bw1.width+" "+bw1.weight);
//		System.out.println();
//		Boxweight bw2=new Boxweight(4,5,6,7);
//		System.out.println(bw2.height +" "+bw2.length+" "+bw2.width+" "+bw2.weight);
		
		BoxPrice box =new BoxPrice();
		System.out.println(box.height +" "+box.length+" "+box.width+" "+box.weight+" "+box.price);
		BoxPrice box1 =new BoxPrice(4,8,300);
		System.out.println(box1.weight+" "+box1.price+" "+ box1.width);
		
	}

}
