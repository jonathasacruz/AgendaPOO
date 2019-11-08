package entidade;

import enums.TipoPrioridade;

abstract class CompromissoGeral {
	Calendario dataHoraInicio;
	Calendario alarme;
	String assunto;
	Boolean alarmeAtivo;
	TipoPrioridade prioridade;
	public Calendario getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(Calendario dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public Calendario getAlarme() {
		return alarme;
	}
	public void setAlarme(Calendario alarme) {
		this.alarme = alarme;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public Boolean getAlarmeAtivo() {
		return alarmeAtivo;
	}
	public void setAlarmeAtivo(Boolean alarmeAtivo) {
		this.alarmeAtivo = alarmeAtivo;
	}
	public TipoPrioridade getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(TipoPrioridade prioridade) {
		this.prioridade = prioridade;
	}
	
	
}
