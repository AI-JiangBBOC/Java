import java.util.Scanner;
public class Exercise02_14
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		double pounds = input.nextDouble();
		System.out.println("Enter weigth in inches:");
		double inches = input.nextDouble();
		double kg = pounds * 0.45359237;
		double metre = inches * 0.0254;
		double BMI = kg / (metre * metre);

		System.out.println("BMI is:" + BMI);
	}
}