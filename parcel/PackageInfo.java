package parcel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//Author: Taruc, Ched V.

public class PackageInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField EnterTrackingtxt;
	private JButton btnTrack;
	private JLabel jLabeltitle2;
	private JLabel jLabeltitle1;
	private JLabel jLabeltitle3;
	private JLabel PackageInfoLabel;
	public static String tracking;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PackageInfo frame = new PackageInfo();
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
	public PackageInfo() {
		setTitle("Quickie Delivery - Package Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 455);
		setResizable(false);
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
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(0, 0, 651, 42);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(0, 376, 651, 42);
		contentPane.add(textField_1);
		
		EnterTrackingtxt = new JTextField();
		EnterTrackingtxt.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				EnterTrackingtxt.setText("");
			}
		});
		EnterTrackingtxt.setForeground(new Color(88, 133, 175));
		EnterTrackingtxt.setText("Enter Tracking Number");
		EnterTrackingtxt.setHorizontalAlignment(SwingConstants.LEFT);
		EnterTrackingtxt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		EnterTrackingtxt.setBackground(new Color(240, 248, 255));
		EnterTrackingtxt.setBounds(95, 251, 308, 34);
		contentPane.add(EnterTrackingtxt);
		EnterTrackingtxt.setColumns(10);
		
		btnTrack = new JButton("TRACK");
		btnTrack.setFocusable(false);
		btnTrack.setForeground(new Color(255, 255, 255));
		btnTrack.setBackground(new Color(65, 114, 159));
		btnTrack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnTrackActionPerformed();
			}

			private void btnTrackActionPerformed() {
				try{
		            if(TrackingNum()==true)
		            {  
		            	JOptionPane.showMessageDialog(null,"Tracking Number Found!");
		                new Courier_TrackedItem().setVisible(true);
		                dispose();
		            }
		            
		            else if(EnterTrackingtxt.getText().equals("")){
		            	JOptionPane.showMessageDialog(null,"The field is empty. \nYou must enter a valid tracking number","ERROR",JOptionPane.WARNING_MESSAGE);
		            	EnterTrackingtxt.setText("");
		            }
		            
		            else if(EnterTrackingtxt.getText().equals("Enter Tracking Number")){
		            	JOptionPane.showMessageDialog(null,"You must enter a valid tracking number","ERROR",JOptionPane.WARNING_MESSAGE);
		            }
		            
		            else if(TrackingNum() == false)
		            {
		                JOptionPane.showMessageDialog(null,"Invalid tracking number","ERROR",JOptionPane.WARNING_MESSAGE);
		                EnterTrackingtxt.setText("");
		            }
		        }
				catch(IOException ex){
		            Logger.getLogger(PackageInfo.class.getName()).log(Level.SEVERE,null,ex);
		        }
				
			}
			
			public boolean TrackingNum()throws IOException{
		        tracking = EnterTrackingtxt.getText(); 
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
		
		btnTrack.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		btnTrack.setBounds(413, 251, 133, 34);
		contentPane.add(btnTrack);
		
		jLabeltitle2 = new JLabel("Q");
		jLabeltitle2.setForeground(new Color(0, 0, 128));
		jLabeltitle2.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 99));
		jLabeltitle2.setBounds(210, 44, 84, 127);
		contentPane.add(jLabeltitle2);
		
		jLabeltitle1 = new JLabel("uickie");
		jLabeltitle1.setForeground(new Color(0, 102, 255));
		jLabeltitle1.setFont(new Font("Calisto MT", Font.ITALIC, 50));
		jLabeltitle1.setBounds(281, 92, 162, 42);
		contentPane.add(jLabeltitle1);
		
		jLabeltitle3 = new JLabel("DELIVERY");
		jLabeltitle3.setForeground(new Color(0, 0, 139));
		jLabeltitle3.setFont(new Font("Calisto MT", Font.ITALIC, 25));
		jLabeltitle3.setBounds(281, 129, 145, 42);
		contentPane.add(jLabeltitle3);
		
		PackageInfoLabel = new JLabel("Package Information");
		PackageInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PackageInfoLabel.setForeground(new Color(0, 0, 139));
		PackageInfoLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		PackageInfoLabel.setBackground(new Color(0, 0, 205));
		PackageInfoLabel.setBounds(142, 174, 349, 53);
		contentPane.add(PackageInfoLabel);
	}

}
