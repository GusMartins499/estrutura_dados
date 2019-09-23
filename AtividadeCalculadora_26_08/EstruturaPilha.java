package AtividadeCalculadora_26_08;

public class EstruturaPilha {

	public class PilhaDeInteiros {
		public int[] pilha;
		public int indicePilha;

		public PilhaDeInteiros() {
			this.indicePilha = -1;
			this.pilha = new int[100];
		}

		public boolean estaVazia() {
			if (this.indicePilha == -1) {
				return true;
			}
			return false;
		}

		public int tamanho() {
			if (this.estaVazia()) {
				return 0;
			}
			return this.indicePilha + 1;
		}

		public int mostraTopo() {
			if (this.estaVazia()) {
				return -1;
			}
			return this.pilha[this.indicePilha];
		}

		public int desempilhar() {
			if (estaVazia()) {
				return -1;
			}
			return this.pilha[this.indicePilha--];
		}

		public void empilhar(int valor) {
			if (this.indicePilha < this.pilha.length - 1) {
				indicePilha++;
				this.pilha[indicePilha] = valor;
			}
		}
	}
}
