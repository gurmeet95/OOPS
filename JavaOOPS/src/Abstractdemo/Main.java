package Abstractdemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1=new Son(21);
		s1.career();
		s1.partner();
		Daughter d1=new Daughter(19);
		d1.career();
		d1.partner();
		// Parent mom =new Parent();
		// can not create object of Abstract class
        Parent.print();
	}

}
