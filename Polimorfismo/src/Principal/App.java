package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("digite o numero de produtos: ");
		int N = sc.nextInt();
		
		for (int i = 1; i<=N;i++) {
			System.out.println("Dados do produto #"+i+": ");
			System.out.print("comum, usado ou importado? (C/U/I)? ");
			char opcao = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("preco: ");
			double preco = sc.nextDouble();
			
			if (opcao == 'c') {
				lista.add(new Produto(nome,preco));
			}
			if (opcao == 'u') {
				System.out.println("data de fabricação: ");
				Date dataFab = formatter.parse(sc.next());
				lista.add(new ProdutoUsado(nome,preco,dataFab));
			}
			if (opcao == 'i') {
				
				System.out.println("taxa: ");
				double taxas = sc.nextDouble();				
				lista.add(new ProdutoImportado(nome,preco,taxas));			
			}
		}
		System.out.println();
		System.out.println("Etiquetas: ");
		for (Produto prod : lista) {
			System.out.println(prod.etiquetaPreco());
		}
		
		
		sc.close();

	}

}
