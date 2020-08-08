import javax.swing.JButton;
import javax.swing.JFrame;

class D_fram {
	public D_fram(String name) {
		JFrame f=new JFrame(name);
		JButton b=new JButton();
		b.setBounds(10, 20, 80, 50);
		
		//Frame setting 
		f.add(b);
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}

class sw_class_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D_fram s=new D_fram("google.com");
		
	}
}
