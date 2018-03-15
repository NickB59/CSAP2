 	//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{ 
	//private double[] grades;
	private ArrayList<Double> grades;
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		/*Scanner s = new Scanner(gradeList);
		if(s.hasNext()){
			grades = new double[s.nextInt()];
		}
		else 
			grades = new double[0];
		int i =0;
		if(s.hasNext())
			s.next();
		//while(s.hasNext()){
		for(int j = 0; j<grades.length; j++){
			grades[j] = s.nextDouble();
			//i++;
		}*/
		Scanner check = new Scanner(gradeList);
		grades = new ArrayList<Double>();
		while(check.hasNextDouble()){
			grades.add(check.nextDouble());
		}
		check.close();
	}
	
	public ArrayList<Double> getGrades(){
		return grades;
	}
	
	public void setGrade(int spot, double grade)
	{
		//grades[spot] = grade;
		grades.set(spot, grade);
	}
	
	
	public double getSum()
	{
		double sum=0.0;
		/*for(int i = 0; i < grades.length; i++){
			sum += grades[i];
		}*/
		for(int i=0; i<grades.size(); i++) {
			sum+=grades.get(i);
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		/*for(int i = 0; i < grades.length; i++){
			if(grades[i]<low)
				low = grades[i];
		}*/
		for(int i=0; i<grades.size(); i++) {
			if(grades.get(i)<low) {
				low = grades.get(i);
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		/*for(int i = 0; i < grades.length; i++){
			if(grades[i]>high)
				high = grades[i];
		}*/
		for(int i=0; i<grades.size(); i++){
			if(grades.get(i)>high)
				high = grades.get(i);
		}
		return high;
	}
	
	public int getNumGrades()
	{
		//return grades.length;
		return grades.size();
	}
	
	public String toString()
	{
		String output= "";
		/*for(int i = 0; i < grades.length; i++){
			output = output + grades[i] + " ";
		}*/
		for(int i=0; i<grades.size(); i++){
			output+=grades.get(i)+" ";
		}

		return output;
	}	
}