package edu.esprit;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.persistance.Reservation;
import tn.esprit.transport.SearchServiceRemote;

public class TestFilterReservationByIDCustomer {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		SearchServiceRemote proxy = (SearchServiceRemote) context
				.lookup("/TransportPublic/SearchService!tn.esprit.transport.SearchServiceRemote");

		List<Reservation> reservations = proxy.filterReservationByIdCustomer(1);
		System.out.println(reservations.size());

	}
	

}
