package windows_gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import client.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class SignUp {

	protected JFrame frame;
	private JPanel contentPane; 
	private JTextField firstnameTextField;
	private JTextField lastnameTextField;
	private JTextField usernameTextField;
	private JTextField emailTextField;
	private JTextField ibanTextField;
	private JTextField bicTextField;
	private JPasswordField passwordTextField;
	private JPasswordField confirmPasswordTextField;
	
	protected static List<User> user = new ArrayList<>();


	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignup = new JLabel("SignUp");
		lblSignup.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignup.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSignup.setBounds(149, 23, 351, 60);
		contentPane.add(lblSignup);
		
		JLabel lblNewLabel = new JLabel("First name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(89, 134, 107, 33);
		contentPane.add(lblNewLabel);
		
		firstnameTextField = new JTextField();
		firstnameTextField.setBounds(296, 138, 194, 33);
		contentPane.add(firstnameTextField);
		firstnameTextField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLastName.setBounds(89, 177, 107, 33);
		contentPane.add(lblLastName);
		
		lastnameTextField = new JTextField();
		lastnameTextField.setColumns(10);
		lastnameTextField.setBounds(296, 177, 194, 33);
		contentPane.add(lastnameTextField);
		
		JLabel lblEmail = new JLabel("Email:(Optional)");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(89, 285, 155, 33);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(89, 343, 107, 33);
		contentPane.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConfirmPassword.setBounds(89, 386, 167, 33);
		contentPane.add(lblConfirmPassword);
		
		JLabel lblIban = new JLabel("IBAN:");
		lblIban.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIban.setBounds(89, 459, 107, 33);
		contentPane.add(lblIban);
		
		JLabel lblBic = new JLabel("BIC:");
		lblBic.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBic.setBounds(89, 502, 107, 33);
		contentPane.add(lblBic);
		
		usernameTextField = new JTextField();
		usernameTextField.setColumns(10);
		usernameTextField.setBounds(296, 220, 194, 33);
		contentPane.add(usernameTextField);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(89, 220, 107, 33);
		contentPane.add(lblUsername);
		
		emailTextField = new JTextField();
		emailTextField.setColumns(10);
		emailTextField.setBounds(296, 285, 194, 33);
		contentPane.add(emailTextField);
		
		ibanTextField = new JTextField();
		ibanTextField.setColumns(10);
		ibanTextField.setBounds(296, 460, 194, 33);
		contentPane.add(ibanTextField);
		
		bicTextField = new JTextField();
		bicTextField.setColumns(10);
		bicTextField.setBounds(296, 502, 194, 33);
		contentPane.add(bicTextField);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(296, 343, 194, 33);
		contentPane.add(passwordTextField);
		
		confirmPasswordTextField = new JPasswordField();
		confirmPasswordTextField.setToolTipText("");
		confirmPasswordTextField.setBounds(296, 386, 194, 33);
		contentPane.add(confirmPasswordTextField);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!(firstnameTextField.getText().isEmpty())
					&& !(lastnameTextField.getText().isEmpty())
					&& !(usernameTextField.getText().isEmpty())
					&& !(passwordTextField.getText().isEmpty())
					&& !(confirmPasswordTextField.getText().isEmpty())
					&&!(ibanTextField.getText().isEmpty())
					&& !(bicTextField.getText().isEmpty())) {
					
					user.add(new User(firstnameTextField.getText(),
							lastnameTextField.getText(),
							ibanTextField.getText(),
							bicTextField.getText(),
							passwordTextField.getText(),
							usernameTextField.getText()));
					
					JOptionPane.showMessageDialog(null, "Registration Succeed !");
					new Login().frame.setVisible(true);
					frame.setVisible(false);
					
				} else {
					JOptionPane.showMessageDialog(null, "Please fill in all Fields!");
				}
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRegister.setBounds(125, 578, 119, 33);
		contentPane.add(btnRegister);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Login().frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBounds(381, 579, 119, 31);
		contentPane.add(btnCancel);
		
	}

}

