package sccot.models;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Location {

    /**
     * Default constructor
     */
    public Location() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private Date date_debut;

    /**
     * 
     */
    private Date date_fin;

    /**
     * 
     */
    private double tarif;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

}