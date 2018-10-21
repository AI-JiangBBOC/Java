import java.util.Scanner;
public class Exercise02_06
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000:");
		int number = input.nextInt();
		int num1 = number / 100;
		int num2 = number / 10 % 10;
		int num3 = number % 10;
		int total = num1 + num2 + num3;
		System.out.println("The sum of the digits is " + total);
	}
}