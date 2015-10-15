package serveses.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Player;
import serveses.interfaces.FootMangamentLocal;
import serveses.interfaces.FootMangamentRemote;

/**
 * Session Bean implementation class FootMangament
 */
@Stateless
public class FootMangament implements FootMangamentRemote, FootMangamentLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public FootMangament() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sallam(String name) {

		return "Ahla Ya: " + name;
	}

	@Override
	public Boolean addPlayer(Player player) {
		Boolean b = false;
		try {
			entityManager.persist(player);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deletePlayerById(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findPlayerById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Player findPlayerById(Integer id) {
		return entityManager.find(Player.class, id);
	}

	@Override
	public Boolean updatePlayer(Player player) {
		Boolean b = false;
		try {
			entityManager.merge(player);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<Player> findAllPlayers() {
		Query query = entityManager.createQuery("select p from Player p");
		return query.getResultList();
	}

	@Override
	public List<Player> findPlayersByName(String name) {
		Query query = entityManager.createQuery("select p from Player p where p.name=:param");
		query.setParameter("param", name);
		return query.getResultList();
	}

}
