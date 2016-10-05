package popups.view;
import javax.swing.JOptionPane;

public class PopupViewer 
{

	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public String collectResponse(String question)
	{
		String response = "";
		response = JOptionPane.showInputDialog(null, question);
		return response;
	}

	public int collectOption(String question)
	{
		int optionNumber = 0;
		optionNumber = JOptionPane.showConfirmDialog(null,  question);
		return optionNumber;
	}
}
