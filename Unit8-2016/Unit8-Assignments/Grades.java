//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	int num = 0;
	String grades = ""; //add a double 
	public double[] gradeArray;
	

	//constructor
	public Grades(int a, String b)
	{
		num = a;
		grades = b;
		gradeArray = new double[a];
	}


	//set method
	public void setArray()
	{
		int count = 0;
		Scanner scan = new Scanner(grades);
		while(scan.hasNextDouble())
		{
			gradeArray[count] = scan.nextDouble();
			count++;
		}
	}


	private double getSum()
	{
		double sum=0.0;
		
		Scanner scan2 = new Scanner(grades);
		while(scan2.hasNextDouble())
		{
			sum += scan2.nextDouble();
		}

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
			average = (getSum()/num);


		return average;
	}


	public String toString()
	{
		String output = "";
		int count = 0;
		for(int i = 0; i<gradeArray.length-1; i++){
			output += ("grade " + (count+1) + " : " + gradeArray[i] + "\n");
			count++;
		}
		output += "\n" + getAverage();
		return output;
	}



}