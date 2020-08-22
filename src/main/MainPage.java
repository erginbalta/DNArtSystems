/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import operations.Operations;
import outputs.Ellipse;
import outputs.EllipseFrame;
import outputs.RectFrame;

/**
 *
 * @author ErginBalta
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public String[] squareTableSize = {
        "30x30", "51x51", "97x97", "130x130"
    };

    public String[] rectangleTableSize = {
        "30x41", "46x61", "61x91", "91x137"
    };
    
    public Operations op = new Operations();
    
    Graphics g = new Graphics() {
        @Override
        public Graphics create() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void translate(int x, int y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Color getColor() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setColor(Color c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setPaintMode() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setXORMode(Color c1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Font getFont() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setFont(Font font) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public FontMetrics getFontMetrics(Font f) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Rectangle getClipBounds() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void clipRect(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setClip(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Shape getClip() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setClip(Shape clip) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void copyArea(int x, int y, int width, int height, int dx, int dy) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawLine(int x1, int y1, int x2, int y2) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fillRect(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void clearRect(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawOval(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fillOval(int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawString(String str, int x, int y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void drawString(AttributedCharacterIterator iterator, int x, int y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void dispose() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    public MainPage() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        genArea = new javax.swing.JTextArea();
        executeButton = new javax.swing.JButton();
        ALabel = new javax.swing.JLabel();
        TLabel = new javax.swing.JLabel();
        GLabel = new javax.swing.JLabel();
        CLabel = new javax.swing.JLabel();
        AColor = new javax.swing.JComboBox<>();
        TColor = new javax.swing.JComboBox<>();
        GColor = new javax.swing.JComboBox<>();
        CColor = new javax.swing.JComboBox<>();
        ALabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        shapes = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        BgColor = new javax.swing.JComboBox<>();
        ALabel2 = new javax.swing.JLabel();
        pixelSize = new javax.swing.JSpinner();
        ALabel3 = new javax.swing.JLabel();
        sizeRange = new javax.swing.JSpinner();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        ALabel4 = new javax.swing.JLabel();
        tableSizes = new javax.swing.JComboBox<>();
        executeButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        genArea.setColumns(20);
        genArea.setRows(5);
        jScrollPane1.setViewportView(genArea);

        executeButton.setLabel("Execute");
        executeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeButtonActionPerformed(evt);
            }
        });

        ALabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        ALabel.setText("A");

        TLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TLabel.setText("T");

        GLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        GLabel.setText("G");

        CLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        CLabel.setText("C");

        AColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLACK", "BLUE", "CYAN", "DARK_GRAY", "GRAY", "GREEN", "LIGHT_GRAY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW" }));
        AColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AColorActionPerformed(evt);
            }
        });

        TColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLACK", "BLUE", "CYAN", "DARK_GRAY", "GRAY", "GREEN", "LIGHT_GRAY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW" }));
        TColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TColorActionPerformed(evt);
            }
        });

        GColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLACK", "BLUE", "CYAN", "DARK_GRAY", "GRAY", "GREEN", "LIGHT_GRAY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW" }));
        GColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GColorActionPerformed(evt);
            }
        });

        CColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLACK", "BLUE", "CYAN", "DARK_GRAY", "GRAY", "GREEN", "LIGHT_GRAY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW" }));
        CColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CColorActionPerformed(evt);
            }
        });

        ALabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        ALabel1.setText("Size Range");

        jButton1.setText("Clear");
        jButton1.setMaximumSize(new java.awt.Dimension(76, 32));
        jButton1.setMinimumSize(new java.awt.Dimension(76, 32));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel1.setText("Shape");

        shapes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELLIPSE", "RECTANGLE" }));

        BgColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLACK", "BLUE", "CYAN", "DARK_GRAY", "GRAY", "GREEN", "LIGHT_GRAY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW" }));
        BgColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BgColorActionPerformed(evt);
            }
        });

        ALabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        ALabel2.setText("Size");

        pixelSize.setModel(new javax.swing.SpinnerNumberModel(10, 10, 100, 5));

        ALabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        ALabel3.setText("Bg Color");

        sizeRange.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jRadioButton1.setText("Square");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Rectangle");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        ALabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        ALabel4.setText("Table Size");

        executeButton1.setText("Show Max Nucleotide");
        executeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(executeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ALabel)
                                    .addComponent(TLabel)
                                    .addComponent(GLabel)
                                    .addComponent(CLabel))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(AColor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(GColor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CColor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ALabel1)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ALabel2)
                                    .addComponent(ALabel3))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BgColor, 0, 92, Short.MAX_VALUE)
                                    .addComponent(shapes, 0, 92, Short.MAX_VALUE)
                                    .addComponent(pixelSize)
                                    .addComponent(sizeRange)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(ALabel4))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(tableSizes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(executeButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 113, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(executeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ALabel)
                    .addComponent(AColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TLabel)
                    .addComponent(TColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GLabel)
                    .addComponent(GColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CLabel)
                    .addComponent(CColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shapes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BgColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ALabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pixelSize))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ALabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sizeRange))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ALabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableSizes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(executeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButtonActionPerformed

        String gen = genArea.getText();
        
        Operations op = new Operations();
        Map<String, String> nucColor = new HashMap<>();
        nucColor.put("A", AColor.getSelectedItem().toString());
        nucColor.put("T", TColor.getSelectedItem().toString());
        nucColor.put("G", GColor.getSelectedItem().toString());
        nucColor.put("C", CColor.getSelectedItem().toString());

        
        Color bgColor = op.findColor(BgColor.getSelectedItem().toString());
        int pixSize = (int) pixelSize.getValue();
        int sizeRng = (int) sizeRange.getValue();
        int[] sizes = cmToPixel();
        
        int[] matrixSize = op.findArraySize(sizes, pixSize, sizeRng);
        
        String nwStr = fillMatrix(gen,sizes,pixSize,sizeRng);
        char[][] abc = op.matrixConvert(nwStr,matrixSize);
        Color[][] yxz = op.matrixToColor(nwStr, nucColor,matrixSize);
        
        
        
        if (shapes.getSelectedItem().equals("ELLIPSE")) {
            EllipseFrame elf = new EllipseFrame(yxz, bgColor, pixSize, sizeRng, sizes,matrixSize);
            elf.setSize(900, 900);
            elf.setExtendedState(JFrame.MAXIMIZED_BOTH);
            elf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            elf.setVisible(true);
        } else if (shapes.getSelectedItem().equals("RECTANGLE")) {
            RectFrame rectf = new RectFrame(yxz, bgColor, pixSize, sizeRng, sizes,matrixSize);
            rectf.setSize(900, 900);
            rectf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            rectf.setVisible(true);
        }
    }//GEN-LAST:event_executeButtonActionPerformed

    private void AColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AColorActionPerformed

    }//GEN-LAST:event_AColorActionPerformed

    private void TColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TColorActionPerformed

    private void GColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GColorActionPerformed

    private void CColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CColorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        genArea.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BgColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BgColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BgColorActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected() == true && jRadioButton2.isSelected() == false) {
            jRadioButton2.setEnabled(false);
            tableSizes.removeAllItems();
            for (int i = 0; i < squareTableSize.length; i++) {
                tableSizes.addItem(squareTableSize[i]);
            }
        } else {
            jRadioButton2.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected() == true && jRadioButton1.isSelected() == false) {
            jRadioButton1.setEnabled(false);
            tableSizes.removeAllItems();
            for (int i = 0; i < rectangleTableSize.length; i++) {
                tableSizes.addItem(rectangleTableSize[i]);
            }
        } else {
            jRadioButton1.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void executeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButton1ActionPerformed
        int pixSize = (int) pixelSize.getValue();
        int sizeRng = (int) sizeRange.getValue();
        int[] sizes = cmToPixel();
        int maxNuc = op.findNucNumber(sizes, pixSize, sizeRng);
        JOptionPane.showMessageDialog(null, "Maximum Nucleotide Number : " +Integer.toString(maxNuc));
        
    }//GEN-LAST:event_executeButton1ActionPerformed
    
    public String fillMatrix(String getTxt, int[] sizes, int size, int sizeRange){
        String newNucs="";
        int maxNuc = op.findNucNumber(sizes,size,sizeRange);
        int txtLength = getTxt.length();
        if(txtLength > maxNuc){
            int tmp = txtLength-maxNuc;
            txtLength = txtLength - tmp;
            newNucs = getTxt.substring(0,txtLength);
        } else if(maxNuc > txtLength){
            int tmp = maxNuc - txtLength;
            newNucs = getTxt + getTxt.substring(0,tmp);
        } else {
            newNucs = getTxt;
        }
        
        return newNucs;
    }
    
    public int[] cmToPixel() {
        int[] pixels = new int[2];
        double pixel = 37.795;
        String tableSize = tableSizes.getSelectedItem().toString();
        String[] sizes = tableSize.split("x");
        pixels[0] = Integer.parseInt(sizes[0]);
        pixels[1] = Integer.parseInt(sizes[1]);
        int onePixel = (int) Math.round(pixel);

        pixels[0] = pixels[0] * onePixel;
        pixels[1] = pixels[1] * onePixel;

        return pixels;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> AColor;
    private javax.swing.JLabel ALabel;
    private javax.swing.JLabel ALabel1;
    private javax.swing.JLabel ALabel2;
    private javax.swing.JLabel ALabel3;
    private javax.swing.JLabel ALabel4;
    public javax.swing.JComboBox<String> BgColor;
    public javax.swing.JComboBox<String> CColor;
    private javax.swing.JLabel CLabel;
    public javax.swing.JComboBox<String> GColor;
    private javax.swing.JLabel GLabel;
    public javax.swing.JComboBox<String> TColor;
    private javax.swing.JLabel TLabel;
    private javax.swing.JButton executeButton;
    private javax.swing.JButton executeButton1;
    public javax.swing.JTextArea genArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner pixelSize;
    private javax.swing.JComboBox<String> shapes;
    private javax.swing.JSpinner sizeRange;
    private javax.swing.JComboBox<String> tableSizes;
    // End of variables declaration//GEN-END:variables
}
