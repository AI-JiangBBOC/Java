import java.util.Scanner;

public class Exercise03_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = (int)(Math.random() * 2);
		System.out.println("请猜0或者1:");
		int guess = input.nextInt();
		while(guess > 1 || guess < 0) {
			System.out.println("请猜0或者1:");
			guess = input.nextInt();
		}
	if (guess == number)
			System.out.println("你猜对了！");
		else
			System.out.println("你猜错了。");
	}
}
