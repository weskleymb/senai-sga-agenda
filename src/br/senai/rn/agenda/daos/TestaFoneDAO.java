package br.senai.rn.agenda.daos;

import br.senai.rn.agenda.models.Fone;
import br.senai.rn.agenda.models.enums.TipoFone;

public class TestaFoneDAO {

	public static void main(String[] args) {

		FoneDAO dao = new FoneDAO();
		
		Fone f1 = new Fone();
		f1.setFone("2222-3333");
		f1.setTipoFone(TipoFone.FIXO);
		
		dao.salvar(f1);
		
		Fone f2 = new Fone();
		f2.setFone("98888-2222");
		f2.setTipoFone(TipoFone.CELULAR);
		
		dao.salvar(f2);
		
		System.out.println(dao.buscarPorFone("98888-2222"));
	
	}

}
