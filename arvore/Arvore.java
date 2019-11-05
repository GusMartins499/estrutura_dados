package arvore;

import java.util.ArrayList;

public class Arvore {
	/*
	 * NA PRIMEIRA VEZ NO MAIN VAI PASSAR NO METODO INSERE(null, a) NA SEGUNDA VEZ,
	 * VAI PASSAR NO METODO INSERE(A,B)
	 * 
	 */

	// NO QUE ARMAZENA A RAIZ DA ARVORE
	No raiz;
	// ARRAY QUE ARMAZENA TODOS OS NO'S DA ARVORE E CONSEQUENTEMENTE O TAMANHO DELA
	// TAMBÉM
	static ArrayList<No> listaDeTodosNo = new ArrayList<No>();
	static int tamanho = 0;

	// METODO PARA INSTANCIAR A ARVORE
	public Arvore() {
		raiz = null;
	}

	// INSERE UM ELEMENTO COMO FILHO DE UMA RAIZ
	public void insere(No pai, No filho) {
		if (raiz == null) {
			raiz = filho;
			tamanho++;
			// raiz.filhos = null;
		} else {
			filho.pai = pai;
			pai.filhos.add(filho);
			// raiz.filhos.add(filho);
			tamanho++;
		}
	}

	// RETORNA A RAIZ DA ARVORE, VALOR DA RAIZ
	public String raiz() {
		return raiz.nomeDoNo;
	}

	// RETORNA O PAI DE QUALQUER NO
	public String pai(No elemento) {
		return elemento.pai.nomeDoNo;
	}

	// RETORNA OS FILHOS DE UM NO
	public void filhos(No elemento) {
		ArrayList<String> filhos = new ArrayList<String>();
		for (int i = 0; i < elemento.filhos.size(); i++) {
			filhos.add(elemento.filhos.get(i).nomeDoNo);
		}
		System.out.println("Filhos do No: " + elemento.nomeDoNo + " =>" + filhos.toString());

		// return elemento.filhos.get
	}

	// TESTA SE UM NO É INTERNO
	public boolean verificaInterno(No elemento) {
		return elemento.filhos.size() == 0;
	}

	// TESTA SE UM NO É EXTERNO
	public boolean verificaExterno(No elemento) {
		return !verificaInterno(elemento);
	}

	// TESTA SE UM NO É RAIZ
	public boolean verificaRaiz(No elemento) {
		return elemento.pai == null;
	}

	/*
	 * RETORNA UMA LISTA COM TODOS OS NOS DA ARVORE ADICIONADO UM IF QUE VERIFICA SE
	 * O NO JÁ ESTÁ NO ARRAY
	 */
	public ArrayList<No> elementos() {
		listaDeTodosNo.add(raiz);
		int i = 0;
		while (i < listaDeTodosNo.size()) {
			No atual = listaDeTodosNo.get(i);
			for (No no : atual.filhos) {
				if (!listaDeTodosNo.contains(no))
					listaDeTodosNo.add(no);
			}
			i++;
		}
		return listaDeTodosNo;
	}

	// RETORNA O TAMANHO DA ARVORE
	public int retornaTamanho() {
		return tamanho;
	}

	/*
	 * SUBSTITUI UM NO POR OUTRO, OU SEJA, AS INFORMAÇÕES DE PAI, E FILHOS IRÃO
	 * CONTINUAR AS MESMAS, O QUE VAI MUDAR É APENAS O NOME DO NO AQUI EU CHAMO DE
	 * NOVO O METODO ELEMENTOS() POIS PODE SER QUE ALGUM NO TENHA SIDO INSERIDO
	 * ANTES DE CHAMAR ESSE METODO NO METODO ELEMENTOS() TEM UM IF QUE NÃO DEIXA
	 * ADICIONAR ALGUM NO CASO ELE JÁ ESTEJA NO ARRAY, UTILIZANDO O COTAINS
	 */

	public No atualizaElemento(No objAntigo, String objNovo) {
		No objAuxiliar = null;
		elementos();
		int i = 0;
		while (i < listaDeTodosNo.size()) {
			No atualNaLista = listaDeTodosNo.get(i);
			if (atualNaLista.equals(objAntigo)) {
				objAuxiliar = atualNaLista;
				atualNaLista.nomeDoNo = objNovo;
			}
			i++;
		}
		return objAuxiliar;
	}
}
