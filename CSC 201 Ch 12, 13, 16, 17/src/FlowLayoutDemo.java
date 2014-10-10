import java.awt.*;

import javax.swing.*;
//Richard Cunningham
//Problem Statement
//Write a program that meets the following requirements.
//Create a frame and set its layout to FlowLayout
//Create two panels and add them to the frame
//Each panel contains three buttons. The panel uses FlowLayout.
@SuppressWarnings("serial")
public class FlowLayoutDemo extends JFrame {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("FlowLayout Demo");
		frame.setSize(800, 80);
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
		panel1.setLayout(new FlowLayout());
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		//////////////////////////////////////////
		
		//Adds 3 buttons to panel 2///////////////
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		//////////////////////////////////////////
		
		//Adds panels to frame using border layout
		frame.setLayout(new FlowLayout());
		frame.getContentPane().add(panel1);
		frame.getContentPane().add(panel2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
