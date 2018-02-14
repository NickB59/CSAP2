//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      
      //call head method
      Robot.head(window);
      //call other methods
      Robot.upperBody(window);
      Robot.lowerBody(window);
      
   }

   public static void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 200);
      window.setColor(Color.GREEN);
      window.fillOval(300, 200, 25, 25);
      window.fillOval(475, 200, 25, 25);
      window.setColor(Color.BLACK);
      window.fillOval(390, 225, 25, 25);
      window.drawArc(375, 265, 50, 50, 0, 180);

		//add more code here
				
   }

   public static void upperBody( Graphics window )
   {
	   window.setColor(Color.BLUE);
	   window.fillRect(300, 300, 200, 200);
	   window.setColor(Color.BLACK);
	   window.drawLine(300, 315, 100, 100);
	   window.drawLine(500, 315, 25, 25);
   }

   public static void lowerBody( Graphics window )
   {

	   window.setColor(Color.GRAY);
	   window.fillRect(300, 525, 50, 200);
	   window.fillRect(450, 525, 50, 200);
	   window.setColor(Color.BLACK);
	  // window.drawLine(300, 315, 100, 100);
	   //window.drawLine(500, 315, 25, 25);

   }
}