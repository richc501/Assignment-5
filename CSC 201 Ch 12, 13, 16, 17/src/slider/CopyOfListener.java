package slider;

import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class CopyOfListener extends CopyOfScrollBarDemo implements AdjustmentListener {
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
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
