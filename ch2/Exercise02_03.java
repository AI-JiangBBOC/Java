import java.util.Scanner;
public class Exercise02_03
{
	public static void main(String[] args){
		System.out.println("Enter a value for feet: ");
		Scanner imput= new Scanner(System.in);
		double feet = imput.nextDouble();
		double meters = feet * 0.305;
		System.out.println(feet + " feet is " + meters + " meters");
	}
}