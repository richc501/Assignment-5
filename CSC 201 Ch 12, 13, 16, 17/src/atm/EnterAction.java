package atm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class EnterAction extends ATM implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		int correctPin = 1234;
		String inputText = pinInput.getText();
		if(e.getSource()==buttonEnter)
		{
			if(inputText.length()==4)
			{
				@SuppressWarnings("deprecation")
				int pinEntered = Integer.parseInt(pinInput.getText()); 
				//checks if pin number is correct and that trails are not out
				if(correctPin==pinEntered&&trailsLeft>0)
					JOptionPane.showMessageDialog(null,"Welcome", "Display Message", JOptionPane.INFORMATION_MESSAGE);
				else
				{
					//only allows three entries
					if(trailsLeft>0)
						JOptionPane.showMessageDialog(null,"Incorrect Input"+"\n Trails Left= "+(trailsLeft-1), "DisplayMessage", JOptionPane.ERROR_MESSAGE);
					pinInput.setText("");
					trailsLeft--;
					//pops up j option pane when trails is 0
					if(trailsLeft==0)
					{
						JOptionPane.showMessageDialog(null, "Contact Administrator","Display Message", JOptionPane.CLOSED_OPTION);
						System.exit(0);
					}
				}
			}
			else
				JOptionPane.showMessageDialog(null, "Pin inut must be a length of 4","Display Message", JOptionPane.WARNING_MESSAGE);
		}
	}
}
