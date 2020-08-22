/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ErginBalta
 */
public class Operations {
    
    public Color colors[] = {
        Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.GRAY,
        Color.GREEN,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,Color.PINK,
        Color.RED,Color.WHITE,Color.YELLOW
    };
    
    public Map<String,Color> colorString = new HashMap<>();
    
    public Operations(){
        
        colorString.put("BLACK",Color.BLACK);
        colorString.put("BLUE",Color.BLUE);
        colorString.put("CYAN",Color.CYAN);
        colorString.put("DARK_GRAY",Color.DARK_GRAY);
        colorString.put("GRAY",Color.GRAY);
        colorString.put("GREEN",Color.GREEN);
        colorString.put("LIGHT_GRAY",Color.LIGHT_GRAY);
        colorString.put("MAGENTA",Color.MAGENTA);
        colorString.put("ORANGE",Color.ORANGE);
        colorString.put("PINK",Color.PINK);
        colorString.put("RED",Color.RED);
        colorString.put("WHITE",Color.WHITE);
        colorString.put("YELLOW",Color.YELLOW);
        
        
    }
    
    public char[][] matrixConvert(String str, int[] mtrxSize){
        
        int index = 0;
        char[] strArray = str.toCharArray();
        char[][] matrix = new char[mtrxSize[0]][mtrxSize[1]];
        try{
            for (int i = 0; i< mtrxSize[0]; i++){
                for (int j= 0; j< mtrxSize[1]; j++){
                    char tmp = strArray[index];
                    matrix[i][j] = tmp;
                    index++;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return matrix;
    }
    
    
    
    public int[] findArraySize(int[] sizes, int size, int sizeRange){
        int[] matrixSize = new int[2];
        
        int x = sizes[0];
        int y = sizes[1];
        
        int radius = size + sizeRange;
        
        matrixSize[0] = Math.round(x/radius);
        matrixSize[1] = Math.round(y/radius);
        
        return matrixSize;
    }
    
    public int findNucNumber(int[] sizes, int size, int sizeRange){
        int[] matrixSize = new int[2];
        int x = sizes[0];
        int y = sizes[1];
        
        int radius = size + sizeRange;
        
        matrixSize[0] = Math.round(x/radius);
        matrixSize[1] = Math.round(y/radius);
        
        return matrixSize[0]*matrixSize[1];
    }
    
    public Object[][] colorToObject(Color[][] colorMatrix){
        Object[][] obj = new Object[50][60];
        for(int i= 0; i< 50; i++){
            for (int j= 0; j< 60; j++){
                obj[i][j] = Integer.toString(colorMatrix[i][j].getRGB());
            }
        }
        return obj;
    }
    
    public Color findColor(String color){
        return colorString.get(color);
    }
    
    public Color[][] matrixToColor(String nuc, Map<String,String> nucColors, int[] mtrxSize){
        
        //convert char matrix to color matrix
        
        Color[][] colorMatrix = new Color[mtrxSize[0]][mtrxSize[1]];
        char[][] nucMatrix = matrixConvert(nuc,mtrxSize);
        int ln = nuc.length();
        int ln2 = nucMatrix.length;
        for(int i= 0; i< mtrxSize[0]; i++){
            for (int j= 0; j< mtrxSize[1]; j++){
                String nucs = Character.toString(nucMatrix[i][j]);
                String color = nucColors.get(nucs);
                colorMatrix[i][j] = findColor(color);
            }
        }
        return colorMatrix;
    }
    
}
