import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class cLabelDemo01 extends JFrame {
	
	ImageIcon icon1= new ImageIcon("D:/foc02/pics03/Frame0.png");
	ImageIcon icon2= new ImageIcon("D:/foc02/pics03/Frame1.png");
	// lable with Image only
	JLabel lblMsg1= new JLabel( icon1);
	JLabel lblMsg2= new JLabel("My pictures", icon2, JLabel.CENTER);
		
	public cLabelDemo01(){
		setTitle("Label Demo with image!");
		setSize( 300, 200);
		setLayout(null);
		
		
		add(lblMsg1);
		add(lblMsg2);
		
		lblMsg1.setBounds(10, 30, 100, 120);
		lblMsg2.setBounds(120, 30, 100, 200);

		lblMsg2.setVerticalTextPosition(JLabel.BOTTOM);
		lblMsg2.setHorizontalTextPosition(JLabel.CENTER);

	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cLabelDemo01 mainwindow = new cLabelDemo01();
		mainwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
	}

}
