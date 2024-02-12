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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

//Author: Dublin, Hannah Florenz Q.

public class Courier_Homepage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Courier_Homepage frame = new Courier_Homepage();
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
	public Courier_Homepage() {
		setTitle("Quickie Delivery - Courier Homepage");
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
		
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(0, 376, 651, 42);
		contentPane.add(textField_1);
		
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
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBorderPainted(false);
		btnLogout.setFocusable(false);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnLogoutActionPerformed(evt);
			}

			private void btnLogoutActionPerformed(ActionEvent evt) {
				if (JOptionPane.showConfirmDialog(null, "Confirm if you want to logout", "Logout", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					new CourierSignIn().setVisible(true);
					dispose();
				}
				
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnLogout.setBackground(new Color(88, 133, 175));
		btnLogout.setBounds(10, 10, 135, 25);
		contentPane.add(btnLogout);
		
		JButton btnPackageInformation = new JButton("Package Information");
		btnPackageInformation.setBorderPainted(false);
		btnPackageInformation.setFocusable(false);
		
		btnPackageInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnPackageInformationActionPerformed(evt);
			}

			private void btnPackageInformationActionPerformed(ActionEvent evt) {
				new PackageInfo().setVisible(true);
                dispose();
				
			}
		});
		btnPackageInformation.setForeground(Color.WHITE);
		btnPackageInformation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnPackageInformation.setBackground(new Color(65, 114, 159));
		btnPackageInformation.setBounds(188, 220, 255, 42);
		contentPane.add(btnPackageInformation);
		
		JButton btnAddPackage = new JButton("Add Package");
		btnAddPackage.setBorderPainted(false);
		btnAddPackage.setFocusable(false);
		btnAddPackage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnUpdateActionPerformed(evt);
                new Add_Package().setVisible(true);
                dispose();
			}

			private void btnUpdateActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
		});
				
		btnAddPackage.setForeground(Color.WHITE);
		btnAddPackage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnAddPackage.setBackground(new Color(65, 114, 159));
		btnAddPackage.setBounds(188, 272, 255, 42);
		contentPane.add(btnAddPackage);
		
		JButton btnPersonalProfile = new JButton("Personal Profile");
		btnPersonalProfile.setBorderPainted(false);
		btnPersonalProfile.setFocusable(false);
		
		btnPersonalProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnManageActionPerformed(evt);
			}

			private void btnManageActionPerformed(ActionEvent evt) {
				new Courier_Profile().setVisible(true);
				dispose();
				
			}
		});
				
		btnPersonalProfile.setForeground(Color.WHITE);
		btnPersonalProfile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnPersonalProfile.setBackground(new Color(65, 114, 159));
		btnPersonalProfile.setBounds(188, 324, 255, 42);
		contentPane.add(btnPersonalProfile);
		
		JLabel lblCourierHomepage = new JLabel("Courier Homepage");
		lblCourierHomepage.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourierHomepage.setForeground(new Color(0, 0, 139));
		lblCourierHomepage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblCourierHomepage.setBackground(new Color(0, 0, 205));
		lblCourierHomepage.setBounds(174, 157, 283, 53);
		contentPane.add(lblCourierHomepage);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(0, 0, 651, 42);
		contentPane.add(textField);
		
	}
}
