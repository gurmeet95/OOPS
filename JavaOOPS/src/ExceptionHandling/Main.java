package ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=5;
        int b=0;
        
        try {
        	//int c=a/b;
        	//divide(a,b);
        	String name="Gurmeet";
        	if(name.equals("Gurmeet")) {
        		throw new MyException("Name is GUrmeet");
        	}
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }finally {
        	System.out.println("Always run");
        }

	}
	static int divide(int a,int b) throws ArithmeticException {
		if(b==0){
			throw new ArithmeticException("Please do not divide by 0");
		}
		return a/b;
	}

}
