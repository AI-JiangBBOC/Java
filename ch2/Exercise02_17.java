import java.util.Scanner;
public class Exercise02_17
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F:");
		double t = input.nextDouble();
		System.out.println("Entre the wind speed(>=2) in miles per hour:");
		double v = input.nextDouble();

		double t1 = 35.74 + 0.6215 * t - 35.75 * Math.pow(v,0.16) + 0.4275 * t * Math.pow(v,0.16);

		System.out.println("The wind chill index is " + t1);
	}
}