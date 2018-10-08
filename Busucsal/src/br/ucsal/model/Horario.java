package br.ucsal.model;

import java.sql.Time;

public class Horario {
	private Time horario;

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Horario [horario=" + horario + "]";
	}
	
}
