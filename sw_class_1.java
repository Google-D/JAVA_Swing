import javax.swing.JButton;
import javax.swing.JFrame;

public class sw_class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java_Swing !");
		JFrame f=new JFrame("Main Frame");
		JFrame f1=new JFrame("Child frame");
		
		//Buttone Setting 
		JButton b =new JButton("Click me!");
		b.setBounds(10, 10, 100, 50);

		
		// Main Frame Setting 
		f.add(b);    //add buttone on frame
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		
		//Child Frame
		f1.setSize(200, 300);
		f1.setLayout(null);
		f1.setVisible(true);
	
	}

}
