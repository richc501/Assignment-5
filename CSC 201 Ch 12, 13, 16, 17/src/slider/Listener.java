package slider;

import java.awt.Color;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Listener extends ScrollBarDemo implements ChangeListener {

	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource()==redSlider)
		{
			Color color = new Color(redSlider.getValue(),greenSlider.getValue() , blueSlider.getValue());
			showColor.setForeground(color);
		}
		else if(e.getSource()==greenSlider)
		{
			Color color = new Color(redSlider.getValue(),greenSlider.getValue() , blueSlider.getValue());
			showColor.setForeground(color);
		}
		else if(e.getSource()==blueSlider)
		{
			Color color = new Color(redSlider.getValue(),greenSlider.getValue() , blueSlider.getValue());
			showColor.setForeground(color);
		}
		
	}

}
