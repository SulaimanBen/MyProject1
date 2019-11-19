package windows_gui;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Operation {

	JFrame frame;
	JLabel lblBalance ;


	/**
	 * Create the application.
	 */
	public Operation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Your Balance is :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(22, 11, 212, 70);
		frame.getContentPane().add(lblNewLabel);
		
		lblBalance = new JLabel("");
		lblBalance.setToolTipText("");
		lblBalance.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBalance.setBounds(235, 23, 238, 39);
		frame.getContentPane().add(lblBalance);
		
		
		
		JButton btnSignOut = new JButton("Sign out");
		btnSignOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Login().frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnSignOut.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSignOut.setBounds(407, 386, 108, 35);
		frame.getContentPane().add(btnSignOut);
		
		JButton btnNewButton_1 = new JButton("Catch");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(235, 171, 108, 99);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPay.setBounds(77, 171, 108, 99);
		frame.getContentPane().add(btnPay);
		
		JButton btnViewPayHistory = new JButton("Pay\r\n History");
		btnViewPayHistory.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnViewPayHistory.setBounds(379, 171, 108, 99);
		frame.getContentPane().add(btnViewPayHistory);
		frame.setBackground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 556, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
