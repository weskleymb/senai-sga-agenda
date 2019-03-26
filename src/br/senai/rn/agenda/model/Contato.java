package br.senai.rn.agenda.model;

public class Contato {

	private String nome;
	private String fone;
	private String email;
	
	public Contato() {}

	public Contato(String nome, String fone, String email) {
		this.setNome(nome);
		this.setFone(fone);
		this.setEmail(email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase().trim();
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone.trim();
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email.toLowerCase().trim();
	}
	
	@Override
	public boolean equals(Object obj) {
		Contato contato = (Contato) obj;
		return this.nome.equals(contato.nome);
	}

	@Override
	public String toString() {
		return "Contato{nome=" + nome + ", fone=" + fone + ", email=" + email + "}";
	}
	
}
