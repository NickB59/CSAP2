//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String question = " ";
		
		do{
			int guess = 0;
			out.print("Guessing game - how many?");
			guess = keyboard.nextInt();
			
			GuessingGame newGame = new GuessingGame(guess);
			newGame.playGame();
			out.println(newGame);
			out.println("Do you want to play again?");
			question = keyboard.nextLine();
		}while(question.equalsIgnoreCase("y"));
	}
}