package parcel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

//Author: Factor, Dovyle Jr. A.

public class CourierSignIn extends javax.swing.JFrame {
	
	static String e;
	private javax.swing.JPanel contentPane;
	private javax.swing.JTextField txtEnterEmailAddress;
	private javax.swing.JPasswordField passwordField;
	private javax.swing.JButton Registerbtn;
	private ActionEvent evt;
	private javax.swing.JList<String> jList1;
	private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private JTextField textField;
    private JTextField textField_1;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourierSignIn frame = new CourierSignIn();
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
	public CourierSignIn() {
		setTitle("Quickie Delivery - Courier Sign-in");
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
		setResizable(false);
	
        
        
        
        
		/*=========================================*/
		JLabel jLabeltitle1 = new JLabel("uickie");
		jLabeltitle1.setForeground(new Color(0, 102, 255));
		jLabeltitle1.setFont(new Font("Calisto MT", Font.ITALIC, 50));
		jLabeltitle1.setBounds(281, 75, 162, 42);
		contentPane.add(jLabeltitle1);
		
		JLabel jLabeltitle2 = new JLabel("Q");
		jLabeltitle2.setForeground(new Color(0, 0, 128));
		jLabeltitle2.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 99));
		jLabeltitle2.setBounds(210, 27, 84, 127);
		contentPane.add(jLabeltitle2);
		
		JLabel jLabeltitle3 = new JLabel("DELIVERY");
		jLabeltitle3.setForeground(new Color(0, 0, 139));
		jLabeltitle3.setFont(new Font("Calisto MT", Font.ITALIC, 25));
		jLabeltitle3.setBounds(281, 112, 145, 42);
		contentPane.add(jLabeltitle3);
		
		JLabel lblNewLabel = new JLabel("Courier Sign-in");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setBackground(new Color(0, 0, 205));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(181, 153, 283, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email Address:");
		lblEmail.setForeground(new Color(88, 133, 175));
		lblEmail.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblEmail.setBounds(37, 216, 188, 35);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(88, 133, 175));
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblPassword.setBounds(89, 261, 136, 35);
		contentPane.add(lblPassword);
		
		JButton Loginbtn = new JButton("Login");
		Loginbtn.setBorderPainted(false);
		Loginbtn.setFocusable(false);
		
		Loginbtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				 LoginbtnActionPerformed(evt);
			}

			private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {
			
				try{
		            if(verifyCourier()==true)
		            {  
		            	JOptionPane.showMessageDialog(null,"Access accepted");
		                new Courier_Homepage().setVisible(true);
		                dispose();
		            }
		            
		            if(txtEnterEmailAddress.getText().equals("") && passwordField.getText().equals("")){
		            	JOptionPane.showMessageDialog(null,"You must enter your email address and password!","ERROR",JOptionPane.WARNING_MESSAGE);
		            }
		            
		            else if(txtEnterEmailAddress.getText().equals("")){
		            	JOptionPane.showMessageDialog(null,"You must enter your email address!","ERROR",JOptionPane.WARNING_MESSAGE);
		            }
		            
		            else if(passwordField.getText().equals("")){
		            	JOptionPane.showMessageDialog(null,"You must enter your password!","ERROR",JOptionPane.WARNING_MESSAGE);
		            }
		            
		            else if (verifyCourier() == false)
		            {
		                JOptionPane.showMessageDialog(null,"Wrong email and password. Try Again","ERROR",JOptionPane.WARNING_MESSAGE);
		            }
		        }catch(IOException ex)
		        {
		            Logger.getLogger(CustomerSignIn.class.getName()).log(Level.SEVERE,null,ex);
		        }
				
			}
			
			public boolean verifyCourier()throws IOException{
		        e = txtEnterEmailAddress.getText();
		        String p = passwordField.getText();
		        File f = new File (e+" = Courier"+".txt");
		        System.out.println(f);
		        boolean exist=false;
		        
		        try
		        {
		        	Scanner inputbuffer=new Scanner(f);
		            
		            while(inputbuffer.hasNext())
		            {
		                String line=inputbuffer.nextLine();
		                System.out.println(line);
		                String[] values=line.split("--");
		                if(values[0].equals(e))
		                {
		                   if(values[4].equals(p))
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
		Loginbtn.setBackground(new Color(65, 114, 159));
		Loginbtn.setBounds(235, 311, 98, 42);
		contentPane.add(Loginbtn);
		
		JButton Registerbtn = new javax.swing.JButton("Register");
		Registerbtn.setBorderPainted(false);
		Registerbtn.setFocusable(false);
		
		Registerbtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterbtnActionPerformed(evt);
			}

			private void RegisterbtnActionPerformed(ActionEvent evt) {
				new Register_Courier().setVisible(true);
		        dispose();	
			}

		});
		
		Registerbtn.setForeground(Color.WHITE);
		Registerbtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		Registerbtn.setBackground(new Color(65, 114, 159));
		Registerbtn.setBounds(343, 311, 129, 42);
		contentPane.add(Registerbtn);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(0, 376, 651, 42);
		contentPane.add(textField_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBorderPainted(false);
		btnBack.setFocusable(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnBackActionPerformed(evt);
			}

			private void btnBackActionPerformed(ActionEvent evt) {
				 new Choice().setVisible(true); 
			     dispose();
				
			}
		});
	
		
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBackground(new Color(88, 133, 175));
		btnBack.setBounds(10, 10, 98, 25);
		contentPane.add(btnBack);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(0, 0, 651, 42);
		contentPane.add(textField);
				
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setForeground(new Color(88, 133, 175));
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		passwordField.setBackground(new Color(240, 248, 255));
		passwordField.setBounds(235, 261, 348, 35);
		contentPane.add(passwordField);
		
		txtEnterEmailAddress = new JTextField();
		txtEnterEmailAddress.setForeground(new Color(88, 133, 175));
		txtEnterEmailAddress.setBackground(new Color(240, 248, 255));
		txtEnterEmailAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txtEnterEmailAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterEmailAddress.setBounds(235, 216, 348, 35);
		contentPane.add(txtEnterEmailAddress);
		txtEnterEmailAddress.setColumns(10);
		
		JCheckBox SeePasswordCheckBox = new JCheckBox("Show Password");
		SeePasswordCheckBox.setFocusable(false);
		SeePasswordCheckBox.setForeground(new Color(65, 114, 159));
		SeePasswordCheckBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(SeePasswordCheckBox.isSelected()){
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		SeePasswordCheckBox.setBackground(new Color(255, 255, 255));
		SeePasswordCheckBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		SeePasswordCheckBox.setBounds(474, 311, 109, 21);
		contentPane.add(SeePasswordCheckBox);
		
		txtEnterEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterEmailAddressActionPerformed(evt);
            }

			private void txtEnterEmailAddressActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
	}
}
