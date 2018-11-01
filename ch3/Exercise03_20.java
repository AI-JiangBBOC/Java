import java.util.Scanner;

public class Exercise03_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F:");
		double fahrenheit = input.nextDouble();
		System.out.println("Enter the wind speed(>=2) in miles per hour:");
		double speed = input.nextDouble();
		boolean keke = fahrenheit >= -58 && fahrenheit <= 41 && speed >=2;
		if (keke) {
			double t = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(speed, 0.16) + 0.4275 * fahrenheit * Math.pow(speed, 0.16);
			System.out.println("The wind chill index is " + t);
		}
		else
			System.out.println("你输入的数值不合法。");
	}
}
