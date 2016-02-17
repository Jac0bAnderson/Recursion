package View;

import javax.swing.JFrame;
import model.CodeTimer;
import Controller.RecursionController;

public class RecursionFrame extends JFrame
{
private RecursionPanel basePanel;
private RecursionController baseController;
private CodeTimer baseTime;

public RecursionFrame(RecursionController baseController, CodeTimer baseTime)
{
	this.baseController = baseController;
	this.baseTime = baseTime;
	basePanel = new RecursionPanel(baseController, baseTime);
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
