package aula_4_exercicios;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExVetor_2 {
	
	public static void main(String[] args) {
		
			ArrayList<String> nomes = new ArrayList<>();
			ArrayList<Integer> alturas = new ArrayList<>();
			ArrayList<Character> sexos = new ArrayList<>();
			
			String menu = "1 - Cadastrar Alunos\n"
					+ "2 - Aluno mais alto(a)\n"
					+ "3 - Mulheres com altura acima da média\n"
					+ "4 - Pessoas com altura abaixo da média\n"
					+ "5 - SAIR";
			int op = 0;
			
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(menu));
				switch (op) {
				case 1:
					nomes.add(JOptionPane.showInputDialog("Nome"));
					alturas.add(Integer.parseInt(JOptionPane.showInputDialog("Altura")));
					sexos.add(JOptionPane.showInputDialog("Sexo(M,F)").toUpperCase().charAt(0));
					break;
				case 2:
					String nmMaisAlto = "";
					int alturamaisAlto = 0;
					for(int i=0; i<nomes.size(); i++) {
						if(alturas.get(i) > alturamaisAlto) {
							alturamaisAlto = alturas.get(i);
							nmMaisAlto = nomes.get(i);
						}
					}
					JOptionPane.showMessageDialog(null, nmMaisAlto);
					break;
				case 3:
					int somaAlturas = 0;
					int qtMulheres = 0;
					for(int i=0; i<nomes.size(); i++) {
						if(sexos.get(i) == 'F') {
							somaAlturas += alturas.get(i);
							qtMulheres ++;
						}
					}
					
					if(qtMulheres == 0)
						qtMulheres = 1;
					
					double mediaAlturasF = somaAlturas / qtMulheres;
					
					String nomesFmaisAltas = "Mulheres mais altas que a média\n";
					for(int i=0; i<nomes.size(); i++) {
						if(sexos.get(i)=='F' && alturas.get(i) > mediaAlturasF) {
							nomesFmaisAltas += nomes.get(i)+"\n";
						}
					}
					JOptionPane.showMessageDialog(null, nomesFmaisAltas);
					break;
				case 4:
					int somaTodasAlturas = 0;
					for(int i=0; i<nomes.size(); i++) {
						somaTodasAlturas += alturas.get(i);
					}
					double mediaTodasAlturas = somaTodasAlturas / nomes.size();
					String pessoasBaixoMedia = "Pessoas mais baixas que a média\n";
					for(int i=0; i<nomes.size(); i++) {
						if(alturas.get(i) < mediaTodasAlturas) {
							pessoasBaixoMedia += nomes.get(i)+"\n";
						}
					}
					JOptionPane.showMessageDialog(null, pessoasBaixoMedia);
					break;

				}
				
			}while(op!=5);
			
			
		}

	}

