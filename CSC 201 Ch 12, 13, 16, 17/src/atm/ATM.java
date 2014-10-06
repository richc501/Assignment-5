package atm;

import java.awt.*;

import javax.swing.*;

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
		frame.setLayout(new BorderLayout());
		frame.add(buttonPanel,BorderLayout.SOUTH);
		frame.add(pinInput,BorderLayout.NORTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
