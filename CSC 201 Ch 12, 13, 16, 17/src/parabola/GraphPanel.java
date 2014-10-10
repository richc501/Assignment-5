package parabola;
import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
public class GraphPanel extends JPanel{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawLine(200, 0, 200, 300);//draws y line
		g.drawString("Y",190,10);//Put Y next to y line
		g.drawLine(0, 200, 300, 200);//draws x line
		g.drawString("X",275,212);//Put x next to x line
		g.drawString("X^2 Parabola", 15, 15);//title, draws string 
		g.drawLine(15,15,86,15);//Underlines Title 
		double scaleFactor = 0.1;
		Polygon p = new Polygon();//makes polygon
		//adds points to polygon
		for (int x=-100; x<=100; x++) {

		p.addPoint(x+200, 200- (int)(scaleFactor *x *x));

		}
		g.drawPolygon(p);//draws polygon
	}
}
