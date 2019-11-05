package arvorebinaria;

public class No {

	int valor;
	No filhoEsquerda, filhoDireita, pai;

	public No(int valor) {
		this.valor = valor;
		this.filhoDireita = null;
		this.filhoEsquerda = null;
		this.pai = null;
	}

}
