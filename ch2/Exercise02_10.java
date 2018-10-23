import java.util.Scanner;
public class Exercise02_10
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms: ");
		double kilograms = input.nextDouble();

		System.out.println("Enter the initial temperture: ");
		double temperatrue= input.nextDouble();

		System.out.println("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();

		double energy = kilograms * (finalTemperature - temperatrue) * 4184;
		System.out.println("The energy needed is " + energy);

	}
}