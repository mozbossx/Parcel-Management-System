package parcel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

//Author: Mozar, Carlo

public class AboutUs extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel lblIsAVery;
	private JLabel lblIsAVery_1;
	private JLabel lblIsAVery_3;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutUs() {
		setTitle("Quickie Delivery - About Us");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		java.awt.Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
		setBounds(100, 100, 1003, 474);
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(65, 114, 159));
		textField_2.setBounds(-19, 397, 1023, 59);
		contentPane.add(textField_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Choice().setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setBorder(null);
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setFocusable(false);
		btnBack.setBackground(new Color(88, 133, 175));
		btnBack.setBounds(10, 10, 98, 25);
		contentPane.add(btnBack);
		
		jLabel1 = new JLabel("Q");
		jLabel1.setForeground(new Color(0, 0, 128));
		jLabel1.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 99));
		jLabel1.setBounds(486, 80, 84, 127);
		contentPane.add(jLabel1);
		
		jLabel2 = new JLabel("uickie");
		jLabel2.setForeground(new Color(0, 102, 255));
		jLabel2.setFont(new Font("Calisto MT", Font.ITALIC, 35));
		jLabel2.setBounds(563, 129, 90, 42);
		contentPane.add(jLabel2);
		
		lblIsAVery = new JLabel("is a very useful and");
		lblIsAVery.setHorizontalAlignment(SwingConstants.LEFT);
		lblIsAVery.setForeground(new Color(88, 133, 175));
		lblIsAVery.setFont(new Font("Arial", Font.PLAIN, 20));
		lblIsAVery.setBounds(788, 138, 185, 35);
		contentPane.add(lblIsAVery);
		
		lblIsAVery_1 = new JLabel("time-saving app to manage parcels.");
		lblIsAVery_1.setForeground(new Color(88, 133, 175));
		lblIsAVery_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblIsAVery_1.setBounds(563, 166, 321, 35);
		contentPane.add(lblIsAVery_1);
		
		lblIsAVery_3 = new JLabel("The Developers:");
		lblIsAVery_3.setForeground(new Color(88, 133, 175));
		lblIsAVery_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblIsAVery_3.setBounds(486, 202, 238, 42);
		contentPane.add(lblIsAVery_3);
		
		Image prof = new ImageIcon(this.getClass().getResource("/package1.jpg")).getImage();
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 52, 450, 335);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(prof));
		
		JLabel jLabel3 = new JLabel("DELIVERY");
		jLabel3.setForeground(new Color(0, 0, 139));
		jLabel3.setFont(new Font("Calisto MT", Font.ITALIC, 25));
		jLabel3.setBounds(649, 133, 145, 42);
		contentPane.add(jLabel3);
		
		JButton btnTermsAndConditions = new JButton("Terms and Conditions");
		btnTermsAndConditions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TermsAndConditions().setVisible(true);
				dispose();
			}
		});
		btnTermsAndConditions.setBorder(null);
		btnTermsAndConditions.setForeground(Color.WHITE);
		btnTermsAndConditions.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnTermsAndConditions.setFocusable(false);
		btnTermsAndConditions.setBackground(new Color(88, 133, 175));
		btnTermsAndConditions.setBounds(729, 10, 244, 25);
		contentPane.add(btnTermsAndConditions);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(-19, -17, 1023, 59);
		contentPane.add(textField_1);
		
		JTextPane txtpnWeAreThe_1 = new JTextPane();
		txtpnWeAreThe_1.setText("Dublin, Hannah Florenz Q.\nFactor, Dovyle Jr. A.\r\nMosqueda, John Vianney C.\r\nMozar, Carlo D.\r\nTaruc, Ched V.\r\n");
		txtpnWeAreThe_1.setForeground(new Color(88, 133, 175));
		txtpnWeAreThe_1.setFont(new Font("Arial", Font.PLAIN, 20));
		txtpnWeAreThe_1.setEditable(false);
		txtpnWeAreThe_1.setBounds(524, 231, 270, 127);
		contentPane.add(txtpnWeAreThe_1);
		
		
	}
}
