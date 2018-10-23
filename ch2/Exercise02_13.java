import java.util.Scanner;
public class Exercise02_13
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount:");
		double x = input.nextDouble();
		double one = x * (1 + 0.00417);
		double two = (x + one) * (1 + 0.00417);
		double three = (x + two) * (1 + 0.00417);
		double four = (x + three) * (1 + 0.00417);
		double five = (x + four) * (1 + 0.00417);
		double six = (x + five) * (1 + 0.00417);

		System.out.println("After the sixth mouth,the account value is $" + six);
	}
}