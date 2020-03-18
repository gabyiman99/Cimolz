package view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class FrameMain extends JFrame{
	public FrameMain(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(new PanelMain());
        this.setSize(600, 600);

        //this.pack();
        this.setVisible(true);
    }
}
