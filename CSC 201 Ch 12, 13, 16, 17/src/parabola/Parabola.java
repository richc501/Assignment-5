package parabola;
import javax.swing.*;
//Richard Cunningham
//Problem Statement
//In algebra, we use f(x) = x^2 function to graph a parabola. You will be using the Java Graphics class to draw a diagram for the function f(x) = x^ 2 on a GUI component.
//The Graphics class provides the methods for drawing strings, lines, rectangles, ovals, arcs, polygons, and polylines. Think of a GUI component as a piece of paper 
//and the Graphics object as a pencil or paintbrush. You can apply the methods in the Graphics class to draw graphics on a GUI component. To draw on a component, 
//you need to define a class that extends JPanel and overrides its paintComponent method to specify what to draw. The signature of the paintComponent method is as follows:
//protected void paintComponent(Graphics g)
//Add points to a polygon p using the following loop:
//double scaleFactor = 0.1;
//for (int x=-100; x<=100; x++) {
//p.addPoint(x+200, 200- (int)(scaleFactor *x *x));
//}
//Connect the points using g.drawPolyline(p.xpoints, p.ypoints, p.npoints) for a Graphics object g. p.xpoints returns an array of x-coordinates, p.ypoints an array 
//of y-coordinates, and p.npoints the number of points in Polygon object p.
//Directions
//Create a class named Parabola extended from JFrame. 
//Create an inner class named GraphPanel extended from JPanel class and overrides its paintComponent method to specify what to draw.
//Draw graph using drawPolyline method of Graphics class 
//Draw line for x and y axes
//Draw string on the graph to label the graph name and x and y axes 
//Add GraphPanel to JFrame and set frame title to Parabola
//Set appropriate size to JFrame and make the frame visible
//Provide appropriate Java comments
//Upload your Java source code file and your captured output image in Blackboard using the Assignment Upload area below.
@SuppressWarnings("serial")
public class Parabola extends JFrame {
	public Parabola() {
		setTitle("Parabola");
		add(new GraphPanel());
	}
	public static void main(String[] args)
	{
		Parabola frame = new Parabola();
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null); // makes frame center
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
