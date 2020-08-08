import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class sw_class_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("Main Frame");
		
		//Buttone Setting 
		JButton b =new JButton("Click me!");
		b.setBounds(10, 10, 100, 50);
		
		b.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						System.out.println("Buttone Pressed !");	
					}
				}	
				);
		
		
		// Main Frame Setting 
		f.add(b);    //add buttone on frame
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
