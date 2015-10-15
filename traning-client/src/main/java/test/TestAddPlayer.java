package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Player;
import serveses.interfaces.FootMangamentRemote;

public class TestAddPlayer {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		FootMangamentRemote proxy = (FootMangamentRemote) context
				.lookup("/traning/FootMangament!serveses.interfaces.FootMangamentRemote");

		Player player = new Player();
		player.setId(1);
		player.setName("ena");

		System.out.println(proxy.addPlayer(player));

	}

}
