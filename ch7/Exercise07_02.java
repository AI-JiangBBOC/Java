import java.util.Scanner;
public class Exercise07_02 {
	public static void main(String[] args) {
		System.out.println("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		double[] keke = new double[10];
		for(int i = 0;i < keke.length; i++) {
			keke[i] = input.nextDouble();
		}
		for(int i = keke.length-1; i >= 0 ; i--) {
			System.out.println(keke[i]);
		}
	}
}
