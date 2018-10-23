public class ShowCurrentTime
{
	public static void main(String[] args){
		long totalMilliseconds = System.currentTimeMillis();//返回总毫秒

		long totalSeconds = totalMilliseconds / 1000;//求得总秒数。

		long currentSecond = totalSeconds % 60;//当前秒数

		long totalMinutes = totalSeconds / 60;//总分钟数
		
		long currentMinute = totalMinutes % 60;//当前分钟数

		long totalHours = totalMinutes / 60;//总小时

		long currentHour = totalHours % 24;//当前小时数。

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
		
	}
}