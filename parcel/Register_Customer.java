package parcel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

//Author: Mosqueda, John Vianney C.

public class Register_Customer extends JFrame {
	public static String EmailAddress2;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel FullNameLabel;
	private JLabel PasswordLabel;
	private JTextField FullNametxt2;
	private JPasswordField passwordField2;
	private JLabel ConfirmPassLabel;
	private JPasswordField confirmpasswordField2;
	private JLabel PhoneNumLabel;
	private JTextField PhoneNumtxt2;
	private JLabel EmailAddLabel;
	private JTextField EmailAddtxt2;
	private JLabel HomeAddLabel;
	private JTextField HomeAddtxt2;
	private JCheckBox SeePasswordCheckBox;
	private JCheckBox SeePasswordCheckBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register_Customer frame = new Register_Customer();
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
	public Register_Customer() {
		setTitle("Quickie Delivery - Register as Customer");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		java.awt.Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setBounds(100, 100, 828, 493);
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelActionPerformed();
			}

			private void btnCancelActionPerformed() {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
				new CustomerSignIn().setVisible(true);
				dispose();
				}
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCancel.setFocusable(false);
		btnCancel.setBorderPainted(false);
		btnCancel.setBackground(new Color(88, 133, 175));
		btnCancel.setBounds(10, 10, 113, 25);
		contentPane.add(btnCancel);
		
		JLabel lblRegisterAsCustomer = new JLabel("Register as Customer");
		lblRegisterAsCustomer.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegisterAsCustomer.setForeground(new Color(0, 0, 128));
		lblRegisterAsCustomer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblRegisterAsCustomer.setBounds(22, 45, 556, 64);
		contentPane.add(lblRegisterAsCustomer);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnRegisterActionPerformed();
			}

			private void btnRegisterActionPerformed() {
				String FullName2 = FullNametxt2.getText();
				String Password2 = passwordField2.getText();
				String ConfirmPassword2 = confirmpasswordField2.getText();
				String PhoneNumber2 = PhoneNumtxt2.getText();
				EmailAddress2 = EmailAddtxt2.getText();
				String HomeAddress2 = HomeAddtxt2.getText();
				
				if(FullName2.equals("") || Password2.equals("") || ConfirmPassword2.equals("") || PhoneNumber2.equals("") || EmailAddress2.equals("") || HomeAddress2.equals("")) {
					JOptionPane.showMessageDialog(null,"You must fill up all fields!");
			    }
			    
				else if(!ConfirmPassword2.equals(Password2) || !Password2.equals(ConfirmPassword2)) { 
					JOptionPane.showMessageDialog(null,"Passwords are not the same. Try again","Password does not match",JOptionPane.WARNING_MESSAGE);
			    }
				
				else {
					try
					{
						FileWriter Writer2 = new FileWriter(EmailAddress2 +" = Customer"+".txt",true);
						Writer2.write(EmailAddress2+"-- "+PhoneNumber2+"-- "+FullName2+"-- "+HomeAddress2+"-- "+Password2+"-- "+ConfirmPassword2);
						Writer2.write(System.getProperty("line.separator"));
						Writer2.close();
						JOptionPane.showMessageDialog(null,"Registration Complete");
						setVisible(false);
						new CustomerSignIn().setVisible(true);
			          }
			          catch(IOException e)
			          {
			              JOptionPane.showMessageDialog(null, "Error");
			          }
			         			          
			       }
				
			}
		});
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnRegister.setFocusable(false);
		btnRegister.setBorderPainted(false);
		btnRegister.setBackground(new Color(88, 133, 175));
		btnRegister.setBounds(650, 368, 139, 35);
		contentPane.add(btnRegister);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(0, 413, 814, 42);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(0, 0, 814, 42);
		contentPane.add(textField);
		
		FullNameLabel = new JLabel("Full Name:");
		FullNameLabel.setForeground(new Color(88, 133, 175));
		FullNameLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		FullNameLabel.setBounds(42, 118, 139, 35);
		contentPane.add(FullNameLabel);
		
		PasswordLabel = new JLabel("Password:");
		PasswordLabel.setForeground(new Color(88, 133, 175));
		PasswordLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		PasswordLabel.setBounds(42, 196, 139, 35);
		contentPane.add(PasswordLabel);
		
		FullNametxt2 = new JTextField();
		FullNametxt2.setForeground(new Color(88, 133, 175));
		FullNametxt2.setBorder(null);
		FullNametxt2.setHorizontalAlignment(SwingConstants.LEFT);
		FullNametxt2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		FullNametxt2.setColumns(10);
		FullNametxt2.setBackground(new Color(240, 248, 255));
		FullNametxt2.setBounds(42, 151, 360, 35);
		contentPane.add(FullNametxt2);
		
		FullNametxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	FullNametxt2ActionPerformed(evt);
            }

			private void FullNametxt2ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		
		passwordField2 = new JPasswordField();
		passwordField2.setEchoChar('*');
		passwordField2.setForeground(new Color(88, 133, 175));
		passwordField2.setBorder(null);
		passwordField2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		passwordField2.setBackground(new Color(240, 248, 255));
		passwordField2.setBounds(42, 227, 360, 33);
		contentPane.add(passwordField2);
		
		passwordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	passwordField2ActionPerformed(evt);
            }

			private void passwordField2ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		ConfirmPassLabel = new JLabel("Confirm Password:");
		ConfirmPassLabel.setForeground(new Color(88, 133, 175));
		ConfirmPassLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		ConfirmPassLabel.setBounds(42, 282, 241, 35);
		contentPane.add(ConfirmPassLabel);
		
		confirmpasswordField2 = new JPasswordField();
		confirmpasswordField2.setEchoChar('*');
		confirmpasswordField2.setBorder(null);
		confirmpasswordField2.setForeground(new Color(88, 133, 175));
		confirmpasswordField2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		confirmpasswordField2.setBackground(new Color(240, 248, 255));
		confirmpasswordField2.setBounds(42, 314, 360, 33);
		contentPane.add(confirmpasswordField2);
		
		confirmpasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	confirmpasswordField2ActionPerformed(evt);
            }

			private void confirmpasswordField2ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		PhoneNumLabel = new JLabel("Phone Number:");
		PhoneNumLabel.setForeground(new Color(88, 133, 175));
		PhoneNumLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		PhoneNumLabel.setBounds(426, 118, 201, 35);
		contentPane.add(PhoneNumLabel);
		
		PhoneNumtxt2 = new JTextField();
		PhoneNumtxt2.setForeground(new Color(88, 133, 175));
		PhoneNumtxt2.setBorder(null);
		PhoneNumtxt2.setHorizontalAlignment(SwingConstants.LEFT);
		PhoneNumtxt2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		PhoneNumtxt2.setColumns(10);
		PhoneNumtxt2.setBackground(new Color(240, 248, 255));
		PhoneNumtxt2.setBounds(426, 151, 360, 35);
		contentPane.add(PhoneNumtxt2);
		
		PhoneNumtxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	PhoneNumtxt2ActionPerformed(evt);
            }

			private void PhoneNumtxt2ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		EmailAddLabel = new JLabel("Email Address:");
		EmailAddLabel.setForeground(new Color(88, 133, 175));
		EmailAddLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		EmailAddLabel.setBounds(426, 196, 195, 35);
		contentPane.add(EmailAddLabel);
		
		EmailAddtxt2 = new JTextField();
		EmailAddtxt2.setForeground(new Color(88, 133, 175));
		EmailAddtxt2.setBorder(null);
		EmailAddtxt2.setHorizontalAlignment(SwingConstants.LEFT);
		EmailAddtxt2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		EmailAddtxt2.setColumns(10);
		EmailAddtxt2.setBackground(new Color(240, 248, 255));
		EmailAddtxt2.setBounds(426, 226, 360, 35);
		contentPane.add(EmailAddtxt2);
		
		EmailAddtxt2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EmailAddtxt2ActionPerformed(evt);
				}

			private void EmailAddtxt2ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
		});
		
		HomeAddLabel = new JLabel("Home Address:");
		HomeAddLabel.setForeground(new Color(88, 133, 175));
		HomeAddLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		HomeAddLabel.setBounds(426, 282, 195, 35);
		contentPane.add(HomeAddLabel);
		
		HomeAddtxt2 = new JTextField();
		HomeAddtxt2.setBorder(null);
		HomeAddtxt2.setForeground(new Color(88, 133, 175));
		HomeAddtxt2.setHorizontalAlignment(SwingConstants.LEFT);
		HomeAddtxt2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		HomeAddtxt2.setColumns(10);
		HomeAddtxt2.setBackground(new Color(240, 248, 255));
		HomeAddtxt2.setBounds(426, 313, 360, 35);
		contentPane.add(HomeAddtxt2);
		
		SeePasswordCheckBox = new JCheckBox("Show Password");
		SeePasswordCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SeePasswordCheckBox.isSelected()) {
					passwordField2.setEchoChar((char)0);
				}
				else {
					passwordField2.setEchoChar('*');
				}
			}
		});
		SeePasswordCheckBox.setFocusable(false);
		SeePasswordCheckBox.setForeground(new Color(65, 114, 159));
		SeePasswordCheckBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		SeePasswordCheckBox.setBackground(Color.WHITE);
		SeePasswordCheckBox.setBounds(293, 259, 109, 21);
		contentPane.add(SeePasswordCheckBox);
		
		SeePasswordCheckBox_1 = new JCheckBox("Show Password");
		SeePasswordCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SeePasswordCheckBox_1.isSelected()) {
					confirmpasswordField2.setEchoChar((char)0);
				}
				else {
					confirmpasswordField2.setEchoChar('*');
				}
			}
		});
		SeePasswordCheckBox_1.setFocusable(false);
		SeePasswordCheckBox_1.setForeground(new Color(65, 114, 159));
		SeePasswordCheckBox_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		SeePasswordCheckBox_1.setBackground(Color.WHITE);
		SeePasswordCheckBox_1.setBounds(293, 344, 109, 21);
		contentPane.add(SeePasswordCheckBox_1);
		
		
	}
}
