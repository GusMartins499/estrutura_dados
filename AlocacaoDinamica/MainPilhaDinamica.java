package AlocacaoDinamica;

import javax.swing.JOptionPane;

public class MainPilhaDinamica {

	public static void main(String[] args) {

		PilhaDinamica p = new PilhaDinamica();

		int op = 0;
		String menu = "";
		boolean continua = true;

		do {
			int primeiro = 0;
			int segundo = 0;
			int resultado = 0;
			menu = JOptionPane.showInputDialog("Digite um número.\n" + "Digite + para somar os dois últimos.\n"
					+ "Digite - para subtrair os dois últimos.\n" + "Digite * para multiplicar os dois últimos.\n"
					+ "Digite / para dividir os dois últimos.\n\n" + "Digite SAIR para sair.");
			if (menu.equalsIgnoreCase("sair")) {
				continua = false;
			}
			if (continua) {
				if (menu.contains("+")) {
					segundo = p.desempilha();
					primeiro = p.desempilha();
					resultado = primeiro + segundo;
					p.empilha(resultado);
					JOptionPane.showMessageDialog(null, "O resultado desta última operação é " + resultado);
				} else if (menu.contains("-")) {
					segundo = p.desempilha();
					primeiro = p.desempilha();
					resultado = primeiro - segundo;
					p.empilha(resultado);
					JOptionPane.showMessageDialog(null, "O resultado desta última operação é " + resultado);
				} else if (menu.contains("*")) {
					segundo = p.desempilha();
					primeiro = p.desempilha();
					resultado = primeiro * segundo;
					p.empilha(resultado);
					JOptionPane.showMessageDialog(null, "O resultado desta última operação é " + resultado);
				} else if (menu.contains("/")) {
					segundo = p.desempilha();
					primeiro = p.desempilha();
					resultado = primeiro / segundo;
					p.empilha(resultado);
					JOptionPane.showMessageDialog(null, "O resultado desta última operação é " + resultado);
				} else {
					op = Integer.parseInt(menu);
					p.empilha(op);
				}

			}
		} while (continua);
		JOptionPane.showMessageDialog(null, "O resultado final é " + p.desempilha());
	}
}
