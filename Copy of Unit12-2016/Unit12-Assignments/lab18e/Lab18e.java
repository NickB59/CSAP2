//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		for(int i=0;i<word.length();i++){
			for(int j=0;j<vowels.length();j++){
				if(word.charAt(i)==vowels.charAt(j))
					vowelCount++;
			}
		}
		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		if(this.numVowels()>rhs.numVowels())
			return 1;
		else if(this.numVowels()==rhs.numVowels()){
			if((int)word.charAt(0) > (int)rhs.toString().charAt(0))
				return 1;
			else if((int)word.charAt(0) == (int)rhs.toString().charAt(0)){
				if((int)word.charAt(1) > (int)rhs.toString().charAt(1))
					return 1;
				if((int)word.charAt(1) == (int)rhs.toString().charAt(1))
					return 0;
				else
					return -1;
			}
			else
				return -1;
		}
		return -1;
	}

	public String toString()
	{
		return word;
	}
}