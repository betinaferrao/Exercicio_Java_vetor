package aula_4_exercicios;

import javax.swing.JOptionPane;

public class ExVetor2 {
	public static void main(String[] args) {
		int vetor[] = new int[3];
		int aux = 0;
		String vetorFinal = "";

		for(int i = 0; i < 3; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "  + (i+1) + "� n�mero: "));
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
 * Fa�a um programa em que o usu�rio informe 3 n�meros inteiros. Considere que o
 * usu�rio ir� informar tr�s n�meros diferentes. Ap�s o cadastro fa�a a
 * ordena��o em ordem crescente desses n�meros, de modo que o vetor original
 * fique ordenado. Mostre o vetor ordenado na tela.
 */
