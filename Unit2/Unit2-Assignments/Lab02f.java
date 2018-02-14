//© A+ Computer Science  -  www.apluscompsci.com
//Name - Nick Bhattacharya
//Date - 2/5/18
//Class - AP Computer Science A P.2
//Lab  - Lab02f

public class Lab02f
{
	public static void main( String[] args )
   {
		Line str = new Line(1, 2, 3, 4);
		
		str.setCoordinates(1, 9, 14, 2);
		str.calculateSlope();
		str.print();
		str.setCoordinates(1, 7, 18, 3);
		str.calculateSlope();
		str.print();
		str.setCoordinates(6, 4, 2, 2);
		str.calculateSlope();
		str.print();
		str.setCoordinates(4, 4, 5, 3);
		str.calculateSlope();
		str.print();
		str.setCoordinates(1, 1, 2, 9);
		str.calculateSlope();
		str.print();
		
		
	}
}