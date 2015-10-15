package edu.esprit;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sound.sampled.Line;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reservation;
import tn.esprit.transport.SearchServiceRemote;
import tn.esprit.transport.TransportServiceRemote;

public class TestFilterPlaningByLineItinerary {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		SearchServiceRemote proxy =  (SearchServiceRemote) context
				.lookup("/TransportPublic/SearchService!tn.esprit.transport.SearchServiceRemote");

		
	//Line line = pro
	//List<Planning> plannings = proxy.filterByLine(line);
	
		//System.out.println(plannings.size());

	}

}
