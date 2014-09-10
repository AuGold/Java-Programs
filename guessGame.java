import java.util.Random;
import java.util.Scanner;

public class guessGame
{
	public static void main(String args[])
	{
	
		Scanner blargh = new Scanner(System.in);
		Random number = new Random();
		int generate, guess, count = 0;
		generate = number.nextInt(100) + 1;
		for(;;)
		{
			System.out.print("Please input a number from 1 - 100:  ");
			guess = blargh.nextInt();
			if(guess <= 0 || guess >= 101)
				System.out.println("Please input a correct number! >:(");
			else
			{
				for(;;)
				{
					if(guess == generate)
					{
						count++;
						System.out.println("Good job! You input " + count + " numbers before guessing correctly!");
						System.out.println("The number was " + generate + "!");
						System.exit(0);
					}
					else if(guess > generate)
					{
						count++;
						System.out.println("That number is too high! You are at " + count + " inputs so far!");
						for(;;)
						{
							System.out.print("Please input a number from 1 - 100:  ");
							guess = blargh.nextInt();
							if(guess <= 0 || guess >= 101)
								System.out.println("Please input a correct number! >:(");
							else
								break;
						}
					}
					else
					{
						count++;
						System.out.println("That number is too low! You are at " + count + " inputs so far!");
						for(;;)
						{
							System.out.print("Please input a number from 1 - 100:  ");
							guess = blargh.nextInt();
							if(guess <= 0 || guess >= 101)
								System.out.println("Please input a correct number! >:(");
							else
								break;
						}
					}
				}
			}
		}
	}
}