package edu.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.persistance.Customer;
import tn.esprit.transport.TransportServiceRemote;

public class TestAddCustomer {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		TransportServiceRemote proxy = (TransportServiceRemote) context
				.lookup("/TransportPublic/TransportService!tn.esprit.transport.TransportServiceRemote");

		Customer customer = new Customer();
		customer.setStatusService_Cutomer("sco");

		proxy.AddCustomer(customer);
	}

}
