package arvore;

import java.util.ArrayList;

public class No {

	/*
	 * NESSE CÓDIGO É CRIADO UMA ARVORE, O NOME DE CADA NO É UMA STRING, E CADA NO
	 * TEM UM PAI E UM ARRAY DE FILHOS
	 */
	String nomeDoNo;
	No pai;
	ArrayList<No> filhos;

	public No(String nomeNo) {
		this.nomeDoNo = nomeNo;
		pai = null;
		filhos = new ArrayList<No>();
	}
}
