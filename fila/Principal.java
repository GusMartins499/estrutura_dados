package fila;

public class Principal {

	public static void main(String[] args) {
		Fila f = new Fila();
		// ADD NA FILA
		f.criaFila(1);
		// ADD NA FILA
		f.criaFila(2);
		// ADD NA FILA
		f.criaFila(3);
		// ADD NA FILA
		f.criaFila(4);
		// RETORNA O INICIO DA FILA
		f.frente();
		// RETORNA O TAMANHO DA FILA
		f.tamanho();
		// VERIFICA SE A FILA ESTÁ VAZIO
		f.vazio();
		// ADD NA FILA
		f.criaFila(5);
		// RETIRA O ELEMENTO
		f.tamanho();
		// RETIRA O ELEMENTO
		f.retira();
		// RETIRA O ELEMENTO
		f.retira();
		// RETORNA O TAMANHO DA FILA
		f.tamanho();

	}

}
