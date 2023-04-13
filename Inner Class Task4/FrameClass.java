package InnerClass;
import java.awt.*;
import java.awt.event.*;
class FrameClass
{
 	private Frame f;
 	public FrameClass() 	{
     		f = new Frame("Hey, Welcome To The Application :)");
 	}
 	public void launchFrame() 
	{
 		f.setSize(200,200);
	 	f.setBackground(Color.red);
	 	f.setVisible(true);	
	// Add a window listener
	
	 f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent evt)
	{
		System.exit(0);
	}
	});   //Anonymous Inner Classes 

	 }



 	public static void main(String args[]) 
	{
		FrameClass f = new FrameClass();
		f.launchFrame();
	}
}