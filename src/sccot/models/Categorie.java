package sccot.models;
import java.io.*;
import java.sql.DatabaseMetaData;
import java.util.*;

import sccot.utils.DataBaseManager;


public class Categorie {
	private static int id = 1;
	private String libelle;
    
    public Categorie(String libelle) {
    	this.libelle = libelle;
    	this.id = id++;
    }
    
    public String getLibelle() {
    	return libelle;
    }
   public void setLibelle(String libelle) {
	   this.libelle = libelle;
   }
   
   public void addNewCategorie(Model m) {
	   try {
		   DataBaseManager.addNewCategorie(this, m);
		   System.out.println("categorie added from model file");
	   }catch(Error e) {
		   e.printStackTrace();
	   }
   }
}