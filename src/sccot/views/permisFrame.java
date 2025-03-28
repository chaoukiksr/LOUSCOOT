package sccot.views;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Identity;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;

import datechooser.beans.DateChooserPanel;
import sccot.models.Permis;
import sccot.utils.DataBaseManager;

public class permisFrame extends JPanel {
	public permisFrame(){
		setupPanel();
		initComponents();

	}
	private void setupPanel() {
		setBackground(Color.blue);
	}
	
	private void initComponents(){
		List<String> categories = DataBaseManager.fetchCategories();
		JLabel identificationL = new JLabel("identification");
		JTextField identificationTF = new JTextField(20);
		JLabel permisCategory= new JLabel("categorie");
		JComboBox<String> categoriesCB= new JComboBox<String>();
		JLabel dateDelL = new JLabel("date de délivrance");
		JCalendar dateDel = new JCalendar();
		JLabel dateExpL = new JLabel("date d'experation");
		JCalendar dateExp = new JCalendar();
		JButton submitBtn = new JButton("Ajouter");
		for(String category :categories) {
			categoriesCB.addItem(category);
		}
		DataBaseManager.fetchCategories();
		add(identificationL);
		add(identificationTF);
		add(permisCategory);
		add(categoriesCB);
		add(dateDelL);
		add(dateDel);
		add(dateExpL);
		add(dateExp);
		add(submitBtn);
		
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(identificationTF.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "all fields are required");
					System.out.println("all fields are required");
					return;
				}
				if(dateExp.getDate().before(dateDel.getDate()) || dateExp.getDate().equals(dateDel.getDate())) {
					JOptionPane.showMessageDialog(null, "del date most be before exp date");
					System.out.println("del date most be before exp date");
					return;
				}
				if(!dateExp.getDate().after(Date.from(null))|| dateDel.getDate().before(Date.from(null))) {
					JOptionPane.showMessageDialog(null, "either del date is after today or permis is expired");
					System.out.println("either del date is after today or permis is expired");
					return;
				}
				Permis p = new Permis(identificationTF.getText(), dateDel.getDate(),dateExp.getDate());
				System.out.println("success creating permis instance");
				p.addPermis(p);
				System.out.println("success adding permis instance to the db");
			}
		});
	}
	
}
