package arvore;

public class Principal {

	public static void main(String[] args) {

		Arvore tree = new Arvore();

		No noRaiz = new No("a");
		tree.insere(null, noRaiz);

		No noB = new No("b");
		tree.insere(noRaiz, noB);

		No noC = new No("c");
		tree.insere(noRaiz, noC);

		No noD = new No("d");
		tree.insere(noRaiz, noD);

		No noE = new No("e");
		tree.insere(noB, noE);

		No noF = new No("f");
		tree.insere(noE, noF);

		No noG = new No("g");
		tree.insere(noD, noG);

		No noH = new No("h");
		tree.insere(noG, noH);

		No noI = new No("i");
		tree.insere(noG, noI);

		System.out.println("Raiz: " + tree.raiz());
		System.out.println("Pai de qualquer nó: " + tree.pai(noG));
		// RETORNA OS FILHOS DE QUALQUER NÓ
		tree.filhos(noRaiz);
		System.out.println("Tamanho da tree: " + tree.retornaTamanho());
		for (int i = 0; i < tree.retornaTamanho(); i++) {
			System.out.print(tree.elementos().get(i).nomeDoNo+",");
		}
		tree.atualizaElemento(noB, "x");
		System.out.println();
		for (int i = 0; i < tree.retornaTamanho(); i++) {
			System.out.print(tree.elementos().get(i).nomeDoNo+",");
		}
	}

}
