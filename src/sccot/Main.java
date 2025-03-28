package sccot;

import java.sql.Date;

import sccot.models.Categorie;
import sccot.models.Client;
import sccot.models.Model;
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
	    Model leger = new Model("leger", 50);
	    Model legerPlus = new Model("leger+", 125);
	    Model grosse = new Model("grosse", 150);
	    leger.addNewModal();
	    legerPlus.addNewModal();
	    grosse.addNewModal();
	    
	    Categorie am = new Categorie("AM");
	    am.addNewCategorie(leger);
	    Categorie a1 = new Categorie("A1");
	    a1.addNewCategorie(legerPlus);
	    Categorie a2 = new Categorie("A2");
	    a2.addNewCategorie(grosse);
	    //DataBaseManager.addModel(leger);
	    //DataBaseManager.addModel(legerPlus);
	    //DataBaseManager.addModel(grosse);
	    
	    
	    AuthenticationPage authPage = new AuthenticationPage();

	}

}
