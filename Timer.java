public class Timer
{
	public static void main(String args[])
	{
	
		int seconds = 0, minutes = 0, hours = 0;
		for(;;)
		{
			System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				
				System.out.println("FAIL");
				break;
			}
			seconds++;
			if(seconds == 60)
			{
				minutes++;
				seconds = 0;
			}
			if(minutes == 60)
			{
				hours++;
				minutes = 0;
			}
		}
	}
}