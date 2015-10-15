package tn.esprit.transport;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.persistance.Customer;

@Remote
public interface TransportServiceRemote {

	void AddCustomer(Customer customer);

	void updateCustomer(Customer customer);

	void deleteCustomer(Customer customer);



	List<Customer> findByStatusService(String statusService);

	List<Customer> findAll();

	Customer findByid(Integer id);

	List<Customer> findAllNewRequests();

	void validateCustomerService(Customer c);

	void rejectCustomerService(Customer c);
}
