package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Principal {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do cliente");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Nascimento: ");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");		
		Date nasc = formatter.parse(sc.next());
		
		Cliente cli = new Cliente(nome, email, nasc);
		
		System.out.println("digite o status do pedido: ");
		System.out.println("status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cli);
		
		System.out.println("quantos items para esse pedido?");
		int n = sc.nextInt();
		for (int i = 1; i<=n;i++) {
			System.out.println("digite os dados do #"+i+" item: ");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomep =sc.nextLine();
			System.out.print("Valor do produto: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			System.out.println();
			
			Produto p = new Produto(nomep, preco);
			ItemPedido itemped = new ItemPedido(quantidade, preco, p);
			pedido.adicionarItem(itemped);
		}
		System.out.println();
		System.out.println(pedido);
		

	}

}
