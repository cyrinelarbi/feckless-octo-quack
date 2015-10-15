package edu.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.persistance.Customer;
import tn.esprit.transport.TransportServiceRemote;

public class TestUpdateCustomer {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		TransportServiceRemote proxy = (TransportServiceRemote) context
				.lookup("/TransportPublic/TransportService!tn.esprit.transport.TransportServiceRemote");

		Customer customer = proxy.findByid(1);
		customer.setStatusService_Cutomer("new");
		proxy.updateCustomer(customer);
	}

}
