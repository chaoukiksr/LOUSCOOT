package sccot;

public class Scooter {

	private String ident;
	private Boolean available;
	private String name;
	private int km;
	//default constructour
	public  Scooter(String ident,String name) {
		this.ident = ident;
		this.available = true;
		this.name = name;
		this.km = 0;
	}
	//getters
	public String getIdent() {
		return ident;
	}
	
	public Boolean getAvailable() {
		return available;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKm() {
		return km;
	}
	
	
	//setters
	public void setIdent(String ident) {
		this.ident = ident;
	}
	
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
	
	//methods
	
	
	
	
	
	
	
	
	
	
	
	
	
}
