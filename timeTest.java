import java.util.Timer;
import java.util.TimerTask;

public class timeTest
{
	static int seconds=0, minutes=0, hours =0;
	
	public static void main(String[] args)
	{
		Timer time = new Timer();
		TimerTask taske = new task();
		time.scheduleAtFixedRate(taske,0,1000);
	}
	
	static class task extends TimerTask
	{
		public void run()
		{
			seconds++;
			if(seconds == 60)
			{
				seconds = 0;
				minutes++;
			}
			if(minutes == 60)
			{
				minutes = 0;
				hours++;
			}
			System.out.println(hours+":"+minutes+":"+seconds);
		}
	}
}