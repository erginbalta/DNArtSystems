/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputs;

// java program to draw a ellipse 
// using drawOval function. 
import java.awt.*;
import static java.awt.PageAttributes.MediaType.E;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;
import main.MainPage;
import operations.Operations;

public class Ellipse extends JPanel {


    int weight;
    int height;
    int szRng;
    public Color[][] col;
    int[] tablSize;
    int[] matrixSize;
    private Graphics g;
    Color backColor;
    public Ellipse(Color[][] cll, Color bgColor, int size, int sizeRng, int[] sizes, int[] mtrxSize) {
        col = cll;
        setSize(800, 800);
        setVisible(true);
        this.setBackground(bgColor);
        weight = size;
        height = size;
        szRng = sizeRng;
        tablSize = sizes;
        matrixSize = mtrxSize;
        backColor = bgColor;
    }
   
    // paint the applet 
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(backColor); //BG color eklenecek
        g2d.fillRect(0, 0, tablSize[0], tablSize[1]);

        int x = 2 * szRng;
        for (int i = 0; i < matrixSize[0]; i++) {
            int y = -height;
            for (int j = 0; j < matrixSize[1]; j++) {
                y = y + (weight + szRng);
                int red = col[i][j].getRed();
                int green = col[i][j].getGreen();
                int blue = col[i][j].getBlue();
                g.setColor(new Color(red, green, blue));
                g.fillOval(x, y, weight, height);
            }
            x = x + (weight + szRng);
        }
    }
    
}
