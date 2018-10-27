import java.util.Scanner;

public class Exercise03_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		int total = number1 + number2;
		System.out.println("What is " + number1 + " + " + number2 + " ?");
		int answer = input.nextInt();
		if(total != answer) {
			System.out.println("you answer is wrong.");
			System.out.println(number1 + " + " + number2 + " should be " + total);
		}
		else {
			System.out.println("You are correct!");
			
		}
	}
}
