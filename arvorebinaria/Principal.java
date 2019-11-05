package arvorebinaria;

public class Principal {

	public static void main(String[] args) {

		ArvoreBinaria treeBinaria = new ArvoreBinaria();

		No no80 = new No(80);
		treeBinaria.insere(no80);

		No no50 = new No(50);
		treeBinaria.insere(no50);

		No no30 = new No(30);
		treeBinaria.insere(no30);

		No no60 = new No(60);
		treeBinaria.insere(no60);

		No no90 = new No(90);
		treeBinaria.insere(no90);

		No no85 = new No(85);
		treeBinaria.insere(no85);

		No no100 = new No(100);
		treeBinaria.insere(no100);

		No no40 = new No(40);
		treeBinaria.insere(no40);

		// MOSTRA FILHOS É SÓ CHAMAR O MÉTODO MOSTRAFILHO QUE IRÁ MOSTRAR FUNCIONA COM
		// QUALQUER NO - FUNCIONANDO
		// treeBinaria.mostraFilho(no100);

		// REMOVE O NO SE ELE NÃO TEM NENHUM FILHO
		// treeBinaria.mostraFilho(no60);
		// treeBinaria.removeNoSemFilho(no60);
		// treeBinaria.mostraFilho(no50);

		// REMOVE O NO SE ELE TEM 1 FILHO - FUNCIONANDO
		treeBinaria.mostraFilho(no50);
		treeBinaria.mostraFilho(no30);
		treeBinaria.removeComUmFilho(no30);
		treeBinaria.mostraFilho(no30);
		treeBinaria.mostraFilho(no50);
	}
}