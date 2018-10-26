import java.util.Scanner;

public class Exercise03_06 {
	public static void main(String[] args) {
		System.out.print("Enter weight in pounds");
		Scanner input = new Scanner(System.in);
		double pounds = input.nextDouble();
		System.out.print("Enter feet");
		double feet = input.nextDouble();
		System.out.print("Enter inches:");
		double inches = input.nextDouble();
		
		double kg =pounds * 0.45359237;
		double metre = (feet * 12 + inches) * 0.0254;
		double BMI = kg / (metre * metre);
		System.out.println("BMI is " + BMI);
		if (BMI <18.5)
			System.out.println("Underweight");
		else if(BMI < 25)
			System.out.println("Normal");
		else if (BMI < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
		
	}
}
