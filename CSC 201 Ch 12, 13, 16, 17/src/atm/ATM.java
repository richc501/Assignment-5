package atm;

import java.awt.*;

import javax.swing.*;
//Richard Cunningham
//Problem Statement
//Write an ATM PIN authentication module to validate user PIN. If the PIN is correct, the application will display a welcome screen,
//otherwise the application will prompt the user to enter PIN again for 3 more times. After another 3 trials, if the PIN is still 
//incorrect then the message shall be displayed to ask the user to contact administrator to reset the PIN.
//Directions
//Create a class named Atm extends JFrame.
//Create user interface using JPanels, JButtons, JPasswordField, and other GUI components if necessary.
//Add the instances of JButtons using GridLayout to JPanel named buttonPanel. The number keys should be 
//organized in the same order as your cell phone pin pad. Also, add the enter key and clear key on to the same panel. 
//Add buttonPanel to the bottom of JFrame using BorderLayout and set frame title to ATM PIN AUTHENTICATION.
//Add an instance of JPasswordField to the north of JFrame.
//Create an inner listener class named buttonAction to register action to each number button.
//Create an inner listener class named clearAction to register action to clear button.
//Create an inner listener class named enterAction to register action to enter button.
//Declare an integer variable named correctPin and assign 1234 as a class variable.
//If the PIN is correct, a JOPtionPane dialog box will pop up with a welcome screen message.
//If the PIN is incorrect, a JOPtionPane dialog box will pop up with the number of trial left. 
//The ATM system will allow the user to enter incorrect PIN for another 3 trials, 
//before the new JOPtionPane dialog box pops up with contact administrator message.
//Set frame size to 800 x 600 and make the frame visible
//Provide appropriate Java comments
//Upload your Java source code file and your captured output image in Blackboard using the Assignment Upload area below.
@SuppressWarnings("serial")
public class ATM extends JFrame{
	public static JButton buttonNum1 = new JButton("1");
	public static JButton buttonNum2 = new JButton("2");
	public static JButton buttonNum3 = new JButton("3");
	public static JButton buttonNum4 = new JButton("4");
	public static JButton buttonNum5 = new JButton("5");
	public static JButton buttonNum6 = new JButton("6");
	public static JButton buttonNum7 = new JButton("7");
	public static JButton buttonNum8 = new JButton("8");
	public static JButton buttonNum9 = new JButton("9");
	public static JButton buttonClear = new JButton("Clear");
	public static JButton buttonNum0 = new JButton("0");
	public static JButton buttonEnter = new JButton("Enter");
	public static JPasswordField pinInput = new JPasswordField();
	public int trailsLeft=3;
	public int trails;
	public ATM()
	{
		setTitle("ATM PIN AUTHENTICATION");
	}
	public static void main(String[]args)
	{
		
		
		ATM frame = new ATM();
		frame.setSize(800, 600);
		JPanel buttonPanel = new JPanel();
		//Adds buttons to panel
		buttonPanel.setLayout(new GridLayout(4,3));
		buttonPanel.add(buttonNum1);
		buttonPanel.add(buttonNum2);
		buttonPanel.add(buttonNum3);
		buttonPanel.add(buttonNum4);
		buttonPanel.add(buttonNum5);
		buttonPanel.add(buttonNum6);
		buttonPanel.add(buttonNum7);
		buttonPanel.add(buttonNum8);
		buttonPanel.add(buttonNum9);
		buttonPanel.add(buttonClear);
		buttonPanel.add(buttonNum0);
		buttonPanel.add(buttonEnter);
		//adds listeners
		ButtonAction action = new ButtonAction();
		ClearAction clearText = new ClearAction();
		EnterAction enterAction = new EnterAction();
		buttonNum1.addActionListener(action);
		buttonNum2.addActionListener(action);
		buttonNum3.addActionListener(action);
		buttonNum4.addActionListener(action);
		buttonNum5.addActionListener(action);
		buttonNum6.addActionListener(action);
		buttonNum7.addActionListener(action);
		buttonNum8.addActionListener(action);
		buttonNum9.addActionListener(action);
		buttonNum0.addActionListener(action);
		buttonClear.addActionListener(clearText);
		buttonEnter.addActionListener(enterAction);
		//adds panel and password field to frame
		frame.setLayout(new BorderLayout());
		frame.add(buttonPanel,BorderLayout.SOUTH);
		frame.add(pinInput,BorderLayout.NORTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
