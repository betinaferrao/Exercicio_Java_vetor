package aula_4_exercicios;

import javax.swing.JOptionPane;

public class ExVetor3 {
	public static void main(String[] args) {
		String marcas[] = new String[50];
		String placas[] = new String[50];
		int anoFabricacao[] = new int[50];
		String menu = "1 – Cadastrar Carro \n2 – Listar os carros do ano \n"
				+ "3 – Buscar carros por marca \n4- Sair";
		int op = 0;
		int n = 0;

		while (op != 4) {
			int j = 0;
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {
				marcas[n] = JOptionPane.showInputDialog("Informe a marca do carro: ");
				placas[n] = JOptionPane.showInputDialog("Informe a placa do carro: ");
				anoFabricacao[n] = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do carro: "));
				n++;
			} 
			
			if (op == 2) {
				String anoFabriTotal = "Registro\n";
				for(int i=0; i < n; i++) {
					if (anoFabricacao[i] == 2021) {
						anoFabriTotal += marcas[i] + " - " + placas[i] + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, anoFabriTotal);
			}
			
			if(op == 3) {
				String buscaMarca = JOptionPane.showInputDialog("Deseja buscar por qual marca? ");
				boolean achou = false;
				String reg = "";
				
				for(int i = 0; i < n; i++) {
					if(marcas[i].equals(buscaMarca)) {
						achou = true;
						j = i;
					}
					
					if(achou == true) {
						reg += buscaMarca + " está cadastrado(a). \nPlaca: " + placas[j] + "\nAno de fabricação: " + anoFabricacao[j] + "\n";
					} else {
						JOptionPane.showMessageDialog(null, buscaMarca + " não encontrado(a)");		
					}
					
				}
				JOptionPane.showMessageDialog(null, reg);
			}
		}
	}
}

/*
 * Faça um programa em que o usuário faça o cadastro de N marcas, placas e ano
 * de fabricação de carros. Possibilite o cadastro de no máximo 50 carros.
 * Utilize um menu com as seguintes opções: 1 – Cadastrar Carro (o usuário
 * informa a marca e a placa do carro) 2 – Listar os carros do ano (o programa
 * mostra todas as informações de todos os carros fabricados no ano de 2021). 3
 * – Buscar carros por marca (o programa mostra todos os dados de todos os
 * carros que possuem a marca pesquisada).
 * 
 * OBS: Nas opções 2 e 3, caso não tenha nenhum registro que atenda aos filtros,
 * deve ser dado uma mensagem ao usuário de que não existe nenhum cadastro que
 * atenda à busca.
 */
