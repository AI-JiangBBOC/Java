import java.util.Scanner;

public class Exercise03_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double p1 = input.nextDouble();
		double p2 = input.nextDouble();
		double p3 = input.nextDouble();
		if((p1 + p2) > p3 && (p2 + p3) > p1 && (p1 + p3) > p2) {
			double zhouchang = p1 + p2 + p3;
			System.out.println("�ܳ��ǣ�" + zhouchang);
		}
		else
			System.out.println("����������߲��Ϸ�");
	}
}
