package lista;

import javax.swing.JOptionPane;

public class Lista {
	static int tamanhoLista = 0;
	Elemento inicio, fim, atual;

	// INSERIR
	public void criaLista(int valor) {
		Elemento novo = new Elemento(valor);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			fim.proximo = novo;
			fim = novo;
		}
		tamanhoLista++;
	}

	// VERIFICA SE ESTÁ VAZIO
	public boolean estaVazio() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insereAntesDoPrimeiro(int valor) {
		Elemento novo = new Elemento(valor);
		if (estaVazio() == false) {
			novo.proximo = inicio;
			inicio = novo;
		}
		tamanhoLista++;
	}

	public void insereNoFim(int valor) {
		Elemento novo = new Elemento(valor);
		if (estaVazio() == false) {
			fim.proximo = novo;
			fim = novo;
		}
		tamanhoLista++;
	}

	/*
	 * IMPLEMENTAR MÉTODO DE BUSCA PARA COLOCAR O NOVO ELEMENTO ONDE O USUÁRIO
	 * QUISER, OU SEJA, O USUARIO IRÁ DIZER ONDE COLOCAR O NOVO ELEMENTO.
	 */
	public void insereNoMeioDaLista(int valor) {
		atual = inicio;
		String op = "";
		Elemento novo = new Elemento(valor);
		if (estaVazio() == false) {
			do {
				op = JOptionPane.showInputDialog("Deseja inserir após esse elemento ? (S/N) " + atual.valor);
				atual = atual.proximo;
			} while (op.equalsIgnoreCase("N"));
			novo.proximo = atual.proximo;
			atual.proximo = novo;
		}
		tamanhoLista++;
	}

	public void retira() {
		Elemento aux = inicio;
		if (estaVazio() == false) {
			String op = "";
			if (estaVazio() == false) {
				do {
					op = JOptionPane.showInputDialog("Deseja retirar esse elemento ? (S/N) " + aux.valor);
					aux = aux.proximo;
				} while (op.equalsIgnoreCase("N"));
				aux.proximo = aux.proximo.proximo;
				System.out.println("Elemento retirado: " + aux.valor);
			}
		}
		tamanhoLista--;
	}
}
