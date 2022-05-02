
/**
 * This is HW1, problem 2.
 * @author senhai
 *
 */
public class Cube {
	
	private double sideLength;
	
	/**
	 * This constructs a cube with a specific side value
	 * @param sideLength set the value of the cube's side
	 */
	public Cube(double sideLength) {
		this.sideLength=sideLength;
	}
	
	/**
	 * This returns the surface area of the cube
	 * @return this cube's surface area
	 */
	public double surfaceArea() {
		return this.sideLength*this.sideLength*6;
	}
	
	/**
	 * This returns the volume of the cube
	 * @return this cube's volume
	 */
	public double volume() {
		return this.sideLength*this.sideLength*this.sideLength;
	}

}
