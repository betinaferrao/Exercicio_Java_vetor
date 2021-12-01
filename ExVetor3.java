package aula_4_exercicios;

import javax.swing.JOptionPane;

public class ExVetor1 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos você deseja cadastrar?"));
		String nome[] = new String[n];
		double altura[] = new double[n];
		char sexo[] = new char[n];
		double maiorAluno = 0;
		String nomeMaiorAluno = "";
		int f = 0;
		int p = 0;
		double somaAlturaF = 0;
		double mediaF = 0;
		String nomesMulheres = "";
		double totalAltura = 0;
		double mediaTotal = 0;
		String nomePessoas = "";
		String nomePessoasCerto = "";
		String nomesMulheresCerto = "";
		
		for (int i = 0; i < n; i++) {
			nome[i] = JOptionPane.showInputDialog("Nome do " + (i + 1) + "° aluno: ");
			p++;
			altura[i] = Double.parseDouble(JOptionPane.showInputDialog("Altura do " + (i + 1) + "° aluno: "));
			totalAltura += altura[i];
			sexo[i] = JOptionPane.showInputDialog("Sexo do " + (i + 1) + "° aluno: ").toUpperCase().charAt(0);
			
			if (i == 0) {
				maiorAluno = altura[i];
				nomeMaiorAluno = nome[i];
			}
			if (altura[i] > maiorAluno) {
				nomeMaiorAluno = nome[i];
			}
			
			if (sexo[i] == 'F') {
				f++;
				somaAlturaF += altura[i];
			}
			
		}
		
		mediaF = somaAlturaF / f;
		
		for (int j = 0; j < n; j++) {
			if (sexo[j] == 'F') {
				if (altura[j] > mediaF) {
						nomesMulheres += nome[j] + ", ";
						nomesMulheresCerto = nomesMulheres.substring(0, nomesMulheres.lastIndexOf(", "));
					}
				}
			}
		
		mediaTotal = totalAltura / p;
		
		for (int k = 0; k < n; k++) {
			if (altura[k] < mediaTotal) {
				nomePessoas += nome[k] + ", ";
				nomePessoasCerto = nomePessoas.substring(0, nomePessoas.lastIndexOf(", "));
			}
		}
		
		JOptionPane.showMessageDialog(null, "Aluno com maior altura: " + nomeMaiorAluno + "\nMulheres com altura acima da média: " + 
			nomesMulheresCerto + "\nPessoas com altura abaixo da média: " + nomePessoasCerto);
		
	}
}



/*
 * Escreva um algoritmo, que leia um conjunto de N alunos (nome, altura (em cm)
 * e sexo) e armazene em vetores. APÓS a leitura dos N Alunos (não é necessário
 * utilizar menu), imprima: - O nome do aluno com maior altura; - O nome de
 * todas as mulheres com altura acima da média da altura das mulheres; - O nome
 * de todas as pessoas com altura abaixo da média.
 */