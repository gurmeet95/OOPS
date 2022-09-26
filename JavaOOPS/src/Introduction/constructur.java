package Introduction;
class Student1{
	//datatype for every single student.
	int  rno;
	float  marks;
	String name ;
	// we need a way to add the values of the above
	// properties object by object
	// we need one word to access every object
//	Student1(){
//		this.rno=14;
//		this.name="Gurmeet";
//		this.marks=88.5f;
//		
//	}
	// Student1 ob1=new Student1(17,"Arjun",32.56f)
	// here this will be replcae by ob1;
	Student1(int rno,String name,float marks){
		this.rno=rno;
		this.name=name;
		this.marks=marks;
	}
	// create another constructur that takes value from another object.
	Student1(Student1 other){
		this.name=other.name;
		this.rno=other.rno;
		this.marks=other.marks;
	}
	Student1(){
		// this is how we can call constructer inside constructer
		// internally it something like new Student();
		this(8,"Anita",23.5f);
	}

}

public class constructur {
	public static void main(String[] args) {
	Student1 s3=new Student1();
	Student1 s4=new Student1(1,"Sumit",67.4f);
	System.out.println(s3.name);
	System.out.println(s3.rno);
	System.out.println(s3.marks);
	System.out.println();
	System.out.println(s4.name);
	System.out.println(s4.rno);
	System.out.println(s4.marks);
	
	Student1 random = new Student1();
	System.out.println(random.name);
	System.out.println();
	Student1 random2=new Student1();
	System.out.println(random2.name);
	Student1 one=new Student1();
	Student1 two=one;
	one.name="Somehing sometihng";
	System.out.println(two.name);
	
	}
}
