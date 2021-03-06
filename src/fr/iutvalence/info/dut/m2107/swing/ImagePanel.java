package fr.iutvalence.info.dut.m2107.swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {
 
	/**
	 * Class which allows to set an image background in a frame
	 */
	
    private Image img;
     
    public ImagePanel(Image img){
        this.img = img;
        this.setSize(new Dimension(1000,800));
    }
     
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
}
