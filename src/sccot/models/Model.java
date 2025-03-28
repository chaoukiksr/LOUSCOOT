package sccot.models;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Model {
	private static int id = 0;
    private String libelle;

    private int cylindrie;

    /**
     * Default constructor
     */
    public Model(String libelle,int cylendrie) {
    	this.cylindrie = cylendrie;
    	this.libelle = libelle;
    	this.id = id++;
    }

    
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getCylindrie() {
		return cylindrie;
	}

	public void setCylindrie(int cylindrie) {
		cylindrie = cylindrie;
	}

}