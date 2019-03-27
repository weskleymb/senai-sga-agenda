package br.senai.rn.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.senai.rn.agenda.model.Fone;

public class FoneDAO {

	private static List<Fone> fones = new ArrayList<Fone>();

	public void salvar(Fone fone) {
		if (!fones.contains(fone)) {
			fones.add(fone);			
		}
	}

	public void editar(Fone foneAtual, Fone foneNovo) {
		if (fones.contains(foneAtual)) {
			fones.set(fones.indexOf(foneAtual), foneNovo);			
		}
	}

	public void excluir(Fone fone) {
		if (fones.contains(fone)) {
			fones.remove(fone);
		}
	}

	public Fone buscar(String fone) {
		return fones.get(fones.indexOf(new Fone(fone, null)));
	}

	public List<Fone> buscarTodos() {
		return fones;
	}
	
}
