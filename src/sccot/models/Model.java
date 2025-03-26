package sccot.models;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Model {

    /**
     * Default constructor
     */
    public Model() {
    }

    /**
     * 
     */
    private String libelle;

    /**
     * 
     */
    private int Cylindree;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getCylindree() {
		return Cylindree;
	}

	public void setCylindree(int cylindree) {
		Cylindree = cylindree;
	}

}