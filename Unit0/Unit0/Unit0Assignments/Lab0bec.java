import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab0bec
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne;
		short shortOne;
		int intOne;
		long longOne;

		//decimal variables
		float floatOne;
		double doubleOne;

		//other integer types
		char charOne;

		//other types
		boolean booleanOne;
		String stringOne;	
		
		//byte input
		System.out.print("Enter an byte :: ");
		byteOne = keyboard.nextByte();
		
		//short input
		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();
		
		//int input
		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();
		
		//long input
		System.out.print("Enter a long :: ");
		longOne = keyboard.nextLong();
		
		//float input
		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();
		
		//double input
		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
		
		//char input
		System.out.print("Enter a char (number) :: ");
		charOne = keyboard.next().charAt(0);
		
		//string input
		System.out.print("Enter a string:: ");
		stringOne = keyboard.next();
		
		//boolean input
		System.out.print("Enter a boolean (true or false) :: ");
		booleanOne = keyboard.nextBoolean();
		
		

		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*Nick Bhattacharya        2/1/18*");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16 bit - shortOne = "+shortOne+"\t*");
		System.out.println("*32 bit - doubleOne = "+intOne+"\t*");
		System.out.println("*64 bit - longOne = "+longOne+"\t*");
		System.out.println("*                               *");
		System.out.println("*        real types          \t*");
		System.out.println("*                               *");
		System.out.println("*32 bit - floatOne = "+floatOne+"\t*");
		System.out.println("*64 bit - doubleOne = "+doubleOne+"\t*");
		System.out.println("*                               *");
		System.out.println("*       other integer types     *");
		System.out.println("*                               *");
		System.out.println("*64 bit - charOne = "+charOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*        other types            *");
		System.out.println("*                               *");
		System.out.println("*64 bit - booleanOne = "+booleanOne+"\t*");
		System.out.println("*64 bit - stringOne = "+stringOne+"\t*");
		System.out.println("/////////////////////////////////");





	}
}