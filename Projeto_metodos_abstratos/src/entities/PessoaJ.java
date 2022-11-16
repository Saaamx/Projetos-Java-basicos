package entities;

public class PessoaJ extends Pessoa {
	private int numFuncionarios;

	
	public PessoaJ(String nome, double renda, int numFuncionarios) {
		super(nome, renda);
		this.numFuncionarios = numFuncionarios;
	}


	public int getNumFuncionarios() {
		return numFuncionarios;
	}


	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}


	@Override
	public double impostoArrecadado() {
		
		if (numFuncionarios > 10) {
			return getRenda() *0.14;
		}
		else {
			return getRenda() *0.16;
		}
		
	}
	
	
	
}
