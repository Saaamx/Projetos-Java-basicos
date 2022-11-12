package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataFab;

	public ProdutoUsado(String nome, double preco, Date dataFab) {
		super(nome, preco);
		this.dataFab= dataFab;
	}
	
	public Date getDataFab() {
		return dataFab;
	}

	public void setDataFab(Date dataFab) {
		this.dataFab = dataFab;
	}

	@Override
	public String etiquetaPreco() {
		return getNome() 
						+"(usado)" 
						+"R$"
						+String.format("%.2f", getPreco())
						+ "(data de fabricacao)" 
						+sdf.format(dataFab);
	}
	
	
	
	
	
}
