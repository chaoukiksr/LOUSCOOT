package sccot.models;
import java.io.*;
import java.sql.SQLException;
import java.util.*;

import sccot.utils.DataBaseManager;

/**
 * 
 */
public class Model {
	private static int id = 1;
    private String libelle;

    private int cylindrie;

    /**
     * Default constructor
     */
    public Model(String libelle,int cylendrie) {
    	this.cylindrie = cylendrie;
    	this.libelle = libelle;
    	Model.id = id++;
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
	public int getId() {
		return id;
	}
	public void setCylindrie(int cylindrie) {
		this.cylindrie = cylindrie;
	}
	
	public void addNewModal() {
		try {
			DataBaseManager.addModel(this);
			System.out.println("adding new model");
		}catch(Error e) {
			e.printStackTrace();
		}
	}
}