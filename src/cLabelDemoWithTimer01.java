import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class cLabelDemoWithTimer01 extends JFrame {
	String[] sFilenames = {
			
			"E:/foc02/pics13/Frame0.png",
			"E:/foc02/pics13/Frame1.png",
			"E:/foc02/pics13/Frame2.png",
			"E:/foc02/pics13/Frame3.png",
			"E:/foc02/pics13/Frame4.png",
			"E:/foc02/pics13/Frame5.png",
			"E:/foc02/pics13/Frame6.png",
			"E:/foc02/pics13/Frame7.png",
			"E:/foc02/pics13/Frame8.png",
			"E:/foc02/pics13/Frame9.png",
			"E:/foc02/pics13/Frame10.png",
			"E:/foc02/pics13/Frame11.png",
			"E:/foc02/pics13/Frame12.png",
			"E:/foc02/pics13/Frame13.png",
			"E:/foc02/pics13/Frame14.png",
			"E:/foc02/pics13/Frame15.png",
	};
	ImageIcon[] icnA= new ImageIcon[16];

	// lable with Image only
	JLabel lblMsg1= new JLabel();
	JButton btnStart= new JButton("start");
	JButton btnStop= new JButton("stop");
	Timer tmAutoControl;
	int nNumberIcon = 16;
	int iCurrent =0;
	public cLabelDemoWithTimer01(){
		setTitle("Label Demo with image!");
		setSize( 300, 200);
		setLayout(null);
		
		for( int i=0; i< nNumberIcon; i++){
			icnA[i] = new ImageIcon(sFilenames[i]);
		}
		
		lblMsg1.setIcon(icnA[iCurrent]);
		
		add(lblMsg1);
		add(btnStart);
		add(btnStop);
		
		
		lblMsg1.setBounds(-100, 30, 150, 120);
		btnStart.setBounds(10, 140, 70, 25);
		btnStop.setBounds(80, 140, 70, 25);
		
		
		tmAutoControl = new Timer(50, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				iCurrent= iCurrent+1;
				if( iCurrent>= nNumberIcon){
					iCurrent=0;
				}
				lblMsg1.setIcon(icnA[iCurrent]);
				int x = lblMsg1.getX()+2;
				lblMsg1.setBounds(x, lblMsg1.getY(), lblMsg1.getWidth(), lblMsg1.getHeight());
			}
		});
		btnStart.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tmAutoControl.start();
			}
		});
		
		btnStop.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tmAutoControl.stop();
			}
		});
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cLabelDemoWithTimer01 mainwindow = new cLabelDemoWithTimer01();
		mainwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainwindow.setVisible(true);
	}

}
