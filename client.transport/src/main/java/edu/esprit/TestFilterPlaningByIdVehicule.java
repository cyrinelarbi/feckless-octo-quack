package edu.esprit;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.persistance.Planning;
import tn.esprit.transport.SearchServiceRemote;

public class TestFilterPlaningByIdVehicule {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		SearchServiceRemote proxy = (SearchServiceRemote) context
				.lookup("/TransportPublic/SearchService!tn.esprit.transport.SearchServiceRemote");

		List<Planning> plannings = proxy.filterByIdVehicule(1);
		System.out.println(plannings.size());

	}

}
