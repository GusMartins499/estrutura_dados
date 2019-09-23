package listaDupla;

public class ListaDupla {
	static int tamanho = 0;
	Elemento inicio, atual, proximo, anterior, fim;

	// INSERIR
	public void inserir(int v) {
		Elemento novo = new Elemento(v);
		if (inicio == null) {
			inicio = novo;
			atual = novo;
			proximo = null;
			anterior = null;
		} else {
			inicio.proximo = novo;
			novo.anterior = inicio;
			fim = novo;
			tamanho++;
		}
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
			Elemento aux = vaiNaPosicao();
			aux.proximo = null;
			fim = aux;
			tamanho--;
		}
	}

	public Elemento vaiNaPosicao() {
		Elemento aux = atual;
		for (int i = 1; i < tamanho - 1; i++) {
			aux = aux.proximo;
		}
		return aux;
	}

}
