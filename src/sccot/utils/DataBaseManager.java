package sccot.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import sccot.models.Client;
import sccot.models.Permis;

public class DataBaseManager {
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
			boolean resultSet;
			String permisTableQuery = " create table if not exists permis (id varchar(15) primary key, dateDel DATE not null, dateExp DATE not null)";
			resultSet = st.execute(permisTableQuery);
			if(!resultSet) {
				System.out.print("Permis table created successfully\n");				
			}
			
			String clientTableQuery = "Create table if not exists clients(id int auto_increment primary key, nom varchar(50) not null, prenom varchar(50) not null, telephone varchar(10) not null, adresse varchar(100) not null, mail varchar(30) not null, idPermi varchar(15) unique, foreign key(idPermi) references Permis(id))";
			resultSet = st.execute(clientTableQuery);
			if(!resultSet) {
				System.out.print("clients table created successfully\n");			
			}
			String modelTableQuery = "create table if not exists model(id int(4) primary key, libelle varchar(50) not null, cylendrie int(4) not null)";
			resultSet = st.execute(modelTableQuery);
			if(!resultSet) {
				System.out.print("model table created successfully\n");			
			}
			
			String categorieTableQuery = "Create Table if not exists categories (id int(2) primary key, libelle varchar(5) not null, idModel int(4) not null, foreign key (idModel) references model(id));";
			resultSet = st.execute(categorieTableQuery);
			if(!resultSet) {
				System.out.print("categorie table created successfully\n");			
			}
			
			String categoriesAndModelTable = "create table if not exists categoriesAndModel(idCategorie int(2), idModel int(4), primary key(idCategorie,idModel), foreign key (idCategorie) references categorie(id), foreign key (idModel) references Model(id)) ";
			resultSet = st.execute(categoriesAndModelTable);
			if(!resultSet) {
				System.out.print("categoriesAndModel table created successfully\n");
			}
			
			String categoriesAndPermisTable = "create table if not exists categoriesAndPermis(idCategorie int(2), idPermis varchar(15), primary key(idCategorie,idPermis), foreign key (idCategorie) references categorie(id), foreign key (idPermis) references permis(id)) ";
			resultSet = st.execute(categoriesAndPermisTable);
			if(!resultSet) {
				System.out.print("categorieAndPermis table created successfully\n");
			}
			
			String penaliteTable = "create table if not exists penalite(id int(2) primary key, libelle varchar(50) not null, montant double(4) not null); ";
			resultSet = st.execute(penaliteTable);
			if(!resultSet) {
				System.out.print("penalite table created successfully\n");
			}
		
			//String LocationTable = "create table if not exists penalite(idPenalite int(2) primary key, libelle varchar(50) not null, montant double(4) not null); ";
			//resultSet = st.execute(penaliteTable);
			//if(!resultSet) {
				//System.out.print("penalite table created successfully\n");
			//}
			
			String retourTable = "create table if not exists retour(id int(5) primary key, kmRetour int(8) not null, dateRetour Date not null, idLocation int(8) not null, idPenalite int(2), foreign key idLocation references Location(id),foreign key idPenalite references penalite(id);); ";
			resultSet = st.execute(retourTable);
			if(!resultSet) {
				System.out.print("retour table created successfully\n");
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void addClient(Client c) {
		String query  = "insert into clients (nom,prenom,telephone,adresse,mail,idPermi) values(?,?,?,?,?,?)";
		try(Connection con = connect();
				PreparedStatement pst = con.prepareStatement(query);){
			pst.setString(1,c.getNom());
			pst.setString(2,c.getPrenom());
			pst.setString(3,c.getTelephone());
			pst.setString(4,c.getMail());
			pst.setString(5,c.getNom());
			pst.setString(6,c.getPermisId());
			
			int insertedRow = pst.executeUpdate();
			if(insertedRow > 0) {
				System.out.println("Client is inserted \n");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.print("erro in addClient function on the model\n");
		}
	}
	public static void addPermis(Permis p) {
		String query = "insert into permis (id,dateDel,dateExp) values (?,?,?);";
		try(Connection con = connect(); PreparedStatement pst = con.prepareStatement(query);){
			pst.setString(1, p.getId());
			pst.setDate(2, new java.sql.Date(p.getDateDel().getTime()));
			pst.setDate(3, new java.sql.Date(p.getDateExp().getTime()));
			int insertedRow = pst.executeUpdate();
			if(insertedRow > 0) {
				System.out.println("permis "+p.getId()+" "+p.getDateDel()+" "+p.getDateExp() +" is inserted successfully\n");				
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("error inserting permis");
		}
	}
}
