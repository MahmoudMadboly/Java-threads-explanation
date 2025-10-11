package excersices;


//Write a Java program to create a thread that prints "Hello, World!" repeatedly for 10 iterations with a one-second delay using Thread.sleep()
//use runnable interface.

public class SayHello_World_10_TimesUsingRunnable implements Runnable{


	public void run() {

		for(int i = 10; i>0; i--) {

			System.out.println("hello world");
			
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
	}




	public static void main(String[] args) {
		
		
		
		
		
		SayHello_World_10_TimesUsingRunnable task = new SayHello_World_10_TimesUsingRunnable();
		
		
		Thread th = new Thread(task);
		
		th.start();
		

	}
}