import java.util.Scanner;

/**
 * This is HW1, problem 3.
 * @author senhai
 *
 */
public class CubeDriver {
	/**
	 * the main method
	 * @param args
	 */
	public static void main(String args[]) {
		
		//Declare a variable that will take a double value from user as cube's side.
		double side;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter a double value of the cube side: ");
		side=scan.nextDouble();
		
		//Create an new Cube object that take side as parameter
		Cube a=new Cube(side);
		
		//Display cube's surface
		System.out.println("Cube surface area: " + a.surfaceArea());
		
		//Display cube's volume
		System.out.println("Cube volume: " + a.volume());
	}

}
