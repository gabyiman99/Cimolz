package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMain extends JPanel{
	
	//private JButton btn1 = new JButton("btn1");
	//private JButton btn2 = new JButton("btn2");
	//private JButton btn3 = new JButton("btn3");
	
	public PanelMain() {
		super(new BorderLayout());
		BottomPanel panelChoose = new BottomPanel();
		this.add(panelChoose, BorderLayout.SOUTH);
		
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(600,100));
		topPanel.setBackground(Color.yellow);
		
		this.add(topPanel, BorderLayout.NORTH);
	    
	}
}
