package parcel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//Author: Dublin, Hannah Florenz Q.

public class Customer_Homepage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField TrackingNumbertxt;
	public static String tracking;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Homepage frame = new Customer_Homepage();
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
	public Customer_Homepage() {
		setTitle("Quickie Delivery - Customer Homepage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(0, 376, 651, 42);
		contentPane.add(textField_1);
		
		JLabel jLabeltitle2 = new JLabel("Q");
		jLabeltitle2.setForeground(new Color(0, 0, 128));
		jLabeltitle2.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 99));
		jLabeltitle2.setBounds(212, 49, 84, 127);
		contentPane.add(jLabeltitle2);
		
		JLabel jLabeltitle1 = new JLabel("uickie");
		jLabeltitle1.setForeground(new Color(0, 102, 255));
		jLabeltitle1.setFont(new Font("Calisto MT", Font.ITALIC, 50));
		jLabeltitle1.setBounds(283, 97, 162, 42);
		contentPane.add(jLabeltitle1);
		
		JLabel jLabeltitle3 = new JLabel("DELIVERY");
		jLabeltitle3.setForeground(new Color(0, 0, 139));
		jLabeltitle3.setFont(new Font("Calisto MT", Font.ITALIC, 25));
		jLabeltitle3.setBounds(283, 134, 145, 42);
		contentPane.add(jLabeltitle3);
		
		TrackingNumbertxt = new JTextField();
		TrackingNumbertxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				TrackingNumbertxtActionPerformed();
			}

			private void TrackingNumbertxtActionPerformed() {
				// TODO Auto-generated method stub
				
			}
		});
		TrackingNumbertxt.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent evt) {
				TrackingNumbertxt.setText("");
			}
		});
		TrackingNumbertxt.setText("Enter Tracking Number");
		TrackingNumbertxt.setHorizontalAlignment(SwingConstants.LEFT);
		TrackingNumbertxt.setForeground(new Color(88, 133, 175));
		TrackingNumbertxt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		TrackingNumbertxt.setColumns(10);
		TrackingNumbertxt.setBackground(new Color(240, 248, 255));
		TrackingNumbertxt.setBounds(107, 253, 308, 34);
		contentPane.add(TrackingNumbertxt);
		
		JButton btnTrack = new JButton("TRACK");
		btnTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try{
		            if(TrackingNum()==true)
		            {  
		            	JOptionPane.showMessageDialog(null,"Tracking Number Found!");
		                new Customer_TrackedItem().setVisible(true);
		                dispose();
		            }
		            
		            else if(TrackingNumbertxt.getText().equals("")){
		            	JOptionPane.showMessageDialog(null,"The field is empty. \nYou must enter a valid tracking number","ERROR",JOptionPane.WARNING_MESSAGE);
		            	TrackingNumbertxt.setText("");
		            }
		            
		            else if(TrackingNumbertxt.getText().equals("Enter Tracking Number")){
		            	JOptionPane.showMessageDialog(null,"You must enter a valid tracking number","ERROR",JOptionPane.WARNING_MESSAGE);
		            }
		            
		            else if(TrackingNum() == false)
		            {
		                JOptionPane.showMessageDialog(null,"Invalid tracking number","ERROR",JOptionPane.WARNING_MESSAGE);
		                TrackingNumbertxt.setText("");
		            }
		        }
				catch(IOException ex){
		            Logger.getLogger(PackageInfo.class.getName()).log(Level.SEVERE,null,ex);
		        }
			}
			public boolean TrackingNum()throws IOException{
		        tracking = TrackingNumbertxt.getText(); 
		        File trackingfile = new File (tracking+" = Tracking Number"+".txt");
		        System.out.println(trackingfile);
		        boolean exist1 = false;
		        
		        try
		        {
		        	Scanner InputBuffer = new Scanner(trackingfile);
		            
		            while(InputBuffer.hasNext())
		            {
		                String line = InputBuffer.nextLine();
		                System.out.println(line);
		                String[] values = line.split(" - ");
		                if(values[0].equals(tracking))
		                {
		                	exist1 = true;
		                }
		                
		            }
		        }
		        catch(FileNotFoundException FE)
		        {
		        	FE.printStackTrace();
		        }
		        return exist1;
		    }
		});
		btnTrack.setForeground(Color.WHITE);
		btnTrack.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		btnTrack.setFocusable(false);
		btnTrack.setBackground(new Color(65, 114, 159));
		btnTrack.setBounds(425, 253, 133, 34);
		contentPane.add(btnTrack);
		
		JLabel lblCustomerHomepage = new JLabel("Customer Homepage");
		lblCustomerHomepage.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerHomepage.setForeground(new Color(0, 0, 139));
		lblCustomerHomepage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblCustomerHomepage.setBackground(new Color(0, 0, 205));
		lblCustomerHomepage.setBounds(154, 179, 325, 53);
		contentPane.add(lblCustomerHomepage);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnLogoutActionPerformed(evt);
			}

			private void btnLogoutActionPerformed(ActionEvent evt) {
				if (JOptionPane.showConfirmDialog(null, "Confirm if you want to logout", "Logout", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					new CustomerSignIn().setVisible(true);
					dispose();
				}
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnLogout.setFocusable(false);
		btnLogout.setBorderPainted(false);
		btnLogout.setBackground(new Color(88, 133, 175));
		btnLogout.setBounds(10, 10, 135, 25);
		contentPane.add(btnLogout);
		
		JButton btnPersonalProfile = new JButton("Personal Profile");
		btnPersonalProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnPersonalProfileActionPerformed();
			}

			private void btnPersonalProfileActionPerformed() {
				new Customer_Profile().setVisible(true);
				dispose();
				
			}
		});
		btnPersonalProfile.setForeground(Color.WHITE);
		btnPersonalProfile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnPersonalProfile.setFocusable(false);
		btnPersonalProfile.setBorderPainted(false);
		btnPersonalProfile.setBackground(new Color(88, 133, 175));
		btnPersonalProfile.setBounds(435, 10, 206, 25);
		contentPane.add(btnPersonalProfile);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(0, 0, 651, 42);
		contentPane.add(textField);
	}

	public static String tracking() {
		// TODO Auto-generated method stub
		return null;
	}
}
