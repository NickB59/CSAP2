//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

   public TriangleThree()
   {
   }

   public TriangleThree(int count, String let)
   {
       size = count;
       letter = let;
   }

   public void setTriangle( String let, int sz )
   {
       size = sz;
       letter = let;
   }

   public String getLetter()
   {
       return letter;
   }

   public String toString()
   {
       String output="";
       for(int i = 1; i<=size; i++)
       {
           for(int k = i; k>0; k--)
           {
               output = output + letter + " ";
           }
           output= output + "\n";
       }





       return output+"\n";
   }
}