package br.senai.rn.agenda.models;

import br.senai.rn.agenda.models.enums.TipoFone;

public class Fone {

	private String fone;
	private TipoFone tipoFone;
	
	public Fone() {}
	
	public Fone(String fone, TipoFone tipoFone) {
		this.fone = fone;
		this.tipoFone = tipoFone;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public TipoFone getTipoFone() {
		return tipoFone;
	}

	public void setTipoFone(TipoFone tipoFone) {
		this.tipoFone = tipoFone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fone == null) ? 0 : fone.hashCode());
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
		Fone other = (Fone) obj;
		if (fone == null) {
			if (other.fone != null)
				return false;
		} else if (!fone.equals(other.fone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fone [fone=" + fone + ", tipoFone=" + tipoFone + "]";
	}
	
}
