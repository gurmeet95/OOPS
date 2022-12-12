package InterfaceExtenddemo;

public class NestedInterface {
     public interface NestedInt{
    	 boolean isodd(int num);
}
}
class B4 implements NestedInterface.NestedInt{

	@Override
	public boolean isodd(int num) {
		// TODO Auto-generated method stub
		return (num & 1)==1;
	}
	// nested interface can be declared as public,private or protected.
	//Top level interface can be public or default one.
}

