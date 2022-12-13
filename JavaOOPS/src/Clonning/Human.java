package Clonning;


public class Human implements Cloneable {
   int age;
   String name;
   int arr[];
   
   public Human(int age, String name) {
	super();
	this.age = age;
	this.name = name;
	this.arr= new int[] {1,2,3,4,6};
}

//Human(Human other){
//	   this.age=other.age;
//	   this.name=other.name;
//	   
//	   
//	   }
//       public Object clone() throws CloneNotSupportedException{
//    	   //this is shallow copy.
//	   return super.clone();
//   }
       public Object clone() throws CloneNotSupportedException{
    	   //this is deep copy.
	   Human twin=(Human)super.clone();  //this is actully shallow copy
	   // make deep copy
	   twin.arr=new int[twin.arr.length];
	   for(int i=0;i<twin.arr.length;i++) {
		   System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
		   
	   }
	   return twin;
   }
}
