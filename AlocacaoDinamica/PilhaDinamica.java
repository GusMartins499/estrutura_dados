
package AlocacaoDinamica;

public class PilhaDinamica {

	private No topo = null;

	public PilhaDinamica() {
	}

	public boolean estaVazia() {
		return topo == null;
	}

	public void empilha(int v) {
		No novo = new No(v);
		if (topo == null)
			topo = novo;
		else {
			novo.proximo = topo;
			topo = novo;
		}
	}

	public int desempilha() {
		int retVal = topo.valor;
		topo = topo.proximo;
		return retVal;
	}
}
