package Controller;

import View.RecursionFrame;
import model.RecursionTool;
import model.CodeTimer;
public class RecursionController 
{
	private RecursionFrame baseFrame;
	private CodeTimer baseTime;
	private CodeTimer time;
	private RecursionTool mathTool;
	private String calculatedValue;
	
public RecursionController()
{
	mathTool = new RecursionTool();
	baseTime = new CodeTimer();
	baseFrame = new RecursionFrame(this, baseTime);

}
public void start()
{
time.startTimer();
calculatedValue = Double.toString(mathTool.getFibNumber(0));	
time.stopTimer();
time.toString();
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
	calculatedValue = "the factorial of " +inputValue+ " is " +Double.toString(mathTool.getFactorialNumber(Integer.parseInt(inputValue)));
	return calculatedValue;
}

}
