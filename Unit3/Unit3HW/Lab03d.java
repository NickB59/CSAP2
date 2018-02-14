//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter side X1:: ");
		int x1 = keyboard.nextInt();
		System.out.print("Enter side X2:: ");
		int x2 = keyboard.nextInt();
		System.out.print("Enter side Y1:: ");
		int y1 = keyboard.nextInt();
		System.out.print("Enter side Y2:: ");
		int y2 = keyboard.nextInt();
		
		Distance ship = new Distance(x1, x2, y1, y2);
		ship.setCoordinates(x1, x2, y1, y2);
		ship.calcDistance();
		ship.print();
		
		System.out.print("Enter side X1:: ");
		int a = keyboard.nextInt();
		System.out.print("Enter side X2:: ");
		int b = keyboard.nextInt();
		System.out.print("Enter side Y1:: ");
		int c = keyboard.nextInt();
		System.out.print("Enter side Y2:: ");
		int d = keyboard.nextInt();
		
		Distance cruiser = new Distance(a, b, c, d);
		cruiser.setCoordinates(a, b, c, d);
		cruiser.calcDistance();
		cruiser.print();
		
		System.out.print("Enter side X1:: ");
		int e = keyboard.nextInt();
		System.out.print("Enter side X2:: ");
		int f = keyboard.nextInt();
		System.out.print("Enter side Y1:: ");
		int g = keyboard.nextInt();
		System.out.print("Enter side Y2:: ");
		int h = keyboard.nextInt();
		
		Distance submarine = new Distance(e, f, g, h);
		submarine.setCoordinates(e, f, g, h);
		submarine.calcDistance();
		submarine.print();
			
	}
}