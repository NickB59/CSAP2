//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("C:\\Users\\bnick\\Desktop\\CSAP2\\Unit14_2016\\Unit14-Assignments\\lab21i.dat"));
		for(int i = 0;i<6;i++){
			int size = scan.nextInt();
			scan.nextLine();
			String maze = scan.nextLine();
			Maze m = new Maze(size,maze);
			m.hasExitPath(0, 0);
			System.out.println(m);
		}
	}
}