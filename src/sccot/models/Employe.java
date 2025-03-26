package sccot.models;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Employe {
	public int id;
    public String nom;
    public String prenom;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
    public Employe() {
    }
}