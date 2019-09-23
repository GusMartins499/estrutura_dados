package listaDupla;

import listaDupla.Elemento;

public class Elemento {

	int valor;
	Elemento proximo,atual,anterior;

	public Elemento(int v) {
		this.valor = v;
		proximo = null;
		anterior = null;
	}
}
