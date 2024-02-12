package parcel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

//Author: Mozar, Carlo D.

public class Courier_TrackedItem extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txt_Tracking;
	private JTextField txt_Item;
	private JTextField txt_Status;
	private JTextField txt_Weight;
	private JTextField txt_Arrival;
	private JTextField txt_Price;
	private JTextField txt_Receiver;
	private JTextField txt_Sender;
	private JTextField txt_FromAddress;
	private JTextField txt_ToAddress;
	public static String tracking2;
	private JComboBox Status_comboBox;
	private JButton Confirm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Courier_TrackedItem frame = new Courier_TrackedItem();
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
	public Courier_TrackedItem() {
		setTitle("Quickie Delivery - Parcel Tracker (Courier Mode)");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		java.awt.Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
		setBounds(100, 100, 846, 547);
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				new PackageInfo().setVisible(true);
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
		
		JLabel lblTracking = new JLabel("Tracking #");
		lblTracking.setForeground(Color.WHITE);
		lblTracking.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTracking.setBounds(506, 3, 139, 35);
		contentPane.add(lblTracking);
		
		JLabel lblWeight = new JLabel("Weight (kg):  ");
		lblWeight.setForeground(new Color(88, 133, 175));
		lblWeight.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblWeight.setBounds(623, 109, 158, 35);
		contentPane.add(lblWeight);
		
		txt_Tracking = new JTextField();
		txt_Tracking.setForeground(Color.WHITE);
		txt_Tracking.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txt_Tracking.setEditable(false);
		txt_Tracking.setColumns(10);
		txt_Tracking.setBorder(null);
		txt_Tracking.setBackground(new Color(65, 114, 159));
		txt_Tracking.setBounds(642, 4, 180, 32);
		contentPane.add(txt_Tracking);
		
		JLabel lblParcelTracker = new JLabel("Parcel Tracker");
		lblParcelTracker.setHorizontalAlignment(SwingConstants.LEFT);
		lblParcelTracker.setForeground(new Color(0, 0, 128));
		lblParcelTracker.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblParcelTracker.setBounds(20, 45, 385, 64);
		contentPane.add(lblParcelTracker);
		
		JLabel lblNewLabel_5 = new JLabel("Item: ");
		lblNewLabel_5.setForeground(new Color(88, 133, 175));
		lblNewLabel_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(45, 109, 74, 35);
		contentPane.add(lblNewLabel_5);
		
		txt_Item = new JTextField();
		txt_Item.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Item.setForeground(new Color(88, 133, 175));
		txt_Item.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txt_Item.setEditable(false);
		txt_Item.setColumns(10);
		txt_Item.setBorder(null);
		txt_Item.setBackground(new Color(240, 248, 255));
		txt_Item.setBounds(45, 141, 341, 38);
		contentPane.add(txt_Item);
		
		JLabel lblNewLabel = new JLabel("Date of Arrival:");
		lblNewLabel.setForeground(new Color(88, 133, 175));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(45, 203, 195, 35);
		contentPane.add(lblNewLabel);
		
		txt_Status = new JTextField();
		txt_Status.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Status.setForeground(new Color(88, 133, 175));
		txt_Status.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txt_Status.setEditable(false);
		txt_Status.setColumns(10);
		txt_Status.setBorder(null);
		txt_Status.setBackground(new Color(240, 248, 255));
		txt_Status.setBounds(406, 141, 190, 38);
		contentPane.add(txt_Status);
		
		JLabel lblFrom_1 = new JLabel("From:");
		lblFrom_1.setForeground(new Color(88, 133, 175));
		lblFrom_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFrom_1.setBounds(45, 293, 82, 35);
		contentPane.add(lblFrom_1);
		
		txt_Weight = new JTextField();
		txt_Weight.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Weight.setForeground(new Color(88, 133, 175));
		txt_Weight.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txt_Weight.setEditable(false);
		txt_Weight.setColumns(10);
		txt_Weight.setBorder(null);
		txt_Weight.setBackground(new Color(240, 248, 255));
		txt_Weight.setBounds(623, 141, 187, 38);
		contentPane.add(txt_Weight);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setForeground(new Color(88, 133, 175));
		lblTo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTo.setBounds(45, 374, 52, 35);
		contentPane.add(lblTo);
		
		txt_Arrival = new JTextField();
		txt_Arrival.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Arrival.setForeground(new Color(88, 133, 175));
		txt_Arrival.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txt_Arrival.setEditable(false);
		txt_Arrival.setColumns(10);
		txt_Arrival.setBorder(null);
		txt_Arrival.setBackground(new Color(240, 248, 255));
		txt_Arrival.setBounds(45, 234, 341, 38);
		contentPane.add(txt_Arrival);
		
		txt_Price = new JTextField();
		txt_Price.setText((String) null);
		txt_Price.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Price.setForeground(new Color(88, 133, 175));
		txt_Price.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txt_Price.setEditable(false);
		txt_Price.setColumns(10);
		txt_Price.setBorder(null);
		txt_Price.setBackground(new Color(240, 248, 255));
		txt_Price.setBounds(406, 408, 220, 38);
		contentPane.add(txt_Price);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setForeground(new Color(88, 133, 175));
		lblPrice.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblPrice.setBounds(406, 374, 126, 35);
		contentPane.add(lblPrice);
		
		txt_Receiver = new JTextField();
		txt_Receiver.setText((String) null);
		txt_Receiver.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Receiver.setForeground(new Color(88, 133, 175));
		txt_Receiver.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txt_Receiver.setEditable(false);
		txt_Receiver.setColumns(10);
		txt_Receiver.setBorder(null);
		txt_Receiver.setBackground(new Color(240, 248, 255));
		txt_Receiver.setBounds(406, 325, 404, 38);
		contentPane.add(txt_Receiver);
		
		JLabel lblReceiver = new JLabel("Receiver: ");
		lblReceiver.setForeground(new Color(88, 133, 175));
		lblReceiver.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblReceiver.setBounds(406, 293, 126, 35);
		contentPane.add(lblReceiver);
		
		txt_Sender = new JTextField();
		txt_Sender.setText((String) null);
		txt_Sender.setHorizontalAlignment(SwingConstants.LEFT);
		txt_Sender.setForeground(new Color(88, 133, 175));
		txt_Sender.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txt_Sender.setEditable(false);
		txt_Sender.setColumns(10);
		txt_Sender.setBorder(null);
		txt_Sender.setBackground(new Color(240, 248, 255));
		txt_Sender.setBounds(406, 234, 404, 38);
		contentPane.add(txt_Sender);
		
		JLabel lblSender = new JLabel("Sender: ");
		lblSender.setForeground(new Color(88, 133, 175));
		lblSender.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblSender.setBounds(406, 203, 109, 35);
		contentPane.add(lblSender);
		
		JLabel lblStatus = new JLabel("Status: ");
		lblStatus.setForeground(new Color(88, 133, 175));
		lblStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblStatus.setBounds(406, 109, 98, 35);
		contentPane.add(lblStatus);
		
		txt_FromAddress = new JTextField();
		txt_FromAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txt_FromAddress.setForeground(new Color(88, 133, 175));
		txt_FromAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txt_FromAddress.setEditable(false);
		txt_FromAddress.setColumns(10);
		txt_FromAddress.setBorder(null);
		txt_FromAddress.setBackground(new Color(240, 248, 255));
		txt_FromAddress.setBounds(45, 325, 341, 38);
		contentPane.add(txt_FromAddress);
		
		txt_ToAddress = new JTextField();
		txt_ToAddress.setText((String) null);
		txt_ToAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txt_ToAddress.setForeground(new Color(88, 133, 175));
		txt_ToAddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		txt_ToAddress.setEditable(false);
		txt_ToAddress.setColumns(10);
		txt_ToAddress.setBorder(null);
		txt_ToAddress.setBackground(new Color(240, 248, 255));
		txt_ToAddress.setBounds(45, 408, 341, 38);
		contentPane.add(txt_ToAddress);
		
		tracking2 = null;
		String item2 = null;
		String toAddress2 = null;
		String status2 = null;
		String weight2 = null;
		String arrival2 = null;
		String fromAddress2 = null;
		String sender2 = null;
		String receiver2 = null;
		String price2 = null;
		
		System.out.println("Parcel Tracker -- " +PackageInfo.tracking);
		String Trackingfile = (PackageInfo.tracking+" = Tracking Number"+".txt");
		System.out.println(Trackingfile);
		
		Scanner tscanner;
		try {
			tscanner = new Scanner(new File(Trackingfile));
			tscanner.useDelimiter(" - ");
			
			tracking2 = tscanner.next();
			item2 = tscanner.next();
			toAddress2 = tscanner.next();
			status2 = tscanner.next();
			weight2 = tscanner.next();
			arrival2 = tscanner.next();
			fromAddress2 = tscanner.next();
			sender2 = tscanner.next();
			receiver2 = tscanner.next();
			price2 = tscanner.next();
			tscanner.close();
		
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		txt_Tracking.setText(tracking2);
		txt_Item.setText(item2);
		txt_FromAddress.setText(status2);
		txt_ToAddress.setText(weight2);
		txt_Status.setText(arrival2);
		txt_Sender.setText(sender2);
		txt_Receiver.setText(receiver2);
		txt_Weight.setText(fromAddress2);
		txt_Arrival.setText(toAddress2);
		txt_Price.setText(price2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(-19, 0, 867, 42);
		contentPane.add(textField);
		
		JButton btnEditStatus = new JButton("Edit Status");
		btnEditStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to\nedit status?", "Edit Profile", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					Status_comboBox.setVisible(true);
					btnEditStatus.setVisible(false);
					txt_Status.setVisible(false);
					Confirm.setVisible(true);
				}
				
			}
		});
		btnEditStatus.setForeground(Color.WHITE);
		btnEditStatus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnEditStatus.setFocusable(false);
		btnEditStatus.setBorderPainted(false);
		btnEditStatus.setBackground(new Color(88, 133, 175));
		btnEditStatus.setBounds(642, 408, 168, 38);
		contentPane.add(btnEditStatus);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(-19, 468, 867, 57);
		contentPane.add(textField_1);
		
		Status_comboBox = new JComboBox();
		Status_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pending", "Packed", "Shipped", "Delivered"}));
		Status_comboBox.setForeground(new Color(88, 133, 175));
		Status_comboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		Status_comboBox.setFocusable(false);
		Status_comboBox.setBackground(new Color(240, 248, 255));
		Status_comboBox.setBounds(406, 141, 190, 35);
		contentPane.add(Status_comboBox);
		
		Confirm = new JButton("Confirm");
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Sender = txt_Sender.getText();
				String Receiver = txt_Receiver.getText();
				String From_Address = txt_FromAddress.getText();
				String To_Address = txt_ToAddress.getText();
				String Content = txt_Item.getText();
				String Weight = txt_Weight.getText();
				String Status = Status_comboBox.getSelectedItem().toString();
				String TrackingNum = txt_Tracking.getText();
				String Arrival = txt_Arrival.getText();
				String Price = txt_Price.getText();
				
				try (PrintWriter pr = new PrintWriter(PackageInfo.tracking+" = Tracking Number"+".txt")){
					pr.print(PackageInfo.tracking+" - "+Content+" - "+Arrival+" - "+From_Address+" - "+To_Address+" - "+Status+
							" - "+Weight+" - "+Sender+" - "+Receiver+" - "+Price);
					pr.close();
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Error. No profile found");
				}
				
				if (JOptionPane.showConfirmDialog(null, "Are you sure?", "Edit Status", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					Status_comboBox.setVisible(false);
					Confirm.setVisible(false);
					txt_Status.setVisible(true);
					txt_Status.setText(Status);
					btnEditStatus.setVisible(true);
				}
			}
		});
		Confirm.setVisible(false);
		Confirm.setForeground(Color.WHITE);
		Confirm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		Confirm.setFocusable(false);
		Confirm.setBorderPainted(false);
		Confirm.setBackground(new Color(88, 133, 175));
		Confirm.setBounds(642, 408, 168, 38);
		contentPane.add(Confirm);
	}
}
