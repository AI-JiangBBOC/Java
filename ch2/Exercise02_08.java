import java.util.Scanner;
public class Exercise02_08
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long keke = input.nextInt();
		long totalMilliseconds = System.currentTimeMillis();//��ǰ�ܺ�����

		long totalSeconds = totalMilliseconds / 1000;//��ǰ��������

		long currentSecond = totalSeconds % 60;//��ǰ����

		long totalMinutes = totalSeconds / 60;//��ǰ�ܷ�����

		long currentMinute = totalMinutes % 60;//��ǰ������

		long totalHours = totalMinutes / 60;//��Сʱ����

		long currentHour = (totalHours + keke) % 24;//��ǰСʱ����

		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);


	}
}