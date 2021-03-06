//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private int [][] maze2;
   private int solved;

	public Maze() //Default Constructor
	{
	   maze = new int[0][0];

	}

	public Maze(int size, String line) // Constructor
	{
		Scanner scan = new Scanner(line); //Scans the file
		maze = new int[size][size]; //Creates a new maze
		for(int i=0; i<size; i++){ //Columns
			for(int j=0;j<size;j++){ //Rows
				maze[i][j]=scan.nextInt(); //Sets the columns and rows
			}
		}
		maze2 = new int[size][size]; //Creates another maze
		for(int i=0; i<size; i++){ //
			for(int j=0;j<size;j++){
				maze2[i][j]=maze[i][j]; //Sets this maze with the old maze
			}
		}


	}

	public boolean hasExitPath(int r, int c)
	{
		if(r>=0&&r<maze2.length&&c>=0&&c<maze2.length&&maze2[r][c]==1){ //If it is within the maze length and = 1
			maze2[r][c] = 2; //Sets it to some sort of 
			if(c>=maze2.length-1){ //If the right side has a 1, then it is solved!
				solved = 1;
				return true;
			}
			else{
				hasExitPath(r-1,c); //up; calls itself again
				hasExitPath(r+1,c); //down; calls itself again
				hasExitPath(r,c-1); //left; calls itself again
				hasExitPath(r,c+1); //right; calls itself again
			}
		}

		return false;
	}

	public String toString()
	{
		String output= "";

		for(int i=0; i<maze.length; i++){ //Outputs the characters for the column
			for(int j = 0; j<maze.length; j++){ //Outputs the characters for the row
				output = output + maze[i][j]; //Outputs the maze
			}
			output = output + "\n";
		}	
		if(solved==1) // If solved, then exit found
			output = output + "exit found\n";
		else if(solved==0)
			output = output + "exit not found\n";
		
		return output;
	}
}