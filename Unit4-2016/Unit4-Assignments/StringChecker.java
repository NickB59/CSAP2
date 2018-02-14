//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;
	private int JenniferIsStupid, NickIsSmart;


	public StringChecker()
	{
		

	}

	public StringChecker(String s)
	{
		word = s;
		
	}

   public void setString(String s)
   {
   		word = s;
   }

	public boolean findLetter(char c)
	{
		JenniferIsStupid = word.indexOf(c);
		if(JenniferIsStupid == -1)
		{
			return false;
		}
		else
		{
			return true;
		}		
	}

	public boolean findSubString(String s)
	{
		NickIsSmart = word.indexOf(s);
		if(NickIsSmart == -1)
		{
			return false;
		}
		{
			return true;
		}
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}