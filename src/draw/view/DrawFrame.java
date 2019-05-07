package draw.view;

import javax.swing.JFrame;
import draw.controller.DrawController;

public class DrawFrame extends JFrame
{
	private DrawController app;
	
	public DrawFrame(DrawController app)
	{
		super();
		
		this.app = app;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1000, 800);
		this.setResizable(false);
		this.setVisible(true);
	}
}
