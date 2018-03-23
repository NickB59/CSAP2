//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	//initialization of String word the string 
	public Word( String s )
	{
		word = s;

	}

	//Comparing the word in this class to the word given
	public int compareTo( Word rhs )
	{
		//If the word is longer than the word, then return 1
		if (word.length()>rhs.toString().length())
			return 1;
		//If the word length equals the given word, compare in an alphabetical sense
		else if(word.length()==rhs.toString().length()){
			return word.compareTo(rhs.word);
			}
		else{
			return -1;
		}
	}
	//Accessor method 
	public String toString()
	{
		return word;
	}
}