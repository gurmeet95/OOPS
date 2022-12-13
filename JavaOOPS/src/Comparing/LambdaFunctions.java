package Comparing;
import java.util.ArrayList;

public class LambdaFunctions {
     public static void main (String [] args) {
    	ArrayList<Integer> arr=new ArrayList<>();
    	for(int i=0;i<5;i++) {
    		arr.add(2*i);
    	}
    	arr.forEach((item)-> System.out.println(item*2));
    	Operation sum=(a,b)-> a+b;
    	Operation prod=(a,b)-> a*b;
    	
     }
     int sum(int a,int b) {
    	 return a+b;
     }
}
interface Operation{
	int opertion(int a,int b);
}
