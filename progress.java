package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class progress {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JTextField t11;
	private JTextField t12;
	private JTextField t13;
	private JTextField t14;
	private JTable table;
	private JTable table_2;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progress window = new progress();
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
	public progress() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Student Report");
		frame.getContentPane().setBackground(new Color(0, 0, 205));
		frame.setBounds(0, 0, 1350, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(211, 211, 211));
		p1.setBounds(9, 11, 525, 371);
		frame.getContentPane().add(p1);
		p1.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(193, 5, 0, 0);
		p1.add(label);
		
		JLabel lblNewLabel = new JLabel("Student_ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 61, 20);
		p1.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("First Name");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(10, 52, 61, 20);
		p1.add(label_1);
		
		JLabel label_2 = new JLabel("Sur Name");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(10, 105, 61, 20);
		p1.add(label_2);
		
		JLabel label_3 = new JLabel("Total Score");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(10, 226, 61, 20);
		p1.add(label_3);
		
		JLabel label_4 = new JLabel("Average");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(10, 269, 61, 14);
		p1.add(label_4);
		
		JLabel label_5 = new JLabel("Ranking");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(10, 327, 61, 14);
		p1.add(label_5);
		
		JLabel label_6 = new JLabel("Course Code");
		label_6.setBounds(10, 148, 77, 20);
		p1.add(label_6);
		
		t1 = new JTextField();
		t1.setBounds(107, 11, 86, 20);
		p1.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(107, 55, 86, 20);
		p1.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(107, 108, 86, 20);
		p1.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(107, 226, 86, 20);
		p1.add(t4);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(107, 271, 86, 20);
		p1.add(t5);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(107, 324, 86, 20);
		p1.add(t6);
		
		JLabel label_7 = new JLabel("Maths");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(226, 11, 74, 14);
		p1.add(label_7);
		
		JLabel label_8 = new JLabel("English");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(226, 58, 74, 14);
		p1.add(label_8);
		
		JLabel label_9 = new JLabel("Biology");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBounds(226, 111, 74, 14);
		p1.add(label_9);
		
		JLabel label_10 = new JLabel("Computer");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_10.setBounds(226, 148, 74, 14);
		p1.add(label_10);
		
		JLabel label_11 = new JLabel("Chemistry");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setBounds(226, 198, 74, 14);
		p1.add(label_11);
		
		JLabel label_12 = new JLabel("Physics");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_12.setBounds(226, 244, 74, 14);
		p1.add(label_12);
		
		JLabel label_13 = new JLabel("Tamil");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_13.setBounds(226, 291, 74, 14);
		p1.add(label_13);
		
		JLabel label_14 = new JLabel("Malayalam");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_14.setBounds(226, 338, 74, 14);
		p1.add(label_14);
		
		t7 = new JTextField();
		t7.setColumns(10);
		t7.setBounds(336, 8, 86, 20);
		p1.add(t7);
		
		t8 = new JTextField();
		t8.setColumns(10);
		t8.setBounds(336, 55, 86, 20);
		p1.add(t8);
		
		t9 = new JTextField();
		t9.setColumns(10);
		t9.setBounds(336, 108, 86, 20);
		p1.add(t9);
		
		t10 = new JTextField();
		t10.setColumns(10);
		t10.setBounds(336, 145, 86, 20);
		p1.add(t10);
		
		t11 = new JTextField();
		t11.setColumns(10);
		t11.setBounds(336, 196, 86, 20);
		p1.add(t11);
		
		t12 = new JTextField();
		t12.setColumns(10);
		t12.setBounds(336, 242, 86, 20);
		p1.add(t12);
		
		t13 = new JTextField();
		t13.setColumns(10);
		t13.setBounds(336, 289, 86, 20);
		p1.add(t13);
		
		t14 = new JTextField();
		t14.setColumns(10);
		t14.setBounds(336, 336, 86, 20);
		p1.add(t14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"11032B", "11032C", "11032D ", "11032E"}));
		comboBox.setBounds(97, 145, 96, 20);
		p1.add(comboBox);
		
				
		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		panel.setBounds(544, 11, 552, 384);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 532, 339);
		panel.add(textArea);
		
		JButton b6 = new JButton("Clear");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 12));
		b6.setBounds(232, 361, 89, 23);
		panel.add(b6);
		
		
		
		JButton b1 = new JButton("Add Report");
		b1.setFont(new Font("Tahoma", Font.BOLD, 12));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double[] R=new double[15];
				R[0]=Double.parseDouble(t7.getText());
				R[1]=Double.parseDouble(t8.getText());
				R[2]=Double.parseDouble(t9.getText());
				R[3]=Double.parseDouble(t10.getText());
				R[4]=Double.parseDouble(t11.getText());
				R[5]=Double.parseDouble(t12.getText());
				R[6]=Double.parseDouble(t13.getText());
				R[7]=Double.parseDouble(t14.getText());
				R[8]=(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7])/8;
				R[9]=R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7];
				String avg=String.format("%.2f",R[8]);
				t5.setText(avg);
				String total=String.format("%.2f",R[9]);
				t4.setText(total);
				if(R[9]>=700)
				   {
				    t6.setText("1");
				   }
				 else if(R[9]>=600)
				   {
				    t6.setText("2");
				   }
				 else if(R[9]>=500)
				   {
				    t6.setText("3");
				   }
				   else if(R[9]>=400)
				   {
				    t6.setText("4");
				   }
				   else if(R[9]>=300)
				   {
				    t6.setText("5");
				   }
				   else
				   {
				    t6.setText("Fail");
				   }
				DefaultTableModel model=(DefaultTableModel) table_1.getModel();
				model.addRow(new String[] {
				t1.getText(),
				(String) comboBox.getSelectedItem(),
				t7.getText(),
				t8.getText(),
				t9.getText(),
				t10.getText(),
				t11.getText(),
				t12.getText(),
				t13.getText(),
				t14.getText(),
				t4.getText(),
				t5.getText(),
				t6.getText(),
				});
				
			}
		});
		b1.setBounds(104, 543, 105, 23);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Delete");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table_1.getModel();
				if(table_1.getSelectedRow()==-1)
				{
				if(table_1.getRowCount()==0)
				{
				JOptionPane.showMessageDialog(null, "NO data to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				else {
				JOptionPane.showMessageDialog(null, "Select a row to Delete",
				"Student Result",JOptionPane.OK_OPTION);
				}
				}
				else {
				model.removeRow(table_1.getSelectedRow());
				}
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 12));
		b2.setBounds(304, 543, 89, 23);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("Show Report");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Student Record\n"
						+ "Student Name :\t\t"+t2.getText()+" "+t3.getText()+"\n"
						+ "======================================\n"
						+ "Math:\t\t" + t7.getText()
						+ "\nEnglish:\t\t" + t8.getText()
						+ "\nBiology:\t\t" + t9.getText()
						+ "\nComputer:\t\t" + t10.getText()
						+ "\nChemistry:\t\t" + t11.getText()
						+ "\nPysics:\t\t" + t12.getText()
						+ "\nTamil:\t\t" + t13.getText()
						+ "\nMalayalam:\t\t" + t14.getText()
						+"\n======================================"
						+ "\nTotal SCore:\t\t" + t4.getText()
						+ "\nAverage:\t\t" + t5.getText()
						+ "\nRanking:\t\t" + t6.getText() + "\n"
						);
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 12));
		b3.setBounds(508, 543, 125, 23);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("Exit");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Comfirm","Student Report",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				    {
					System.exit(0);
					}
				
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 12));
		b4.setBounds(727, 543, 89, 23);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("Reset");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				t9.setText("");
				t10.setText("");
				t11.setText("");
				t12.setText("");
				t13.setText("");
				t14.setText("");
				
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 12));
		b5.setBounds(920, 543, 89, 23);
		frame.getContentPane().add(b5);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		table_1.setBackground(new Color(102, 205, 170));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student id", "Course Code", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "Total Score", "Averege", null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.setBounds(9, 457, 1096, 75);
		frame.getContentPane().add(table_1);
	}
}
