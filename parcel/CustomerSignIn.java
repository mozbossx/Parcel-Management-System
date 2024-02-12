package parcel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

//Author: Factor, Dovyle Jr. A.

public class CustomerSignIn extends JFrame {
	
	static String email2;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField EmailAddtxt;
	private JPasswordField passwordField2;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerSignIn frame = new CustomerSignIn();
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
	public CustomerSignIn() {
		setTitle("Quickie Delivery - Customer Sign-in");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 455);
		java.awt.Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
		setBounds(100, 100, 665, 455);
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
				new Choice().setVisible(true);
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
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(0, 0, 651, 42);
		contentPane.add(textField);
		
		JLabel jLabeltitle2 = new JLabel("Q");
		jLabeltitle2.setForeground(new Color(0, 0, 128));
		jLabeltitle2.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 99));
		jLabeltitle2.setBounds(210, 27, 84, 127);
		contentPane.add(jLabeltitle2);
		
		JLabel jLabeltitle1 = new JLabel("uickie");
		jLabeltitle1.setForeground(new Color(0, 102, 255));
		jLabeltitle1.setFont(new Font("Calisto MT", Font.ITALIC, 50));
		jLabeltitle1.setBounds(281, 75, 162, 42);
		contentPane.add(jLabeltitle1);
		
		JLabel jLabeltitle3 = new JLabel("DELIVERY");
		jLabeltitle3.setForeground(new Color(0, 0, 139));
		jLabeltitle3.setFont(new Font("Calisto MT", Font.ITALIC, 25));
		jLabeltitle3.setBounds(281, 112, 145, 42);
		contentPane.add(jLabeltitle3);
		
		JLabel lblCustomerSignin = new JLabel("Customer Sign-in");
		lblCustomerSignin.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerSignin.setForeground(new Color(0, 0, 139));
		lblCustomerSignin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblCustomerSignin.setBackground(new Color(0, 0, 205));
		lblCustomerSignin.setBounds(181, 153, 283, 53);
		contentPane.add(lblCustomerSignin);
		
		JLabel lblNewLabel_1 = new JLabel("Email Address:");
		lblNewLabel_1.setForeground(new Color(88, 133, 175));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(37, 216, 188, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setForeground(new Color(88, 133, 175));
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(89, 261, 136, 35);
		contentPane.add(lblNewLabel_1_1);
		
		passwordField2 = new JPasswordField();
		passwordField2.setEchoChar('*');
		passwordField2.setForeground(new Color(88, 133, 175));
		passwordField2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		passwordField2.setBackground(new Color(240, 248, 255));
		passwordField2.setBounds(235, 261, 348, 35);
		contentPane.add(passwordField2);
		
		JButton Loginbtn = new JButton("Login");
		Loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				 LoginbtnActionPerformed(evt);
			}

			private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {
			
				try{
		            if(verifyCustomer()==true)
		            {  
		            	JOptionPane.showMessageDialog(null,"WELCOME!");
		                new Customer_Homepage().setVisible(true);
		                dispose();
		            }
		            
		            if(EmailAddtxt.getText().equals("") && passwordField2.getText().equals("")){
		            	JOptionPane.showMessageDialog(null,"You must enter your email address and password!","ERROR",JOptionPane.WARNING_MESSAGE);
		            }
		            
		            else if(EmailAddtxt.getText().equals("")){
		            	JOptionPane.showMessageDialog(null,"You must enter your email address!","ERROR",JOptionPane.WARNING_MESSAGE);
		            }
		            
		            else if(passwordField2.getText().equals("")){
		            	JOptionPane.showMessageDialog(null,"You must enter your password!","ERROR",JOptionPane.WARNING_MESSAGE);
		            }
		            
		            else if (verifyCustomer() == false)
		            {
		                JOptionPane.showMessageDialog(null,"Wrong email and password. Try Again","ERROR",JOptionPane.WARNING_MESSAGE);
		            }
		        }catch(IOException ex)
		        {
		            Logger.getLogger(CustomerSignIn.class.getName()).log(Level.SEVERE,null,ex);
		        }
				
			}
			
			public boolean verifyCustomer()throws IOException{
		        email2 = EmailAddtxt.getText();
		        String password2 = passwordField2.getText();
		        File file2 = new File (email2+" = Customer"+".txt");
		        System.out.println(file2);
		        boolean exist = false;
		        
		        try
		        {
		        	Scanner inputbuffer = new Scanner(file2);
		            
		            while(inputbuffer.hasNext())
		            {
		                String line = inputbuffer.nextLine();
		                System.out.println(line);
		                String[] values = line.split("-- ");
		                if(values[0].equals(email2))
		                {
		                   if(values[4].equals(password2))
		                   {
		                       exist=true;
		                   }
		                }
		                
		            }
		        }catch(FileNotFoundException fe)
		        {
		            fe.printStackTrace();
		        }
		        return exist;
		    }
		});
		Loginbtn.setForeground(Color.WHITE);
		Loginbtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Loginbtn.setFocusable(false);
		Loginbtn.setBorderPainted(false);
		Loginbtn.setBackground(new Color(65, 114, 159));
		Loginbtn.setBounds(235, 311, 98, 42);
		contentPane.add(Loginbtn);
		
		JButton Registerbtn = new JButton("Register");
		
		Registerbtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				RegisterbtnActionPerformed(evt);
			}

			private void RegisterbtnActionPerformed(ActionEvent evt) {
				new Register_Customer().setVisible(true);
		        dispose();	
			}

		});
		
		
		Registerbtn.setForeground(Color.WHITE);
		Registerbtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Registerbtn.setFocusable(false);
		Registerbtn.setBorderPainted(false);
		Registerbtn.setBackground(new Color(65, 114, 159));
		Registerbtn.setBounds(343, 311, 129, 42);
		contentPane.add(Registerbtn);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(65, 114, 159));
		textField_2.setBounds(0, 376, 651, 42);
		contentPane.add(textField_2);
		
		JCheckBox SeePasswordCheckBox = new JCheckBox("Show Password");
		SeePasswordCheckBox.setFocusable(false);
		SeePasswordCheckBox.setForeground(new Color(65, 114, 159));
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
		SeePasswordCheckBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		SeePasswordCheckBox.setBackground(Color.WHITE);
		SeePasswordCheckBox.setBounds(474, 311, 109, 21);
		contentPane.add(SeePasswordCheckBox);
		
		EmailAddtxt = new JTextField();
		EmailAddtxt.setForeground(new Color(88, 133, 175));
		EmailAddtxt.setHorizontalAlignment(SwingConstants.LEFT);
		EmailAddtxt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		EmailAddtxt.setColumns(10);
		EmailAddtxt.setBackground(new Color(240, 248, 255));
		EmailAddtxt.setBounds(235, 216, 348, 35);
		contentPane.add(EmailAddtxt);
		
		EmailAddtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	EmailAddtxtActionPerformed(evt);
            }

			private void EmailAddtxtActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
	}
}
