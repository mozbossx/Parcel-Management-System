package parcel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

//Author: Mozar, Carlo D.

public class Customer_TrackedItem extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtItem;
	private JLabel lblNewLabel;
	private JTextField txtStatus;
	private JTextField txtArrival;
	private JLabel lblStatus;
	private JTextField txtFromAddress;
	private JLabel lblWeight;
	private JTextField txtToAddress;
	private JTextField Trackingtxt;
	private JLabel lblTracking;
	public static String tracking;
	private JTextField txtWeight;
	private JLabel lblTo;
	private JLabel lblFrom_1;
	private JLabel lblSender;
	private JTextField txtSender;
	private JLabel lblReceiver;
	private JTextField txtReceiver;
	private JLabel lblParcelTracker;
	private JLabel lblPrice;
	private JTextField txtPrice;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_TrackedItem frame = new Customer_TrackedItem();
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
	public Customer_TrackedItem() {
		setTitle("Quickie Delivery - Parcel Tracker (Customer Mode)");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 547);
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
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(-12, 468, 860, 42);
		contentPane.add(textField_1);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Item: ");
		lblNewLabel_5.setForeground(new Color(88, 133, 175));
		lblNewLabel_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(45, 109, 74, 35);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel = new JLabel("Date of Arrival:");
		lblNewLabel.setForeground(new Color(88, 133, 175));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(45, 203, 195, 35);
		contentPane.add(lblNewLabel);
		
		txtArrival = new JTextField();
		txtArrival.setHorizontalAlignment(SwingConstants.LEFT);
		txtArrival.setBorder(null);
		txtArrival.setEditable(false);
		txtArrival.setForeground(new Color(88, 133, 175));
		txtArrival.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txtArrival.setColumns(10);
		txtArrival.setBackground(new Color(240, 248, 255));
		txtArrival.setBounds(45, 234, 341, 38);
		contentPane.add(txtArrival);
		
		lblStatus = new JLabel("Status: ");
		lblStatus.setForeground(new Color(88, 133, 175));
		lblStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblStatus.setBounds(406, 109, 98, 35);
		contentPane.add(lblStatus);
		
		lblWeight = new JLabel("Weight (kg):  ");
		lblWeight.setForeground(new Color(88, 133, 175));
		lblWeight.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblWeight.setBounds(623, 109, 158, 35);
		contentPane.add(lblWeight);
		
		txtPrice = new JTextField();
		txtPrice.setText((String) null);
		txtPrice.setHorizontalAlignment(SwingConstants.LEFT);
		txtPrice.setForeground(new Color(88, 133, 175));
		txtPrice.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txtPrice.setEditable(false);
		txtPrice.setColumns(10);
		txtPrice.setBorder(null);
		txtPrice.setBackground(new Color(240, 248, 255));
		txtPrice.setBounds(406, 408, 404, 38);
		contentPane.add(txtPrice);
		
		Trackingtxt = new JTextField();
		Trackingtxt.setBorder(null);
		Trackingtxt.setForeground(new Color(255, 255, 255));
		Trackingtxt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		Trackingtxt.setEditable(false);
		Trackingtxt.setColumns(10);
		Trackingtxt.setBackground(new Color(65, 114, 159));
		Trackingtxt.setBounds(642, 4, 180, 32);
		contentPane.add(Trackingtxt);
		
		tracking = null;
		String item = null;
		String toAddress = null;
		String status = null;
		String weight = null;
		String arrival = null;
		String fromAddress = null;
		String sender = null;
		String receiver = null;
		String price = null;
		
		System.out.println("Parcel Tracker -- " +Customer_Homepage.tracking);
		String Trackingfile = (Customer_Homepage.tracking+" = Tracking Number"+".txt");
		System.out.println(Trackingfile);
		
		Scanner tscanner;
		try {
			tscanner = new Scanner(new File(Trackingfile));
			tscanner.useDelimiter(" - ");
			
			tracking = tscanner.next();
			item = tscanner.next();
			toAddress = tscanner.next();
			status = tscanner.next();
			weight = tscanner.next();
			arrival = tscanner.next();
			fromAddress = tscanner.next();
			sender = tscanner.next();
			receiver = tscanner.next();
			price = tscanner.next();
			
			tscanner.close();
		
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}	
		Trackingtxt.setText(tracking);
		txtArrival.setText(toAddress);
		
		lblTracking = new JLabel("Tracking #");
		lblTracking.setForeground(new Color(255, 255, 255));
		lblTracking.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTracking.setBounds(506, 3, 139, 35);
		contentPane.add(lblTracking);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(-12, 0, 860, 42);
		contentPane.add(textField);
		
		lblTo = new JLabel("To:");
		lblTo.setForeground(new Color(88, 133, 175));
		lblTo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTo.setBounds(45, 374, 52, 35);
		contentPane.add(lblTo);
		
		txtItem = new JTextField();
		txtItem.setHorizontalAlignment(SwingConstants.LEFT);
		txtItem.setBorder(null);
		txtItem.setEditable(false);
		txtItem.setForeground(new Color(88, 133, 175));
		txtItem.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txtItem.setColumns(10);
		txtItem.setBackground(new Color(240, 248, 255));
		txtItem.setBounds(45, 141, 341, 38);
		contentPane.add(txtItem);
		txtItem.setText(item);
		
		lblFrom_1 = new JLabel("From:");
		lblFrom_1.setForeground(new Color(88, 133, 175));
		lblFrom_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFrom_1.setBounds(45, 293, 82, 35);
		contentPane.add(lblFrom_1);
		
		
		txtFromAddress = new JTextField();
		txtFromAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txtFromAddress.setBorder(null);
		txtFromAddress.setForeground(new Color(88, 133, 175));
		txtFromAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txtFromAddress.setEditable(false);
		txtFromAddress.setColumns(10);
		txtFromAddress.setBackground(new Color(240, 248, 255));
		txtFromAddress.setBounds(45, 325, 341, 38);
		contentPane.add(txtFromAddress);
		txtFromAddress.setText(status);
		
		lblSender = new JLabel("Sender: ");
		lblSender.setForeground(new Color(88, 133, 175));
		lblSender.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblSender.setBounds(406, 203, 109, 35);
		contentPane.add(lblSender);
		
		
		txtWeight = new JTextField();
		txtWeight.setHorizontalAlignment(SwingConstants.LEFT);
		txtWeight.setText((String) null);
		txtWeight.setForeground(new Color(88, 133, 175));
		txtWeight.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txtWeight.setEditable(false);
		txtWeight.setColumns(10);
		txtWeight.setBorder(null);
		txtWeight.setBackground(new Color(240, 248, 255));
		txtWeight.setBounds(623, 141, 187, 38);
		contentPane.add(txtWeight);
		txtWeight.setText(fromAddress);
		
		txtSender = new JTextField();
		txtSender.setText((String) null);
		txtSender.setHorizontalAlignment(SwingConstants.LEFT);
		txtSender.setForeground(new Color(88, 133, 175));
		txtSender.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txtSender.setEditable(false);
		txtSender.setColumns(10);
		txtSender.setBorder(null);
		txtSender.setBackground(new Color(240, 248, 255));
		txtSender.setBounds(406, 234, 404, 38);
		contentPane.add(txtSender);
		txtSender.setText(sender);
		
		txtStatus = new JTextField();
		txtStatus.setHorizontalAlignment(SwingConstants.LEFT);
		txtStatus.setBorder(null);
		txtStatus.setEditable(false);
		txtStatus.setForeground(new Color(88, 133, 175));
		txtStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txtStatus.setColumns(10);
		txtStatus.setBackground(new Color(240, 248, 255));
		txtStatus.setBounds(406, 141, 187, 38);
		contentPane.add(txtStatus);
		txtStatus.setText(arrival);
		
		txtToAddress = new JTextField();
		txtToAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txtToAddress.setBorder(null);
		txtToAddress.setForeground(new Color(88, 133, 175));
		txtToAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txtToAddress.setEditable(false);
		txtToAddress.setColumns(10);
		txtToAddress.setBackground(new Color(240, 248, 255));
		txtToAddress.setBounds(45, 408, 341, 38);
		contentPane.add(txtToAddress);
		txtToAddress.setText(weight);
		
		lblReceiver = new JLabel("Receiver: ");
		lblReceiver.setForeground(new Color(88, 133, 175));
		lblReceiver.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblReceiver.setBounds(406, 293, 126, 35);
		contentPane.add(lblReceiver);
		
		txtReceiver = new JTextField();
		txtReceiver.setText((String) null);
		txtReceiver.setHorizontalAlignment(SwingConstants.LEFT);
		txtReceiver.setForeground(new Color(88, 133, 175));
		txtReceiver.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txtReceiver.setEditable(false);
		txtReceiver.setColumns(10);
		txtReceiver.setBorder(null);
		txtReceiver.setBackground(new Color(240, 248, 255));
		txtReceiver.setBounds(406, 325, 404, 38);
		contentPane.add(txtReceiver);
		
		txtPrice.setText(price);
		txtReceiver.setText(receiver);
		
		lblParcelTracker = new JLabel("Parcel Tracker");
		lblParcelTracker.setHorizontalAlignment(SwingConstants.LEFT);
		lblParcelTracker.setForeground(new Color(0, 0, 128));
		lblParcelTracker.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblParcelTracker.setBounds(20, 45, 385, 64);
		contentPane.add(lblParcelTracker);
		
		lblPrice = new JLabel("Price:");
		lblPrice.setForeground(new Color(88, 133, 175));
		lblPrice.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblPrice.setBounds(406, 374, 126, 35);
		contentPane.add(lblPrice);
		
		
		
	}
}
