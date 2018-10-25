import java.util.Scanner;

public class Exercise03_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a,b,c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant = b * b - 4 * a * c;
		if ( discriminant > 0) {
			double x1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			double x2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("The equation has two roots " + x1 + x2);
		}
		else if (discriminant == 0) {
			double x = -b / (2 * a);
			System.out.println("The equation has one root " + x);
		}
		else
			System.out.println("The equation has no real roots");
	}
}
