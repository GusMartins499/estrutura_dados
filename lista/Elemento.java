package lista;

import lista.Elemento;

public class Elemento {

	int valor;
	Elemento proximo,anterior;

	public Elemento(int v) {
		this.valor = v;
		proximo = null;
		anterior= null;
	}
}
