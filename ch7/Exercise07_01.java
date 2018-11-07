import java.util.Scanner;
public class Exercise07_01 {
	
	public static void main(String[] args) {
		System.out.print("Enter the number of students:");
		Scanner input = new Scanner(System.in);
		int numbersOfStudents = input.nextInt();
		System.out.print("Enter " + numbersOfStudents + " scores:");
		double[] scores = new double[numbersOfStudents];
		for(int i = 0;i < scores.length;i++) {
			scores[i] = input.nextDouble();
		}
		double max = scores[0];
		for(int i = 1;i < scores.length;i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		
		char[] dengji = {'A','B','C','D','F'};
		char k ;
		for(int i=0; i < scores.length;i++) {
			if (scores[i] >= max - 10)
		          k = dengji[0];
		      else if (scores[i] >= max - 20)
		          k = dengji[1];
		      else if (scores[i] >= max - 30)
		    	  k = dengji[2];
		      else if (scores[i] >= max - 40)
		    	  k = dengji[3];
		      else
		    	  k = dengji[4];
			System.out.println("Student " + i + "score is " + scores[i] + " and grade is " + k);
		}
		
	}	
}
