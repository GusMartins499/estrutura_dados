package lista;

public class Principal {

	public static void main(String[] args) {
		Lista l = new Lista();
		l.criaLista(1);
		l.criaLista(2);
		l.criaLista(3);
		l.insereAntesDoPrimeiro(0);
		l.insereNoFim(4);
		l.insereNoMeioDaLista(9);
		l.retira();
		//l.vazio();
		//l.tamanhoLista();

	}

}
