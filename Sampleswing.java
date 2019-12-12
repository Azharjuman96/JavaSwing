package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class Sampleswing {

	private JFrame frame;
	private JTextField s1;
	private JLabel t1;
	private JLabel t2;
	private JLabel label;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JButton btnNewButton;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sampleswing window = new Sampleswing();
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
	public Sampleswing() {
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
		
		s1 = new JTextField();
		s1.setBounds(235, 57, 189, 20);
		frame.getContentPane().add(s1);
		s1.setColumns(10);
		
		t1 = new JLabel("Username");
		t1.setBounds(100, 57, 114, 20);
		frame.getContentPane().add(t1);
		
		t2 = new JLabel(" Password");
		t2.setBounds(97, 111, 63, 14);
		frame.getContentPane().add(t2);
		
		
		
		label = new JLabel("");
		label.setBounds(133, 218, 189, 14);
		frame.getContentPane().add(label);
		
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(235, 108, 189, 20);
		frame.getContentPane().add(passwordField_1);
		
		btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username=s1.getText();
				String Password=""+new String(passwordField_1.getPassword());
				if(Username.equals("AZHAR") && Password.equals("1234"))
				{
					label.setText("Login is sucessfull");	
				}
				else
				{
					label.setText("Login is not sucessfull");
                                }
			}
		});
		btnNewButton.setBounds(181, 184, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(57, 183, 46, 49);
		frame.getContentPane().add(textArea);
		
		
		
	}
}
