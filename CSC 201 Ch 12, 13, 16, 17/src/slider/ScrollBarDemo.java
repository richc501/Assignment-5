package slider;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

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
