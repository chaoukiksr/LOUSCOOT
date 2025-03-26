package sccot.models;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Penalite {

    /**
     * Default constructor
     */
    public Penalite() {
    }

    /**
     * 
     */
    private int id;

    /**
     * 
     */
    private double montant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

}