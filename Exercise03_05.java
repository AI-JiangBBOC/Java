import java.util.Scanner;

public class Exercise03_05
{
	public static void main(String[] args) {
		System.out.println("Enter today's day");
		Scanner input = new Scanner(System.in);
		int today = input.nextInt();
		String keke = null;
		switch (today) {
		case 0 : keke = "Sunday";break;
		case 1 : keke = "Monday";break;
		case 2 : keke = "Tuesday";break;
		case 3 : keke = "Wednesday";break;
		case 4 : keke = "Thursday";break;
		case 5 : keke = "Friday";break;
		case 6 : keke = "Saturday";break;
		}
		System.out.println("Enter the number of days elapsed since today");
		int futureDay = input.nextInt();
		futureDay = (futureDay + today) % 7;
		String hehe = null;
		switch (futureDay) {
		case 0 : hehe = "Sunday";break;
		case 1 : hehe = "Monday";break;
		case 2 : hehe = "Tuesday";break;
		case 3 : hehe = "Wednesday";break;
		case 4 : hehe = "Thursday";break;
		case 5 : hehe = "Friday";break;
		case 6 : hehe = "Saturday";break;
		}
		System.out.println("Today is " + keke + 
				" and the future day is " + hehe);
		
	}

}