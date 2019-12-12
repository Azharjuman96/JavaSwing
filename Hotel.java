package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class Hotel {
	String str1,str2,str,str3,str4;

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(216, 191, 216));
		frame.getContentPane().setBackground(new Color(253, 245, 230));
		frame.setBounds(100, 100, 1132, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(10, 54, 442, 256);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chicken Burger");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(29, 22, 124, 26);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("Chicken Burger meal");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(29, 66, 124, 26);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Cheese Burger");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(29, 117, 124, 26);
		panel.add(label_1);
		
		t1 = new JTextField();
		t1.setBounds(163, 31, 196, 26);
		panel.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(165, 68, 196, 26);
		panel.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(165, 119, 196, 26);
		panel.add(t3);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDrink.setBounds(107, 154, 46, 14);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQty.setBounds(306, 154, 46, 14);
		panel.add(lblQty);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 11));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Tea", "Coffee", "Soft Drink", "Water"}));
		c1.setBounds(69, 182, 124, 20);
		panel.add(c1);
		
		t4 = new JTextField();
		t4.setBounds(262, 179, 142, 26);
		panel.add(t4);
		t4.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Home delivery");
		r1.setBackground(new Color(102, 205, 170));
		r1.setFont(new Font("Tahoma", Font.BOLD, 11));
		r1.setBounds(84, 226, 109, 23);
		panel.add(r1);
		
		JRadioButton r2 = new JRadioButton("Tax");
		r2.setBackground(new Color(102, 205, 170));
		r2.setFont(new Font("Tahoma", Font.BOLD, 11));
		r2.setBounds(273, 226, 109, 23);
		panel.add(r2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(102, 205, 170));
		panel_1.setBounds(10, 321, 442, 188);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cost of Drink");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 21, 141, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel label_2 = new JLabel("Cost of Meal");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(20, 66, 141, 34);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Cost of Delivery");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(20, 109, 141, 34);
		panel_1.add(label_3);
		
		JLabel l1 = new JLabel("");
		l1.setBackground(SystemColor.activeCaption);
		l1.setBounds(234, 28, 141, 23);
		panel_1.add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setBackground(SystemColor.activeCaption);
		l2.setBounds(234, 77, 141, 23);
		panel_1.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setBackground(SystemColor.activeCaption);
		l3.setBounds(234, 120, 141, 23);
		panel_1.add(l3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(102, 205, 170));
		panel_2.setBounds(462, 54, 256, 256);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Tahoma", Font.BOLD, 12));
		c2.setModel(new DefaultComboBoxModel(new String[] {"INR", "DOLLAR", "EURO"}));
		c2.setBounds(41, 74, 181, 20);
		panel_2.add(c2);
		
		t5 = new JTextField();
		t5.setBounds(41, 125, 181, 20);
		panel_2.add(t5);
		t5.setColumns(10);
		
		
		
		JButton button = new JButton("Close");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(133, 209, 89, 23);
		panel_2.add(button);
		
		JLabel lblCurrencyConverter = new JLabel("Currency converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrencyConverter.setBounds(58, 11, 164, 38);
		panel_2.add(lblCurrencyConverter);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(new Color(102, 205, 170));
		panel_3.setBounds(462, 321, 256, 188);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Tax");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 24, 91, 25);
		panel_3.add(lblNewLabel_3);
		
		JLabel label_6 = new JLabel("Sub Total");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(10, 72, 91, 25);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("Total");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(10, 119, 91, 25);
		panel_3.add(label_7);
		
		JLabel l4 = new JLabel("");
		l4.setBackground(SystemColor.activeCaption);
		l4.setBounds(111, 26, 141, 23);
		panel_3.add(l4);
		
		JLabel l5 = new JLabel("");
		l5.setBackground(SystemColor.activeCaption);
		l5.setBounds(111, 77, 141, 23);
		panel_3.add(l5);
		
		JLabel l6 = new JLabel("");
		l6.setBackground(SystemColor.activeCaption);
		l6.setBounds(111, 124, 141, 23);
		panel_3.add(l6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(new Color(102, 205, 170));
		panel_4.setBounds(728, 54, 378, 455);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 29, 348, 415);
		panel_4.add(tabbedPane);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		tabbedPane.addTab("Receipt", null, layeredPane_2, null);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(10, 11, 323, 365);
		layeredPane_2.add(ta1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(135, 206, 235));
		tabbedPane.addTab("Calculator", null, layeredPane, null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(121, 35, 1, 1);
		layeredPane.add(layeredPane_1);
		
		t6 = new JTextField();
		t6.setFont(new Font("Tahoma", Font.BOLD, 11));
		t6.setBounds(10, 11, 323, 54);
		layeredPane.add(t6);
		t6.setColumns(10);
		
		JButton b1 = new JButton("B");
		b1.setBounds(31, 76, 58, 44);
		layeredPane.add(b1);
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b2 = new JButton("C");
		b2.setBounds(107, 76, 58, 44);
		layeredPane.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText("");
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b3 = new JButton("...");
		b3.setBounds(184, 76, 58, 44);
		layeredPane.add(b3);
		b3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b4 = new JButton("+");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=t6.getText();
				str2=b4.getText();
				t6.setText("");
			}
		});
		b4.setBounds(258, 76, 58, 44);
		layeredPane.add(b4);
		b4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b5 = new JButton("7");
		b5.setBounds(31, 132, 58, 44);
		layeredPane.add(b5);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b5.getText()));
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b6 = new JButton("8");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(107, 132, 58, 44);
		layeredPane.add(b6);
		b6.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b7 = new JButton("9");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b7.getText()));
			}
		});
		b7.setBounds(184, 131, 58, 44);
		layeredPane.add(b7);
		b7.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b8 = new JButton("-");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=t6.getText();
				str2=b8.getText();
				t6.setText("");
			}
		});
		b8.setBounds(258, 131, 58, 44);
		layeredPane.add(b8);
		b8.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b9 = new JButton("4");
		b9.setBounds(31, 187, 58, 44);
		layeredPane.add(b9);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b9.getText()));
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b10 = new JButton("5");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b10.getText()));
			}
		});
		b10.setBounds(107, 187, 58, 44);
		layeredPane.add(b10);
		b10.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b11 = new JButton("6");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b11.getText()));
			}
		});
		b11.setBounds(184, 186, 58, 44);
		layeredPane.add(b11);
		b11.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b12 = new JButton("*");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=t6.getText();
				str2=b12.getText();
				t6.setText("");
			}
		});
		b12.setBounds(258, 186, 58, 44);
		layeredPane.add(b12);
		b12.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b13 = new JButton("1");
		b13.setBounds(31, 247, 58, 44);
		layeredPane.add(b13);
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b13.getText()));
			}
		});
		b13.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b14 = new JButton("2");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b14.getText()));
			}
		});
		b14.setBounds(107, 247, 58, 44);
		layeredPane.add(b14);
		b14.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b15 = new JButton("3");
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b15.getText()));
			}
		});
		b15.setBounds(184, 247, 58, 44);
		layeredPane.add(b15);
		b15.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b16 = new JButton("/");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=t6.getText();
				str2=b16.getText();
				t6.setText("");
			}
		});
		b16.setBounds(258, 247, 58, 44);
		layeredPane.add(b16);
		b16.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b17 = new JButton("0");
		b17.setBounds(31, 308, 58, 44);
		layeredPane.add(b17);
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b17.getText()));
			}
		});
		b17.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b18 = new JButton(".");
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t6.setText(t6.getText().concat(b18.getText()));
			}
		});
		b18.setBounds(107, 308, 58, 44);
		layeredPane.add(b18);
		b18.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b19 = new JButton("...");
		b19.setBounds(184, 308, 58, 44);
		layeredPane.add(b19);
		b19.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton b20 = new JButton("=");
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float res1=Float.parseFloat(str1);
				String str;
				float res2=Float.parseFloat(t6.getText());
				float s=1;
				if(str2.contentEquals("+"))
				{
				  float res=res1+res2;
				  str=String.valueOf(res);
				  t6.setText(str);
				}	
				else if(str2.contentEquals("-"))
				{
				  float res=res1-res2;
				  str=String.valueOf(res);
				  t6.setText(str);
				}	
				else if(str2.contentEquals("*"))
				{
				  float res=res1*res2;
				  str=String.valueOf(res);
				  t6.setText(str);
				}	
				else if(str2.contentEquals("/"))
				{
				  float res=res1/res2;
				  str=String.valueOf(res);
				  t6.setText(str);
				}	
			}
		});
		b20.setBounds(258, 308, 58, 44);
		layeredPane.add(b20);
		b20.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta1.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(203, 11, 89, 23);
		panel_4.add(btnClear);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=t6.getText();
				str2=str1.substring(0,str1.length()-1);
				t6.setText(str2);
			}
		});
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(new Color(102, 205, 170));
		panel_5.setBounds(10, 520, 1096, 59);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b1=150;
				int b2=250;
				int b3=110;
				int te=15;
				int co=30;
				int sd=45;
				int w=20;
				str1=t1.getText();
				str2=t2.getText();
				str3=t3.getText();
				str4=t4.getText();
				int s1=Integer.parseInt(str1);
				int s2=Integer.parseInt(str2);
				int s3=Integer.parseInt(str3);
				int s4=Integer.parseInt(str4);
				float s5=(float)(b1*s1+b2*s2+b3*s3);
				l2.setText(String.valueOf(s5));
				if(c1.getSelectedItem().equals("Tea"))
				{
				  float s6=(float)(te*s4);
				  l1.setText(String.valueOf(s6));
				}
				else if(c1.getSelectedItem().equals("Cofee"))
				{
					float s6=(float)(co*s4);
					l1.setText(String.valueOf(s6));
				}
				else if(c1.getSelectedItem().equals("Soft Drink"))
				{
					float s6=(float)(sd*s4);
					l1.setText(String.valueOf(s6));
				}
				else if(c1.getSelectedItem().equals("Water"))
				{
					float s6=(float)(w*s4);
					l1.setText(String.valueOf(s6));
				}
				if(r1.isSelected())
				{
					float s7=20;
				    l3.setText(String.valueOf(s7));
				}
				
				
				if(r1.isSelected())
				{
					float s8=Float.parseFloat(l1.getText());
					float s9=Float.parseFloat(l2.getText());
					float s10=Float.parseFloat(l3.getText());
				  float st=s8+s9+s10;
				  l5.setText(String.valueOf(st));
				}
				else
				{
					float s8=Float.parseFloat(l1.getText());
					float s9=Float.parseFloat(l2.getText());
					//float s10=Float.parseFloat(l3.getText());
					float st=s8+s9; 
					l5.setText(String.valueOf(st));
				}
				float s11=Float.parseFloat(l5.getText());
				if(r2.isSelected())
				{
					float Tax=(float)(s11*12)/100;
					l4.setText(String.valueOf(Tax));
				}
				float s12=Float.parseFloat(l4.getText());
				float s13=s11+s12;
				l6.setText(String.valueOf(s13));
				
				
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTotal.setBounds(32, 19, 116, 29);
		panel_5.add(btnTotal);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float d=0.014f;
				float eu=0.013f;
				if(c2.getSelectedItem().equals("DOLLAR"))
				{
					t5.setText(String.valueOf((float)1/d));
					float k1=Float.parseFloat(l2.getText());
					float k2=k1*d;
					l2.setText(String.valueOf(k2));
					float k3=Float.parseFloat(l1.getText());
					float k4=k3*d;
					l1.setText(String.valueOf(k4));
					float k5=Float.parseFloat(l3.getText());
					float k6=k5*d;
					l3.setText(String.valueOf(k6));
					float k7=Float.parseFloat(l4.getText());
					float k8=k7*d;
					l4.setText(String.valueOf(k8));
					float k9=Float.parseFloat(l5.getText());
					float k10=k9*d;
					l5.setText(String.valueOf(k10));
					float k11=Float.parseFloat(l6.getText());
					float k12=k11*d;
					l6.setText(String.valueOf(k12));





				}
				else if(c2.getSelectedItem().equals("EURO"))
				{
					t5.setText(String.valueOf((float)1/eu));
					float k1=Float.parseFloat(l2.getText());
					float k2=k1*eu;
					l2.setText(String.valueOf(k2));
					float k3=Float.parseFloat(l1.getText());
					float k4=k3*eu;
					l1.setText(String.valueOf(k4));
					float k5=Float.parseFloat(l3.getText());
					float k6=k5*eu;
					l3.setText(String.valueOf(k6));
					float k7=Float.parseFloat(l4.getText());
					float k8=k7*eu;
					l4.setText(String.valueOf(k8));
					float k9=Float.parseFloat(l5.getText());
					float k10=k9*eu;
					l5.setText(String.valueOf(k10));
					float k11=Float.parseFloat(l6.getText());
					float k12=k11*eu;
					l6.setText(String.valueOf(k12));

				}
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConvert.setBounds(10, 209, 89, 23);
		panel_2.add(btnConvert);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Hotel Management Systam",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
			    {
				System.exit(0);
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_1.setBounds(724, 19, 116, 29);
		panel_5.add(button_1);
		
		
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta1.append("\t Food Bill\n"
						+ "Hotel Name :\tBurger Hut\n"
						+ "======================================\n"
						+ "\nChicken Burger:\t 150 *" + t1.getText()
						+ "\nChicken Burger meal:\t 250 *" + t2.getText()
						+ "\nCheese Burger:\t\t 110 *" + t3.getText()
						+ "\nCost of Drinks:\t\t " + l1.getText()
						+ "\nCost of Meal:\t\t" + l2.getText()
						+ "\nCost of Delivery:\t" + l3.getText()
						+ "\nTax:\t\t 12%" 
						//+ "\nMalayalam:\t\t" + t14.getText()
						+"\n======================================\n"
						+ "\n Sub Total:\t\t" + l5.getText()
						+ "\n Tax:\t\t" + l4.getText()
						+ "\nTotal:\t\t" + l6.getText()
						+ "\n\n\n\t THANK YOU"
						);
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReceipt.setBounds(264, 24, 103, 23);
		panel_5.add(btnReceipt);
		
		JLabel lblHotelManagementSystem = new JLabel("HOTEL MANAGEMENT SYSTEM");
		lblHotelManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblHotelManagementSystem.setBounds(404, 0, 354, 50);
		frame.getContentPane().add(lblHotelManagementSystem);
	}
}
