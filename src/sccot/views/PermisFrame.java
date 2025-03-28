package sccot.views;

import java.awt.Color;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PermisFrame extends JPanel {
	public PermisFrame() {
		JPanel addPermisPanel = new JPanel();
		addPermisPanel.setBackground(Color.gray);
		add(addPermisPanel);
		
		initComponents();
	}
	
	private void initComponents() {
		JLabel permisIdLabel = new JLabel("identification");
		JTextField permisIdTF = new JTextField(20);
		JLabel dateDelLabel = new JLabel("Date de Délivrance");
		//JDateChooser dateDel = new JDateChooser();
		JLabel dateExpLabel = new JLabel("Date d'éxpiration");
		//JDateChooser dateExp = new JDateChooser();
		
	}

}
