package br.senai.rn.agenda.daos;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericDAO<T extends PersistDB> {

	private List<T> ts = new ArrayList<T>();
	
	@SuppressWarnings("deprecation")
	public Boolean salvar(T t) {
		if (!ts.contains(t)) {
			t.setId(new Long(ts.size()));
			ts.add(t);
			return true;
		}
		return false;
	}
	
	public Boolean excluir(T t) {
		if (ts.contains(t)) {
			ts.remove(t);
			return true;
		}
		return false;
	}
	
	public T buscarPorId(Long id) {
		for (T t : ts) {
			if (t.getId().equals(id)) {
				return t;
			}
		}
		return null;
	}
	
	public List<T> buscarTodos() {
		return ts;
	}
	
}
