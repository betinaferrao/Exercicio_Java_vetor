package aula_4_exercicios;

import javax.swing.JOptionPane;

public class ExVetor2 {
	public static void main(String[] args) {
		int vetor[] = new int[3];
		int aux = 0;
		String vetorFinal = "";

		for(int i = 0; i < 3; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "  + (i+1) + "° número: "));
			}
		
		for(int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if(vetor[i] < vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		for(int i = 0; i < vetor.length; i++) {
			vetorFinal += vetor[i] + " ";
		}
		
		JOptionPane.showMessageDialog(null, "Ordem crescente: " + vetorFinal);
	}
}

/*
 * Faça um programa em que o usuário informe 3 números inteiros. Considere que o
 * usuário irá informar três números diferentes. Após o cadastro faça a
 * ordenação em ordem crescente desses números, de modo que o vetor original
 * fique ordenado. Mostre o vetor ordenado na tela.
 */
