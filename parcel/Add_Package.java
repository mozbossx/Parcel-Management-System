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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;

//Author: Mozar, Carlo D.

public class Add_Package extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox FromAddress_comboBox;
	private JLabel lblNewLabel;
	private JComboBox ToAddress_comboBox;
	private JLabel lblNewLabel_2;
	private JComboBox Content_comboBox;
	private JLabel lblNewLabel_3;
	private JTextField Weighttxt;
	private JLabel lblNewLabel_4;
	private JComboBox Status_comboBox;
	private JLabel lblNewLabel_5;
	private JTextField SenderNametxt;
	private JLabel lblNewLabel_6;
	private JTextField ReceiverNametxt;
	private JButton btnAdd;
	private JTextField TrackNumtxt;
	private JLabel lblNewLabel_7;
	public static String TrackingNum;
	private JTextField arrivalDatetxt;
	private JTextField Pricetxt;
	private JLabel lblAddPackage;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Package frame = new Add_Package();
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
	public Add_Package() {
		setTitle("Quickie Delivery - Add Package");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 602);
		
		java.awt.Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFocusable(false);
				
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnBackActionPerformed(evt);
			}

			private void btnBackActionPerformed(ActionEvent evt) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to go back?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) { 
					new Courier_Homepage().setVisible(true); 
					dispose();
				}
				
			}
		});
		
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setBackground(new Color(88, 133, 175));
		btnBack.setBounds(10, 10, 98, 25);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("From:");
		lblNewLabel_1.setForeground(new Color(88, 133, 175));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(41, 288, 81, 35);
		contentPane.add(lblNewLabel_1);
		
		FromAddress_comboBox = new JComboBox();
		FromAddress_comboBox.setForeground(new Color(88, 133, 175));
		FromAddress_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Abra", "Agusan Del Norte", "Agusan Del Sur", "Aklan", "Albay", "Antique", "Apayao", "Aurora", "Basilan", "Bataan", "Batanes", "Batangas", "Benguet", "Biliran", "Bohol", "Bukidnon", "Bulacan", "Cagayan", "Camarines Norte", "Camarines Sur", "Camiguin", "Capiz", "Catanduanes", "Cavite", "Cebu", "Compostella Valley", "CotabatoD", "Davao Del Norte", "Davao Del Sur", "Davao Occidental", "Davao Oriental", "Dinagat Islands", "Eastern Samar", "Guimaras", "Ifugao", "Ilocos Norte", "Ilocos Sur", "Iloilo", "Isabela", "Kalinga", "La Union", "Laguna", "Lanao Del Norte", "Lanao Del Sur", "LeyteM", "Maguindanao", "Marinduque", "Masbate", "Misamis Occidental", "Misamis Oriental", "Mountain Province", "Negros Occidental", "Negros Oriental", "Northern Samar", "Nueva Ecija", "Nueva Vizcaya", "Occidental Mindoro", "Oriental Mindoro", "Palawan", "Pampanga", "Pangasinan", "Quezon", "QuirinoR", "Rizal", "Romblon", "Samar", "Sarangani", "Siquijor", "Sorsogon", "South Cotabato", "Southern Leyte", "Sultan Kudarat", "Sulu", "Surigao Del Norte", "Surigao Del Sur", "Tarlac", "Tawi-Tawi", "Zambales", "Zamboanga Del Norte", "Zamboanga Del Sur", "Zamboanga Sibugay"}));
		FromAddress_comboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		FromAddress_comboBox.setFocusable(false);
		FromAddress_comboBox.setBackground(new Color(240, 248, 255));
		FromAddress_comboBox.setBounds(120, 288, 337, 35);
		contentPane.add(FromAddress_comboBox);
		
		FromAddress_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	FromAddress_comboBoxActionPerformed(evt);
            }

			private void FromAddress_comboBoxActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		lblNewLabel = new JLabel("To:");
		lblNewLabel.setForeground(new Color(88, 133, 175));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel.setBounds(71, 333, 51, 35);
		contentPane.add(lblNewLabel);
		
		ToAddress_comboBox = new JComboBox();
		ToAddress_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Abra", "Agusan Del Norte", "Agusan Del Sur", "Aklan", "Albay", "Antique", "Apayao", "Aurora", "Basilan", "Bataan", "Batanes", "Batangas", "Benguet", "Biliran", "Bohol", "Bukidnon", "Bulacan", "Cagayan", "Camarines Norte", "Camarines Sur", "Camiguin", "Capiz", "Catanduanes", "Cavite", "Cebu", "Compostella Valley", "CotabatoD", "Davao Del Norte", "Davao Del Sur", "Davao Occidental", "Davao Oriental", "Dinagat Islands", "Eastern Samar", "Guimaras", "Ifugao", "Ilocos Norte", "Ilocos Sur", "Iloilo", "Isabela", "Kalinga", "La Union", "Laguna", "Lanao Del Norte", "Lanao Del Sur", "LeyteM", "Maguindanao", "Marinduque", "Masbate", "Misamis Occidental", "Misamis Oriental", "Mountain Province", "Negros Occidental", "Negros Oriental", "Northern Samar", "Nueva Ecija", "Nueva Vizcaya", "Occidental Mindoro", "Oriental Mindoro", "Palawan", "Pampanga", "Pangasinan", "Quezon", "QuirinoR", "Rizal", "Romblon", "Samar", "Sarangani", "Siquijor", "Sorsogon", "South Cotabato", "Southern Leyte", "Sultan Kudarat", "Sulu", "Surigao Del Norte", "Surigao Del Sur", "Tarlac", "Tawi-Tawi", "Zambales", "Zamboanga Del Norte", "Zamboanga Del Sur", "Zamboanga Sibugay"}));
		ToAddress_comboBox.setForeground(new Color(88, 133, 175));
		ToAddress_comboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		ToAddress_comboBox.setFocusable(false);
		ToAddress_comboBox.setBackground(new Color(240, 248, 255));
		ToAddress_comboBox.setBounds(120, 333, 337, 35);
		contentPane.add(ToAddress_comboBox);
		
		ToAddress_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	ToAddress_comboBoxActionPerformed(evt);
            }

			private void ToAddress_comboBoxActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		lblNewLabel_2 = new JLabel("Content:");
		lblNewLabel_2.setForeground(new Color(88, 133, 175));
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(487, 115, 147, 35);
		contentPane.add(lblNewLabel_2);
		
		Content_comboBox = new JComboBox();
		Content_comboBox.setBorder(null);
		Content_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Auto Parts", "Battery", "Bag", "Books", "Camera", "CDs", "Cellphone", "Charger", "Chocolates", "Cloth", "Clothing", "Computer Parts", "Documents", "Dry Fruits", "Food Item", "Furniture", "Greetings Card", "Laptop", "Sensitive Items", "Shoes"}));
		Content_comboBox.setForeground(new Color(88, 133, 175));
		Content_comboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		Content_comboBox.setFocusable(false);
		Content_comboBox.setBackground(new Color(240, 248, 255));
		Content_comboBox.setBounds(487, 147, 305, 35);
		contentPane.add(Content_comboBox);
		
		Content_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	Content_comboBoxActionPerformed(evt);
            }

			private void Content_comboBoxActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		lblNewLabel_3 = new JLabel("Weight (kg):");
		lblNewLabel_3.setForeground(new Color(88, 133, 175));
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(487, 198, 154, 35);
		contentPane.add(lblNewLabel_3);
		
		Weighttxt = new JTextField();
		Weighttxt.setBorder(null);
		Weighttxt.setBackground(new Color(240, 248, 255));
		Weighttxt.setForeground(new Color(88, 133, 175));
		Weighttxt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		Weighttxt.setBounds(487, 231, 305, 35);
		contentPane.add(Weighttxt);
		Weighttxt.setColumns(10);
		
		Weighttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	WeighttxtActionPerformed(evt);
            }

			private void WeighttxtActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		lblNewLabel_4 = new JLabel("Status:");
		lblNewLabel_4.setForeground(new Color(88, 133, 175));
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(487, 288, 98, 35);
		contentPane.add(lblNewLabel_4);
		
		Status_comboBox = new JComboBox();
		Status_comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pending", "Packed", "Shipped", "Delivered"}));
		Status_comboBox.setForeground(new Color(88, 133, 175));
		Status_comboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		Status_comboBox.setFocusable(false);
		Status_comboBox.setBackground(new Color(240, 248, 255));
		Status_comboBox.setBounds(581, 288, 156, 35);
		contentPane.add(Status_comboBox);
		
		Status_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	Status_comboBoxActionPerformed(evt);
            }

			private void Status_comboBoxActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		lblNewLabel_5 = new JLabel("Sender's Name:");
		lblNewLabel_5.setForeground(new Color(88, 133, 175));
		lblNewLabel_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(40, 115, 200, 35);
		contentPane.add(lblNewLabel_5);
		
		SenderNametxt = new JTextField();
		SenderNametxt.setBorder(null);
		SenderNametxt.setBackground(new Color(240, 248, 255));
		SenderNametxt.setForeground(new Color(88, 133, 175));
		SenderNametxt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		SenderNametxt.setColumns(10);
		SenderNametxt.setBounds(40, 146, 417, 35);
		contentPane.add(SenderNametxt);
		
		SenderNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	SenderNameActionPerformed(evt);
            }

			private void SenderNameActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		
		arrivalDatetxt = new JTextField();
		arrivalDatetxt.setBorder(null);
		arrivalDatetxt.setToolTipText("###-###");
		arrivalDatetxt.setForeground(new Color(88, 133, 175));
		arrivalDatetxt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		arrivalDatetxt.setColumns(10);
		arrivalDatetxt.setBackground(new Color(240, 248, 255));
		arrivalDatetxt.setBounds(487, 425, 305, 35);
		contentPane.add(arrivalDatetxt);
		
		lblNewLabel_6 = new JLabel("Receiver's Name:");
		lblNewLabel_6.setForeground(new Color(88, 133, 175));
		lblNewLabel_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_6.setBounds(40, 198, 243, 35);
		contentPane.add(lblNewLabel_6);
		
		ReceiverNametxt = new JTextField();
		ReceiverNametxt.setBorder(null);
		ReceiverNametxt.setBackground(new Color(240, 248, 255));
		ReceiverNametxt.setForeground(new Color(88, 133, 175));
		ReceiverNametxt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		ReceiverNametxt.setColumns(10);
		ReceiverNametxt.setBounds(40, 231, 417, 35);
		contentPane.add(ReceiverNametxt);
		
		Pricetxt = new JTextField();
		Pricetxt.setBorder(null);
		Pricetxt.setToolTipText("");
		Pricetxt.setForeground(new Color(88, 133, 175));
		Pricetxt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		Pricetxt.setColumns(10);
		Pricetxt.setBackground(new Color(240, 248, 255));
		Pricetxt.setBounds(581, 333, 211, 35);
		contentPane.add(Pricetxt);
		
		ReceiverNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	ReceiverNameActionPerformed(evt);
            }

			private void ReceiverNameActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnAddActionPerformed();
			}

			private void btnAddActionPerformed() {
				String Sender_Name = SenderNametxt.getText();
				String Receiver_Name = ReceiverNametxt.getText();
				String From_Address = FromAddress_comboBox.getSelectedItem().toString();
				String To_Address = ToAddress_comboBox.getSelectedItem().toString();
				String Content = Content_comboBox.getSelectedItem().toString();
				String Weight = Weighttxt.getText();
				String Status = Status_comboBox.getSelectedItem().toString();
				TrackingNum = TrackNumtxt.getText();
				String Arrival = arrivalDatetxt.getText();
				String Price = Pricetxt.getText();
				
				if(Sender_Name.equals("") || Receiver_Name.equals("") || 
						Weight.equals("") || TrackingNum.equals("") || Arrival.equals("") 
						|| Price.equals("")) {
					JOptionPane.showMessageDialog(null,"You must fill up all fields!");
			    }
			    
				else {
					try
					{
						FileWriter PackageWriter = new FileWriter(TrackingNum +" = Tracking Number"+".txt",true);
												
						PackageWriter.write(TrackingNum+" - "+Content+" - "+Arrival+" - "+From_Address+" - "+To_Address+" - "+Status+
								" - "+Weight+" - "+Sender_Name+" - "+Receiver_Name+" - "+Price);
						PackageWriter.close();
						JOptionPane.showMessageDialog(null,"You added a package!");
						setVisible(false);
						new Courier_Homepage().setVisible(true);
			          }
			          catch(IOException e)
			          {
			              JOptionPane.showMessageDialog(null, "Error");
			          }
			       }				
			}
		});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		btnAdd.setFocusable(false);
		btnAdd.setBorderPainted(false);
		btnAdd.setBackground(new Color(88, 133, 175));
		btnAdd.setBounds(688, 475, 104, 35);
		contentPane.add(btnAdd);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(-18, -15, 851, 57);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(65, 114, 159));
		textField_1.setBounds(-18, 523, 851, 64);
		contentPane.add(textField_1);
		
		TrackNumtxt = new JTextField();
		TrackNumtxt.setBorder(null);
		TrackNumtxt.setBackground(new Color(240, 248, 255));
		TrackNumtxt.setToolTipText("###-###");
		TrackNumtxt.setForeground(new Color(88, 133, 175));
		TrackNumtxt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		TrackNumtxt.setColumns(10);
		TrackNumtxt.setBounds(41, 425, 416, 35);
		contentPane.add(TrackNumtxt);
		
		TrackNumtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	TrackNumtxtActionPerformed(evt);
            }

			private void TrackNumtxtActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });
		
		lblNewLabel_7 = new JLabel("Tracking Number (###-###):");
		lblNewLabel_7.setForeground(new Color(88, 133, 175));
		lblNewLabel_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_7.setBounds(41, 393, 353, 35);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_4_1 = new JLabel("Expected Date of Arrival: ");
		lblNewLabel_4_1.setForeground(new Color(88, 133, 175));
		lblNewLabel_4_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_4_1.setBounds(487, 392, 306, 35);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setForeground(new Color(88, 133, 175));
		lblPrice.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblPrice.setBounds(504, 333, 81, 35);
		contentPane.add(lblPrice);
				
		lblAddPackage = new JLabel("Add Package");
		lblAddPackage.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddPackage.setForeground(new Color(0, 0, 128));
		lblAddPackage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblAddPackage.setBounds(20, 47, 385, 64);
		contentPane.add(lblAddPackage);
		
		
	}
}
