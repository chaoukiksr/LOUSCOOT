package sccot.models;
import java.io.*;
import java.util.*;


public class Categorie {
	private static int id = 0;
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

}