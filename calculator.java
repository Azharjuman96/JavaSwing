package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;

public class calculator {
	String str,str1,str2;
	double a;

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton button123;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText(" ");
		textField.setBounds(10, 21, 510, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("sqrt");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(20, 71, 71, 38);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float b=Float.parseFloat(str1);
				float k=(float)Math.sqrt(b);
				String str=String.valueOf(k);
				textField.setText(str);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(96, 71, 71, 38);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float t=Float.parseFloat(str1);
				float k=(float)1/t;
				String str=String.valueOf(k);
				textField.setText(str);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		button123 = new JButton("x^y");
		button123.setFont(new Font("Tahoma", Font.BOLD, 11));
		button123.setBounds(20, 164, 71, 38);
		button123.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=button123.getText();
				textField.setText("");	
				
			}
		});
		frame.getContentPane().add(button123);
		
		button_1 = new JButton("x^2");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(20, 213, 71, 38);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float b=Float.parseFloat(str1);
				 float c=b*b;
				 str=String.valueOf(c);
				 textField.setText(str);
				
			}
		});
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("ln");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBounds(96, 164, 71, 38);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float b=Float.parseFloat(str1);
				float k=(float)Math.log(b);
				String str=String.valueOf(k);
				textField.setText(str);
			}
		});
		frame.getContentPane().add(button_2);
		
	button_3 = new JButton("n!");
	button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
	button_3.setBounds(96, 213, 71, 38);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float t=Float.parseFloat(str1);
				float fact=1;
				for(int i=1;i<=t;i++)
				{
					fact=(int)fact*i;
				}
				str=String.valueOf(fact);
				textField.setText(str);
				
			}
		});
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("sin");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBounds(172, 71, 71, 38);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float t=Float.parseFloat(str1);
				float res=(float)Math.sin(t*(float)Math.PI/180);
				str=String.valueOf(res);
				textField.setText(str);
			}
		});
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("tan");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.setBounds(172, 164, 71, 38);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float t=Float.parseFloat(str1);
				float res=(float)Math.tan(t*(float)Math.PI/180);
				str=String.valueOf(res);
				textField.setText(str);
			}
		});
		frame.getContentPane().add(button_5);
		
		button_7 = new JButton("sec");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_7.setBounds(172, 213, 71, 38);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float t=Float.parseFloat(str1);
				float res=(float)Math.cos(t*(float)Math.PI/180);
				float p=(float)1/res;
				str=String.valueOf(p);
				textField.setText(str);
			}
		});
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("%");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_8.setBounds(20, 120, 71, 38);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=button_8.getText();
				textField.setText("");
			}
		});
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("Exp");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_9.setBounds(96, 120, 71, 38);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float b=Float.parseFloat(str1);
				float k=(float)Math.exp(b);
				String str=String.valueOf(k);
				textField.setText(str);
			}
			
		});
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("Cos");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_10.setBounds(172, 120, 71, 38);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				float t=Float.parseFloat(str1);
				float res=(float)Math.cos(t*(float)Math.PI/180);
				str=String.valueOf(res);
				textField.setText(str);
			}
		});
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("7");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(button_11.getText()));
			}
		});
		button_11.setBounds(303, 71, 42, 38);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("8");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(button_12.getText()));
			}
		});
		button_12.setBounds(355, 71, 42, 38);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("9");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(button_13.getText()));
			}
		});
		button_13.setBounds(407, 71, 42, 38);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=button_14.getText();
				textField.setText("");
				
			}
		});
		button_14.setBounds(459, 71, 42, 38);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("4");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(button_15.getText()));
			}
		});
		button_15.setBounds(303, 120, 42, 38);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("5");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(button_16.getText()));
			}
		});
		button_16.setBounds(355, 120, 42, 38);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("6");
		button_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(button_17.getText()));
			}
		});
		button_17.setBounds(407, 120, 42, 38);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("*");
		button_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=button_18.getText();
				textField.setText("");
				 
			}
		});
		button_18.setBounds(459, 120, 42, 38);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("-");
		button_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=button_19.getText();
				textField.setText("");
			
			}
		});
		button_19.setBounds(459, 164, 42, 38);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("3");
		button_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(button_20.getText()));
			}
		});
		button_20.setBounds(407, 164, 42, 38);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("2");
		button_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(button_21.getText()));
			}
		});
		button_21.setBounds(355, 164, 42, 38);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("1");
		button_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().concat(button_22.getText())); 
			}
		});
		button_22.setBounds(303, 164, 42, 38);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("0");
		button_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText().concat(button_23.getText()));
			}
		});
		button_23.setBounds(303, 213, 42, 38);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton(".");
		button_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_24.setBounds(355, 213, 42, 38);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("=");
		button_25.setFont(new Font("Tahoma", Font.BOLD, 10));
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float res1=Float.parseFloat(str1);
				String str;
				float res2=Float.parseFloat(textField.getText());
				float s=1;
				if(str2.contentEquals("+"))
				{
				  float res=res1+res2;
				  str=String.valueOf(res);
				  textField.setText(str);
				}	
				else if(str2.contentEquals("-"))
				{
				  float res=res1-res2;
				  str=String.valueOf(res);
				  textField.setText(str);
				}	
				else if(str2.contentEquals("*"))
				{
				  float res=res1*res2;
				  str=String.valueOf(res);
				  textField.setText(str);
				}	
				else if(str2.contentEquals("/"))
				{
				  float res=res1/res2;
				  str=String.valueOf(res);
				  textField.setText(str);
				}	
				else if(str2.contentEquals("x^y"))
				{
					for(int i=1;i<=res2;i++)
					{
				     s=(float)s*res1;  
					}
					str=String.valueOf(s);
					textField.setText(str);
				}	
				else if(str2.contentEquals("%"))
				{
					float res=res1%res2;
					  str=String.valueOf(res);
					  textField.setText(str);
				}
			}
});
		button_25.setBounds(407, 213, 42, 38);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("+");
		button_26.setFont(new Font("Tahoma", Font.BOLD, 10));
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=textField.getText();
				str2=button_26.getText();
				textField.setText("");
				
				
				
			}
		});
		button_26.setBounds(459, 213, 42, 38);
		frame.getContentPane().add(button_26);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 21, 2, 2);
		frame.getContentPane().add(scrollPane);
		
		JButton btnNewButton_2 = new JButton("c");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_2.setBounds(253, 86, 40, 57);
		frame.getContentPane().add(btnNewButton_2);
	}
}
		
	
	