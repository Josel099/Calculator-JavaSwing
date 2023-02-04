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
	
	
	public Calculator() {		//constructor
		
		JFrame jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		 jf.setLocation(420,250);		// location of the window when the window is opened(x axix,Y axix)
		
		 
		  displayLabel=new JLabel("hello"); //  
		 displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); // to align the text right || instead of this line we can also use "JLabel displayLabel=new JLabel("hello",SwingConstants.RIGHT);"
		 displayLabel.setBounds(30, 50, 540, 40); // used to give size and padding for the label , 
		 displayLabel.setBackground(Color.gray);
		 displayLabel.setForeground(Color.white);
		 displayLabel.setOpaque(true);				// to visible the color 
		 jf.add(displayLabel);
		
		
		 // buttons starting
		 
		 JButton sevenButton=new JButton("7");
		 sevenButton.setBounds(30, 130, 80, 80);
		 sevenButton.setFont(new Font("Arial",Font.PLAIN,40)); // text modifications in JButton
		 sevenButton.addActionListener(this);
		 jf.add(sevenButton);
		 
		
		 JButton eightButton=new JButton("8");
		 eightButton.setBounds(130, 130, 80, 80);
		 eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(eightButton);
		 
		 JButton nineButton=new JButton("9");
		 nineButton.setBounds(230, 130, 80, 80);
		 nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(nineButton);
		 
		 
		 // next row buttons
		 
		 JButton fourButton=new JButton("4");
		 fourButton.setBounds(30, 240, 80, 80);
		 fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(fourButton);
		 
		 JButton fiveButton=new JButton("5");
		 fiveButton.setBounds(130, 240, 80, 80);
		 fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(fiveButton);
		 
		 
		 JButton sixButton=new JButton("6");
		 sixButton.setBounds(230, 240, 80, 80);
		 sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(sixButton);						
		 
		 // next row buttons
		 
		 JButton oneButton=new JButton("1");
		 oneButton.setBounds(30, 350, 80, 80);
		 oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(oneButton);
		 
		 JButton twoButton=new JButton("2");
		twoButton.setBounds(130,350, 80, 80);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(twoButton);
		 
		 
		 JButton threeButton=new JButton("3");
		 threeButton.setBounds(230, 350, 80, 80);
		 threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(threeButton);		
		
		 // next row .,0,= buttons
		 
		 
		 

		 JButton dotButton=new JButton(".");
		 dotButton.setBounds(30,460, 80, 80);
		 dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(dotButton);
		 
		 JButton zeroButton=new JButton("0");		
		 zeroButton.setBounds(130, 460, 80, 80);
		 zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(zeroButton);
		 
		 
		 JButton equaltoButton=new JButton("=");
		 equaltoButton.setBounds(230, 460, 80, 80);
		 equaltoButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(equaltoButton);
		 
		 
		 // operators button in right side
		 
		 JButton divisonButton=new JButton("/");
		 divisonButton.setBounds(330, 130, 80, 80);
		 divisonButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(divisonButton);
		 
		 JButton multiplicationButton=new JButton("*");
		 multiplicationButton.setBounds(330, 240, 80, 80);
		 multiplicationButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(multiplicationButton);	
		 
		 JButton subtractionButton=new JButton("-");
		 subtractionButton.setBounds(330, 350, 80, 80);
		 subtractionButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(subtractionButton);
		 
		 JButton plusButton=new JButton("+");
		 plusButton.setBounds(330, 460, 80, 80);
		 plusButton.setFont(new Font("Arial",Font.PLAIN,40));
		 jf.add(plusButton);
		 
		 
		 
		 
		jf.setVisible(true);             // to visible the frame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // used to terminate  the program working  when the window closed otherwise it will running in background
	}
	public static void main(String[] args) {
		
		new Calculator();		// Calculator c=new Calculator(); object creation of constructor
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {			// method of interface ActionListener .must define the method 
		//when the user clicks the button automatically call the interface
		displayLabel.setText("7");
	}
	
	 
	
	
}
