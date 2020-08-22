/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class RectFrame extends JFrame{
    Rect r;
    int sz;
    int[] tableSize;
    public RectFrame(Color[][] cl, Color bgColor, int size, int sizeRng, int[] sizes, int[] mtrxSize){
        r = new Rect(cl,bgColor,size,sizeRng,sizes,mtrxSize);
        setLayout(new BorderLayout());
        JButton button = new JButton("Save");
        Container c = getContentPane();
        c.add(button, BorderLayout.SOUTH);
        c.add(r, BorderLayout.CENTER);
        sz = size;
        tableSize = sizes;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveImage();
                
            }
        });
        setVisible(false);
    }
    public void saveImage() {
        BufferedImage bi = new BufferedImage(tableSize[0], tableSize[1], BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.createGraphics();
        r.paint(g);
        g.dispose();
        String graphFileName = JOptionPane.showInputDialog("Please enter a name for picture ");
        try {
            ImageIO.write(bi, "png", new File(graphFileName + ".png"));
        } catch (Exception e) {
            System.out.println("Kaydedilemedi!");
        }
    }
}
