package atm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class ClearAction extends ATM implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==buttonClear)
			{
				pinInput.setText(""); 
			}
	}
}
