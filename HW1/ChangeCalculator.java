
import java.util.Scanner;


/**
 * This is HW1, problem 1.
 * It is a an application that reads a double value of money,
 * and the application tells the number of bills and coins to match the value
 * @author senhai
 *
 */
public class ChangeCalculator {
	
	/**
	 * the main method
	 * @param args
	 */
	public static void main(String args[]) {
		
			// create 4 variables num20,num10,num5,num1 represent 20,10,5,1 dollar bills
		 	int num20=0;
		 	int num10=0;
		 	int num5=0;
		 	int num1=0;
		 	
		 	// create 4 variables num025,num010,num005,num001 
		 	// represent quarters,dimes,nickels,pennies
		 	int num025=0;
		 	int num010=0;
		 	int num005=0;
		 	int num001=0;
		 	
		 	// create a double type variable called amount that will take user's input as value 
		    double amount;
		    Scanner scan=new Scanner(System.in);
			System.out.println("Please Enter an amount with double value");
			amount=scan.nextDouble();
			
		 	// if the money is over 20, we decrease the value by 20 and increase 1
			// to the number of 20 dollar bills then check again until value is under 20
			if(amount>=20) {
				while(amount>=20) {
					num20++;
					amount=amount-20;
				}
			}
			
		 	// if the money is over 10, we decrease the value by 10 and increase 1 
		 	// to the number of 10 dollar bills
			if(amount>=10) {
				num10++;
				amount=amount-10;
			}
			

		 	// if the money is over 5, we decrease the value by 5 and increase 1 
		 	// to the number of 5 dollar bills
			if(amount>=5) {
				num5++;
				amount=amount-5;
			}
			
		 	// if the money is over 1, we decrease the value by 1 and increase 1 
		 	// to the number of 1 dollar bills then check again until the value is under 1
			if(amount>=1) {
				while(amount>=1) {
					num1++;
					amount=amount-1;
				}
			}
			
		 	// if the money is over 0.25, we decrease the value by 0.25 and increase 1 
		 	// to the number of quarters then check again until the value is under 0.25
			if(amount>=0.25) {
				while(amount>=0.25) {
					num025++;
					amount=amount-0.25;
				}
			}
			
		 	// if the money is over 0.10, we decrease the value by 0.10 and increase 1 
		 	// to the number of dimes then check again until the value is under 0
			if(amount>=0.10) {
				while(amount>=0.10) {
					num010++;
					amount=amount-0.10;
				}
			}
			
		 	// if the money is over 0.05, we decrease the value by 0.05 and increase 1 
		 	//to the number of nickels 
			if(amount>=0.05) {
				num005++;
				amount=amount-0.05;
			}
			
		 	// if the money is over 0.01, we decrease the value by 0.01 and increase 1 
		 	// to the number of pennies then check again until the value is under 0.1
			if(amount>=0.01){
				while(amount>=0.009999) {
					num001++;
					amount=amount-0.01;
				}
			}		
			

			// display bills and coins
			System.out.println(num20+ " twenty dollar bills");
			System.out.println(num10+ " ten dollar bills");
			System.out.println(num5+ " five dollar bills");
			System.out.println(num1+ " one dollar bills");
			System.out.println(num025+ " quarters");
			System.out.println(num010+ " dimes");
			System.out.println(num005+ " nickels");
			System.out.println(num001+ " pennies");

	}
		

	
 

	
	
}
