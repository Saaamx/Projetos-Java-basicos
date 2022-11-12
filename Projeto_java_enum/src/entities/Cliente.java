package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
	private String nome;
	private String email;
	private Date nasc;
	
	
	public Cliente(String nome, String email, Date nasc) {
		this.nome = nome;
		this.email = email;
		this.nasc = nasc;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNasc() {
		return nasc;
	}
	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}
	@Override
	public String toString() {
		return nome + "("+ sdf.format(nasc) +") - "+ email;
	}
}
