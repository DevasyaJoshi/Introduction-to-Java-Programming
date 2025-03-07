package Exercise02;

/* @author HARSH PATEL  (20CS050)
(Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
The formula for computing the distance is Note that
you can use Math.pow(a, 0.5) to compute Here is a sample run:
 */
import java.util.Scanner;

public class Exercise02_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double determinant = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		double sqrRoot = Math.pow(determinant, 0.5);
		System.out.printf("The distance between two points is %f", sqrRoot);
	}
}
