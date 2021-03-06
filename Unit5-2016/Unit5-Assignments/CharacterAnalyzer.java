//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;
	private int ascii;

	public CharacterAnalyzer()
	{
		

	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;

	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		ascii = theChar; 
		if(ascii > 64 && ascii < 91)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isLower( )
	{
		ascii = theChar; 
		if(ascii > 96 && ascii < 123)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isNumber( )
	{
		ascii = theChar; 
		if(ascii > 47 && ascii < 58)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	

	public int getASCII( )
	{
		return ascii;
	}

	public String toString()
	{
		if(isUpper() == true)
		{
		return "" +getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";
		}
		else if(isLower() == true)
		{
			return "" +getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		}
		else if(isNumber() == true)
		{
			return "" +getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		return null;
	}
}