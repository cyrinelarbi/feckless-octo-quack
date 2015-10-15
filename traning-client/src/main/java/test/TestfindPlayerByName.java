package test;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Player;
import serveses.interfaces.FootMangamentRemote;

public class TestfindPlayerByName {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		FootMangamentRemote proxy = (FootMangamentRemote) context
				.lookup("/traning/FootMangament!serveses.interfaces.FootMangamentRemote");

		List<Player> players = proxy.findPlayersByName("ena");

		System.out.println(players.size());

	}

}
