//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

public class TheGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGame()
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);
		
		
		Pong pong_game = new Pong();
		((Component)pong_game).setFocusable(true);			
		getContentPane().add(pong_game);
						
		setVisible(true);
		
		
		/*
		Breakout breakout_game = new Breakout();	
		((Component)breakout_game).setFocusable(true);
		getContentPane().add(breakout_game);
		*/
		
		/*
		//uncomment to test airhockey
		AirHockey hockey_game = new AirHockey();
		((Component)hockey_game).setFocusable(true);	
		getContentPane().add(hockey_game);
		*/
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		TheGame run = new TheGame();
	}
}