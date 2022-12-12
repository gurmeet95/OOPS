package InterfaceExtenddemo;

public class Main1 implements A1,B1{

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
	}
          //if one class implements more than 1 interface then only one interface can have 
	//default method.
	
   public static void main(String [] args) {
	   Main1 ob=new Main1();
	  A1.greeting();
   }
}
