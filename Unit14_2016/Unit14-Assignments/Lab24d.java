//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("C:\\Users\\bnick\\Desktop\\CSAP2\\Unit14_2016\\Unit14-Assignments\\lab24d.dat"));

		int Boards = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i<Boards; i++){
			TicTacToe game = new TicTacToe(file.nextLine());
			System.out.println(game.toString());
		}	}
}



