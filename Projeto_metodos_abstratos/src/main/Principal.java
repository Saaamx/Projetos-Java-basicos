package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaF;
import entities.PessoaJ;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Pessoa> lista = new ArrayList<>();
		System.out.print("digite o numero de Pessoas a pagar: ");
		int N = sc.nextInt();
		
		for (int i = 1; i<= N;i++){	
			System.out.println("Dados do pagador #"+i+": ");
			System.out.print("Fisica ou Juridica (f/j)? ");
			char p = sc.next().charAt(0);	
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Renda Anual: ");
			double renda = sc.nextDouble();
			
			
			if(p == 'f') {
				System.out.print("Gastos com saude: ");
				double gastoSaude = sc.nextDouble();
				lista.add(new PessoaF(nome, renda, gastoSaude));
			}
			if(p == 'j') {
				System.out.print("Numero de Funcionarios");
				int numFuncionarios = sc.nextInt();
				lista.add(new PessoaJ(nome, renda, numFuncionarios));
			}
			
		}
		double soma = 0;
		System.out.println();
		System.out.println("taxas pagas: ");
		for (Pessoa pe : lista) {
			double taxa= pe.impostoArrecadado();
			System.out.println(pe.getNome() + ": R$ "+ String.format("%.2f", taxa));
			soma+=taxa;
		}
		
		System.out.println();
		System.out.println("Total Impostos: $" + String.format("%.2f",soma));

	}

}
