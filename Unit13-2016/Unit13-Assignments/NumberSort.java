//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;

		for(int i = number; i>0; i=i/10){
			count++;
		}
		
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int digits = getNumDigits(number);
		int[] sorted = new int[digits];
		
		for(int i = 0; i < digits;i++){
			for(int j = 0; i < digits - 1; j++){
				if(sorted[j]>sorted[j+1]){
					int temp = sorted[j];
					sorted[j] = sorted[j+1];
					sorted[j+1] = temp;
				}
			}
		}
		return sorted;
	}
}