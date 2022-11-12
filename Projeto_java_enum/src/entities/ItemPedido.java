package entities;

public class ItemPedido {

	private int quantidade;
	private double preco;
	
	private Produto produto;
	
	
	public ItemPedido(int quantidade, double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double subtotal() {		
		return quantidade * preco;	
	}

	@Override
	public String toString() {
			return getProduto().getnomep()
					+ ", R$"
					+ String.format("%.2f", preco)
					+ ", Quantidade: "
					+ quantidade
					+ ", Subtotal: R$"
					+ String.format("%.2f", subtotal());
		
	}
}
