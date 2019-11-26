package windows_gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import client.Bank;
import client.User;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JPasswordField;

public class Login {

	public JFrame frame;
	private JPanel contentPane;
	private JTextField usernametextField;
	private JPasswordField passwordTextField;

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 508);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usernametextField = new JTextField();
		usernametextField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		usernametextField.setBounds(247, 161, 271, 43);
		contentPane.add(usernametextField);
		usernametextField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(104, 162, 86, 40);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(104, 221, 96, 40);
		contentPane.add(lblPassword);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				for (User element : User.user) {
					if (element.getUserName().contentEquals(usernametextField.getText()) 
							&& element.getPassword().contentEquals(passwordTextField.getText())) {
						WelcomeWindow w = new WelcomeWindow();
						
						w.frame.setVisible(true);
						w.lblwelcomeUsername.setText(element.getUserName());
						System.out.println(element.getAmount());	
//						new Operation().lblBalance.setText();
						frame.setVisible(false);
						break;
					}else {
						JOptionPane.showMessageDialog(null, "Wrong Username or Password!\n Please try again..");
					}
				}
			}
		});
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnlogin.setBounds(247, 312, 117, 43);
		contentPane.add(btnlogin);
		
		JButton btnCancel = new JButton("Close");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBounds(406, 312, 112, 43);
		contentPane.add(btnCancel);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLogin.setBounds(104, 50, 412, 68);
		contentPane.add(lblLogin);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SignUp().frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnSignup.setBackground(new Color(50, 205, 50));
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSignup.setBounds(297, 385, 173, 43);
		contentPane.add(btnSignup);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordTextField.setBounds(247, 221, 271, 42);
		contentPane.add(passwordTextField);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(651, 10, 37, 29);
		contentPane.add(lblNewLabel);
		frame.setUndecorated(true);
	}
	
	String getAmountAsString(String iban) {
		String amountAsString;
		for (User element : Bank.getList()) {
			if(iban == element.getIban()) {
				amountAsString = Double.toString(element.getAmount());
				return amountAsString;
			}	
		}
		return null;
	}
}

