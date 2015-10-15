package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import entities.Player;
import serveses.interfaces.FootMangamentRemote;

public class TestfindPlayerById {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		FootMangamentRemote proxy = (FootMangamentRemote) context
				.lookup("/traning/FootMangament!serveses.interfaces.FootMangamentRemote");

		Player player = proxy.findPlayerById(1);
		System.out.println(player.getName());

	}

}
