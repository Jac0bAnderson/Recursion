package Controller;

import View.RecursionFrame;
import model.RecursionTool;
public class RecursionController 
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	
public RecursionController()
{
	mathTool = new RecursionTool();
	baseFrame = new RecursionFrame(this);

}
public void start()
{
	
}


}
