package tn.esprit.transport;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sound.sampled.Line;

import tn.esprit.persistance.Planning;
import tn.esprit.persistance.Reservation;

@Stateless
public class SearchService implements SearchServiceRemote, SearchServiceLocal {
	@PersistenceContext
	private EntityManager em;

	// qui permet de faire la conn ac la bas
	@Override
	public List<Planning> findAll() {
		return em.createQuery("select d from Planning d", Planning.class).getResultList();
	}

	@Override
	public List<Planning> filterByDate(Date dateDepart) {
		return em.createQuery("select d from Planning d where d.dateDepart=:param").setParameter("param", dateDepart)
				.getResultList();

	}

	@Override
	public List<Planning> filterOrdered(int userIdÒ) {

		return em.createQuery("select d from Planning d where d.itinerary.ordre_Itinerary=:param")
				.setParameter("param", userIdÒ).getResultList();
	}

	

	@Override
	public List<Planning> filterByLine(Line line) {
		return em.createQuery("select d from Planning d where d.itinerary=:param")
				.setParameter("param", line).getResultList();
	}

	

	//@Override
	//public List<Planning> filterByArrival(String arrival) {
	//	return em.createQuery("select d from Planning d where d.itinerary.arret_Itinerary=:param")
	//			.setParameter("param", arrival).getResultList();
	//}
	
	

	@Override
	public List<Planning> filterByIdVehicule(Integer idIm) {
		return em.createQuery("select d from Planning d where d.vehicle.id_Vehicle=:param")
				.setParameter("param", idIm).getResultList();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> filterReservationByIdCustomer(Integer id) {

		return em.createQuery("select d from Reservation d where d.customer.id_Person=:param").setParameter("param", id)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> filterReservationByDateReservation(Date datedate_Reservation) {
		return em.createQuery("select d from Reservation d where d.datedate_Reservation=:param")
				.setParameter("param", datedate_Reservation).getResultList();

	}

	



	

}
