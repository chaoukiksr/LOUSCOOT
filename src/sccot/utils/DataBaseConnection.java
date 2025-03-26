package sccot.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import sccot.models.Client;
import sccot.models.Permis;

public class DataBaseConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/louscoot";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connectionStatus = DriverManager.getConnection(URL, USER, PASSWORD);
			return connectionStatus;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void createTables() {
		try(Connection con = connect();
			Statement st = con.createStatement();){
			
			String permisTableQuery = " create table if not exists permis (id varchar(15) primary key, dateDel DATE not null, dateExp DATE not null)";
			st.execute(permisTableQuery);
			System.out.print("Permis table created successfully");
			String clientTableQuery = "Create table if not exists clients(id int auto_increment primary key, nom varchar(50) not null, prenom varchar(50) not null, telephone varchar(10) not null, adresse varchar(100) not null, mail varchar(30) not null, idPermi varchar(15) unique, foreign key(idPermi) references Permis(id))";
			st.execute(clientTableQuery);
			System.out.print("clients table created successfully");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void addClient(Client c, String permisId) {
		String query  = "insert into clients (nom,prenom,telephone,adresse,mail,idPermi) values(?,?,?,?,?,?)";
		try(Connection con = connect();
				PreparedStatement pst = con.prepareStatement(query);){
			pst.setString(1,c.getNom());
			pst.setString(2,c.getPrenom());
			pst.setString(3,c.getTelephone());
			pst.setString(4,c.getMail());
			pst.setString(5,c.getNom());
			pst.setString(6,permisId);
			
			int insertedRow = pst.executeUpdate();
			if(insertedRow > 0) {
				System.out.println("Client is inserted");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.print("erro in addClient function on the model");
		}
	}
	
}
