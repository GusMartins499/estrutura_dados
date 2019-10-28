package lista;

import javax.swing.JOptionPane;

public class Lista {
	static int tamanhoLista = 0;
	Elemento inicio, fim, atual;

	// INSERIR
	public void criaLista(int valor) {
		tamanhoLista++;
		Elemento novo = new Elemento(valor);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			fim.proximo = novo;
			fim = novo;
		}
		System.out.println("Elemento adicionado: " + novo.valor);
	}

	// VERIFICA SE ESTÁ VAZIO
	public boolean estaVazio() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}

	public void vazio() {
		if (estaVazio() == true) {
			System.out.println("Está vazio");
		} else {
			System.out.println("Não está vazio: " + tamanhoLista + " é o tamanho da fila");
		}
	}

	public void insereAntesDoPrimeiro(int valor) {
		tamanhoLista++;
		Elemento novo = new Elemento(valor);
		if (estaVazio() == false) {
			novo.proximo = inicio;
			inicio.anterior = novo;
			System.out.println("Elemento inserido antes do: " + inicio.valor);
			inicio = novo;
		}
	}

	public void insereNoFim(int valor) {
		tamanhoLista++;
		Elemento novo = new Elemento(valor);
		if (estaVazio() == false) {
			fim.proximo = novo;
			novo.anterior = fim;
			System.out.println("Elemento inserido depois do: " + fim.valor);
			fim = novo;
		}
	}

	/*
	 * IMPLEMENTAR MÉTODO DE BUSCA PARA COLOCAR O NOVO ELEMENTO ONDE O USUÁRIO
	 * QUISER, OU SEJA, O USUARIO IRÁ DIZER ONDE COLOCAR O NOVO ELEMENTO.
	 */
	public void insereNoMeioDaLista(int valor) {
		atual = inicio;
		Elemento aux;
		String op = "";
		Elemento novo = new Elemento(valor);
		if (estaVazio() == false) {
			do {
				op = JOptionPane.showInputDialog("Deseja inserir após esse elemento ? (S/N) " + atual.valor);
				aux = atual;
				atual = atual.proximo;
				// atual.proximo = novo;
			} while (op.equalsIgnoreCase("N"));
			novo.proximo = atual;
			// atual.proximo = novo;
			System.out.println("Elemento inserido depois do: " + aux.valor);
			tamanhoLista++;
		}
	}

	public void retira() {
		atual = inicio;
		Elemento aux;
		String op = "";
		if (estaVazio() == false) {
			do {
				op = JOptionPane.showInputDialog("Deseja retirar esse elemento ? (S/N) " + atual.valor);
				aux = atual;
				atual = atual.proximo;
			} while (op.equalsIgnoreCase("N"));
			aux.proximo = aux.proximo.proximo;
			System.out.println("Elemento retirado: " + aux.valor);
			tamanhoLista--;
		}
	}

	public void tamanhoLista() {
		System.out.println("Tamanho da lista: " + tamanhoLista);
	}
}
