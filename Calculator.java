



import java.awt.Color;


import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {
JFrame jf;
JButton sevenButton;
JButton eightButton;
JButton nineButton;
JButton fiveButton;
JButton fourButton;
JButton threeButton;
JButton twoButton;
JButton oneButton;


JButton sixButton,zeroButton;

JLabel display;
   public Calculator() {
    jf= new JFrame("Calculator");
    jf.setLayout(null);
    jf.setSize(600, 600);
    jf.setLocation(300, 150);
    

    
 display=new JLabel("hello");
display.setBounds(30, 40,540,40);
display.setBackground(Color.LIGHT_GRAY);
display.setOpaque(true);
display.setHorizontalAlignment(SwingConstants.RIGHT);
display.setForeground(Color.white);
jf.add(display);

 sevenButton=new JButton("7");
sevenButton.setBounds(30, 130, 80, 80);
sevenButton.addActionListener(this);
jf.add(sevenButton);

 eightButton=new JButton("8");
eightButton.setBounds(130, 130, 80, 80);
eightButton.addActionListener(this);

jf.add(eightButton);

 nineButton=new JButton("9");
nineButton.setBounds(230,130,80,80);
nineButton.addActionListener(this);

jf.add(nineButton);

 sixButton=new JButton("6");
sixButton.setBounds(30, 230,80,80);
sixButton.addActionListener(this);
jf.add(sixButton);

 fiveButton=new JButton("5");

fiveButton.setBounds(130, 230,80,80);
fiveButton.addActionListener(this);
jf.add(fiveButton);


 fourButton=new JButton("4");
fourButton.setBounds(230,230,80,80);
fourButton.addActionListener(this);
jf.add(fourButton);

 threeButton=new JButton("3");
threeButton.setBounds(30, 330, 80, 80);
threeButton.addActionListener(this);
jf.add(threeButton);

 twoButton=new JButton("2");
twoButton.setBounds(130, 330,80,80);
twoButton.addActionListener(this);
jf.add(twoButton);

 oneButton=new JButton("1");
oneButton.setBounds(230,330,80,80);
oneButton.addActionListener(this);
jf.add(oneButton);


JButton dotButton=new JButton(".");
dotButton.setBounds(30, 430, 80, 80);
jf.add(dotButton);
 zeroButton=new JButton("0");
zeroButton.setBounds(130,430,80,80);
zeroButton.addActionListener(this);
jf.add(zeroButton);




JButton equalButton=new JButton("=");
equalButton.setBounds(230,430,80,80);
jf.add(equalButton);


JButton divButton=new JButton("/");
divButton.setBounds(330, 130, 80, 80);
jf.add(divButton);

JButton mulButton=new JButton("X");
mulButton.setBounds(330, 230, 80, 80);
jf.add(mulButton);

JButton minusButton=new JButton("-");
minusButton.setBounds(330, 330, 80, 80);
jf.add(minusButton);
JButton addButton=new JButton("+");
addButton.setBounds(330, 430, 80, 80);
jf.add(addButton);















    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    public static void main(String[] args) {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){
            display.setText("7");
        }else if(e.getSource()==eightButton){
            display.setText("8");
        }else if(e.getSource()==nineButton){
            display.setText("9");
        }else if(e.getSource()==fourButton){
            display.setText("4");
        }else if(e.getSource()==fiveButton){
            display.setText("5");
        }else if(e.getSource()==sixButton){
            display.setText("6");
        }else if(e.getSource()==threeButton){
            display.setText("3");
        }else if(e.getSource()==twoButton){
            display.setText("2");
        }else if(e.getSource()==oneButton){
            display.setText("1");
        }else if(e.getSource()==zeroButton){
            display.setText("0");
        }
        
    }
    


    
        

    
    
}
