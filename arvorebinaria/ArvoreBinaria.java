package arvorebinaria;

public class ArvoreBinaria {

	No raiz;
	static int tamanho = 0;

	// METODO PARA INSTANCIAR A ARVORE
	public ArvoreBinaria() {
		raiz = null;
	}

	public void insere(No n) {
		if (raiz == null) {
			raiz = n;
		} else {
			verificaFilho(raiz, n);
		}
	}

	public void verificaFilho(No noPai, No novo) {
		if (novo.valor < noPai.valor) {
			if (noPai.filhoEsquerda == null) {
				novo.pai = noPai;
				noPai.filhoEsquerda = novo;
			} else {
				noPai = noPai.filhoEsquerda;
				verificaFilho(noPai, novo);
			}
		} else {
			if (noPai.filhoDireita == null) {
				novo.pai = noPai;
				noPai.filhoDireita = novo;
			} else {
				noPai = noPai.filhoDireita;
				verificaFilho(noPai, novo);
			}
		}
	}

	// public void mostraFihoEsquerda(No no) {
	// System.out.println("Mostrando filhos do No: " + no.valor);
	// if (no.filhoEsquerda != null) {
	// System.out.println("Esquerda: " + no.filhoEsquerda.valor);
	// // System.out.println("Direita: " + no.filhoDireita.valor);
	// } else {
	// System.out.println("Este No não tem filhos a esquerda!");
	// }
	// }

	public void mostraFilho(No no) {
		System.out.println("Mostrando filhos do No: " + no.valor);
		if (no.filhoDireita != null) {
			System.out.println("Direita: " + no.filhoDireita.valor);
		} else {
			System.out.println("Este No não tem filhos a direita!");
		}
		if (no.filhoEsquerda != null) {
			System.out.println("Esquerda: " + no.filhoEsquerda.valor);
		} else {
			System.out.println("Este No não tem filhos a esquerda!");
		}
		System.out.println();
	}

	public void removeNoSemFilho(No no) {
		No auxPai = no.pai;
		if (auxPai.filhoDireita.equals(no)) {
			no.pai.filhoDireita = null;
		}
		if (auxPai.filhoEsquerda.equals(no)) {
			no.pai.filhoEsquerda = null;
		}
	}

	public void removeComUmFilho(No no) {
		No auxPai = no.pai;
		if (no.filhoDireita != null) {
			no.filhoDireita.pai = auxPai;
			if (auxPai.filhoDireita.equals(no)) {
				auxPai.filhoDireita = no.filhoDireita;
			} else {
				if (auxPai.filhoEsquerda.equals(no)) {
					auxPai.filhoEsquerda = no.filhoDireita;
				}
			}
			no.filhoDireita = null;

		} else {
			if (no.filhoEsquerda != null) {
				no.filhoEsquerda.pai = auxPai;
				if (auxPai.filhoEsquerda.equals(no)) {
					auxPai.filhoEsquerda = no.filhoEsquerda;
				} else {
					if (auxPai.filhoDireita.equals(no)) {
						auxPai.filhoDireita = no.filhoEsquerda;
					}
				}
				no.filhoEsquerda = null;
			}
		}
	}

	public void removeComDoisFilhos(No no) {

	}
}
