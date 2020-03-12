package base;

public class Singleton {
	 
	 private static Singleton obj=new Singleton();//Early, instance will be created at load time  
	 
	 private Singleton(){}  
	   
	 public static Singleton getSingleton(){  
	  return obj;  
	 }  
	  
	 public void doSomething(){  
	 //write your code  
	 }  
}
