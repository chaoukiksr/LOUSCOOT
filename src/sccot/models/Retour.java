package sccot.models;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Retour {

    public Retour() {
    }

    
    private Date dateRetour;

   
    public Date getDateRetour() {
		return dateRetour;
	}


	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}


	public int getKmRetour() {
		return kmRetour;
	}


	public void setKmRetour(int kmRetour) {
		this.kmRetour = kmRetour;
	}


	public int kmRetour;

}