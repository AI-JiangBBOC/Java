import java.util.Scanner;

public class Exercise03_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = (int)(Math.random() * 2);
		System.out.println("���0����1:");
		int guess = input.nextInt();
		while(guess > 1 || guess < 0) {
			System.out.println("���0����1:");
			guess = input.nextInt();
		}
	if (guess == number)
			System.out.println("��¶��ˣ�");
		else
			System.out.println("��´��ˡ�");
	}
}
