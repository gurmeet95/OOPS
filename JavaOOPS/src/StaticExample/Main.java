package StaticExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human guru=new Human(26,"Gurmeet Chahal",41000,false);
		Human sumit=new Human(23,"Sumit Chahal",50000,true);
		System.out.println(guru.name);
		System.out.println(sumit.name);
		System.out.println(Human.population);
		System.out.println(Human.population);
		
		// static method only access static data.
	//	greeting();
		Main fun1=new Main();
		fun1.fun2();
		

	}
	
	static void fun() {
		//greeting(); we can not use this because it require instance.
		// but the function we are using it in does not depend on instance.
		
		
		
		//we can not access non static stuff without refrencing their instances in
		// a static context
		
		//hence here i am refrencing it.
		//Main obj = new Main();
		//obj.greeting();
	}
	void fun2() {
		greeting();  //this is using object of fun2
	}
	//we konow that something which is not static,belong to object
	void greeting() {
		// for access this we must require object.
		System.out.println("I am non static method");
		
		fun(); //we can access static method into non static method.
		
	}

}
