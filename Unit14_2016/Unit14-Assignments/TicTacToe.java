//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe() // default constructor
	{
		mat = new char[3][3]; //3x3 since that is what a tic tac toe game is
	}

	public TicTacToe(String game) //creating a tic tac toe game
	{
		mat = new char[3][3]; //3x3 
		
		for(int i=0; i<3; i++){ //Columns
			for(int j=0; j<3; j++){ //Rows
				mat[i][j]=game.charAt(3*i+j); //Sets 3 columns and rows
			}
		}
	}

	public String getWinner()
	{
		//across
		for(int i=0; i<3; i++){ //Checis if the there 
			char a = mat[i][0];
			int count = 0;
			for(int j=0; j<3;j++){
				if(mat[i][j]==a)
					count++;;
			}
		if(count==3)
			return Character.toString(a)+"a";
		else
			count = 0;
		}
		//vertical
		for(int i=0; i<3; i++){
			char b = mat[0][i];
			int count = 0;
			for(int j=0; j<3;j++){
				if(mat[i][j]==b)
					count++;;
			}
		if(count==3)
			return Character.toString(b)+"b";
		}
		//diagonal
		char c =mat[0][0];
		int count = 0;
		for(int j=0; j<3;j++){
			if(mat[j][j]==c)
				count++;
		}
		if(count==3)
			return Character.toString(c)+"c";
		else
			count = 0;
		c=mat[0][2];
		if(mat[1][1]==c&&mat[2][0]==c)
			return Character.toString(c)+"c";
		
		return "";
	}

	public String toString()
	{
		String output="";
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				output = output + mat[i][j];
			}
			output = output + "\n";
		}
		if(getWinner().equals("Xa"))
			output = output + "X wins horizontally!";
		else if(getWinner().equals("Oa"))
			output = output + "O wins horizontally!";
		else if(getWinner().equals("Xb"))
			output = output + "X wins vertically!";
		else if(getWinner().equals("Ob"))
			output = output + "O wins vertically!";
		else if(getWinner().equals("Xc"))
			output = output + "X wins diagonally!";
		else if(getWinner().equals("Oc"))
			output = output + "O wins diagonally!";
		else if(getWinner().equals(""))
			output = output + "cat's game - no winner!";

		return output+"\n\n";
	}
}