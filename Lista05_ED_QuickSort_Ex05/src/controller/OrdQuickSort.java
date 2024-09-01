package controller;

import br.edu.fateczl.calc.Ordenacao;

public class OrdQuickSort {

	public OrdQuickSort() {
		super();
	}

	public int[] Ordenacao(int[] vetor, int inicio, int fim) {
		Ordenacao ordenacao = new Ordenacao();
		int[] vetorQuickSort = ordenacao.quickSort(vetor, inicio, fim);
		System.out.println(vetorQuickSort);
		return vetorQuickSort;
	}
}
	

