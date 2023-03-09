package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		double sum = 0.0;
		if (n>0) {
			sum = Math.pow(0.5, n);
			sum += geometricSum(n-1);
		}
		
			// FIXME compute the geometric sum for the first n terms recursively
			return sum;
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		int gcd = 0;
		if (p%q==0) {
			gcd=q;
		}
		else {
			gcd = gcd(q, p%q);
		}
			// FIXME compute the gcd of p and q using recursion
			return gcd;
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int [] reverse = new int [array.length];
		System.arraycopy(array, 0, reverse, 0, array.length);
		return helper(reverse, 0);
	}
		public static int[] helper(int[] array, int index) {
			if (index>=(array.length / 2))
			{
				return array;
			}
			int temp = 0;
			int swapIndex = array.length - 1 - index;
			temp = array [index];
			array [index] = array [swapIndex];
			array [swapIndex] = temp;
			
			return helper(array, index + 1);
		}

		

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
