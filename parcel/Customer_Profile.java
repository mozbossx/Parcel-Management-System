package parcel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

//Author: Taruc, Ched V.

public class Customer_Profile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public static String address;
	private JPasswordField passwordField;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ImageIcon prof = new ImageIcon("profile icon.png");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Profile frame = new Customer_Profile();
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
	public Customer_Profile() {
		setTitle("Quickie Delivery - Customer Profile");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 550);
		java.awt.Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image prof = new ImageIcon(this.getClass().getResource("/delivery_guy2.jpg")).getImage();
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(-14, 471, 902, 54);
		contentPane.add(textField_1);
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnBackActionPerformed();
			}

			private void btnBackActionPerformed() {
				new Customer_Homepage().setVisible(true);
				dispose();
				
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setFocusable(false);
		btnBack.setBorderPainted(false);
		btnBack.setBackground(new Color(88, 133, 175));
		btnBack.setBounds(10, 10, 98, 25);
		contentPane.add(btnBack);
		
		JTextPane CustomerName = new JTextPane();
		CustomerName.setForeground(new Color(88, 133, 175));
		CustomerName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		CustomerName.setEditable(false);
		CustomerName.setBackground(new Color(240, 248, 255));
		CustomerName.setBounds(44, 147, 381, 36);
		contentPane.add(CustomerName);
		
		JTextPane phoneNumber = new JTextPane();
		phoneNumber.setText(" ");
		phoneNumber.setForeground(new Color(88, 133, 175));
		phoneNumber.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		phoneNumber.setEditable(false);
		phoneNumber.setBackground(new Color(240, 248, 255));
		phoneNumber.setBounds(469, 247, 381, 36);
		contentPane.add(phoneNumber);
				
		String name = null;
		String emailadd = null;
		String number = null;
		String pass = null;
	
		System.out.println("Customer Profile -- " +CustomerSignIn.email2);
		String file1 = (CustomerSignIn.email2 +" = Customer"+".txt");
		System.out.println(file1);
		Scanner scanner;
		try {
			scanner = new Scanner(new File(file1));
			scanner.useDelimiter("-- ");
			
			emailadd = scanner.next();
			number = scanner.next();
			name = scanner.next();
			address = scanner.next();
			pass = scanner.next();
			
			scanner.close();
		
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error. No profile found");
		}	
		CustomerName.setText(name);
		
		JTextPane emailAdd = new JTextPane();
		emailAdd.setForeground(new Color(88, 133, 175));
		emailAdd.setText(" ");
		emailAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		emailAdd.setEditable(false);
		emailAdd.setBackground(new Color(240, 248, 255));
		emailAdd.setBounds(469, 147, 381, 36);
		contentPane.add(emailAdd);
		emailAdd.setText(emailadd);
		
		JLabel lblCustomerName = new JLabel("Full Name: ");
		lblCustomerName.setForeground(new Color(88, 133, 175));
		lblCustomerName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblCustomerName.setBounds(44, 114, 139, 35);
		contentPane.add(lblCustomerName);
		
		JLabel lblEmail = new JLabel("Email Address: ");
		lblEmail.setForeground(new Color(88, 133, 175));
		lblEmail.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblEmail.setBounds(469, 114, 202, 35);
		contentPane.add(lblEmail);
		
		JLabel lblBillingAddress = new JLabel("Home Address:");
		lblBillingAddress.setForeground(new Color(88, 133, 175));
		lblBillingAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblBillingAddress.setBounds(44, 214, 202, 35);
		contentPane.add(lblBillingAddress);
		
		JTextPane homeAddress = new JTextPane();
		homeAddress.setText(" ");
		homeAddress.setForeground(new Color(88, 133, 175));
		homeAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		homeAddress.setEditable(false);
		homeAddress.setBackground(new Color(240, 248, 255));
		homeAddress.setBounds(44, 247, 381, 36);
		contentPane.add(homeAddress);
		homeAddress.setText(address);
		
		JLabel lblProfile = new JLabel("Your Profile");
		lblProfile.setHorizontalAlignment(SwingConstants.LEFT);
		lblProfile.setForeground(new Color(0, 0, 128));
		lblProfile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblProfile.setBounds(20, 45, 297, 64);
		contentPane.add(lblProfile);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(new Color(88, 133, 175));
		lblPhoneNumber.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblPhoneNumber.setBounds(469, 214, 202, 35);
		contentPane.add(lblPhoneNumber);
		
		phoneNumber.setText(number);
		JLabel lblProfileLogo = new JLabel("");
		lblProfileLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfileLogo.setIcon(new ImageIcon(prof));
		lblProfileLogo.setBounds(592, 317, 209, 169);
		contentPane.add(lblProfileLogo);
		
		JButton btnConfirm = new JButton("Confirm");
		
		btnConfirm.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnConfirm.setVisible(false);
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnConfirm.setFocusable(false);
		btnConfirm.setBorderPainted(false);
		btnConfirm.setBackground(new Color(88, 133, 175));
		btnConfirm.setBounds(44, 425, 146, 36);
		contentPane.add(btnConfirm);
		
		JButton btnCancel = new JButton("Cancel");
		
		btnCancel.setVisible(false);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnCancel.setFocusable(false);
		btnCancel.setBorderPainted(false);
		btnCancel.setBackground(new Color(88, 133, 175));
		btnCancel.setBounds(200, 425, 128, 36);
		contentPane.add(btnCancel);
		
		JLabel lblyouCantEdit = new JLabel("(You can't edit email address)");
		lblyouCantEdit.setVisible(false);
		lblyouCantEdit.setForeground(new Color(88, 133, 175));
		lblyouCantEdit.setFont(new Font("Arial", Font.ITALIC, 20));
		lblyouCantEdit.setBounds(469, 83, 283, 35);
		contentPane.add(lblyouCantEdit);
		
		JButton btnEditProfile = new JButton("Edit");
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEditProfileActionPerformed();
				}

			private void btnEditProfileActionPerformed() {			
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to edit \nyour information?", "Edit Profile", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					btnEditProfile.setVisible(false);
					CustomerName.setEditable(true);
					CustomerName.setBorder(new LineBorder(new Color(0, 0, 128), (int) 1.5, true));
					passwordField.setEditable(true);
					passwordField.setBorder(new LineBorder(new Color(0, 0, 128), (int) 1.5, true));
					homeAddress.setEditable(true);
					homeAddress.setBorder(new LineBorder(new Color(0, 0, 128), (int) 1.5, true));
					phoneNumber.setEditable(true);
					phoneNumber.setBorder(new LineBorder(new Color(0, 0, 128),(int) 1.5, true));
					btnConfirm.setVisible(true);
					btnCancel.setVisible(true);
					lblyouCantEdit.setVisible(true);
		
			}
				
			}
		});
		
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConfirmActionPerformed();
			}

			private void btnConfirmActionPerformed() {
				String Customer_name1 = CustomerName.getText();
				String Customer_email1 = emailAdd.getText(); 
				String Customer_address1 = homeAddress.getText();
				String Customer_phonenum1 = phoneNumber.getText();
				String Customer_password = passwordField.getText();
				
				try (PrintWriter pr = new PrintWriter(CustomerSignIn.email2+" = Customer"+".txt")){
					pr.print(CustomerSignIn.email2+"-- "+Customer_phonenum1+"-- "+Customer_name1+"-- "+Customer_address1+"-- "+Customer_password);
									
					pr.close();
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Error. No profile found");
				}
				if (JOptionPane.showConfirmDialog(null, "Are you sure?", "Edit Profile", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					btnEditProfile.setVisible(true);
					CustomerName.setEditable(false);
					CustomerName.setBorder(null);
					passwordField.setEditable(false);
					passwordField.setBorder(null);
					homeAddress.setEditable(false);
					homeAddress.setBorder(null);
					phoneNumber.setEditable(false);
					phoneNumber.setBorder(null);
					btnConfirm.setVisible(false);
					btnCancel.setVisible(false);
					lblyouCantEdit.setVisible(false);
				}
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Edit Profile", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					btnEditProfile.setVisible(true);
					CustomerName.setEditable(false);
					CustomerName.setBorder(null);
					passwordField.setEditable(false);
					passwordField.setBorder(null);
					homeAddress.setEditable(false);
					homeAddress.setBorder(null);
					phoneNumber.setEditable(false);
					phoneNumber.setBorder(null);
					btnConfirm.setVisible(false);
					btnCancel.setVisible(false);
					lblyouCantEdit.setVisible(false);
				}
			}
		});
		
		btnEditProfile.setForeground(Color.WHITE);
		btnEditProfile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnEditProfile.setFocusable(false);
		btnEditProfile.setBorderPainted(false);
		btnEditProfile.setBackground(new Color(88, 133, 175));
		btnEditProfile.setBounds(762, 52, 87, 34);
		contentPane.add(btnEditProfile);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(-14, 0, 902, 42);
		contentPane.add(textField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(88, 133, 175));
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblPassword.setBounds(44, 308, 202, 35);
		contentPane.add(lblPassword);
		
		JCheckBox SeePasswordCheckBox_1 = new JCheckBox("Show Password");
		SeePasswordCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SeePasswordCheckBox_1.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		SeePasswordCheckBox_1.setForeground(new Color(65, 114, 159));
		SeePasswordCheckBox_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		SeePasswordCheckBox_1.setFocusable(false);
		SeePasswordCheckBox_1.setBackground(Color.WHITE);
		SeePasswordCheckBox_1.setBounds(316, 378, 109, 21);
		contentPane.add(SeePasswordCheckBox_1);
		
		passwordField = new JPasswordField();
		passwordField.setText("<dynamic>");
		passwordField.setForeground(new Color(88, 133, 175));
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		passwordField.setEditable(false);
		passwordField.setEchoChar('*');
		passwordField.setBorder(null);
		passwordField.setBackground(new Color(240, 248, 255));
		passwordField.setBounds(44, 340, 381, 36);
		contentPane.add(passwordField);
		
		
		passwordField.setText(pass);

	}
}
