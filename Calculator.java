import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
display.setHorizontalAlignment(SwingConstants.RIGHT);
display.setForeground(Color.white);
jf.add(display);

JButton sevenButton=new JButton("7");
sevenButton.setBounds(30, 130, 80, 80);
jf.add(sevenButton);

JButton eightButton=new JButton("8");
eightButton.setBounds(130, 130, 80, 80);
jf.add(eightButton);

JButton nineButton=new JButton("9");
nineButton.setBounds(230,130,80,80);
jf.add(nineButton);

JButton sixButton=new JButton("6");
sixButton.setBounds(30, 230,80,80);
jf.add(sixButton);

JButton fiveButton=new JButton("5");
fiveButton.setBounds(130, 230,80,80);
jf.add(fiveButton);


JButton fourButton=new JButton("4");
fourButton.setBounds(230,230,80,80);
jf.add(fourButton);

JButton threeButton=new JButton("3");
threeButton.setBounds(30, 330, 80, 80);
jf.add(threeButton);

JButton twoButton=new JButton("2");
twoButton.setBounds(130, 330,80,80);
jf.add(twoButton);


JButton oneButton=new JButton("1");
oneButton.setBounds(230,330,80,80);
jf.add(oneButton);


JButton dotButton=new JButton(".");
dotButton.setBounds(30, 430, 80, 80);
jf.add(dotButton);

JButton zeroButton=new JButton("0");
zeroButton.setBounds(130, 430,80,80);
jf.add(zeroButton);


JButton equalButton=new JButton("=");
equalButton.setBounds(230,430,80,80);
jf.add(equalButton);














    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    public static void main(String[] args) {
        new Calculator();
    }
    
}
