package view;

import javax.swing.JButton;
import javax.swing.JLabel;

public class UpgradeButton extends JButton{
	private String title;
	private boolean visible;
	private int id;
	private int price;
	
	public UpgradeButton(int id, String title, int price, boolean visible) {
		JLabel btnTitle = new JLabel(title);
		JLabel btnPrice = new JLabel(""+price);
		this.add(btnTitle);
		this.add(btnPrice);
		this.title = title;
		this.price = price;
		this.id = id;
		this.visible = visible;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getId(){
		return id;
	}
	
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
