//© A+ Computer Science  -  www.apluscompsci.com
//Name - Nick Bhattacharya
//Date - 2/5/18
//Class - AP Computer Science A - Period 2
//Lab  - Circle
import static java.lang.System.*;
import java.text.DecimalFormat;

public class Circle
{
	private double radius;
	private double area;
	private DecimalFormat df2 = new DecimalFormat (".####");

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = Math.PI*radius*radius;
	}
	
	public void print( )
	{
		out.println("The area of the circle is:: " + df2.format(area) + "\n\n");
	}
}