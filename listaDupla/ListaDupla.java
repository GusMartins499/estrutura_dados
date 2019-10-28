package listaDupla;

import javax.swing.JOptionPane;

public class ListaDupla {
	static int tamanho = 0;
	Elemento inicio, atual, proximo, anterior, fim;

	// INSERIR
	public void inserir(int v) {
		Elemento novo = new Elemento(v);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			fim.proximo = novo;
			novo.anterior = inicio;
			fim = novo;
		}
		tamanho++;
		System.out.println("Elemento adicionado : " + novo.valor);
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
			System.out.println("Não está vazio: " + tamanho + " é o tamanho da fila");
		}
	}

	public void retiraPrimeiro() {
		if (estaVazio()) {
			System.out.println("ERRO - lista vazia");
		} else {
			Elemento aux = inicio;
			inicio = inicio.proximo;
			inicio.anterior = null;
			System.out.println("Elemento retirado : " + aux.valor);
			tamanho--;
		}
	}

	public void retiraFim() {
		if (estaVazio()) {
			System.out.println("ERRO - lista vazia");
		} else {
			Elemento retirado;
			Elemento aux = vaiNaPosicao();
			retirado = aux.proximo;
			aux.proximo = null;
			fim = aux;
			tamanho--;
			System.out.println("Elemento retirado: "+retirado.valor);
		}
	}

	public void retiraQualquerPosicao() {
		atual = inicio;
		Elemento aux;
		String op = "";
		if (estaVazio()) {
			System.out.println("Erro - lista vazia");
		} else {
			do {
				op = JOptionPane.showInputDialog("Deseja retirar esse elemento ? (S/N) " + atual.valor);
				aux = atual;
				atual = atual.proximo;
			} while (op.equalsIgnoreCase("N"));
			aux.proximo = aux.proximo.proximo;
			System.out.println("Elemento retirado: " + aux.valor);
			tamanho--;
		}
	}

	public Elemento vaiNaPosicao() {
		Elemento aux = inicio;
		for (int i = 1; i < tamanho - 1; i++) {
			aux = aux.proximo;
		}
		return aux;
	}

}
