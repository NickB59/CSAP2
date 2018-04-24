import java.awt.event.*;
import sun.audio.*;
import javax.swing.*;
import java.io.*;

public class Sound{

	public static void music()
	{
	AudioPlayer MGP = AudioPlayer.player;
	AudioStream BGM;
	AudioData MD;
	ContinuousAudioDataStream loop = null;
	
	try{
	BGM = new AudioStream(new FileInputStream("Game.mp3"));
	MD = BGM.getData();
	loop = new ContinuousAudioDataStream(MD);
	}catch(IOException error){}
	
	MGP.start(loop);
	
}
}
	
