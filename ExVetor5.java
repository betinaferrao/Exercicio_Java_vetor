package aula_4_exercicios;

import javax.swing.JOptionPane;

public class ExVetor3 {
	public static void main(String[] args) {
		String marcas[] = new String[50];
		String placas[] = new String[50];
		int anoFabricacao[] = new int[50];
		String menu = "1 � Cadastrar Carro \n2 � Listar os carros do ano \n"
				+ "3 � Buscar carros por marca \n4- Sair";
		int op = 0;
		int n = 0;

		while (op != 4) {
			int j = 0;
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {
				marcas[n] = JOptionPane.showInputDialog("Informe a marca do carro: ");
				placas[n] = JOptionPane.showInputDialog("Informe a placa do carro: ");
				anoFabricacao[n] = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabrica��o do carro: "));
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
						reg += buscaMarca + " est� cadastrado(a). \nPlaca: " + placas[j] + "\nAno de fabrica��o: " + anoFabricacao[j] + "\n";
					} else {
						JOptionPane.showMessageDialog(null, buscaMarca + " n�o encontrado(a)");		
					}
					
				}
				JOptionPane.showMessageDialog(null, reg);
			}
		}
	}
}

/*
 * Fa�a um programa em que o usu�rio fa�a o cadastro de N marcas, placas e ano
 * de fabrica��o de carros. Possibilite o cadastro de no m�ximo 50 carros.
 * Utilize um menu com as seguintes op��es: 1 � Cadastrar Carro (o usu�rio
 * informa a marca e a placa do carro) 2 � Listar os carros do ano (o programa
 * mostra todas as informa��es de todos os carros fabricados no ano de 2021). 3
 * � Buscar carros por marca (o programa mostra todos os dados de todos os
 * carros que possuem a marca pesquisada).
 * 
 * OBS: Nas op��es 2 e 3, caso n�o tenha nenhum registro que atenda aos filtros,
 * deve ser dado uma mensagem ao usu�rio de que n�o existe nenhum cadastro que
 * atenda � busca.
 */
