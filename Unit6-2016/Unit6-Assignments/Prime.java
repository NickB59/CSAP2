//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;
	private int count = 0;

	public Prime()
	{
		
		
	}

	public Prime(int num)
	{
		number = num; 

	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
			for (double i =2; i <= Math.sqrt(number); i++){
				if (number % i == 0)
				{
					count = count +2;
				}
			}
			if(count > 2){
				return false;
			}
			else
			{
				return true;
			}
	}

	public String toString()
	{
		
		String output= "";
		if (isPrime() == true)
		{
			output = + number + " is a prime number";
		}
		else
		{
			output = + number + " is not a prime number";
		}
		return output;
	}
}