package br.senai.rn.agenda.daos;

import java.io.Serializable;

public interface PersistDB extends Serializable {

	void setId(Long id);
	
	Long getId();
	
}
