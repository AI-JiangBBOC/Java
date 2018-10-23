import java.util.Scanner;
public class Exercise02_11
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of year: ");
		int year = input.nextInt();
		double population= year * ((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45.0) - (365 * 24 * 60 * 60 / 13.0)) + 312032486;

		System.out.println("The population in 5 years is: " + (int)population);
	}
}