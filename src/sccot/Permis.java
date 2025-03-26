package sccot;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Permis {

    /**
     * Default constructor
     */
    public Permis() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
   private Date dateDebut;

    /**
     * 
     */
    private Date dateExperation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateExperation() {
		return dateExperation;
	}

	public void setDateExperation(Date dateExperation) {
		this.dateExperation = dateExperation;
	}

}