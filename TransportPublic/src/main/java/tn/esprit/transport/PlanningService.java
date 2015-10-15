package tn.esprit.transport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import tn.esprit.persistance.Itinerary;
import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Vehicle;

public class PlanningService implements PlanningServiceRemote, PlanningServiceLocal {
	private EntityManager em;
	//qui permet de faire la conn ac la bas
	@Override
	public List<Planning> findAll() {
		return em
				.createQuery("select d from Planning d", Planning.class)
				.getResultList();
	}

	@Override
	public List<Planning> filterByDate(Date dateDepart) {
		return em
				.createQuery("select d from Planning d Where dateDepart='"+dateDepart.toString()+"'", Planning.class)
				.getResultList();
	}

	@Override
	public List<Planning> filterOrdered(int userIdÒ) {
		List<Planning> plannings=(ArrayList<Planning>)findAll();
		List<Planning> result=new ArrayList<Planning>();
		for(int i=0; i<plannings.size();i++){
			//if(((Itinerary)(plannings.get(i).getItinerary().getOrdre_Itinerary()).getCustomer().get_id_Person==userId){
				result.add(plannings.get(i));
			//}
		}
		return result;
	}

	@Override
	public List<Planning> filterByLine(String line) {
		List<Planning> plannings=(ArrayList<Planning>)findAll();
		List<Planning> result=new ArrayList<Planning>();
		for(int i=0; i<plannings.size();i++){
			if(((Itinerary)plannings.get(i).getItinerary()).getLigne_Itinerary().equals(line)){
				result.add(plannings.get(i));
			}
		}
		return result;
	}

	@Override
	public List<Planning> filterByArrival(String arrival) {
		List<Planning> plannings=(ArrayList<Planning>)findAll();
		List<Planning> result=new ArrayList<Planning>();
		for(int i=0; i<plannings.size();i++){
			if(((Itinerary)plannings.get(i).getItinerary()).getArret_Itinerary().equals(arrival)){
				result.add(plannings.get(i));
			}
		}
		return result;
	}

	@Override
	public List<Planning> filterByImmatriculation(String immatriculation) {
		List<Planning> plannings=(ArrayList<Planning>)findAll();
		List<Planning> result=new ArrayList<Planning>();
		for(int i=0; i<plannings.size();i++){
			if(((Vehicle)plannings.get(i).getVehicle()).getMatricule_Vehicle().equals(immatriculation)){
				result.add(plannings.get(i));
			}
		}
		return result;
	}

}
