package br.senai.rn.agenda.daos;

import java.util.List;

import br.senai.rn.agenda.models.Fone;

public interface PersistDB {

	void salvar();
	
	void excluir(Fone fone);
	
	void editar(Fone fone);
	
	Fone buscar();
	
	List<Fone> buscarTodos();
	
}
