package sccot.models;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Scooter {

    /**
     * Default constructor
     */
    public Scooter() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private String modele;

    /**
     * 
     */
    private String marque;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

}