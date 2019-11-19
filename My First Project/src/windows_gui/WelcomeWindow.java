package windows_gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WelcomeWindow {

	JFrame frame;
	JLabel lblwelcomeUsername;

	/**
	 * Create the application.
	 */
	public WelcomeWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setBackground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(95, 34, 258, 57);
		frame.getContentPane().add(lblNewLabel);
		
		lblwelcomeUsername = new JLabel("");
		lblwelcomeUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblwelcomeUsername.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblwelcomeUsername.setBounds(115, 84, 215, 103);
		frame.getContentPane().add(lblwelcomeUsername);
		
		JLabel lblSkip = new JLabel("Skip");
		lblSkip.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Operation().frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		lblSkip.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSkip.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkip.setBounds(281, 198, 48, 36);
		frame.getContentPane().add(lblSkip);
	}
}
