package base;

public class Singleton {

	private static Singleton obj = new Singleton();// Early, instance will be created at load time
	private long startedTime;

	private Singleton() {
		startTimer();
	}

	public static Singleton getSingleton() {
		return obj;
	}

	public void doSomething() {
		// write your code
	}

	public String getRunningTime() {

		long elapsedTime = System.currentTimeMillis() - startedTime;
		return "The current running time in milliseconds is: " + elapsedTime;
	}

	public void startTimer() {
		startedTime = System.currentTimeMillis();
	}

	public String getRunningTimeinHours() {

		long elapsedTime = System.currentTimeMillis() - startedTime;
		float floatTime = (float)elapsedTime / 3600000;
		return "The current running time in hours is: " + floatTime;
	}
}
