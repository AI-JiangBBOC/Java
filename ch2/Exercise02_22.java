import java.util.Scanner;
public class Exercise02_22
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();

		int dollar = amount / 100;
		int yue = amount %100;
		int quarter = yue / 25;
		yue = yue % 25;
		int dime = yue / 10;
		yue = yue % 10;
		int nickel = yue / 5;
		yue = yue % 5;
		int penny = yue;
		System.out.println("Your amount " + amount + " consists off");
		System.out.println("      " + dollar + " dollars");
		System.out.println("      " + quarter + " quarters");
		System.out.println("      " + dime + " dimes");
		System.out.println("      " + nickel + " nickels");
		System.out.println("      " + penny + " pennys");
	}
}