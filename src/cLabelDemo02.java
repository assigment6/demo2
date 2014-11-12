import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class cLabelDemo02 extends JFrame {
	String[] sFilenames = {
			
			"D:/foc02/pics12/Frame0.png",
			"D:/foc02/pics12/Frame1.png",
			"D:/foc02/pics12/Frame2.png",
			"D:/foc02/pics12/Frame3.png",
			"D:/foc02/pics12/Frame4.png",
			"D:/foc02/pics12/Frame5.png",
			"D:/foc02/pics12/Frame6.png",
			"D:/foc02/pics12/Frame7.png",
			"D:/foc02/pics12/Frame8.png",
			"D:/foc02/pics12/Frame9.png",
			"D:/foc02/pics12/Frame10.png",
			"D:/foc02/pics12/Frame11.png",
			"D:/foc02/pics12/Frame12.png",
			"D:/foc02/pics12/Frame13.png",
			"D:/foc02/pics12/Frame14.png",
			"D:/foc02/pics12/Frame15.png",
			"D:/foc02/pics12/Frame16.png",
			"D:/foc02/pics12/Frame17.png",
			"D:/foc02/pics12/Frame18.png",
			"D:/foc02/pics12/Frame19.png",
			"D:/foc02/pics12/Frame20.png",
			"D:/foc02/pics12/Frame21.png",
			"D:/foc02/pics12/Frame22.png",
			"D:/foc02/pics12/Frame23.png",
			"D:/foc02/pics12/Frame24.png",
			"D:/foc02/pics12/Frame25.png",
			"D:/foc02/pics12/Frame26.png",
			"D:/foc02/pics12/Frame27.png",
			"D:/foc02/pics12/Frame28.png",
			"D:/foc02/pics12/Frame29.png",
			"D:/foc02/pics12/Frame30.png",
			"D:/foc02/pics12/Frame31.png"
	};
	ImageIcon[] icnA= new ImageIcon[32];

	// lable with Image only
	JLabel lblMsg1= new JLabel();
	JButton btnChange = new JButton("change");
	
	int nNumberIcon = 32;
	int iCurrent =0;
	public cLabelDemo02(){
		setTitle("Label Demo with image!");
		setSize( 300, 200);
		setLayout(null);
		
		for( int i=0; i< nNumberIcon; i++){
			icnA[i] = new ImageIcon(sFilenames[i]);
		}
		
		lblMsg1.setIcon(icnA[iCurrent]);
		
		add(lblMsg1);
		add(btnChange);
		
		lblMsg1.setBounds(10, 30, 150, 120);
		btnChange.setBounds(10, 140, 80, 25);


	//	lblMsg2.setVerticalTextPosition(JLabel.BOTTOM);
		//lblMsg2.setHorizontalTextPosition(JLabel.CENTER);

		btnChange.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				iCurrent= iCurrent+1;
				if( iCurrent>= nNumberIcon){
					iCurrent=0;
				}
				lblMsg1.setIcon(icnA[iCurrent]);
			}
		});
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cLabelDemo02 mainwindow = new cLabelDemo02();
		mainwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
	}

}
