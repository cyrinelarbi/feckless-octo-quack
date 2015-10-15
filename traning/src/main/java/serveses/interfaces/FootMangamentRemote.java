package serveses.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.Player;

@Remote
public interface FootMangamentRemote {

	String sallam(String name);

	Boolean addPlayer(Player player);

	Boolean deletePlayerById(Integer id);

	Boolean updatePlayer(Player player);

	Player findPlayerById(Integer id);

	List<Player> findAllPlayers();

	List<Player> findPlayersByName(String name);
}
