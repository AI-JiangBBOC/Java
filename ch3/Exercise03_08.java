import java.util.Scanner;

public class Exercise03_08 {
	public static void main(String[] args) {
		System.out.println("Enter three numbers:");
		Scanner input = new Scanner(System.in);
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double max = number1;
		if (max < number2)
			max = number2;
		if (max < number3)
			max = number3;
		System.out.println("the max number is:" + max);
	}
}
