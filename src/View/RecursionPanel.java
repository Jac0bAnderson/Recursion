package View;

import Controller.RecursionController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RecursionPanel extends JPanel
{
private SpringLayout baseLayout;
private RecursionController baseController;
private JButton fibonacciButton;
private JButton factorialButton;
private JTextArea displayArea;

public RecursionPanel(RecursionController baseController)
{
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	
	setupPanel();
	setupLayout();
	setupListeners();
}
private void setupPanel()
{
	this.setLayout(baseLayout);
}

private void setupLayout()
{
	
}

private void setupListeners()
{
	
}


}
