/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue.Outils;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Loïc Cimon
 */
public class ImagePanel extends JPanel {

    private Image img;

    public ImagePanel(String img) {
        this.img = new ImageIcon(getClass().getResource(img)).getImage();
        Dimension size = new Dimension(this.img.getWidth(null), this.img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
    
    public void setImage(String img) {
        this.img = new ImageIcon(img).getImage();
        this.repaint();
    }
    
    public Image getImage() {
        return img;
    }
}
