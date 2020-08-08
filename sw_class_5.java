import java.awt.dnd.Autoscroll;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class button1{
	public button1() {
		// TODO Auto-generated constructor stub
		JFrame f=new JFrame("Buttone Icone.");
		JButton b1= new JButton(new ImageIcon("C:\\Users\\Google-D\\Downloads\\icons8-play-button-48.png"));
		
		b1.setBounds(5, 5,48,48);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			    System.out.println("Youtub buttone pressed!");
			    
			}
		});
		
		b1.setEnabled(true);
		b1.setText("Hello Buttone.");
		String bu=b1.getText();
		System.out.println(bu);
		f.add(b1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
				
	}
	
}

public class sw_class_5 {

	public static void main(String[] args) {
		System.out.println("hello Swing !");
		button1 d=new button1();
	}
	
	

}
