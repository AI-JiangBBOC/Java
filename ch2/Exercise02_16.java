import java.util.Scanner;
public class Exercise02_16
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side:");
		double side = input.nextDouble();
		double area = 3 * Math.pow(3,0.5) / 2.0 * side * side;

		System.out.println("The area of the hexagon is " + area);
	}
}