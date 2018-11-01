import java.util.Scanner;

public class Exercise03_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入包裹质量");
		double zhiliang = input.nextDouble();
		if (zhiliang > 0 && zhiliang <=1) {
			System.out.println("The shipping cost is $3.5");
		}
		else if(zhiliang > 1 && zhiliang <=3) {
			System.out.println("The shipping cost is $5.5");
		}
		else if (zhiliang >3 && zhiliang <= 10) {
			System.out.println("The shipping cost is $8.5");
		}
		else if (zhiliang >10 && zhiliang <= 20) {
			System.out.println("The shipping cost is $10.5");
		}
		else if (zhiliang > 20) {
			System.out.println("The package cannot be shipped");
		}
	}
}
