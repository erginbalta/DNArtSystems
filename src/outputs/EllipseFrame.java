/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.text.AttributedCharacterIterator;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/**
 *
 * @author user
 */
public class EllipseFrame extends JFrame {

    Ellipse e;
    int sz;
    int[] tableSize;

    public EllipseFrame(Color[][] cl, Color bgColor, int size, int sizeRng, int[] sizes, int[] mtrxSize) {
        e = new Ellipse(cl, bgColor, size, sizeRng, sizes, mtrxSize);

        setLayout(new BorderLayout());
        JButton button = new JButton("Save");
        Container c = getContentPane();
        c.add(button, BorderLayout.SOUTH);
        c.add(e, BorderLayout.CENTER);
        sz = size;
        tableSize = sizes;

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveImage();
            }
        });
    }

    public void saveImage() {
        BufferedImage bi = new BufferedImage(tableSize[0], tableSize[1], BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.createGraphics();
        e.paint(g);
        g.dispose();
        String graphFileName = JOptionPane.showInputDialog("Please enter a name for picture ");
        try {
            ImageIO.write(bi, "png", new File(graphFileName + ".png"));
        } catch (Exception e) {
            System.out.println("Kaydedilemedi!");
        }
    }

}
