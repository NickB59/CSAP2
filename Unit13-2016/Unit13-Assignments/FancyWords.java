//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);

	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");

	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		
		Arrays.toString(wordRay);
		for(int i = 0; i<wordRay.length; i++ ){
			if(wordRay[i].length()> max)
				max = wordRay[i].length();
		}
		
		for(int j = 0; j<wordRay.length; j++){
			for(int k = wordRay.length-1; k>= 0; k--){
				if(1+j > wordRay[k].length())
					output = output + " ";
				else
					output = output + wordRay[k].charAt(wordRay[k].length()-(1+j));
			}
			output = output + "\n";
		}
		return output+"\n\n";
	}
}