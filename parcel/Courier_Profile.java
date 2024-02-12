package parcel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

//Author: Taruc, Ched V.

public class Courier_Profile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String Courier_address;
	private JTextField textField_1;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Courier_Profile frame = new Courier_Profile();
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
	public Courier_Profile() {
		setTitle("Quickie Delivery - Courier Profile");
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
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnBackActionPerformed();
			}

			private void btnBackActionPerformed() {
				new Courier_Homepage().setVisible(true);
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
		
		JTextPane CourierName = new JTextPane();
		CourierName.setText((String) null);
		CourierName.setForeground(new Color(88, 133, 175));
		CourierName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		CourierName.setEditable(false);
		CourierName.setBackground(new Color(240, 248, 255));
		CourierName.setBounds(44, 147, 381, 36);
		contentPane.add(CourierName);
		
		JTextPane CourierPhoneNumber = new JTextPane();
		CourierPhoneNumber.setText(" ");
		CourierPhoneNumber.setForeground(new Color(88, 133, 175));
		CourierPhoneNumber.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		CourierPhoneNumber.setEditable(false);
		CourierPhoneNumber.setBackground(new Color(240, 248, 255));
		CourierPhoneNumber.setBounds(469, 246, 381, 36);
		contentPane.add(CourierPhoneNumber);
		
		String Courier_Name = null;
		String Courier_EmailAdd = null;
		String Courier_Number = null;
		String Courier_Password = null;
		
		System.out.println("Courier Profile -- " +CourierSignIn.e);
		
		String file2 = (CourierSignIn.e+" = Courier"+".txt");
		System.out.println(file2);
		Scanner s;
		try {
			s = new Scanner(new File(file2));
			s.useDelimiter("--");
			Courier_EmailAdd = s.next();
			Courier_Number = s.next();
			Courier_Name = s.next();
			Courier_address = s.next();
			Courier_Password = s.next();
			s.close();
		
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error. No profile found");
		}	
		CourierName.setText(Courier_Name);
		
		JLabel lblProfile = new JLabel("Courier Profile");
		lblProfile.setHorizontalAlignment(SwingConstants.LEFT);
		lblProfile.setForeground(new Color(0, 0, 128));
		lblProfile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblProfile.setBounds(20, 45, 385, 64);
		contentPane.add(lblProfile);
		
		JLabel lblCourierName = new JLabel("Full Name: ");
		lblCourierName.setForeground(new Color(88, 133, 175));
		lblCourierName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblCourierName.setBounds(44, 114, 139, 35);
		contentPane.add(lblCourierName);
		
		JTextPane CourierEmailAdd = new JTextPane();
		CourierEmailAdd.setText(" ");
		CourierEmailAdd.setForeground(new Color(88, 133, 175));
		CourierEmailAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		CourierEmailAdd.setEditable(false);
		CourierEmailAdd.setBackground(new Color(240, 248, 255));
		CourierEmailAdd.setBounds(469, 147, 381, 36);
		contentPane.add(CourierEmailAdd);
		CourierEmailAdd.setText(Courier_EmailAdd);
		
		JLabel lblEmail = new JLabel("Email Address: ");
		lblEmail.setForeground(new Color(88, 133, 175));
		lblEmail.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblEmail.setBounds(469, 114, 202, 35);
		contentPane.add(lblEmail);
		
		JLabel lblHomeAddress = new JLabel("Home Address:");
		lblHomeAddress.setForeground(new Color(88, 133, 175));
		lblHomeAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblHomeAddress.setBounds(44, 214, 202, 35);
		contentPane.add(lblHomeAddress);
		
		JTextPane CourierHomeAddress = new JTextPane();
		CourierHomeAddress.setText(" ");
		CourierHomeAddress.setForeground(new Color(88, 133, 175));
		CourierHomeAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		CourierHomeAddress.setEditable(false);
		CourierHomeAddress.setBackground(new Color(240, 248, 255));
		CourierHomeAddress.setBounds(44, 246, 381, 36);
		contentPane.add(CourierHomeAddress);
		CourierHomeAddress.setText(Courier_address);
		
		Image prof = new ImageIcon(this.getClass().getResource("/pic prof1.png")).getImage();
		
		Image cour = new ImageIcon(this.getClass().getResource("/delivery_guy1.jpg")).getImage();
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(0, 0, 875, 42);
		contentPane.add(textField);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(new Color(88, 133, 175));
		lblPhoneNumber.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblPhoneNumber.setBounds(469, 214, 202, 35);
		contentPane.add(lblPhoneNumber);
		
		CourierPhoneNumber.setText(Courier_Number);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(-15, 472, 902, 54);
		contentPane.add(textField_1);
		
		JLabel lblProfileLogo2 = new JLabel("");
		lblProfileLogo2.setIcon(new ImageIcon(cour));
		lblProfileLogo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfileLogo2.setBounds(558, 292, 233, 190);
		contentPane.add(lblProfileLogo2);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(88, 133, 175));
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblPassword.setBounds(44, 308, 202, 35);
		contentPane.add(lblPassword);
		
		JButton btnConfirm = new JButton("Confirm");
		
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
		btnCancel.setBounds(200, 425, 127, 36);
		contentPane.add(btnCancel);
		
		JLabel lblyouCantEdit = new JLabel("(You can't edit email address)");
		lblyouCantEdit.setVisible(false);
		lblyouCantEdit.setForeground(new Color(88, 133, 175));
		lblyouCantEdit.setFont(new Font("Arial", Font.ITALIC, 20));
		lblyouCantEdit.setBounds(469, 86, 285, 35);
		contentPane.add(lblyouCantEdit);
		
		JButton btnEditProfile = new JButton("Edit");
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEditProfileActionPerformed();
			}

			private void btnEditProfileActionPerformed() {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to edit \nyour information?", "Edit Profile", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					btnEditProfile.setVisible(false);
					CourierName.setEditable(true);
					CourierName.setBorder(new LineBorder(new Color(0, 0, 128), (int) 1.5, true));
					passwordField.setEditable(true);
					passwordField.setBorder(new LineBorder(new Color(0, 0, 128), (int) 1.5, true));
					CourierHomeAddress.setEditable(true);
					CourierHomeAddress.setBorder(new LineBorder(new Color(0, 0, 128), (int) 1.5, true));
					CourierPhoneNumber.setEditable(true);
					CourierPhoneNumber.setBorder(new LineBorder(new Color(0, 0, 128),(int) 1.5, true));
					btnConfirm.setVisible(true);
					btnCancel.setVisible(true);
					lblyouCantEdit.setVisible(true);
				}
				
			}
		});
		
		btnConfirm.setVisible(false);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConfirmActionPerformed();
			}

			private void btnConfirmActionPerformed() {
				String Courier_name1 = CourierName.getText();
				String Courier_email1 = CourierEmailAdd.getText(); 
				String Courier_address1 = CourierHomeAddress.getText();
				String Courier_phonenum1 = CourierPhoneNumber.getText();
				String Courier_password = passwordField.getText();
				
				try (PrintWriter pr = new PrintWriter(CourierSignIn.e+" = Courier"+".txt")){
					pr.print(CourierSignIn.e+"--"+Courier_phonenum1+"--"+Courier_name1+"--"+Courier_address1+"--"+Courier_password);
									
					pr.close();
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Error. No profile found");
				}
				if (JOptionPane.showConfirmDialog(null, "Are you sure?", "Edit Profile", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					btnEditProfile.setVisible(true);
					CourierName.setEditable(false);
					CourierName.setBorder(null);
					passwordField.setEditable(false);
					passwordField.setBorder(null);
					CourierHomeAddress.setEditable(false);
					CourierHomeAddress.setBorder(null);
					CourierPhoneNumber.setEditable(false);
					CourierPhoneNumber.setBorder(null);
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
					CourierName.setEditable(false);
					CourierName.setBorder(null);
					passwordField.setEditable(false);
					passwordField.setBorder(null);
					CourierHomeAddress.setEditable(false);
					CourierHomeAddress.setBorder(null);
					CourierPhoneNumber.setEditable(false);
					CourierPhoneNumber.setBorder(null);
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
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setEchoChar('*');
		passwordField.setBorder(null);
		passwordField.setForeground(new Color(88, 133, 175));
		passwordField.setBackground(new Color(240, 248, 255));
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		passwordField.setBounds(44, 339, 381, 36);
		contentPane.add(passwordField);
		passwordField.setText(Courier_Password);
		
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
		SeePasswordCheckBox_1.setBounds(316, 379, 109, 21);
		contentPane.add(SeePasswordCheckBox_1);
		
		
	}
}
