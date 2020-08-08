import javax.swing.JButton;
import javax.swing.JFrame;

class d_frame extends JFrame{
	JFrame f;
	public d_frame() {
	// TODO Auto-generated constructor stub
		JButton b =new JButton("Click me!");
		b.setBounds(130, 100, 100, 40);
		
		add(b);
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
	}
}

public class sw_class_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d_frame ss=new d_frame();
	}

}
