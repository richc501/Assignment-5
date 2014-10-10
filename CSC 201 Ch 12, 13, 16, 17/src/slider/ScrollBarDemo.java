package slider;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
//Richard Cunningham
//Problem Statement
//Write a program that uses scroll bars to select the foreground color of a label. Three horizontal scroll bars 
//are used for selecting the color’s red, green, and blue components. Use a title border on the panel that holds the scroll bars.
//Directions
//Create a class named ScrollBarDemo extends JFrame.
//Create user interface using JPanel, JLabel, JScrollBar.
//Use TitleBorder on the panel that holds the scroll bars (example code below).
//panel.setBorder(new CompoundBorder(new TitledBorder("Choose colors"),
//new EmptyBorder(2, 2, 2, 2)));
//Register listener for the scroll bars
//Create a class named Listener implements ChangeListener
//Set the color label based on Red, Green, Blue from the constructor of Color class
//Set the tile of JFrame to “Scroll Bars Demo”, center the frame, set size to 300 by 200, and make the frame visible
//Test the program to verify that the foreground color changes in the label as you adjust the scroll bars.
//Revise the program using JSlider instead of JScrollBar and title the frame to Slider Demo.
//Provide appropriate Java comments
//Post your Java source code file and captured output image in Blackboard.
@SuppressWarnings("serial")
public class ScrollBarDemo extends JFrame{
	public static JFrame frame = new JFrame("ScrollBar Demo");
	public static JPanel panel = new JPanel();
	public static JPanel showColorPanel= new JPanel();
	public static JLabel showColor = new JLabel("Show Color");
	public static JLabel redLabel = new JLabel("Red");
	public static JLabel greenLabel = new JLabel("Green");
	public static JLabel blueLabel = new JLabel("Blue");
	public static JSlider redSlider = new JSlider(JSlider.HORIZONTAL);
	public static JSlider greenSlider = new JSlider(JSlider.HORIZONTAL);
	public static JSlider blueSlider  = new JSlider(JSlider.HORIZONTAL);
	public ScrollBarDemo()
	{
		redSlider.setMaximum(255);//set max values
		greenSlider.setMaximum(255);
		blueSlider.setMaximum(255);
	}
	public static void main(String[] args)
	{
		Listener listen = new Listener();//makes listener
		redSlider.addChangeListener(listen);//adds listeners
		greenSlider.addChangeListener(listen);
		blueSlider.addChangeListener(listen);
		//sets title to panel
		panel.setBorder(new CompoundBorder(new TitledBorder("Choose colors"),
				new EmptyBorder(2, 2, 2, 2)));
		panel.setLayout(new GridLayout(3,2));//sets grid layout
		//adds labels and sliders to panel
		panel.add(redLabel);
		panel.add(redSlider);
		panel.add(greenLabel);
		panel.add(greenSlider);
		panel.add(blueLabel);
		panel.add(blueSlider);
		showColorPanel.setLayout(new FlowLayout());
		showColorPanel.add(showColor);
		frame.setLayout(new BorderLayout());
		frame.add(showColorPanel,BorderLayout.CENTER);
		frame.add(panel,BorderLayout.SOUTH);
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null); // makes frame center
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
