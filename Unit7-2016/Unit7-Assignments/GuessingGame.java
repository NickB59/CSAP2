//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound; 
	public int compChoice;
	public GuessingGame(int g)
	{
		upperBound = g;
		compChoice = (int) (g*Math.random() + 1);

	}

	public void playGame()
	{
		int i = compChoice;
		int top = upperBound;
		double count = 0;
		double input = 0;
		do
		{
			out.println("Enter a number between 1 and " + top);
			Scanner keyboard = new Scanner(System.in);
			input = keyboard.nextInt();
			count++;
		}while(i!=input);
		out.println("It took you " + (int) count + " guesses to guess " + i);
		out.println("You guessed wrong " + (double)(1/count) + " percent of the time.");
	}

	public String toString()
	{
		String output= "";
		
		return output;
	}
}