package swing;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;

public class samp2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					samp2 window = new samp2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public samp2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(134, 171, 144, 37);
		frame.getContentPane().add(l1);
		
		
		JCheckBox c1 = new JCheckBox("C++");
		c1.setFont(new Font("Tahoma", Font.BOLD, 15));
		c1.setBounds(132, 38, 181, 44);
		frame.getContentPane().add(c1);
		c1.addItemListener(new ItemListener(){
			

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				l1.setText("C++"+(e.getStateChange()==1?" checked":" unchecked"));
			}
		});
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setFont(new Font("Tahoma", Font.BOLD, 15));
		c2.setBounds(132, 101, 97, 23);
		frame.getContentPane().add(c2);
        c2.addItemListener(new ItemListener(){
			

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				l1.setText("JAVA"+(e.getStateChange()==1?" checked":"unchecked"));
			}
		});
        ButtonGroup H = new ButtonGroup();
		H.add(c1);
		H.add(c2);
		

		
	}
}
