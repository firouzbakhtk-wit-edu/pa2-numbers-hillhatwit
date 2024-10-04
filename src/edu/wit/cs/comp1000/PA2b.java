package edu.wit.cs.comp1000;
import java.util.Scanner;


/**
 * Solution to the PA2b assignment.
 * 
 * This program prompts the user to input the coefficients a, b, and c of a quadratic equation
 * in the form ax^2 + bx + c = 0, then calculates and outputs the roots of the equation.
 * Depending on the discriminant (b^2 - 4ac), the program will determine if the roots are
 * real or imaginary:
 * - If the discriminant is negative, the roots are imaginary.
 * - If the discriminant is zero, there is one real root (a double root).
 * - If the discriminant is positive, there are two real roots.
 * 
 * The roots are displayed in ascending order if two real roots are found.
 * 
 * @author Harljen Hill
 */
public class PA2b {

	 /**
     * The main method starts the program by prompting the user to input the coefficients a, b, and c.
     * It calculates the discriminant (d = b^2 - 4ac) and determines the nature of the roots:
     * - If d < 0: outputs "Roots: imaginary".
     * - If d == 0: outputs the single real root.
     * - If d > 0: calculates and outputs two real roots in ascending order.
     * 
     * @param args command line arguments, ignored
     */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.print("Enter a b c: " );
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		double d = b*b-(4*a*c);
		if (d<0) {
			System.out.printf("Roots: imaginary%n");
		}else if(d==0) {
			System.out.printf("Root: %.2f%n", ((b*(-1)/(2*a))));
		}else{
			
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
		    double root2 = (-b - Math.sqrt(d)) / (2 * a);
		    if (root1 > root2) {
		    	System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
		    }else{
		    	System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
		    };

		};
		
	}

}
