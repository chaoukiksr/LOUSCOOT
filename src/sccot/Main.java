package sccot;

import java.sql.Date;

import sccot.models.Client;
import sccot.models.Permis;
import sccot.utils.DataBaseConnection;
import sccot.views.AuthenticationPage;

public class Main {

	public static void main(String[] args) {
		DataBaseConnection dbC = new DataBaseConnection();
		DataBaseConnection.createTables();

	    Client c = new Client("kessouri","chaouki", "0605914225" , "paris", "kessourichaouki@gmail.com");
	    Permis p = new Permis("20214569556", Date.valueOf("2021-10-20") , Date.valueOf("2030-10-20"));
	    Client.addNewClient(c, p.getId());
		AuthenticationPage authPage = new AuthenticationPage();

	}

}
