package br.senai.rn.agenda.model;

import java.util.ArrayList;
import java.util.List;

public class Contato {

	private String nome;
	private List<Fone> fones;
	private List<Email> emails;
	
	public Contato() {
		this.fones = new ArrayList<Fone>();
		this.emails = new ArrayList<Email>();
	}

	public Contato(String nome, List<Fone> fones, List<Email> emails) {
		this.nome = nome;
		this.fones = fones;
		this.emails = emails;
	}
	
	public void adicionarFone(Fone fone) {
		fones.add(fone);
	}
	
	public void adicionarEmail(Email email) {
		emails.add(email);
	}
	
	public void removerFone(Fone fone) {
		fones.remove(fone);
	}
	
	public void removerEmail(Email email) {
		emails.remove(email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Fone> getFones() {
		return fones;
	}

	public void setFones(List<Fone> fones) {
		this.fones = fones;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", fones=" + fones + ", emails=" + emails + "]";
	}
	
}
