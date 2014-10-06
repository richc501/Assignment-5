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
//	public static JScrollBar redScrollBar = new JScrollBar(JScrollBar.VERTICAL);
//	public static JScrollBar greenScrollBar = new JScrollBar();
//	public static JScrollBar blueScrollBar = new JScrollBar();
	public static void main(String[] args)
	{
		JScrollBar redScrollBar = new JScrollBar(JScrollBar.VERTICAL,30, 40, 0, 300);
		JScrollBar greenScrollBar = new JScrollBar(JScrollBar.VERTICAL);
		JScrollBar blueScrollBar = new JScrollBar(JScrollBar.VERTICAL);
		panel.setBorder(new CompoundBorder(new TitledBorder("Choose colors"),
				new EmptyBorder(2, 2, 2, 2)));
		panel.setLayout(new GridLayout(3,2));
		panel.add(redLabel);
		panel.add(redScrollBar);
		panel.add(greenLabel);
		panel.add(greenScrollBar);
		panel.add(blueLabel);
		panel.add(blueScrollBar);
		showColorPanel.setLayout(new BorderLayout());
		showColorPanel.add(showColor,BorderLayout.CENTER);
		frame.setLayout(new BorderLayout());
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null); // makes frame center
		frame.add(showColorPanel,BorderLayout.CENTER);
		frame.add(panel,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
