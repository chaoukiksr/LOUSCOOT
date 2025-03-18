package sccot;

public class Client {

	private static int id = 0;
	private String name;
	private int age;
	private String mainAdress;
	private String email;
	private String phoneNbr;
	
	public Client(String name, int age, String mainAdress, String email, String phoneNbr) {
		if(age <18) {
			throw new IllegalArgumentException("Age must be 18 or older");
		}
		
		this.name = name;
		this.age = age;
		this.mainAdress = mainAdress;
		this.email = email;
		this.phoneNbr = phoneNbr;
		Client.id++;
	}
	
	//getters
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getMainAdress() {
		return mainAdress;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNbr() {
		return phoneNbr;
	}
	
	
	//setters
	
	public void setId(int ad) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setMainAdress(String mainAdress) {
		this.mainAdress = mainAdress;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}
	
	
}
