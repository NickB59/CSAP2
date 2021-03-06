import java.util.Scanner;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord() //Default Constructor
	{
		mat = new char[0][0];
	}

   public FancyWord(String s) //Constructor
	{
	   mat = new char[s.length()][s.length()]; //New Constructor. Creates row and column of however long the word is
	   
	   for(int i=0;i<s.length();i++){ //Bounds from 0 to the length of the word
		   mat[0][i]=s.charAt(i); // Goes through the top row
		   mat[i][i]=s.charAt(i); // Goes from top left to bottom right
		   mat[s.length()-(i+1)][i]=s.charAt(i); // Goes from top right to bottom left
		   mat[s.length()-1][i]=s.charAt(i); //goes through bottom row
	   }
	}

	public String toString()
	{
		String output= "";
		
		for(int i=0;i<mat.length;i++){ //Sets the bounds of the columns
			for(int j=0;j<mat.length;j++){ // Sets the bounds of the rows
				output = output+mat[i][j]; // Adds each letter to the matrix
			}
			output = output + "\n";
		}
		
		
		
		
		return output+"\n\n";
	}
}