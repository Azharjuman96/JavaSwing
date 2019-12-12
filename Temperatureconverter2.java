package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class coon {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					coon window = new coon();
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
	public coon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 224));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("Input");
		l1.setFont(new Font("Tahoma", Font.BOLD, 12));
		l1.setBounds(88, 10, 77, 34);
		frame.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(175, 11, 148, 34);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel l2 = new JLabel("Input Scale");
		l2.setFont(new Font("Tahoma", Font.BOLD, 12));
		l2.setBounds(22, 85, 120, 22);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("Output Scale");
		l3.setFont(new Font("Tahoma", Font.BOLD, 12));
		l3.setBounds(315, 85, 100, 22);
		frame.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("Output");
		l4.setFont(new Font("Tahoma", Font.BOLD, 12));
		l4.setBounds(127, 226, 63, 25);
		frame.getContentPane().add(l4);
		
        JLabel l5 = new JLabel("");
		l5.setBounds(200, 224, 87, 27);
		frame.getContentPane().add(l5);
		
		
		
		JRadioButton r1 = new JRadioButton("Celcius");
		r1.setBackground(new Color(255, 255, 224));
		r1.setFont(new Font("Tahoma", Font.BOLD, 12));
		r1.setBounds(32, 114, 109, 23);
		frame.getContentPane().add(r1);
		
		
		JRadioButton r2 = new JRadioButton("Fahrenheit");
		r2.setBackground(new Color(255, 255, 224));
		r2.setFont(new Font("Tahoma", Font.BOLD, 12));
		r2.setBounds(33, 157, 109, 23);
		frame.getContentPane().add(r2);
		
		JRadioButton r3 = new JRadioButton("Kelvin");
		r3.setBackground(new Color(255, 255, 224));
		r3.setFont(new Font("Tahoma", Font.BOLD, 11));
		r3.setBounds(33, 196, 109, 23);
		frame.getContentPane().add(r3);
		ButtonGroup G = new ButtonGroup();
		G.add(r1);
		G.add(r2);
		G.add(r3);
		
		JRadioButton r4 = new JRadioButton("Celcius"); 
		
		r4.setBackground(new Color(255, 255, 224));
		r4.setFont(new Font("Tahoma", Font.BOLD, 12));
		r4.setBounds(325, 118, 109, 23);
		frame.getContentPane().add(r4);
		
		JRadioButton r5 = new JRadioButton("Fahrenheit");
		
		r5.setBackground(new Color(255, 255, 224));
		r5.setFont(new Font("Tahoma", Font.BOLD, 12));
		r5.setBounds(325, 157, 109, 23);
		frame.getContentPane().add(r5);
		
		JRadioButton r6 = new JRadioButton("Kelvin");
		
		r6.setBackground(new Color(255, 255, 224));
		r6.setFont(new Font("Tahoma", Font.BOLD, 12));
		r6.setBounds(325, 195, 109, 23);
		frame.getContentPane().add(r6);
		
		ButtonGroup H = new ButtonGroup();
		H.add(r4);
		H.add(r5);
		H.add(r6);
		
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			H.clearSelection();	
				
			}
		});
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				H.clearSelection();	
			}
		});
		
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				H.clearSelection();	
			}
		});
		
		
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str0=t1.getText();
				float s0=Float.parseFloat(str0);
				if(r1.isSelected())
				{
					String str1=String.valueOf(s0);
					l5.setText(str1);
				}
				else if(r2.isSelected())
				{
					float s1=(float)(5*s0-160)/9;
					String str1=String.valueOf(s1);
					l5.setText(str1);
				}
				else if(r3.isSelected())
				{
					float s1=(float)(s0-273.15);
					String str1=String.valueOf(s1);
					l5.setText(str1);
				}
				
			}
		});
		
		
		r5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str2=t1.getText();
				float s2=Float.parseFloat(str2);
				if(r1.isSelected())
				{
					float s3=(float)(9*s2+160)/5;
					String str3=String.valueOf(s3);
					l5.setText(str3);
					
				}
				else if(r2.isSelected())
				{
					String str3=String.valueOf(s2);
					l5.setText(str2);
				}
				else if(r3.isSelected())
				{
					float s3=(float)((s2-273.15)*9/5+32);
					String str3=String.valueOf(s3);
					l5.setText(str3);
				}
				
			}
		});
		
		r6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str4=t1.getText();
				float s4=Float.parseFloat(str4);
				if(r1.isSelected())
				{
					float s5=(float)(s4+273.15);
					String str5=String.valueOf(s5);
					l5.setText(str5);
					
				}
				else if(r2.isSelected())
				{
					float s5=(float)((5*s4-160)/9+273.15);
					String str5=String.valueOf(s5);
					l5.setText(str5);
					
				}
				else if(r3.isSelected())
				{
					String str5=String.valueOf(s4);
					l5.setText(str5);
				}
			}
		});
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				l5.setText("");
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(175, 86, 89, 34);
		frame.getContentPane().add(btnClear);
		
		
		
	}
}
