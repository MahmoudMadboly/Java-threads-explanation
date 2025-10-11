package excersices;



//Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

public class EvenAndOddNumbers extends Thread{
	
	
Object lock = new Object();
	
	boolean isEvenThread;
	
	int maxNumber = 20;
	
	
	public EvenAndOddNumbers(boolean evenThread) {
		
		this.isEvenThread = evenThread;
		
	}

	
	
	

	public void run() {

		
		for(int i =1; i<=maxNumber; i++) {

			synchronized (lock) {

				if(i%2==0 && isEvenThread) {

					System.out.println(currentThread().getName() +
							"/ " + "the number " + i +  " is an even number");

				}	else if(i%2!= 0 && !isEvenThread) {


					System.out.println(currentThread().getName() +
							"/ " + "the number " + i +  " is an odd number");

				}

			}

		}


	}

	public static void main(String[] args) {

		EvenAndOddNumbers oddThread = new EvenAndOddNumbers(true);
		EvenAndOddNumbers evenThread = new EvenAndOddNumbers(false);
		
		oddThread.setName("Odd Thread");
		
		evenThread.setName("Even Thread");

		oddThread.start();

		evenThread.start();


	}
}