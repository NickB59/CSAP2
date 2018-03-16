//© A+ Computer Science  -  www.apluscompsci.com
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
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
		
	}


	//write an initialization constructor with an int parameter ht
	public Monster(int h){
		setHeight(h);
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int h, int w){
		setHeight(h);
		setWeight(w);
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int h, int w, int a){
		myHeight = h;
		myWeight = w;
		myAge = a;	
		}


	//modifiers - write set methods for height, weight, and age
	public void setHeight(int myHeight){
		this.myHeight = myHeight;
	}
	
	public void setWeight(int myWeight){
		this.myWeight = myWeight;
	}
	
	public void setAge(int myAge){
		this.myAge = myAge;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight(){
		return myHeight;
	}
	
	public int getWeight(){
		return myWeight;
	}
	
	public int getAge(){
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(getHeight(), getWeight(), getAge());
	}

	public boolean equals( Object obj )
	{
		Monster sully = (Monster)obj;
		if(this.myHeight==sully.getHeight()&&this.myWeight==sully.getWeight()&&this.myAge==sully.getAge())
			return true;
		else
			return false;
	}

	public int compareTo( Object obj )
	{
		Monster mike = (Monster)obj;
		if(this.myHeight>mike.getHeight())
			return 1;
		else if(this.myHeight==mike.getHeight()){
			if(this.myAge==mike.getAge())
				return 1;
			else if(this.myWeight==mike.getWeight()){
				if(this.myAge>mike.getAge())
					return 1;
				else if (this.myAge>mike.getAge())
					return 0;
				return -1;
			}
			return -1;
		}
		return -1;
	}

	//write a toString() method
	public String toString(){
		return ""+getHeight()+" "+getWeight()+" "+getAge();
	}
	
	
}