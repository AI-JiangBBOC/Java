public class ShowCurrentTime
{
	public static void main(String[] args){
		long totalMilliseconds = System.currentTimeMillis();//�����ܺ���

		long totalSeconds = totalMilliseconds / 1000;//�����������

		long currentSecond = totalSeconds % 60;//��ǰ����

		long totalMinutes = totalSeconds / 60;//�ܷ�����
		
		long currentMinute = totalMinutes % 60;//��ǰ������

		long totalHours = totalMinutes / 60;//��Сʱ

		long currentHour = totalHours % 24;//��ǰСʱ����

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
		
	}
}