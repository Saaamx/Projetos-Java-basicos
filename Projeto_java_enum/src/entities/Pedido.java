package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private StatusPedido status;
	private List<ItemPedido> items = new ArrayList<>();
	private Cliente cliente;
	
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;	
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public void adicionarItem(ItemPedido item) {
		items.add(item);
	}
	public void removerItem(ItemPedido item) {
		items.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for (ItemPedido it: items) {
			soma+=it.subtotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Items pedidos:\n");
		for (ItemPedido item : items) {
			sb.append(item + "\n");
		}
		sb.append("Valor total: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	
	
	
}
