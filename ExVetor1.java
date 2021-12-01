package aula_4_exercicios;

import javax.swing.JOptionPane;

public class ExVetor_1 {


	/*
	 * 1 – Escreva um algoritmo, que leia um conjunto de N alunos 
	 * (nome, altura (em cm) e sexo) e armazene em vetores. 
	 * APÓS a leitura dos N Alunos (utilizar menu), imprima:
	 * - O nome do aluno com maior altura;
	 * - O nome de todas as mulheres com altura acima da média da altura das mulheres;
	 * - O nome de todas as pessoas com altura abaixo da média
	 */
		
		public static void main(String[] args) {
			
			String[] nomes = new String[100];
			int[] alturas = new int[100];
			char[] sexos = new char[100];
			
			String menu = "1 - Cadastrar Alunos\n"
					+ "2 - Aluno mais alto(a)\n"
					+ "3 - Mulheres com altura acima da média\n"
					+ "4 - Pessoas com altura abaixo da média\n"
					+ "5 - SAIR";
			int op = 0;
			int n = 0;
			
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(menu));
				switch (op) {
				case 1:
					nomes[n] = JOptionPane.showInputDialog("Nome");
					alturas[n] = Integer.parseInt(JOptionPane.showInputDialog("Altura"));
					sexos[n]= JOptionPane.showInputDialog("Sexo(M,F)").toUpperCase().charAt(0);
					n++;
					break;
				case 2:
					String nmMaisAlto = "";
					int alturamaisAlto = 0;
					for(int i=0; i<n; i++) {
						if(alturas[i] > alturamaisAlto) {
							alturamaisAlto = alturas[i];
							nmMaisAlto = nomes[i];
						}
					}
					JOptionPane.showMessageDialog(null, nmMaisAlto);
					break;
				case 3:
					int somaAlturas = 0;
					int qtMulheres = 0;
					for(int i=0; i<n; i++) {
						if(sexos[i] == 'F') {
							somaAlturas += alturas[i];
							qtMulheres ++;
						}
					}
					double mediaAlturasF = somaAlturas / qtMulheres;
					
					String nomesFmaisAltas = "Mulheres mais altas que a média\n";
					for(int i=0; i<n; i++) {
						if(sexos[i]=='F' && alturas[i] > mediaAlturasF) {
							nomesFmaisAltas += nomes[i]+"\n";
						}
					}
					JOptionPane.showMessageDialog(null, nomesFmaisAltas);
					break;
				case 4:
					int somaTodasAlturas = 0;
					for(int i=0; i<n; i++) {
						somaTodasAlturas += alturas[i];
					}
					double mediaTodasAlturas = somaTodasAlturas / n;
					String pessoasBaixoMedia = "Pessoas mais baixas que a média\n";
					for(int i=0; i<n; i++) {
						if(alturas[i] < mediaTodasAlturas) {
							pessoasBaixoMedia += nomes[i]+"\n";
						}
					}
					JOptionPane.showMessageDialog(null, pessoasBaixoMedia);
					break;

				}
				
			}while(op!=5);
			
			
		}

	}

