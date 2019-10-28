package fila;

public class Fila {
	static int tamanhoFila = 0;
	Elemento inicio, fim;

	// INSERIR
	public void criaFila(int valor) {
		Elemento elementoNovo = new Elemento(valor);
		if (inicio == null) {
			inicio = elementoNovo;
			fim = elementoNovo;
		} else {
			fim.proximo = elementoNovo;
			fim = elementoNovo;
		}
		tamanhoFila++;

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
			System.out.println("Não está vazio: " + tamanhoFila + " é o tamanho da fila");
		}
	}

	// RETIRA
	public void retira() {
		if (estaVazio() == false) {
			Elemento aux = inicio;
			inicio = inicio.proximo;
			tamanhoFila--;
			System.out.println("Elemento retirado da fila: " + aux.valor);
		}

	}

	// TAMANHO
	public void tamanho() {
		System.out.println("Tamanho da Fila: " + tamanhoFila);
	}

	public void frente() {
		System.out.println("Inicio da fila: " + inicio.valor);
	}
}
