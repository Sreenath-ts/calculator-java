import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator {
   public Calculator() {
    JFrame jf=new JFrame("Calculator");
    jf.setLayout(null);
    jf.setSize(600, 600);
    jf.setLocation(300, 150);
    

    
JLabel display=new JLabel("hello");
display.setBounds(30, 40,540,40);
display.setBackground(Color.LIGHT_GRAY);
display.setOpaque(true);


jf.add(display);


    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    public static void main(String[] args) {
        new Calculator();
    }
    
}
