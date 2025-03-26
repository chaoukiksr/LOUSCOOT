package sccot.models;
import java.io.*;
import java.util.*;

import sccot.utils.DataBaseConnection;
import java.sql.*;
import java.sql.Date;
/**
 * 
 */
public class Client {
    private static int id = 0;
    private String nom;
    private String prenom;   
    private String telephone;    
    private String adresse;
    private String mail;
    
    public Client(String nom, String prenom, String telephone, String adresse, String mail) {
    	this.nom = nom;
    	this.prenom = prenom;
    	this.telephone = telephone;
    	this.adresse = adresse;
    	this.mail = mail;
    	this.id = id++;
    }
    
    public int getId() {
    	return id;
    }
    public String getNom() {
    	return nom;
    }
    public String getPrenom() {
    	return prenom;
    }
    public String getTelephone() {
    	return telephone;
    }
    public String getAdresse() {
    	return adresse;
    }
    public String getMail() {
    	return mail;
    }
    
    public void setId(int id) {
    	Client.id = id;
    }
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
    
    public static void addNewClient(Client c,String permisId) {
    	try {
    		DataBaseConnection.addClient(c, permisId);
    		System.out.print("client is added");
    	}catch(Error e) {
    		System.out.print("error"+e);
    	}
    }
    
    
    
    
}