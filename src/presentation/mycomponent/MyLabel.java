package presentation.mycomponent;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import presentation.statics.MyColor;
import presentation.statics.MyFont;

public class MyLabel extends JLabel {
	private static final long serialVersionUID = 1L;

	public MyLabel() {
		super();
		this.setBackground(Color.BLACK);
	}

	public MyLabel(String str) {
		super(str);
		this.setFont(MyFont.SMALLEST_PLAIN);
		this.setForeground(Color.WHITE);
	}

	public MyLabel(ImageIcon background) {
		this.setFont(MyFont.SMALL_BOLD);
		this.setForeground(MyColor.MY_RED);
		this.setIcon(background);
	}

	public void setMyIcon(ImageIcon icon) {
		if (icon != null) {
			ImageIcon Icon = icon;
			Image image = Icon.getImage();
			Image temp = image.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_REPLICATE);
			Icon.setImage(temp);
			this.setIcon(Icon);
		}
	}

	public void setTextAndStyle(String str) {
		this.setText(str);
		this.setFont(MyFont.SMALLEST_BOLD);
	}
}
