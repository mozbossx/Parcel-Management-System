package parcel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Author: Mosqueda, John Vianney C.

public class TermsAndConditions extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TermsAndConditions frame = new TermsAndConditions();
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
	public TermsAndConditions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Quickie Delivery - Terms and Conditions");
		setResizable(false);
		java.awt.Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setBounds(100, 100, 678, 526);
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setText(" 1. Your privacy is very important to us. The users\u2019 data are assured to be kept and protected \r\n with utmost confidentiality. \r\n\r\n 2. Agree to keep your password private and only use your email and password when logging \r\n in, to log out of your account at the conclusion of each session, to tell us promptly if your \r\n account is used without your permission, and to keep your account information correct and \r\n up-to-date. Quickie Delivery is not liable to any losses or damage arising from unauthorized \r\n access to your account.\r\n\r\n 3. Comply to always follow proper netiquette when using the application. If Quickie Delivery \r\n perceives you are using the service for illegal purposes, fraudulent, harassing, libelous, \r\n threatening, or abusive behavior, it may instantly terminate your account and your email \r\n without warning or liability to you or any third party.\r\n\r\n 4. Users are not allowed to terminate their accounts if there are still remaining balances \r\n or transactions that have not been completed.\r\n\r\n 5. If a problem emerges during a transaction, the buyer and rider agree to first speak with \r\n each other to try to resolve the disagreement through amicable conversations, which \r\n Quickie Delivery will provide using reasonable commercial efforts. Users may seek the \r\n claims tribunal of their local jurisdiction to address any disagreement emerging from \r\n a transaction if the problem cannot be resolved through open dialogue.");
		textArea.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setFont(new Font("Arial", Font.PLAIN, 15));
		textArea.setBounds(10, 108, 644, 371);
		contentPane.add(textArea);
		
		JLabel lblTermsAndConditions = new JLabel("Terms and Conditions");
		lblTermsAndConditions.setHorizontalAlignment(SwingConstants.CENTER);
		lblTermsAndConditions.setForeground(new Color(0, 0, 128));
		lblTermsAndConditions.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblTermsAndConditions.setBounds(124, 52, 415, 54);
		contentPane.add(lblTermsAndConditions);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AboutUs().setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnBack.setFocusable(false);
		btnBack.setBorder(null);
		btnBack.setBackground(new Color(88, 133, 175));
		btnBack.setBounds(10, 10, 98, 25);
		contentPane.add(btnBack);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(65, 114, 159));
		textField.setBounds(0, 0, 664, 42);
		contentPane.add(textField);
		
		
	}
}
