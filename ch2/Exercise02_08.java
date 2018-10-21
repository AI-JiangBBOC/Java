import java.util.Scanner;
public class Exercise02_08
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long keke = input.nextInt();
		long totalMilliseconds = System.currentTimeMillis();//当前总毫秒数

		long totalSeconds = totalMilliseconds / 1000;//当前总秒数。

		long currentSecond = totalSeconds % 60;//当前秒数

		long totalMinutes = totalSeconds / 60;//当前总分钟数

		long currentMinute = totalMinutes % 60;//当前分钟数

		long totalHours = totalMinutes / 60;//总小时数。

		long currentHour = (totalHours + keke) % 24;//当前小时数。

		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);


	}
}