import java.util.Scanner;
public class Exercise02_01
{
	public static void main(String[] args){
		System.out.println("Enter a degree in Celsius: ");
		Scanner input = new Scanner(System.in);
		double sswd = input.nextDouble();
		double hswd = (9.0/5) * sswd + 32;
		System.out.println(hswd);
	}
}