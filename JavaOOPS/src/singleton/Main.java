package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Singleton obj=Singleton.getInstance();
         Singleton obj1=Singleton.getInstance();
         Singleton obj2=Singleton.getInstance();
         // All three ref variable are pointing to just one object.
	}

}
