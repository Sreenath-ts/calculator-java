



import java.awt.Color;


import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {
    boolean isOperatorClicked=false;
    
JFrame jf;
int temp=0;
String oldValue;
JButton sevenButton;
JButton eightButton;
JButton nineButton;
JButton fiveButton;
JButton fourButton;
JButton threeButton;
JButton twoButton;
JButton oneButton;


JButton sixButton,zeroButton,dotButton,equalButton,divButton,mulButton,minusButton,addButton,clearButton;
String newValue;
float oldValueF;
float newValueF;
float result;

JLabel display;
   public Calculator() {
    jf= new JFrame("Calculator");
    jf.setLayout(null);
    jf.setSize(600, 600);
    jf.setLocation(300, 150);
    

    
 display=new JLabel();
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


dotButton=new JButton(".");
dotButton.setBounds(30, 430, 80, 80);
dotButton.addActionListener(this);
jf.add(dotButton);
 zeroButton=new JButton("0");
zeroButton.setBounds(130,430,80,80);
zeroButton.addActionListener(this);
jf.add(zeroButton);




 equalButton=new JButton("=");
equalButton.setBounds(230,430,80,80);
equalButton.addActionListener(this);
jf.add(equalButton);


 divButton=new JButton("/");
divButton.setBounds(330, 130, 80, 80);
divButton.addActionListener(this);
jf.add(divButton);

mulButton=new JButton("X");
mulButton.setBounds(330, 230, 80, 80);
mulButton.addActionListener(this);
jf.add(mulButton);

minusButton=new JButton("-");
minusButton.setBounds(330, 330, 80, 80);
minusButton.addActionListener(this);
jf.add(minusButton);
addButton=new JButton("+");
addButton.setBounds(330, 430, 80, 80);
addButton.addActionListener(this);
jf.add(addButton);

clearButton=new JButton("clear");
clearButton.setBounds(430, 430, 80, 80);
clearButton.addActionListener(this);
jf.add(clearButton);















    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    public static void main(String[] args) {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){
           
            if(isOperatorClicked){
                display.setText("7");
                isOperatorClicked=false;}
            else {
                display.setText(display.getText()+"7");} 

                
    
           
            
            

    
            
        
             } else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                display.setText("8");
                isOperatorClicked=false;}
            else {
                display.setText(display.getText()+"8");}

                

        }else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                display.setText("9");
                isOperatorClicked=false;
            }else {display.setText(display.getText()+"9");}
        }else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                display.setText("4");
                isOperatorClicked=false;
            }else {display.setText(display.getText()+"4");}
        }else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                display.setText("5");
                isOperatorClicked=false;
            }else {display.setText(display.getText()+"5");}
        }else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                display.setText("6");
                isOperatorClicked=false;
            }else {display.setText(display.getText()+"6");}
        }else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                display.setText("3");
                isOperatorClicked=false;
            }else {display.setText(display.getText()+"3");}
        }else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                display.setText("2");
                isOperatorClicked=false;
            }else {display.setText(display.getText()+"2");}
        }else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                display.setText("1");
                isOperatorClicked=false;
            }else {display.setText(display.getText()+"1");}
        }else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                display.setText("0");
                isOperatorClicked=false;
            }else {display.setText(display.getText()+"0");}
        }else if(e.getSource()==dotButton){
            display.setText(display.getText()+".");
    }else if(e.getSource()==equalButton){
        newValue=display.getText();

        oldValueF=Float.parseFloat(oldValue);
        newValueF=Float.parseFloat(newValue);

    if(temp==1){
        result=oldValueF+newValueF;

        display.setText(result+"");}

        else if(temp==2){
            result=oldValueF-newValueF;
            display.setText(result+"");}

            else if(temp==3){
                result=oldValueF*newValueF;
                display.setText(result+"");}

                else if(temp==4){
                    result=oldValueF/newValueF;
                    display.setText(result+"");}
        }

    else if(e.getSource()==divButton){
        temp=4;
        
        isOperatorClicked=true;
        oldValue=display.getText();

    }else if(e.getSource()==mulButton){
        temp=3;
        
        isOperatorClicked=true;
        oldValue=display.getText();
        
    }else if(e.getSource()==minusButton){
        temp=2;
        isOperatorClicked=true;
        oldValue=display.getText();
        
    }else if(e.getSource()==addButton){

        temp=1;
        
        isOperatorClicked=true;
        oldValue=display.getText();
        
    }else if(e.getSource()==clearButton){
        display.setText("");

        
    }




                    

    


    
        

    
    
}
}
