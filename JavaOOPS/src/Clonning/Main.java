package Clonning;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Human ob1=new Human(24,"Rahul");
		//Human twin=new Human(ob1); // this will take lot of time so we can create the 
		// clone (Object clonning) exact copy of object.
		
		Human twin=(Human)ob1.clone();
		System.out.println(twin.age);
		System.out.println(Arrays.toString(twin.arr));
		twin.arr[0]=100;   //this also change ob[0]
		// this is calles shallow copy.
		System.out.println(Arrays.toString(ob1.arr));
		System.out.println(Arrays.toString(twin.arr));

	}

}
