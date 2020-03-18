package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButton extends JPanel{
	public PanelButton() {
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
	}
}
