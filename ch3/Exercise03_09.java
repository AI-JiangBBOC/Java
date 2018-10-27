import java.util.Scanner;

public class Exercise03_09 {
	public static void main(String[] args) {
		
		System.out.print("Enter the first 9 digits of an ISBN ad intger:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int d1 = number / 1_0000_0000; 
		int d2 = number / 1000_0000 % 10; 
		int d3 = number / 100_0000 % 10; 
		int d4 = number / 10_0000 % 10; 
		int d5 = number / 1_0000 % 10; 
		int d6 = number / 1000 % 10; 
		int d7 = number / 100 % 10; 
		int d8 = number / 10 % 10; 
		int d9 = number % 10; 
		int d = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 +
				d7 * 7 + d8 * 8 + d9 * 9) % 11;
		String s = String.valueOf(number);
		if(d == 10)
		{
			if(d1 == 0)
			System.out.println("The ISBN-10 number is " + "0" + s + "X");
			else
				System.out.println("The ISBN-10 number is " + s + "X");
		}
		else {
			if(d1 == 0)
				System.out.println("The ISBN-10 number is " + "0" +s + d);
			else
				System.out.println("The ISBN-10 number is " + s + d);
		}
	}
}
