package entities;



public class ProdutoImportado extends Produto {
	
	private double taxas;
	public ProdutoImportado(String nome, double preco, double taxas) {
		super(nome, preco);
		this.taxas = taxas;
	}
	

	public double getTaxas() {
		return taxas;
	}


	public void setTaxas(double taxas) {
		this.taxas = taxas;
	}


	public double precoTotal() {
		return getPreco()+ taxas;
	}
	@Override
	public String etiquetaPreco() {
		return getNome() 
						+ " R$ " 
						+ String.format("%.2f", precoTotal())
						+ " (Taxas: R$ " 
						+ String.format("%.2f", taxas)
						+ ")";
	}
}
