
package javaapplication19;

import javax.swing.JFrame;

public class Main {
    
    public static void main(String[] args) {
         Test frame = new Test();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 20, 450, 700);
        frame.setTitle(" Multiplication Table ");
        
    }
    
}
