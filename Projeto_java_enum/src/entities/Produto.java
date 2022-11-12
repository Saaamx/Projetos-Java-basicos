package entities;

public class Produto {
	private String nomep;
	private double preco;
	
	public Produto(String nomep, double preco) {
		this.nomep = nomep;
		this.preco = preco;
		
	}

	public String getnomep() {
		return nomep;
	}

	public void setnomep(String nomep) {
		this.nomep = nomep;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
