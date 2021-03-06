//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordA implements Comparable<WordA>
{
	private String word;

	//initalization constructor
	public WordA( String s)
	{
		word = s;
	}

	//Finds how many vowels are in the word above.
	private int numVowels()
	{
		String vowels = "AEIOUaeiou"; //We need this string to see how many vowels there are
		int vowelCount=0; //Setting the vowelCount
		
		for(int i=0;i<word.length();i++){
			for(int j=0;j<vowels.length();j++){
				if(word.charAt(i)==vowels.charAt(j))
					vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(WordA rhs)
	{
		//If there is more vowels in the word than the compared, return 1
		if(this.numVowels()>rhs.numVowels()) 
			return 1;
		//If the word and the compared have the same amount of vowels, compare the words
		else if(this.numVowels()==rhs.numVowels()){ 
			return word.compareTo(rhs.word);
		}
		//If there is more vowels in the compared than the word, return -1
			else
				return -1;
	}

	public String toString()
	{
		return word;
	}
}