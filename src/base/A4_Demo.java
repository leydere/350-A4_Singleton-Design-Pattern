package base;

public class A4_Demo {

	 public static void main(String args[]){  

		 Singleton mySingleton = Singleton.getSingleton();
		 System.out.println("The application has started.  Please allow a few seconds for next line to print.  Expecting roughly 4000 milliseconds.");
		 
		 try {
			    Thread.sleep(4000);
			} catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			}
		 
		 System.out.println(mySingleton.getRunningTime());
		 System.out.println("The system is going to run another 6 seconds and the print time in hours represented in decimal fashion.  Expecting roughly 0.002778 hours");

		 try {
			    Thread.sleep(6000);
			} catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			}
		 System.out.println(mySingleton.getRunningTimeinHours());
	 }  	
	
}
