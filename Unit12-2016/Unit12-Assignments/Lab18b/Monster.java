//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
		
	}


	//write an initialization constructor with an int parameter ht
	public Monster(int h){
		myHeight = h;
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int h, int w){
		myHeight = h;
		myWeight = w;
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int h, int w, int a){
		myHeight = h;
		myWeight = w;
		myAge = a;	
		}


	//modifiers - write set methods for height, weight, and age
	public void setHeight(){
		
	}
	
	public void setWeight(){
		
	}
	
	public void setAge(){
		
	}
	
	
	//accessors - write get methods for height, weight, and age
	
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{


		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;





		return -1;
	}

	//write a toString() method
	
	
}