import java.util.Random;

public class infinite
{
	public static void main(String args[])
	{
		Random generator = new Random();
		for(;;)
			System.out.print(generator.nextInt(2));
	}
}