package edu.esprit;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.persistance.Customer;
import tn.esprit.transport.TransportServiceRemote;

public class TestFindCustomerByStatus {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		TransportServiceRemote proxy = (TransportServiceRemote) context
				.lookup("/TransportPublic/TransportService!tn.esprit.transport.TransportServiceRemote");

		
		List<Customer> customers = proxy.findByStatusService("sco");
		System.out.println(customers.size());

	}

}
