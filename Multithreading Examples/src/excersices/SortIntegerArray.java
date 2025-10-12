package excersices;

import java.util.Arrays;


//Write a Java program that sorts an array of integers using multiple threads.

public class SortIntegerArray extends Thread{
	
	String name;
	
	public SortIntegerArray(String threadName) {
		
		this.name = threadName;
		
	}
	
	//the main array
	int[] array = {1,2,6,5,4,8,9,6,4,1,5};
		
	//this is the main array length
	int arrayLength = array.length;
	
	//declaring the final sorted array length
	int [] sortedArray = new int[arrayLength];
	
	//split arrays
	int childArrayLength = arrayLength/2;
	
	int [] childArr1 = new int [childArrayLength];
	
	int [] childArr2 = new int [arrayLength - childArr1.length];
	
	
	public void run() {
		
		childArr1 = Arrays.copyOfRange(array, 0, childArrayLength);
		
		childArr2 = Arrays.copyOfRange(array, childArrayLength, arrayLength);
		
		Arrays.sort(childArr1);
		
		Arrays.sort(childArr2);
		
		
		
		
		
		
		}
	

	public static void main(String[] args) {
		
		SortIntegerArray th1 = new SortIntegerArray("Thread1");
		SortIntegerArray th2 = new SortIntegerArray("Thread2");
		
		th1.start();
		th2.start();
		
		try{
			
			
			th1.join();
			th2.join();
			
		
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		

	}

}
