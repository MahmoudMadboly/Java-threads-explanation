package excersices;

import java.util.concurrent.ExecutorService;


//Create a Basic Thread to Print "Hello, World!"

public class SayHello_World  extends Thread{
	
	@Override
	  public void run() {
	    System.out.println("Hello, World!");
	  }
		
		
	
	public static void main(String[] args) {
		
		SayHello_World demo = new SayHello_World();
		
		demo.start();
		

	}

}
