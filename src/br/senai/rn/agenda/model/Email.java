package br.senai.rn.agenda.model;

import br.senai.rn.agenda.model.enums.TipoEmail;

public class Email {

	private String email;
	private TipoEmail tipoEmail;
	
	public Email() {}
	
	public Email(String email, TipoEmail tipoEmail) {
		this.email = email;
		this.tipoEmail = tipoEmail;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoEmail getTipoEmail() {
		return tipoEmail;
	}

	public void setTipoEmail(TipoEmail tipoEmail) {
		this.tipoEmail = tipoEmail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		Email other = (Email) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + ", tipoEmail=" + tipoEmail + "]";
	}
	
}
