package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class BottomPanel extends JPanel{
	public BottomPanel() {
		super(new GridLayout(1,2));
		this.setPreferredSize(new Dimension(600,100));
		PanelChooser ingredients = new PanelChooser();
		PanelChooser stuff = new PanelChooser();
		ingredients.setBackground(Color.pink);
		stuff.setBackground(Color.blue);
		this.add(ingredients);
		this.add(stuff);
	}
	
	public void addButton(int id, String title, int price, boolean visible) {
		UpgradeButton[] buttons = new UpgradeButton[5];
		for (int i = 0; i <5; i++) {
			String name = "btn" + i;
			buttons[i] = new UpgradeButton(i, name, i, false);
		}
		
	}
}
