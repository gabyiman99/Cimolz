package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelChooser extends JPanel{
	public PanelChooser() {
		super(new GridLayout(2,1));
		this.setBackground(Color.pink);
		JLabel namePrice = new JLabel("name price");
		namePrice.setHorizontalAlignment(JLabel.CENTER);
		this.add(namePrice);
		PanelButton panelButton = new PanelButton();
		this.add(panelButton);
	}
}
