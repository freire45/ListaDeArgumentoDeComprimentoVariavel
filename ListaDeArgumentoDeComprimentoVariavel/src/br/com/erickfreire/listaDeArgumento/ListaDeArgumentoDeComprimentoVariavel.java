package br.com.erickfreire.listaDeArgumento;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa em java que calcula o produto de uma lista de elementos inseridos pelo usuário de forma dinâmica, ou seja, sem tamanho fixo.
 * @author Erick Freire
 * @version 1 - Criado em 10-06-2021 as 16:00
 */

public class ListaDeArgumentoDeComprimentoVariavel {

	public static void main(String[] args) {
		
		ArrayList<Integer> vetor = new ArrayList<>();
		
		int opcao = 0;
		int valor = 0;
		int resultado = 1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite 0 para inserir um dado ou 1 para sair: ");
		opcao = entrada.nextInt();
		
		while(opcao != 1) {
			System.out.print("Digite um valor: ");
			valor = entrada.nextInt();
			
			vetor.add(valor);
			
			System.out.print("Digite 0 para inserir um dado ou 1 para sair: ");
			opcao = entrada.nextInt();
		}
		
		for(int i : vetor)
			resultado *= i; 
		
		System.out.printf("\nResultado Final: %d", resultado);

	}

}
