import java.util.Scanner;

public class Exercise03_17 {
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		int game = (int)(Math.random() * 3);
		String computer = null;
		switch (game) {
		case 0:computer = "scissor";break;
		case 1:computer = "rock";break;
		case 2:computer = "paper";break;
		}
		System.out.println("scissor(0),rock(1),paper(2):");
		int guess = input.nextInt();
		String me = null;
		switch (guess) {
		case 0:me = "scissor";break;
		case 1:me = "rock";break;
		case 2:me = "paper";break;
		}
		System.out.println("电脑出的是：" + computer);
		if (guess == game)
			System.out.println("The computer is " + computer + ". you are " + me + " too" +
		". it is a drwa" );
		else if (guess == 0 && game == 2 || guess == 1 && game == 0 || guess == 2 && game == 1) {
			System.out.println("The computer is " + computer + ". your are " + me + " you won");
		}
		else if(guess == 0 && game == 1 || guess ==  1 && game == 2 || guess == 2 && game == 0)
			System.out.println("你输了。");
	}
}
