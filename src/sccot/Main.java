package sccot;

import java.sql.Date;

import sccot.models.Client;
import sccot.models.Permis;
import sccot.utils.DataBaseManager;
import sccot.views.AuthenticationPage;

public class Main {

	public static void main(String[] args) {
		
		DataBaseManager.createTables();
	    Permis p = new Permis("20214569963", Date.valueOf("2021-10-20") , Date.valueOf("2030-10-20"));
	  //  DataBaseManager.addPermis(p);
	    Client c = new Client("kessouri","chaouki", "0605914225" , "paris", "kessourichaouki@gmail.com",p.getId());
	   // Client.addNewClient(c);
		AuthenticationPage authPage = new AuthenticationPage();

	}

}
