//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;
	double topOne = 0.0;
	double topTwo = 0.0;
	double bottomOne = 0.0;
	double bottomTwo = 0.0;

	public Quadratic()
	{

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
		topOne = -b + Math.sqrt((Math.pow(b, 2)) - (4.0 * a * c));
		topTwo = -b - Math.sqrt((Math.pow(b, 2)) - (4.0 * a * c));
		bottomOne =  2.0 * a;	
		bottomTwo = 2.0 * a;
 	}

	public void calcRoots( )
	{
		rootOne = topOne/bottomOne;
		rootTwo = topTwo/bottomTwo;
	}

	public void print( )
	{
		out.println("rootone:: " + String.format("%.2f\n", rootOne));
		out.println("roottwo:: " + String.format("%.2f\n", rootTwo));
	}
}