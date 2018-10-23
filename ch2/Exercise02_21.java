import java.util.Scanner;
public class Exercise02_21
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double amount = input.nextDouble();
		System.out.println("Enter annual interes rate in percentage:");
		double  mouthRate = input.nextDouble();
		System.out.println("Enter number of years:");
		double years = input.nextDouble();
		
		double value = amount * Math.pow((1 + mouthRate / 100.0 /12),years * 12); 
		System.out.println("Accumulated value is $" + (int)(value * 100) / 100.0);
	}
}