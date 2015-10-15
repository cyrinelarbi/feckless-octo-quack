package tn.esprit.transport;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import tn.esprit.persistance.Planning;

@Local
public interface PlanningServiceLocal {
	List<Planning> findAll();
	List<Planning> filterByDate(Date dateDepart);
	List<Planning> filterOrdered(int userIdÒ);
	List<Planning> filterByLine(String line);
	List<Planning> filterByArrival(String Arrival);
	List<Planning> filterByImmatriculation(String Immatriculation);
}
