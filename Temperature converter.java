package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class converter {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					converter window = new converter();
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
	public converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 519, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegreesl = new JLabel("Degrees");
		lblDegreesl.setBounds(64, 28, 95, 33);
		frame.getContentPane().add(lblDegreesl);
		
		textField = new JTextField();
		textField.setBounds(191, 28, 173, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(135, 121, 246, 51);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("To Celsius");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Degrees=textField.getText();
				int f=Integer.parseInt(Degrees);
				float t2=(float)(5*f-160)/9;
				String s1=String.valueOf(t2);
				label.setText("Result = "+s1);
			}
		});
		btnNewButton.setBounds(52, 211, 152, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("To Fahranheit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Degrees=textField.getText();
				int i=Integer.parseInt(Degrees);
				float t1=(float)(9*i+160)/5;
				String s2=String.valueOf(t1);
				label.setText("Result = "+s2);
			}
		});
		btnNewButton_1.setBounds(281, 209, 159, 41);
		frame.getContentPane().add(btnNewButton_1);
	}
}
