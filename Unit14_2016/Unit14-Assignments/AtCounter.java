//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0; 
		//atMat board
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		if(r<10 && r>=0 && c<10 && c>=0 && atMat[r][c]=='@'){ // Checks if it is within the bounds (from 0 to 9) AND if the symbol is an @
			atMat[r][c]='a'; //Replaces that row with a character so it does not disappear
			atCount++; //Adds to counter
				countAts(r-1,c); // Does it for next row
				countAts(r+1,c);
				countAts(r,c-1); // Does it for next column
				countAts(r,c+1);
		}


		return 0; //Returns an int when it's done.
	}

	public int getAtCount()
	{
		return atCount; //Returns the atCount variable
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}