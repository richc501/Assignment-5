package atm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction extends ATM implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttonNum1)
		{
			@SuppressWarnings("deprecation")
			String text = pinInput.getText();
			if (text==null)
				text="1";
			else
				text = text+"1";
			pinInput.setText(text);
			System.out.println(text);
		}
		else if(e.getSource()==buttonNum2)
		{
			@SuppressWarnings("deprecation")
			String text = pinInput.getText();
			if (text==null)
				text="2";
			else
				text = text+"2";
			pinInput.setText(text);
			System.out.println(text);
		}
		else if(e.getSource()==buttonNum3)
		{
			@SuppressWarnings("deprecation")
			String text = pinInput.getText();
			if (text==null)
				text="3";
			else
				text = text+"3";
			pinInput.setText(text);
			System.out.println(text);
		}
		else if(e.getSource()==buttonNum4)
		{
			@SuppressWarnings("deprecation")
			String text = pinInput.getText();
			if (text==null)
				text="4";
			else
				text = text+"4";
			pinInput.setText(text);
			System.out.println(text);
		}
		else if(e.getSource()==buttonNum5)
		{
			@SuppressWarnings("deprecation")
			String text = pinInput.getText();
			if (text==null)
				text="5";
			else
				text = text+"5";
			pinInput.setText(text);
			System.out.println(text);
		}
		else if(e.getSource()==buttonNum6)
		{
			@SuppressWarnings("deprecation")
			String text = pinInput.getText();
			if (text==null)
				text="6";
			else
				text = text+"6";
			pinInput.setText(text);
			System.out.println(text);
		}
		else if(e.getSource()==buttonNum7)
		{
			@SuppressWarnings("deprecation")
			String text = pinInput.getText();
			if (text==null)
				text="7";
			else
				text = text+"7";
			pinInput.setText(text);
			System.out.println(text);
		}
		else if(e.getSource()==buttonNum8)
		{
			@SuppressWarnings("deprecation")
			String text = pinInput.getText();
			if (text==null)
				text="8";
			else
				text = text+"8";
			pinInput.setText(text);
			System.out.println(text);
		}
		else if(e.getSource()==buttonNum9)
		{
			@SuppressWarnings("deprecation")
			String text = pinInput.getText();
			if (text==null)
				text="9";
			else
				text = text+"9";
			pinInput.setText(text);
			System.out.println(text);
		}
		else if(e.getSource()==buttonNum0)
		{
			@SuppressWarnings("deprecation")
			String text = pinInput.getText();
			if (text==null)
				text="0";
			else
				text = text+"0";
			pinInput.setText(text);
			System.out.println(text);
		}
	}
}