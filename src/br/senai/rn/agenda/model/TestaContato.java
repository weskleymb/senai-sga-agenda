package br.senai.rn.agenda.model;

public class TestaContato {

	public static void main(String[] args) {
		
		Contato c1 = new Contato("ze", "3333", "ze@colmeia");
		Contato c2 = new Contato("ze", "2222", "sdfkjhsd@colmeia");
		
		String resultado = "";
		
		if (c1.equals(c2)) {
			resultado = "IGUAIS";
		} else {
			resultado = "DIFERENTES";
		}
		
		System.out.println(resultado);
		
	}

}
