package model;

public class RecursionTool 
{
public double getFibNumber(double position)
{
	//Defensive code against user
	if(position < 0)
	{
		return Integer.MIN_VALUE;
	}

	if(position ==0 || position == 1)
	{
		return 1;
	}
	else// recursive case we must keep calling the method.
	{
		return getFibNumber(position -1 ) + getFibNumber(position - 2);
	}
	
}
public double getFactorialNumber(Double position)
{
	if(position < 0)
	{
		return Integer.MIN_VALUE;
	}
	if(position == 0)
	{
		return 1;
	}
	else
	{
		return position * getFactorialNumber(position -1);
	}
}

}
