package Polymorphism;

public class Numbers {
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
     public static void main(String[] args) {

    	 Numbers n1=new Numbers();
    	 n1.sum(34, 44);
    	 n1.sum(1,2,3);
    	// n1.sum(1,2,3,4);   this give error beacuse no such method are present there in class which is ttaking 4 variables.
    	 
    	 
}
}
// This is method overloading.
