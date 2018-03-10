//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Lab16e
{
	public static void main( String args[] ) throws IOException
	{
		Histogram test = new Histogram(new char[]{'a','b','c'},"C:\\Users\\bnick\\Desktop\\CSAP2\\Unit10-2016\\Unit10-Assignments\\Lab16e\\lab16e1.dat");
		test.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+test.mostFrequent());
		out.println("Letter occurring least : "+test.leastFrequent());
		out.println("\n");
		out.println(test);
		
		Histogram tes = new Histogram(new char[]{'d','e','a'},"C:\\Users\\bnick\\Desktop\\CSAP2\\Unit10-2016\\Unit10-Assignments\\Lab16e\\lab16e2.dat");
		tes.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+tes.mostFrequent());
		out.println("Letter occurring least : "+tes.leastFrequent());
		out.println("\n");
		out.println(tes);
		
		Histogram te = new Histogram(new char[]{'x', 'a', 'r', 'g'},"C:\\Users\\bnick\\Desktop\\CSAP2\\Unit10-2016\\Unit10-Assignments\\Lab16e\\lab16e3.dat");
		te.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+te.mostFrequent());
		out.println("Letter occurring least : "+te.leastFrequent());
		out.println("\n");
		out.println(te);
	}
}