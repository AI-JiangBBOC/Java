import java.util.Scanner;

public class Exercise03_15 {
	public static void main(String[] args) {
		int lottery = (int)(Math.random() * 900) + 100;
		int l1 = lottery % 10;//��Ʊ��λ
		int l2 = lottery /10 % 10;//��Ʊʮλ
		int l3 = lottery / 100;//��Ʊ��λ
		System.out.println("Enter your lottery pick (three digits");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		int g1 = guess % 10;//�µĸ�λ
		int g2 = guess /10 % 10;//�µ�ʮλ
		int g3 = guess /100;//�µİ�λ
		System.out.println("The lottery number is " + lottery);
		if(lottery == guess)
			System.out.println("Exact match:you win $10,000");
		else if(g1 == l1 && g2 == l3 && g3 == l2 ||
				g1 == l2 && g2 == l1 && g3 == l3 ||
				g1 == l2 && g2 == l3 && g3 == l1 ||
				g1 == l3 && g2 == l1 && g3 == l2 ||
				g1 == l3 && g2 == l2 && g3 == l1)
			System.out.println("Match all digits:you win $3,000");
		else if(g1 == l1 || g1 == l2 || g1 == l3 || g2 == l1 || g2 == l2 || g2 == l3 || g3 == l1 || g3 == l2 || g3 == l3)
			System.out.println("Match all digits:you win $1,000");
		else
			System.out.println("Sorry,no match.");
	}
}
