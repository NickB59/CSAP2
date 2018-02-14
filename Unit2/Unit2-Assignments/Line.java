//© A+ Computer Science  -  www.apluscompsci.com
//Name - Nick Bhattacharya
//Date - 2/5/18
//Class - AP Computer Science A P.2
//Lab  - Line
import static java.lang.System.*;

public class Line
{
	private double xOne, yOne, xTwo, yTwo; 
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		
		slope = (yTwo-yOne) / (xTwo-xOne);


	}

	public void print( )
	{
		out.println("The slope is:: " + String.format("%.2f\n",slope) + "\n\n");
	}
}