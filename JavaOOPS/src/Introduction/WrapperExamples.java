package Introduction;

public class WrapperExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		// but we can also do this
		Integer num=45;
		// now it worked as object and after using num. we can access so many properties
		final int bous=2;
		//not able to modiefied it
	//	bonus =3
       final  A Gurmeet= new A("Gurmeet Chahal");
       System.out.println(Gurmeet.name);
       Gurmeet.name="Name change ";
       System.out.println(Gurmeet.name);
       
	}
	

}
class A{
	final int num=10;
	//always intialise while declaring
	//only applicable to primitive ata type.
	// if it is non primitive datatype we can change the value of object but can not reinitalise it.
	// s1=ohter object
	String name;
	public A(String name) {
		this.name =name;
	}
	
}
