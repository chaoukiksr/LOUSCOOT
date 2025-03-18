package sccot;

public class Main {

	public static void main(String[] args) {
		AuthenticationPage authPage = new AuthenticationPage();
		Client chaouki = new Client( "Chaouki",23, "Ile-De-France", "kessourichaouki@gmail.com","0605914225");
		System.out.println(chaouki.getId()+" "+chaouki.getName()+" "+chaouki.getAge()+" "+chaouki.getMainAdress()+" "+chaouki.getEmail()+" "+chaouki.getPhoneNbr());
		Client momoh = new Client("momoh",24, "Ile-De-France", "kessourichaouki@gmail.com","0605914225");
		System.out.println(momoh.getId()+" "+momoh.getName()+" "+momoh.getAge()+" "+momoh.getMainAdress()+" "+momoh.getEmail()+" "+momoh.getPhoneNbr());

	}

}
