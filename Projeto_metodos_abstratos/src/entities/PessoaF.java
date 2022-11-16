package entities;

public class PessoaF extends Pessoa {
	private double gastoSaude;

	public PessoaF(String nome, double renda, double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double impostoArrecadado() {
		if(getRenda()<20000.0) {
			return getRenda() * 0.15 - gastoSaude * 0.5;
		}
		else {
			return getRenda() * 0.25 - gastoSaude * 0.5;
		}
		
		
	}
	
	
}
