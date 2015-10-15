package tn.esprit.transport;


import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.persistance.Planning;

@Remote
public interface PlanningServiceRemote {
	List<Planning> findAll();
	List<Planning> filterByDate(Date dateDepart);
	List<Planning> filterOrdered(int userIdÒ);
	List<Planning> filterByLine(String line);
	List<Planning> filterByArrival(String Arrival);
	List<Planning> filterByImmatriculation(String Immatriculation);
}
