package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import serveses.interfaces.FootMangamentRemote;

public class TestSallam {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		FootMangamentRemote proxy = (FootMangamentRemote) context
				.lookup("/traning/FootMangament!serveses.interfaces.FootMangamentRemote");
		
		System.out.println(proxy.sallam("cyrine"));

	}

}
