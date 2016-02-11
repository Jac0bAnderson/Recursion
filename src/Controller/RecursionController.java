package Controller;

import View.RecursionFrame;
import model.RecursionTool;
public class RecursionController 
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private String calculatedValue;
	
public RecursionController()
{
	mathTool = new RecursionTool();
	baseFrame = new RecursionFrame(this);

}
public void start()
{
calculatedValue = Double.toString(mathTool.getFibNumber(0));	
}

public String getCalculatedValue()
{
	return calculatedValue;
}
public String doFibonacci(String inputValue)
{
	calculatedValue = "The Fibonacci sequence number of " + inputValue + " is " + Double.toString(mathTool.getFibNumber(Integer.parseInt(inputValue)));
	return calculatedValue;
}
public String doFactorial(String inputValue){
	calculatedValue = "the factorial of " +inputValue+ " is " +Double.toString(mathTool.getFactorialNumber(Double.parseDouble(inputValue)));
	return calculatedValue;
}

}
