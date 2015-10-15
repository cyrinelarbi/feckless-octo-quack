package edu.esprit;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.persistance.Customer;
import tn.esprit.persistance.Reservation;
import tn.esprit.transport.SearchServiceRemote;
import tn.esprit.transport.TransportServiceRemote;

public class TestFilterReservationByDateReservation {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		SearchServiceRemote proxy =  (SearchServiceRemote) context
				.lookup("/TransportPublic/SearchService!tn.esprit.transport.SearchServiceRemote");

		
		List<Reservation> reservations = proxy.filterReservationByDateReservation(null);
		System.out.println(reservations.size());

	}

}
