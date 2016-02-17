package View;

import Controller.RecursionController;
import model.CodeTimer;
import java.awt.Color;
import model.CodeTimer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RecursionPanel extends JPanel
{
private SpringLayout baseLayout;
private RecursionController baseController;
private CodeTimer baseTime;
private JButton fibonacciButton;
private JButton factorialButton;
private JTextField inputField;
private JTextArea resultsArea;
private JLabel timeResults;


public RecursionPanel(RecursionController baseController,CodeTimer baseTime)
{
	this.baseController = baseController;
	this.baseTime = baseTime;
	baseLayout = new SpringLayout();
	fibonacciButton = new JButton("Get the Fibonacci sequence");
	factorialButton = new JButton("Get  ∞");
	inputField = new JTextField(20);
	resultsArea = new JTextArea(10, 20);
	timeResults = new JLabel("time: " );
	
	
	
	
	setupPanel();
	setupLayout();
	setupListeners();
}
private void setupPanel()
{
	this.add(timeResults);
	this.add(fibonacciButton);
	this.add(factorialButton);
	this.add(inputField);
	this.add(resultsArea);
	resultsArea.setWrapStyleWord(true);
	resultsArea.setLineWrap(true);
	this.setLayout(baseLayout);
	this.setBackground(new Color(0,255,127));
	resultsArea.setText(baseController.getCalculatedValue());
}

private void setupLayout()
{
	baseLayout.putConstraint(SpringLayout.NORTH, timeResults, 13, SpringLayout.SOUTH, resultsArea);
	baseLayout.putConstraint(SpringLayout.WEST, timeResults, 0, SpringLayout.WEST, resultsArea);
	baseLayout.putConstraint(SpringLayout.NORTH, resultsArea, 100, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 50, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.EAST, resultsArea, -50, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, fibonacciButton, -72, SpringLayout.SOUTH, this);
	baseLayout.putConstraint(SpringLayout.EAST, fibonacciButton, -138, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.WEST, factorialButton, 206, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, inputField, 25, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.EAST, inputField, -122, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.SOUTH, factorialButton, -6, SpringLayout.NORTH, resultsArea);
}

private void setupListeners()
{
	fibonacciButton.addActionListener(new ActionListener()
	{
		
		public void actionPerformed(ActionEvent click)
		{
			
		String userInput = inputField.getText();
		if(checkInput(userInput))
		{
			resultsArea.setText(baseController.doFibonacci(userInput));
			timeResults.setText(baseTime.toString());
		}
		}
		
	});
	
	factorialButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			String userInput = inputField.getText();
			if(checkInput(userInput))
			{
				resultsArea.append(baseController.doFactorial(userInput));
				timeResults.setText(baseTime.toString());
			}
		}
	});
	
}
private boolean checkInput(String input)
{
	boolean isNumber = false;
	try 
	{
		Double.parseDouble(input);
		isNumber = true;
	}
	catch(Exception numberException)
	{
		resultsArea.setText("Yo dawg just type a number");
	}
	return isNumber;
}


}