//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter Counter = new AtCounter();
		
		//test the code
		int a = 0;
		int b = 0;
		Counter.countAts(a,b);
		System.out.println(a+" "+b+" has "+Counter);
		
		//Repeat for 2 and 5
		AtCounter Counter1 = new AtCounter();
		a = 2;
		b = 5;
		Counter1.countAts(a, b);
		System.out.println(a+" "+b+ " has "+Counter1);
		
		//Repeat for 5 and 0
		AtCounter Counter2 = new AtCounter();
		a = 5;
		b = 0;
		Counter2.countAts(a, b);
		System.out.println(a+" "+b+ " has "+Counter2);
		
		//Repeat for 9 and 9
		AtCounter Counter3 = new AtCounter();
		a = 9;
		b = 9;
		Counter3.countAts(a, b);
		System.out.println(a+" "+b+ " has "+Counter3);
		
		//Repeat for 3 and 9
		AtCounter Counter4 = new AtCounter();
		a = 3;
		b = 9;
		Counter4.countAts(a, b);
		System.out.println(a+" "+b+ " has "+Counter4);
	}
}