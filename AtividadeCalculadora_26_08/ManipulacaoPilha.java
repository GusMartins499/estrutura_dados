package AtividadeCalculadora_26_08;

import javax.swing.JOptionPane;

import atividade1_19_08.PilhaDeInteiros;

public class ManipulacaoPilha {

	public static void main(String[] args) {
		PilhaDeInteiros p = new PilhaDeInteiros();
		String menu = "1 - Inserir número" + "\n" + "2 - soma" + "\n" + "3 - subtracao" + "\n" + "4 - multiplicacao"
				+ "5 - divisao" + "\n" + "0 - Sair";
		int oper = 0;
		do {
			oper = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (oper) {
			case 1:
				//p.empilhar(Integer.parseInt(JOptionPane.showInputDialog("Valor:")));
				int inteiro = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
				p.empilhar(inteiro);
				System.out.println(inteiro);
				break;
			case 2:

				if (oper == 2) {
					int n1 = p.desempilhar();
					int n2 = p.desempilhar();
					int result = n2 + n1;
					p.empilhar(result);
					System.out.println("SOMA " + result);
				}
				break;
			case 3:
				if (oper == 3) {
					int n1 = p.desempilhar();
					int n2 = p.desempilhar();
					int result = n2 - n1;
					p.empilhar(result);
					System.out.println("subtrai " + result);
				}
			case 4:
				if (oper == 4) {
					int n1 = p.desempilhar();
					int n2 = p.desempilhar();
					int result = n2 * n1;
					p.empilhar(result);
					System.out.println("multiplica " + result);
				}
				break;
			case 5:
				if (oper == 5) {
					int n1 = p.desempilhar();
					int n2 = p.desempilhar();
					int result = n2 / n1;
					p.empilhar(result);
					System.out.println("divide " + result);
				}
				break;
			case 0:
				System.out.println(p.desempilhar());
				break;
			}
		} while (oper != 0);

	}

	public static void soma() {
		PilhaDeInteiros p = new PilhaDeInteiros();
		String recebeOperacao = JOptionPane.showInputDialog("Digite o SÍMBOLO DA OPERAÇÃO: " + "\n" + "+ Soma" + "\n"
				+ "- Subtração" + "\n" + "* Multiplicação" + "\n" + "/ Divisão");
		if (recebeOperacao.equals("+")) {
			int n1 = p.desempilhar();
			int n2 = p.desempilhar();
			int result = n1 + n2;
			p.empilhar(result); // topo
			System.out.println("soma" + result);

		}

	}

	public static void subtracao() {
		PilhaDeInteiros p = new PilhaDeInteiros();
		String recebeOperacao = JOptionPane.showInputDialog("Digite o SÍMBOLO DA OPERAÇÃO: " + "\n" + "+ Soma" + "\n"
				+ "- Subtração" + "\n" + "* Multiplicação" + "\n" + "/ Divisão");
		if (recebeOperacao.equals("-")) {
			int n1 = p.desempilhar();
			int n2 = p.desempilhar();
			int result = n1 - n2;
			p.empilhar(result);
			System.out.println("sub" + result);
		}
	}

	public static void multiplicacao() {
		PilhaDeInteiros p = new PilhaDeInteiros();
		String recebeOperacao = JOptionPane.showInputDialog("Digite o SÍMBOLO DA OPERAÇÃO: " + "\n" + "+ Soma" + "\n"
				+ "- Subtração" + "\n" + "* Multiplicação" + "\n" + "/ Divisão");
		if (recebeOperacao.equals("*")) {
			int n1 = p.desempilhar();
			int n2 = p.desempilhar();
			int result = n1 * n2;
			p.empilhar(result);
			System.out.println("mult" + result);
		}
	}

	public static void divisao() {
		PilhaDeInteiros p = new PilhaDeInteiros();
		String recebeOperacao = JOptionPane.showInputDialog("Digite o SÍMBOLO DA OPERAÇÃO: " + "\n" + "+ Soma" + "\n"
				+ "- Subtração" + "\n" + "* Multiplicação" + "\n" + "/ Divisão");
		if (recebeOperacao.equals("/")) {
			int n1 = p.desempilhar();
			int n2 = p.desempilhar();
			int result = n1 / n2;
			p.empilhar(result);
			System.out.println("div" + result);
		}
	}

}
