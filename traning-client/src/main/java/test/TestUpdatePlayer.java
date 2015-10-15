package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Player;
import serveses.interfaces.FootMangamentRemote;

public class TestUpdatePlayer {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		FootMangamentRemote proxy = (FootMangamentRemote) context
				.lookup("/traning/FootMangament!serveses.interfaces.FootMangamentRemote");

		Player playerFound = proxy.findPlayerById(1);
		playerFound.setName("cyrine");

		System.out.println(proxy.updatePlayer(playerFound));

	}

}
