package Introduction;

public class main {
public static void main(String[] args) {
	// store 5 roll numbers;
	int [] numbers=new int[5];
	
	// store 5 names
	String[] names=new String[5] ;
	//data of 5 students:{rollno,name,marks}
	int [] rno=new int[5];
	float [] marks=new float[5];
	String[] name=new String[5] ;
	// if i want to convert all these into single entity i can do it with the help of classes.
	Student[] students=new Student[5]; // will talk about this later
	Student s1; //this is reference variable of type student.it consist of three property rollno,name,marks.
	// this is declaring the object not creating.
	s1= new Student(); 
	Student s2=new Student();   //two different way to create object of a class
	s2.rno=14;
	s2.name="Gurmeet";
	s2.marks=88.5f;
	System.out.println(s2.name);
	System.out.println(s2.rno);
	System.out.println(s2.marks);
	
}
}
// create a class
class Student{
	//datatype for every single student.
	int  rno;
	float  marks;
	String name ;
	

}
