package View;

import javax.swing.JFrame;
import Controller.RecursionController;

public class RecursionFrame extends JFrame
{
private RecursionPanel basePanel;
private RecursionController baseController;

public RecursionFrame(RecursionController baseController)
{
	this.baseController = baseController;
	basePanel = new RecursionPanel(baseController);
	setupFrame();
}
private void setupFrame()
{
	this.setContentPane(basePanel);
	this.setSize(500, 500);
	this.setTitle("1123581321");
	this.setVisible(true);
}

}
