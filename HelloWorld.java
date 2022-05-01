import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		Scanner myObj=new Scanner(System.in);
		System.out.print("Hellow World");
		System.out.println("Type an integer: ");
		int typeNumber=myObj.nextInt();
		boolean isNumber=myObj.hasNextInt();
		System.out.println("Numver is :"+typeNumber);
		
		//for foreach , while, case swich
		
		//print 0 to 10;
		//1 while
		//2 for
		//3 foreach
		
		//Array Examples
		int[] intArray=new int[3];
		intArray[0]=2;
		intArray[1]=2;
		intArray[2]=2;
		intArray[3]=2; //----index outof bounded
		
		//O(1) big O worst case bounded;
		//O(n) grow as n   
		//O(n^2) grow as n^2
		
		//Data Structure 
		
		//Fib Recusive
		
		//Fizbuzz
		
		
		//Java Regex
		
		// Java Gabarge colletion
		
		// try catch finally close collection
		
	}
	

}
