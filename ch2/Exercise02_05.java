import java.util.Scanner;
public class Exercise02_05
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();

		double Choujin = gratuity / 100.0;
		double total = subtotal + Choujin;

		System.out.println(" The gatui is" + Choujin + " and total is " + total);
	}
}