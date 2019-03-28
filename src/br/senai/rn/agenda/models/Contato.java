package br.senai.rn.agenda.models;

import java.util.ArrayList;
import java.util.List;

import br.senai.rn.agenda.daos.PersistDB;

public class Contato implements PersistDB {

	private Long id;
	private String nome;
	private List<Fone> fones;
	private List<Email> emails;
	
	public Contato() {
		this.fones = new ArrayList<Fone>();
		this.emails = new ArrayList<Email>();
	}

	public Contato(Long id, String nome, List<Fone> fones, List<Email> emails) {
		this.id = id;
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

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.trim().toUpperCase();
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", fones=" + fones + ", emails=" + emails + "]";
	}
	
}
