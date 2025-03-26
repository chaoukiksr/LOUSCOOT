package sccot.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import sccot.utils.DataBaseConnection;

public class AuthenticationPage extends JFrame {
	private JTextField usernameTextField;
	private JPasswordField passwordTextField;
	private JButton loginButton;
	private JButton resetButton;

	public AuthenticationPage() {

		setupFrame();
		initComponents();
		addComponents();
		addEventListeners();
		setVisible(true);
	}

	private void setupFrame() {
		setTitle("LOUSCOOT");
		setSize(420, 420);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
	}

	private void initComponents() {

		usernameTextField = new JTextField(20);
		passwordTextField = new JPasswordField(20);

		loginButton = new JButton("login");
		resetButton = new JButton("Reset");
	}

	private void addComponents() {

		JPanel panel = new JPanel();
		panel.setBackground(new Color(33, 33, 33));
		panel.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 0;

		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setForeground(Color.WHITE);
		panel.add(usernameLabel, gbc);
		gbc.gridx = 1;
		panel.add(usernameTextField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(Color.WHITE);
		panel.add(passwordLabel, gbc);
		gbc.gridx = 1;
		panel.add(passwordTextField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		panel.add(loginButton, gbc);

		gbc.gridx = 1;
		panel.add(resetButton, gbc);

		add(panel, BorderLayout.CENTER);
		
	}
	private void addEventListeners() {
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = usernameTextField.getText();
				String password = new String(passwordTextField.getPassword());
				if(validateAuth(username,password)) {
					Dashboard dashboard = new Dashboard();
					System.out.print("Success");
					dispose();
					
				}else {
					System.out.print("Faild");
				}
			}
		});
	}
	public boolean validateAuth(String username,String password) {
		String query = "Select * from admin where username = ? and password = ?";
		try (
			Connection connect = DataBaseConnection.connect();	
			PreparedStatement prst = connect.prepareStatement(query)){
				prst.setString(1, username);
				prst.setString(2, password);
				
				ResultSet rs = prst.executeQuery();
				
				return rs.next();			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		//return username.equals("admin") && password.equals("abc123");
	}
}
