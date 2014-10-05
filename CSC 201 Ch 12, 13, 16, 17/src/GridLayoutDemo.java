import java.awt.*;
//Richard Cunningham
//Problem Statement
//Write a program that meets the following requirements.
//Create a frame and set its layout to BorderLayout.
//Create two panels and place one panel in the south of the frame and another panel in the center.
//Create six buttons and add them into 2 separated panels.
//Use GridLayout of 2 rows and 2 columns.

import javax.swing.*;
@SuppressWarnings("serial")
public class GridLayoutDemo extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("GridLayout Demo");
		frame.setSize(100, 100);
		//Creates 6 buttons///////////////////////
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		JButton button6 = new JButton("Button 6");
		//////////////////////////////////////////

		//Adds 3 buttons to panel 1///////////////
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,2));
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		//////////////////////////////////////////
		
		//Adds 3 buttons to panel 2///////////////
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2,2));
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		//////////////////////////////////////////
		
		//Adds panels to frame using border layout
		frame.setLayout(new BorderLayout());
		frame.add(panel1, BorderLayout.SOUTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}
