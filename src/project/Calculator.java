package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{           // interface implented(abstraction)

	JLabel displayLabel;		// declared to global variable to get the object to interface action performing
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	 JButton zeroButton;
	 JButton equaltoButton;
	 JButton divisonButton;
	 JButton multiplicationButton;
	 JButton subtractionButton;
	 JButton plusButton;
	 JButton clearButton;
	 boolean isOperatorClicked=false;
	

	public Calculator() {		//constructor
		
		JFrame jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		 jf.setLocation(420,250);		// location of the window when the window is opened(x axix,Y axix)
		
		 
		 displayLabel=new JLabel(); //  
		 displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); // to align the text right || instead of this line we can also use "JLabel displayLabel=new JLabel("hello",SwingConstants.RIGHT);"
		 displayLabel.setBounds(30, 50, 540, 40); // used to give size and padding for the label , 
		 displayLabel.setBackground(Color.gray);
		 displayLabel.setForeground(Color.white);    // used to make the color of the text to white
		 displayLabel.setOpaque(true);				// to visible the color 
		 jf.add(displayLabel);
		
		
		 // buttons starting
		 
		 sevenButton=new JButton("7");
		 sevenButton.setBounds(30, 130, 80, 80);
		 sevenButton.setFont(new Font("Arial",Font.PLAIN,40)); // text modifications in JButton
		 sevenButton.addActionListener(this);                  // passed the current object to the interface
		 jf.add(sevenButton);
		 
		
		 eightButton=new JButton("8");
		 eightButton.setBounds(130, 130, 80, 80);
		 eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		 eightButton.addActionListener(this); 
		 jf.add(eightButton);
		 
		 nineButton=new JButton("9");
		 nineButton.setBounds(230, 130, 80, 80);
		 nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		 nineButton.addActionListener(this); 
		 jf.add(nineButton);
		 
		 
		 // next row buttons
		 
		 fourButton=new JButton("4");
		 fourButton.setBounds(30, 240, 80, 80);
		 fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		 fourButton.addActionListener(this); 
		 jf.add(fourButton);
		 
		 fiveButton=new JButton("5");
		 fiveButton.setBounds(130, 240, 80, 80);
		 fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		 fiveButton.addActionListener(this); 
		 jf.add(fiveButton);
		 
		 
		 sixButton=new JButton("6");
		 sixButton.setBounds(230, 240, 80, 80);
		 sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		 sixButton.addActionListener(this); 
		 jf.add(sixButton);						
		 
		 // next row buttons
		 
		 oneButton=new JButton("1");
		 oneButton.setBounds(30, 350, 80, 80);
		 oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		 oneButton.addActionListener(this); 
		 jf.add(oneButton);
		 
		twoButton=new JButton("2");
		twoButton.setBounds(130,350, 80, 80);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		twoButton.addActionListener(this); 
		 jf.add(twoButton);
		 
		 
		 threeButton=new JButton("3");
		 threeButton.setBounds(230, 350, 80, 80);
		 threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		 threeButton.addActionListener(this); 
		 jf.add(threeButton);		
		
		 // next row .,0,= buttons
		 
		 
		 

		 dotButton=new JButton(".");
		 dotButton.setBounds(30,460, 80, 80);
		 dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		 dotButton.addActionListener(this); 
		 jf.add(dotButton);
		 
		 zeroButton=new JButton("0");		
		 zeroButton.setBounds(130, 460, 80, 80);
		 zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		 zeroButton.addActionListener(this); 
		 jf.add(zeroButton);
		 
		 
		 equaltoButton=new JButton("=");
		 equaltoButton.setBounds(230, 460, 80, 80);
		 equaltoButton.setFont(new Font("Arial",Font.PLAIN,40));
		 equaltoButton.addActionListener(this); 
		 jf.add(equaltoButton);
		 
		 
		 // operators button in right side
		 
		 divisonButton=new JButton("/");
		 divisonButton.setBounds(330, 130, 80, 80);
		 divisonButton.setFont(new Font("Arial",Font.PLAIN,40));
		 divisonButton.addActionListener(this); 
		 jf.add(divisonButton);
		 
		 multiplicationButton=new JButton("*");
		 multiplicationButton.setBounds(330, 240, 80, 80);
		 multiplicationButton.setFont(new Font("Arial",Font.PLAIN,40));
		 multiplicationButton.addActionListener(this); 
		 jf.add(multiplicationButton);	
		 
		 subtractionButton=new JButton("-");
		 subtractionButton.setBounds(330, 350, 80, 80);
		 subtractionButton.setFont(new Font("Arial",Font.PLAIN,40));
		 subtractionButton.addActionListener(this); 
		 jf.add(subtractionButton);
		 
		 plusButton=new JButton("+");
		 plusButton.setBounds(330, 460, 80, 80);
		 plusButton.setFont(new Font("Arial",Font.PLAIN,40));
		 plusButton.addActionListener(this); 
		 jf.add(plusButton);
		 
		clearButton=new JButton("AC");
		clearButton.setBounds(440,460,80,80);
		clearButton.setFont(new Font("Arial",Font.PLAIN,40));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		 
		 
		 
		 
		jf.setVisible(true);             // to visible the frame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // used to terminate  the program working  when the window closed otherwise it will running in background
	}
	public static void main(String[] args) {
		
		new Calculator();		// Calculator c=new Calculator(); object creation of constructor
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {			// method of interface ActionListener .must define the method 
		//when the user clicks the button automatically call the interface
				// downwards , action specifying when button is clicked // display the button name when button pressed 
		if(e.getSource()==sevenButton){		// e.getSource used to check the whick button is clicked 
			
			if(isOperatorClicked==true) 
				displayLabel.setText("7");
			
			else																						
			
			displayLabel.setText(displayLabel.getText()+"7");										//String labelText =displayLabel.getText();	//displayLabel.setText(labelText+"7");
		
			}
	
		else if  (e.getSource()==eightButton){
			if(isOperatorClicked==true) {
			displayLabel.setText("8");
			}
			else
			{
				displayLabel.setText(displayLabel.getText()+"8");
			}
			}
		
		 else if  (e.getSource()==nineButton){
				displayLabel.setText(displayLabel.getText()+"9");
			}
	
		 else if  (e.getSource()==fourButton){
				displayLabel.setText(displayLabel.getText()+"4");
			}
		 else if  (e.getSource()==fiveButton){
				displayLabel.setText(displayLabel.getText()+"5");
			}
		 else if  (e.getSource()==sixButton){
				displayLabel.setText(displayLabel.getText()+"6");
			}
		 else if  (e.getSource()==threeButton){
				displayLabel.setText(displayLabel.getText()+"3");
			}
		 else if  (e.getSource()==twoButton){
				displayLabel.setText(displayLabel.getText()+"2");
			}
		 else if  (e.getSource()==oneButton){
				displayLabel.setText(displayLabel.getText()+"1");
			}
		 else if  (e.getSource()==dotButton){
				displayLabel.setText(displayLabel.getText()+".");
		 	}
		 else if  (e.getSource()==zeroButton){
				displayLabel.setText(displayLabel.getText()+"0");
		 	}
		 else if  (e.getSource()==equaltoButton){
				displayLabel.setText("=");
		 	}
		 else if  (e.getSource()==plusButton){
				displayLabel.setText("+");
				isOperatorClicked=true;
		 	}
		 else if  (e.getSource()==subtractionButton){
				displayLabel.setText("-");
		 	}
		 else if  (e.getSource()==multiplicationButton){
				displayLabel.setText("*");
		 	}
		 else if  (e.getSource()==divisonButton){
				displayLabel.setText("/");
		 	}
		 else if  (e.getSource()==clearButton){
				displayLabel.setText("");
		 	}
		
						
	
	
	
	
	
	
	
	
	
	
	}
	
	 
	
	
}
