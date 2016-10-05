package popups.controller;

import java.util.List;
import java.util.ArrayList;
import popups.view.PopupViewer;
import popups.model.Thingy;

public class PopupsController
{
	private  PopupViewer display;
	private List<Thingy> thingyList;
	private Thingy bork;
	
	public PopupsController()
	{
		display = new PopupViewer();
		//thingylist = new ArrayList<Thingy>();
		
	}
	
	public void start()
	{
		learnLists();
	}

	
	//private void askQuestionLoop()
	//{
	//	String answer = "sample";
	//	while(answer != null && !isDouble(answer))
	//	{
	//		answer = display.collectResponse("must type in a double");
	//	}
	//}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		try
		{
			int validInt = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			display.displayMessage("not a valid integer");
		}
		return isInt;
	}
	
	private void learnLists()
	{
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy firstThingy = new Thingy();
		thingyList.add(firstThingy);
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy secondThingy = new Thingy();
		thingyList.add(secondThingy);
		display.displayMessage("This is the size of the list:" + thingyList.size());
		Thingy thirdThingy = new Thingy();
		thingyList.add(thirdThingy);
		display.displayMessage("This is the size of the list:" + thingyList.size());
		 for (int index = 0; index < 5; index++)
		 {
			 Thingy loopThingy = new Thingy();
			 thingyList.add(loopThingy);
		 }
	
	
	}
	
	

}