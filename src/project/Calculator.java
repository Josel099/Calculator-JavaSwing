package project;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

	public Calculator() {		//constructor
		
		JFrame jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		 jf.setLocation(420,250);		// location of the window when the window is opened(x axix,Y axix)
		 JLabel displayLabel=new JLabel("hello"); //  
		 displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); // to align the text right || instead of this line we can also use "JLabel displayLabel=new JLabel("hello",SwingConstants.RIGHT);"
		 displayLabel.setBounds(30, 50, 540, 40); // used to give size and padding for the label , 
		 displayLabel.setBackground(Color.gray);
		 displayLabel.setForeground(Color.white);
		 displayLabel.setOpaque(true);				// to visible the color 
		 jf.add(displayLabel);
		
		
		 JButton sevenButton=new JButton("7");
		 sevenButton.setBounds(30, 130, 80, 80);
		 jf.add(sevenButton);
		 
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // used to terminate  the program working  when the window closed otherwise it will running in background
	}
	public static void main(String[] args) {
		
		new Calculator();		// Calculator c=new Calculator();
	}
	
	 
	
	
}
