import java.util.ArrayList;

public class multiple
{
	public static void main(String args[])
	{
		int number = 999, sum = 0;
		ArrayList<Integer> store = new ArrayList<Integer>();
		for( ; number > 0 ; number--)
		{
			if(number % 3 == 0 || number % 5 == 0)
				store.add(number);
		}
		for(int i = 0 ; i < store.size() ; i++)
		{
			sum += store.get(i);
		}
		System.out.println("The sum of the multiples of 3 or 5 below 1000 is " + sum);
	}
}
		