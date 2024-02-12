package parcel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

//Author: Mozar, Carlo D.

public class Choice extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField BlueBorder2;
	private javax.swing.JButton Customerbtn;
	private javax.swing.JButton Courierbtn;
	private ActionEvent evt;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choice frame = new Choice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Choice() {	
		BlueBorder2 = new JTextField();
		JLabel jLabel2 = new JLabel("uickie");
		JLabel jLabel1 = new JLabel("Q");
		JLabel jLabel3 = new JLabel("DELIVERY");
		JLabel jLabel4 = new JLabel("Parcel Management System");
		JButton Customerbtn = new javax.swing.JButton ("Customer");
		JButton Courierbtn = new javax.swing.JButton ("Courier");
		
		setTitle("Quickie Delivery - Home");
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		java.awt.Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
		setBounds(100, 100, 665, 455);
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jLabel2.setForeground(new Color(0, 102, 255));
		jLabel2.setFont(new Font("Calisto MT", Font.ITALIC, 50));
		jLabel2.setBounds(281, 75, 162, 42);
		contentPane.add(jLabel2);
		
		jLabel1.setForeground(new Color(0, 0, 128));
		jLabel1.setFont(new Font("Calisto MT", Font.BOLD | Font.ITALIC, 99));
		jLabel1.setBounds(210, 27, 84, 127);
		contentPane.add(jLabel1);
				
		jLabel3.setForeground(new Color(0, 0, 139));
		jLabel3.setFont(new Font("Calisto MT", Font.ITALIC, 25));
		jLabel3.setBounds(281, 112, 145, 42);
		contentPane.add(jLabel3);
		
		jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel4.setForeground(new Color(0, 0, 128));
		jLabel4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		jLabel4.setBounds(115, 160, 415, 71);
		contentPane.add(jLabel4);
		
		Customerbtn.setBorderPainted(false);
		Customerbtn.setFocusable(false);
		Customerbtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CustomerbtnActionPerformed(evt);
			}

			private void CustomerbtnActionPerformed(ActionEvent evt) {
				new CustomerSignIn().setVisible(true);
				setVisible(false);
			}
		});
		Customerbtn.setForeground(new Color(255, 255, 255));
		Customerbtn.setBackground(new Color(88, 133, 175));
		Customerbtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		Customerbtn.setBounds(225, 241, 193, 48);
		contentPane.add(Customerbtn);
		
		Courierbtn.setBorderPainted(false);
		Courierbtn.setFocusable(false);
		Courierbtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				CourierbtnActionPerformed(evt);
			}
			
			private void CourierbtnActionPerformed(ActionEvent evt) {
				new CourierSignIn().setVisible(true);
				setVisible(false);
			}
		});
		Courierbtn.setForeground(Color.WHITE);
		Courierbtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		Courierbtn.setBackground(new Color(88, 133, 175));
		Courierbtn.setBounds(225, 299, 193, 48);
		contentPane.add(Courierbtn);
		
		BlueBorder2.setSelectedTextColor(Color.BLACK);
		BlueBorder2.setFocusable(false);
		BlueBorder2.setBackground(new Color(65, 114, 159));
		BlueBorder2.setEditable(false);
		BlueBorder2.setBounds(-12, 376, 678, 54);
		contentPane.add(BlueBorder2);
		BlueBorder2.setColumns(10);
		
		Image prof = new ImageIcon(this.getClass().getResource("/delivery_guy1.jpg")).getImage();
		JLabel lblProfileLogo = new JLabel("");
		lblProfileLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfileLogo.setIcon(new ImageIcon(prof));
		lblProfileLogo.setBounds(408, 198, 233, 190);
		contentPane.add(lblProfileLogo);
		
		Image prof1 = new ImageIcon(this.getClass().getResource("/delivery_guy2.jpg")).getImage();
		JLabel lblProfileLogo2 = new JLabel("");
		lblProfileLogo2.setIcon(new ImageIcon(prof1));
		lblProfileLogo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfileLogo2.setBounds(-12, 198, 233, 210);
		contentPane.add(lblProfileLogo2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(65, 114, 159));
		menuBar.setBounds(0, 0, 651, 42);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu(" ||| ");
		mnNewMenu.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		mnNewMenu.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About Us");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AboutUs().setVisible(true);
				dispose();
			}
		});
		mntmNewMenuItem.setBorder(null);
		mntmNewMenuItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		mntmNewMenuItem.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem.setBackground(new Color(88, 133, 175));
		mnNewMenu.add(mntmNewMenuItem);

	}
}
