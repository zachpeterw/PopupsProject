package popups.view;
import javax.swing.JOptionPane;

public class PopupViewer 
{
	/**
	 * creates a popup to show the user a String.
	 * @param message the String to show the user.
	 */
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Creates a popup to ask a question to the user. Stores the response
	 * as a String
	 * @param question The question being asked to the user
	 * @return The users response.
	 */
	
	public String collectResponse(String question)
	{
		String response = "";
		response = JOptionPane.showInputDialog(null, question);
		return response;
	}

	/**
	 * Creates a popup to ask a yes/no/cancel type question
	 * @param question The question being asked the user.
	 * @returnThe constant value from JOptionPane for y/n/c
	 */
	
	public int collectUserOption(String question)
	{
		int response = 0;
		response = JOptionPane.showConfirmDialog(null,  question);
		return response;
	}
}
