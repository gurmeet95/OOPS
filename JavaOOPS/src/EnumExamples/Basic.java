package EnumExamples;

public class Basic  {
   enum Week implements A{
	   Monday,Tuesday,Wednesday,Thrusday,Friday,saturday;
	   //these are enum constans
	   // by default public,static and final
	   // since its final can not create child final
	   //type is week
	   Week(){
		   System.out.println("Constutor called for"+ this.toString());
	   }
	   // this is not public or protected only private and default
	   //why - We dont want to create new objects.
	   // this is not the enum concept, thats why.
	   // internally its something like this
	   // public static final week Monday =new Week();
	   public void hello() {
			// TODO Auto-generated method stub
		   System.out.println("Interface working with enum");
			
		}
   }
   public static void main(String [] args) {
	   Week week;
	   week=Week.Monday;
//	   for(Week day: Week.values()) {
//		   System.out.println(day);
//	   }
	 //  System.out.println(week);
	  // System.out.println(week.ordinal()); // positon at which it is present;
	   week.hello();
	   System.out.println(Week.valueOf("Monday"));
   }

}
