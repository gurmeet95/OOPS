package Access;
import java.util.ArrayList;

public class Main extends A {
	public Main(int num,String name) {
		super(num,name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A(10,"Gurmeet");
		// need to do few things
		//1. access the data members
		//2. modify the data members
		
		//ArrayList<Integer> list= new ArrayList<>(12);
		//list.DEFAULT_CAPACITY;    cAN not access this becuase this is internal hide.
		
		// obj.num  can not access this because num is private this is data hiding.
		
		obj.getNum();
 
	}

}
