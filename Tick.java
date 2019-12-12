package swing;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.awt.event.ActionEvent;
public class Tick{
	 String t="";
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
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tick window = new Tick();
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
	public Tick() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 791, 686);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBounds(372, 87, 399, 421);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(27, 50, 92, 20);
		panel.add(lblName);
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(153, 50, 150, 20);
		panel.add(t5);
		JLabel lblFrom = new JLabel("From");
		lblFrom.setToolTipText("");
		lblFrom.setLabelFor(frame);
		lblFrom.setForeground(Color.WHITE);
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFrom.setBounds(10, 137, 92, 20);
		panel.add(lblFrom);
		JLabel lblTo = new JLabel("To");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTo.setBounds(10, 191, 92, 20);
panel.add(lblTo);
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDate.setBounds(10, 240, 92, 20);
		panel.add(lblDate);
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTime.setBounds(10, 297, 92, 20);
		panel.add(lblTime);
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(78, 137, 111, 20);
		panel.add(t6);
		t7 = new JTextField();
		t7.setColumns(10);
		t7.setBounds(78, 191, 111, 20);
		panel.add(t7);
		t8 = new JTextField();
		t8.setColumns(10);
		t8.setBounds(78, 240, 111, 20);
		panel.add(t8);
		t9 = new JTextField();
		t9.setColumns(10);
		t9.setBounds(78, 297, 111, 20);
		panel.add(t9);
		JLabel lblTicketNumber = new JLabel("Ticket Number");
		lblTicketNumber.setBounds(258, 137, 92, 20);
		panel.add(lblTicketNumber);
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(258, 194, 92, 20);
		panel.add(lblPrice);
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(258, 243, 92, 20);
		panel.add(lblRoute);
		t10 = new JTextField();
		t10.setColumns(10);
		t10.setBounds(255, 168, 111, 20);
		panel.add(t10);
		t11 = new JTextField();
		t11.setColumns(10);
		t11.setBounds(255, 212, 111, 20);
		panel.add(t11);
		t12 = new JTextField();
		t12.setColumns(10);
		t12.setBounds(258, 274, 111, 20);
		panel.add(t12);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new TitledBorder(null, "Ticketing System", TitledBorder.LEFT, TitledBorder.TOP, null, Color.WHITE));
		panel_1.setForeground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 11, 761, 70);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel.setBounds(10, 11, 741, 48);
		panel_1.add(lblNewLabel);
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 87, 352, 421);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 29, 77, 27);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_2.add(lblNewLabel_1);
		t1 = new JTextField();
		t1.setBounds(97, 32, 212, 27);
		panel_2.add(t1);
		t1.setColumns(10);
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 67, 332, 2);
		panel_2.add(separator);
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(340, 67, 2, 343);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(separator_1);
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 212, 342, 2);
		panel_2.add(separator_3);
		JRadioButton r4 = new JRadioButton("First Class");
		r4.setBounds(10, 129, 77, 23);
		panel_2.add(r4);
		JRadioButton r2 = new JRadioButton("Single Ticket");
		r2.setBounds(126, 89, 92, 23);
		panel_2.add(r2);
		JRadioButton r3 = new JRadioButton("Adult");
		r3.setBounds(254, 89, 77, 23);
		panel_2.add(r3);
		JRadioButton r1 = new JRadioButton("Standared");
		r1.setBounds(22, 89, 77, 23);
		panel_2.add(r1);
		JRadioButton r5 = new JRadioButton("AC");
		r5.setBounds(97, 129, 51, 23);
		panel_2.add(r5);
		JRadioButton r6 = new JRadioButton("Sleeper");
		r6.setBounds(163, 129, 77, 23);
panel_2.add(r6);
		JRadioButton r7 = new JRadioButton("Child");
		r7.setBounds(254, 129, 77, 23);
		panel_2.add(r7);
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Kozhikkode", "Malappuram", "Ernakkulam"}));
		c1.setBounds(10, 181, 89, 20);
		panel_2.add(c1);
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Kozhikkode", "Malappuram", "Ernakkulam"}));
		c2.setBounds(126, 181, 92, 20);
		panel_2.add(c2);
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		c3.setBounds(245, 178, 85, 20);
		panel_2.add(c3);
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 332, 342, 2);
		panel_2.add(separator_2);
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(22, 225, 92, 20);
		panel_2.add(lblTax);
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(22, 262, 92, 20);
		panel_2.add(lblSubTotal);
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(22, 301, 92, 20);
		panel_2.add(lblTotal);
		t2 = new JTextField();
		t2.setBounds(180, 225, 150, 20);
		panel_2.add(t2);
		t2.setColumns(10);
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(180, 262, 150, 20);
		panel_2.add(t3);
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(180, 301, 150, 20);
		panel_2.add(t4);
		ButtonGroup g=new ButtonGroup();
		ButtonGroup g1=new ButtonGroup();
		g.add(r3);
		g.add(r7);
		System.out.print(r3.getText());
		g1.add(r5);
		g1.add(r6);
		g1.add(r1);
		g1.add(r4);
		g1.add(r2);
JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((!g1.isSelected(null)) && (!g.isSelected(null)))
				{
				String a=(String)c1.getSelectedItem();
				String b=(String)c2.getSelectedItem();
				float c=Float.parseFloat((String)c3.getSelectedItem());
				g1.getSelection();
				String age="";
				String st="";
				float tax = 0;
		         float total=0;
		         float fa=0;
				if((a.equals("Kozhikkode")) && (b.equals("Ernakkulam"))||(a.equals("Ernakkulam")) && (b.equals("Kozhikkode")))
				{
		         fa=290f;
				}
				if((a.equals("Kozhikkode")) && (b.equals("Malappuram"))||(a.equals("Malappuram")) && (b.equals("Kozhikkode")))
				{
		         fa=45f;
				}
				if((a.equals("Ernakkulam")) && (b.equals("Malappuram"))||(a.equals("Malappuram")) && (b.equals("Ernakkulam")))
				{
		         fa=248f;
				}
				if(r3.isSelected())
				{
				  if(r1.isSelected())
					{
					  t="Standared";
					  fa=fa;
					  tax=fa*5/100;
					  total=(fa+tax)*c;
					}
					else if(r5.isSelected())
					{
						 t="Ac";
					  fa=fa*150/100;
					  tax=fa*10/100;
					  total=(fa+tax)*c;
					}
					else if(r6.isSelected())
					{
						 t="Sleeper";
					 fa=fa*130/100;
					 tax=fa*7/100;
					 total=(fa+tax)*c;
					}
					else if(r4.isSelected())
					{
						 t="FirstClass";
					  fa=fa*180/100;
					  tax=fa*15/100;
					  total=(fa+tax)*c;
					}
				}
				else
				{
					if(r1.isSelected())
					{
						 t="Standared";
					  fa=fa*50/100;
					  tax=fa*2/100;
					  total=(fa+tax)*c;
					}
					else if(r5.isSelected())
					{
						 t="Ac";
					  fa=(fa*50/100)*50/100;
					  tax=fa*5/100;
					  total=(fa+tax)*c;
					}
					else if(r6.isSelected())
					{
						 t="Sleeper";
					 fa=(fa*50/100)*30/100;
					  tax=fa*3/100;
					  total=(fa+tax)*c;
					}
					else if(r4.isSelected())
					{
						 t="First Class";
					  fa=(fa*50/100)*80/100;
					  tax=fa*10/100;
					  total=(fa+tax)*c;
					}
				}
		         t2.setText(String.valueOf(tax));
		         t3.setText(String.valueOf(fa));
		         t4.setText(String.valueOf(total));
		         Random rand = new Random();
		         int rand_int1 = rand.nextInt(10000);
		         t10.setText(String.valueOf(rand_int1));
		         t11.setText(String.valueOf(total));
		         t5.setText(t1.getText());
		         t6.setText((String)c1.getSelectedItem());
		         t7.setText((String)c2.getSelectedItem());
		        //time
		         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		         DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm");
		         LocalDateTime now = LocalDateTime.now();
		         t8.setText(dtf.format(now));
		         t9.setText(tf.format(now));
		         t12.setText("Any");
				}
			}
		});
		btnTotal.setBounds(10, 361, 89, 23);
		panel_2.add(btnTotal);
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new String[]
						{
								t5.getText(),
								t10.getText(),
								t6.getText(),
								t7.getText(),
								(String)c3.getSelectedItem(),
								t8.getText(),
								t9.getText(),
								t,
								t11.getText()
						});
			}
		});
		btnConfirm.setBounds(153, 366, 89, 23);
		panel.add(btnConfirm);
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    g1.clearSelection();
				g.clearSelection();
				JTextField temp=null;
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						System.out.println(c.getClass().toString().contains("javax.swing.JTextField"));
					temp=(JTextField)c;
					temp.setText("");
				}
				}
				for(Component c:panel_2.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						System.out.println(c.getClass().toString().contains("javax.swing.JTextField"));
					temp=(JTextField)c;
					temp.setText("");
				}
				}
			}
		});
		btnReset.setBounds(138, 361, 89, 23);
		panel_2.add(btnReset);
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(245, 361, 89, 23);
		panel_2.add(btnExit);
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 512, 755, 125);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No. of seat", "Time", "Date", "Ac/Non-Ac", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(92);
		table.getColumnModel().getColumn(2).setPreferredWidth(87);
		table.getColumnModel().getColumn(3).setPreferredWidth(86);
		table.setBounds(10, 11, 735, 103);
		panel_3.add(table);
	}
}
