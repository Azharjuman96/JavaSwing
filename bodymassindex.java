package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class body {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					body window = new body();
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
	public body() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 11, 581, 71);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("  BODY MASS INDEX  ");
		lblBodyMassIndex.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblBodyMassIndex.setBounds(188, 11, 349, 38);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(10, 93, 581, 182);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeight = new JLabel("Height(m)");
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHeight.setBounds(55, 16, 122, 23);
		panel_1.add(lblHeight);
		
		JLabel label = new JLabel("Weight(Kg)");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(55, 65, 122, 23);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setBounds(264, 11, 207, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(264, 53, 207, 34);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("BMI");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(99, 106, 56, 34);
		panel_1.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(155, 110, 100, 29);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(344, 108, 145, 23);
		panel_1.add(label_1);
		
		JButton btnClear = new JButton("calculate");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String height =textField.getText();
				String weight =textField_1.getText();
				float h=Float.parseFloat(height);
				float w=Float.parseFloat(weight);
				float bmi=(float)w/(h*h);
				String str=String.valueOf(bmi);
				textField_2.setText(str);
				if(bmi<18.5)
				{
					label_1.setText("Under weight");
				}
				else if(bmi>18.5 && bmi<24.9)
				{
					label_1.setText("Normal weight");
				}
				else if(bmi>25 && bmi<29.9)
				{
					label_1.setText("Over weight");
				}
				else if(bmi>30)
				{
					label_1.setText("Obese");
				}
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBounds(261, 148, 89, 23);
		panel_1.add(btnClear);
		
		JButton button = new JButton("clear");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
			
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBounds(367, 148, 89, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBounds(471, 148, 89, 23);
		panel_1.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(10, 283, 581, 71);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Under weight", "Normal weight", "Over weight", "Obese"},
				{"<18.5", "18-5 to 24-9", "25 to 29.9", null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 561, 32);
		panel_2.add(table);
	}
}
