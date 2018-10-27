import java.util.Scanner;

public class Exercise03_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month:");
		int months = input.nextInt();
		System.out.print("Enter the year");
		int year = input.nextInt();
		//boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		String keke;
		switch (months) {
		case 1:keke = "January " ;System.out.println(keke + year +" has 31 days");break;
		case 2:keke = "Febuary " ;if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			System.out.println(keke + year +" has 29 days");
		else
			System.out.println(keke + year +" has 28 days");;break;
		case 3:keke = "March " ;System.out.println(keke + year +" has 31 days");break;
		case 4:keke = "April";System.out.println(keke + year +" has 30 days"); break;
		case 5:keke = "May ";System.out.println(keke + year +" has 31 days");break;
		case 6:keke = "June ";System.out.println(keke + year +" has 30 days"); break;
		case 7:keke = "July " ;System.out.println(keke + year +" has 31 days");break;
		case 8:keke = "August ";System.out.println(keke + year +" has 31 days");break;
		case 9:keke = "September ";System.out.println(keke + year +" has 30 days"); break;
		case 10:keke = "October " ;System.out.println(keke + year +" has 31 days");break;
		case 11:keke = "November ";System.out.println(keke + year +" has 30 days"); break;
		case 12:keke = "Devember ";System.out.println(keke + year +" has 31 days");break;
		}
	}
}
