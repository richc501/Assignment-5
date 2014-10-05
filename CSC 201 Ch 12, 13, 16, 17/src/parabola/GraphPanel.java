package parabola;
import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
public class GraphPanel extends JPanel{
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawLine(	15, 0, 15, 300);//draws y line
		g.drawString("Y",5,10);//Put Y next to y line
		g.drawLine(0, 250, 300, 250);//draws x line
		g.drawString("X",275,262);//Put x next to x line
		double scaleFactor = 0.1;
		Polygon p = new Polygon();//makes polygon
		//adds points to polygon
		for (int x=-100; x<=100; x++) {

		p.addPoint(x+200, 200- (int)(scaleFactor *x *x));

		}
		g.drawPolygon(p);//draws polygon
	}
}
