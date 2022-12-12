package InterfaceExtenddemo;

public interface A1 {
   default void fun() {
	   System.out.println("Default implemtation A1");
	   // no need of override this inmain class.
   };
   // static interface methods should have body.
   static void greeting() {
	   System.out.println("Hi I am statice method");
   }
}
