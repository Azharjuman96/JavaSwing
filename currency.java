package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class currency {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currency window = new currency();
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
	public currency() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 128, 114));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("INPUT");
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		l1.setBounds(72, 31, 87, 25);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("ENTER");
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));
		l2.setBounds(72, 80, 87, 25);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("OUTPUT");
		l3.setFont(new Font("Tahoma", Font.BOLD, 15));
		l3.setBounds(72, 126, 87, 25);
		frame.getContentPane().add(l3);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"AMERICAN DOLLAR", "EURO", "SAUDI RIYAL", "YEN", "INDIAN RUPEE"}));
		c1.setBackground(new Color(221, 160, 221));
		c1.setBounds(226, 35, 134, 20);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(226, 84, 158, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"AMERICAN DOLLAR", "EURO", "SAUDI RIYAL", "YEN", "INDIAN RUPEE"}));
		c2.setBounds(226, 130, 134, 20);
		frame.getContentPane().add(c2);
		
		JButton b1 = new JButton("Value");
		b1.setBackground(new Color(255, 182, 193));
		b1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				
				double r=0.014;
				double e=1.11;
				double sr=0.27;
				double y=0.0092;
				String str=t1.getText();
				float p=Float.parseFloat(str);
			    if(c1.getSelectedItem().equals("AMERICAN DOLLAR"))
			    {
			    	if(c2.getSelectedItem().equals("AMERICAN DOLLAR"))
			    	{
			    		t2.setText(str);
			    	}
			    	else if(c2.getSelectedItem().equals("INDIAN RUPEE"))
			    	{
			    		double p1=(float)p/r;
			    		String s1=String.valueOf(p1);
			    		t2.setText(s1);
			    	}
			    	else if(c2.getSelectedItem().equals("EURO"))
			    	{
			    		double p2=(float)p/e;
			    		String s2=String.valueOf(p2);
			    		t2.setText(s2);
			    	}
			    	else if(c2.getSelectedItem().equals("SAUDI RIYAL"))
			    	{
			    		double p3=(float)p/sr;
			    		String s3=String.valueOf(p3);
			    		t2.setText(s3);
			    	}
			    	else if(c2.getSelectedItem().equals("YEN"))
			    	{
			    		double p4=(float)p/y;
			    		String s4=String.valueOf(p4);
			    		t2.setText(s4);

			    	}
			    	
			    }
			    else if(c1.getSelectedItem().equals("INDIAN RUPEE"))
			    {
			    	if(c2.getSelectedItem().equals("INDIAN RUPEE"))
			    	{
			    		t2.setText(str);
			    	}
			    	else if(c2.getSelectedItem().equals("AMERICAN DOLLAR"))
			    	{
			    		double p5=(float)p*r;
			    		String s5=String.valueOf(p5);
			    		t2.setText(s5);
			    	}
			    	else if(c2.getSelectedItem().equals("EURO"))
			    	{
			    		double p6=(float)p*r/e;
			    		String s6=String.valueOf(p6);
			    		t2.setText(s6);
			    	}
			    	else if(c2.getSelectedItem().equals("SAUDI RIYAL"))
			    	{
			    		double p7=(float)p*r/sr;
			    		String s7=String.valueOf(p7);
			    		t2.setText(s7);
			    	}
			    	else if(c2.getSelectedItem().equals("YEN"))
			    	{
			    		double p8=(float)p*r/y;
			    		String s8=String.valueOf(p8);
			    		t2.setText(s8);

			    	}
			    }
			    else if(c1.getSelectedItem().equals("EURO"))
			    {
			    	if(c2.getSelectedItem().equals("INDIAN RUPEE"))
			    	{
			    		double p9=(float)p*e/r;
			    		String s9=String.valueOf(p9);
			    		t2.setText(s9);

			    	}
			    	else if(c2.getSelectedItem().equals("AMERICAN DOLLAR"))
			    	{
			    		double p10=(float)p*e;
			    		String s10=String.valueOf(p10);
			    		t2.setText(s10);
			    	}
			    	else if(c2.getSelectedItem().equals("EURO"))
			    	{
			    		t2.setText(str);
			    	}
			    	else if(c2.getSelectedItem().equals("SAUDI RIYAL"))
			    	{
			    		double p11=(float)p*e/sr;
			    		String s11=String.valueOf(p11);
			    		t2.setText(s11);
			    	}
			    	else if(c2.getSelectedItem().equals("YEN"))
			    	{
			    		double p12=(float)p*e/y;
			    		String s12=String.valueOf(p12);
			    		t2.setText(s12);

			    	}
			    }
			    else if(c1.getSelectedItem().equals("SAUDI RIYAL"))
			    {
			    	if(c2.getSelectedItem().equals("INDIAN RUPEE"))
			    	{
			    		double p13=(float)p*sr/r;
			    		String s13=String.valueOf(p13);
			    		t2.setText(s13);

			    	}
			    	else if(c2.getSelectedItem().equals("AMERICAN DOLLAR"))
			    	{
			    		double p14=(float)p*sr;
			    		String s14=String.valueOf(p14);
			    		t2.setText(s14);
			    	}
			    	else if(c2.getSelectedItem().equals("EURO"))
			    	{
			    		double p15=(float)p*sr/e;
			    		String s15=String.valueOf(p15);
			    		t2.setText(s15);
			    	}
			    	else if(c2.getSelectedItem().equals("SAUDI RIYAL"))
			    	{
			    		t2.setText(str);
			    		
			    	}
			    	else if(c2.getSelectedItem().equals("YEN"))
			    	{
			    		double p16=(float)p*sr/y;
			    		String s16=String.valueOf(p16);
			    		t2.setText(s16);

			    	}
			    }
			    else if(c1.getSelectedItem().equals("YEN"))
			    {
			    	if(c2.getSelectedItem().equals("INDIAN RUPEE"))
			    	{
			    		double p17=(float)p*y/r;
			    		String s17=String.valueOf(p17);
			    		t2.setText(s17);

			    	}
			    	else if(c2.getSelectedItem().equals("AMERICAN DOLLAR"))
			    	{
			    		double p18=(float)p*y;
			    		String s18=String.valueOf(p18);
			    		t2.setText(s18);
			    	}
			    	else if(c2.getSelectedItem().equals("EURO"))
			    	{
			    		double p19=(float)p*y/e;
			    		String s19=String.valueOf(p19);
			    		t2.setText(s19);
			    	}
			    	else if(c2.getSelectedItem().equals("SAUDI RIYAL"))
			    	{
			    		double p20=(float)p*y/sr;
			    		String s20=String.valueOf(p20);
			    		t2.setText(s20);
			    		
			    	}
			    	else if(c2.getSelectedItem().equals("YEN"))
			    	{
			    		t2.setText(str);
			    		

			    	}
			    }
				 
			}
		});
		b1.setBounds(70, 187, 89, 23);
		frame.getContentPane().add(b1);
		
		JButton button = new JButton("Exit");
		button.setBackground(new Color(255, 182, 193));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setBounds(173, 228, 89, 23);
		frame.getContentPane().add(button);
		
		t2 = new JTextField();
		t2.setBounds(226, 188, 158, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
	}
}
