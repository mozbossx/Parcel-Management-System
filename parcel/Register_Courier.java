package parcel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

//Author: Mosqueda, John Vianney C.

public class Register_Courier extends JFrame {
	public static String EmailAddress;
	private JPanel contentPane;
	private JTextField FullNametxtfield;
	private JPasswordField passwordField;
	private JPasswordField confirmpasswordField;
	private JTextField PhoneNumtxtfield;
	private JTextField Emailtxtfield;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField HomeAddtxtfield;
	private JCheckBox SeePasswordCheckBox;
	private JCheckBox SeePasswordCheckBox_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register_Courier frame = new Register_Courier();
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
	public Register_Courier() {
		setTitle("Quickie Delivery - Register as Courier");
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
		setResizable(false);
		
		JLabel lblRegisterAsCourier = new JLabel("Register as Courier");
		lblRegisterAsCourier.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegisterAsCourier.setForeground(new Color(0, 0, 128));
		lblRegisterAsCourier.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblRegisterAsCourier.setBounds(22, 45, 498, 64);
		contentPane.add(lblRegisterAsCourier);
		
		FullNametxtfield = new JTextField();
		FullNametxtfield.setBorder(null);
		FullNametxtfield.setForeground(new Color(88, 133, 175));
		FullNametxtfield.setHorizontalAlignment(SwingConstants.LEFT);
		FullNametxtfield.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		FullNametxtfield.setColumns(10);
		FullNametxtfield.setBackground(new Color(240, 248, 255));
		FullNametxtfield.setBounds(42, 151, 360, 35);
		contentPane.add(FullNametxtfield);
		
		FullNametxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	FullNametxtfieldActionPerformed(evt);
            }

			private void FullNametxtfieldActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		
		JLabel lblNewLabel_1 = new JLabel("Full Name:");
		lblNewLabel_1.setForeground(new Color(88, 133, 175));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(42, 118, 139, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setForeground(new Color(88, 133, 175));
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(42, 196, 139, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Confirm Password:");
		lblNewLabel_1_1_1.setForeground(new Color(88, 133, 175));
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(42, 282, 241, 35);
		contentPane.add(lblNewLabel_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBorder(null);
		passwordField.setForeground(new Color(88, 133, 175));
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		passwordField.setBounds(42, 227, 360, 33);
		passwordField.setBackground(new Color(240, 248, 255));
		contentPane.add(passwordField);
		
		passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	passwordFieldActionPerformed(evt);
            }

			private void passwordFieldActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		confirmpasswordField = new JPasswordField();
		confirmpasswordField.setEchoChar('*');
		confirmpasswordField.setBorder(null);
		confirmpasswordField.setForeground(new Color(88, 133, 175));
		confirmpasswordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		confirmpasswordField.setBackground(new Color(240, 248, 255));
		confirmpasswordField.setBounds(42, 314, 360, 33);
		contentPane.add(confirmpasswordField);
		
		confirmpasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	confirmpasswordFieldActionPerformed(evt);
            }

			private void confirmpasswordFieldActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		PhoneNumtxtfield = new JTextField();
		PhoneNumtxtfield.setBorder(null);
		PhoneNumtxtfield.setForeground(new Color(88, 133, 175));
		PhoneNumtxtfield.setHorizontalAlignment(SwingConstants.LEFT);
		PhoneNumtxtfield.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		PhoneNumtxtfield.setColumns(10);
		PhoneNumtxtfield.setBackground(new Color(240, 248, 255));
		PhoneNumtxtfield.setBounds(426, 151, 363, 35);
		contentPane.add(PhoneNumtxtfield);
		
		PhoneNumtxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	PhoneNumtxtfieldActionPerformed(evt);
            }

			private void PhoneNumtxtfieldActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		
		Emailtxtfield = new JTextField();
		Emailtxtfield.setBorder(null);
		Emailtxtfield.setForeground(new Color(88, 133, 175));
		Emailtxtfield.setHorizontalAlignment(SwingConstants.LEFT);
		Emailtxtfield.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		Emailtxtfield.setColumns(10);
		Emailtxtfield.setBackground(new Color(240, 248, 255));
		Emailtxtfield.setBounds(426, 226, 363, 35);
		contentPane.add(Emailtxtfield);
		
		Emailtxtfield.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EmailtxtfieldActionPerformed(evt);
				}

			private void EmailtxtfieldActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Phone Number:");
		lblNewLabel_1_1_1_1.setForeground(new Color(88, 133, 175));
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBounds(426, 118, 201, 35);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Email Address:");
		lblNewLabel_1_1_1_2.setForeground(new Color(88, 133, 175));
		lblNewLabel_1_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_1_1_1_2.setBounds(426, 196, 195, 35);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBorderPainted(false);
		btnRegister.setFocusable(false);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnRegisterActionPerformed(evt);
			}

			private void btnRegisterActionPerformed(ActionEvent evt) {
				String FullName = FullNametxtfield.getText();
				String Password = passwordField.getText();
				String ConfirmPassword = confirmpasswordField.getText();
				String PhoneNumber = PhoneNumtxtfield.getText();
				EmailAddress = Emailtxtfield.getText();
				String HomeAddress = HomeAddtxtfield.getText();
				
				if(FullName.equals("") || Password.equals("") || ConfirmPassword.equals("") || PhoneNumber.equals("") || EmailAddress.equals("") ||
						HomeAddress.equals("")) {
					JOptionPane.showMessageDialog(null,"You must fill up all fields!");
			    }
			    
				else if(!ConfirmPassword.equals(Password) || !Password.equals(ConfirmPassword)){
					JOptionPane.showMessageDialog(null,"Passwords are not the same. Try again","Password does not match",JOptionPane.WARNING_MESSAGE);
			    }
			    
				else {
					try
					{
						FileWriter Writer=new FileWriter(EmailAddress+" = Courier"+".txt",true);
						Writer.write(EmailAddress+"--"+PhoneNumber+"--"+FullName+"--"+HomeAddress+"--"+Password+"--"+ConfirmPassword);
						Writer.write(System.getProperty("line.separator"));
						Writer.close();
						JOptionPane.showMessageDialog(null,"Registration Complete");
						setVisible(false);
						new CourierSignIn().setVisible(true);
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
		btnRegister.setBackground(new Color(88, 133, 175));
		btnRegister.setBounds(650, 368, 139, 35);
		contentPane.add(btnRegister);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(0, 414, 814, 42);
		contentPane.add(textField_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBorderPainted(false);
		btnCancel.setFocusable(false);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnCancelActionPerformed(evt);
			}

			private void btnCancelActionPerformed(ActionEvent evt) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					new CourierSignIn().setVisible(true); 
					dispose();
				}
				
			}
		});
				
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCancel.setBackground(new Color(88, 133, 175));
		btnCancel.setBounds(10, 10, 113, 25);
		contentPane.add(btnCancel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(0, 0, 814, 42);
		contentPane.add(textField);
		
		HomeAddtxtfield = new JTextField();
		HomeAddtxtfield.setBorder(null);
		HomeAddtxtfield.setForeground(new Color(88, 133, 175));
		HomeAddtxtfield.setHorizontalAlignment(SwingConstants.LEFT);
		HomeAddtxtfield.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		HomeAddtxtfield.setColumns(10);
		HomeAddtxtfield.setBackground(new Color(240, 248, 255));
		HomeAddtxtfield.setBounds(426, 313, 363, 35);
		contentPane.add(HomeAddtxtfield);
		
		HomeAddtxtfield.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				HomeAddtxtfieldActionPerformed(evt);
				}

			private void HomeAddtxtfieldActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel HomeAddLabel = new JLabel("Home Address:");
		HomeAddLabel.setForeground(new Color(88, 133, 175));
		HomeAddLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		HomeAddLabel.setBounds(426, 282, 195, 35);
		contentPane.add(HomeAddLabel);
		
		SeePasswordCheckBox = new JCheckBox("Show Password");
		SeePasswordCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SeePasswordCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		SeePasswordCheckBox.setFocusable(false);
		SeePasswordCheckBox.setForeground(new Color(65, 114, 159));
		SeePasswordCheckBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		SeePasswordCheckBox.setBackground(Color.WHITE);
		SeePasswordCheckBox.setBounds(293, 260, 109, 21);
		contentPane.add(SeePasswordCheckBox);
		
		SeePasswordCheckBox_1 = new JCheckBox("Show Password");
		SeePasswordCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SeePasswordCheckBox_1.isSelected()) {
					confirmpasswordField.setEchoChar((char)0);
				}
				else {
					confirmpasswordField.setEchoChar('*');
				}
			}
		});
		SeePasswordCheckBox_1.setFocusable(false);
		SeePasswordCheckBox_1.setForeground(new Color(65, 114, 159));
		SeePasswordCheckBox_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		SeePasswordCheckBox_1.setBackground(Color.WHITE);
		SeePasswordCheckBox_1.setBounds(293, 346, 109, 21);
		contentPane.add(SeePasswordCheckBox_1);
	}

	public void getName(String string) {
		// TODO Auto-generated method stub
		
	}
}
