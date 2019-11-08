package entidade;

public class Reuniao extends CompromissoGeral {
	Calendario dataHoraFim;
	Endereco local;
	//Contato[] participantesObrigatorios;
	Contato[] participantes;
	Contato coordenador;
	public Calendario getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(Calendario dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	public Endereco getLocal() {
		return local;
	}
	public void setLocal(Endereco local) {
		this.local = local;
	}
	public Contato[] getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Contato[] participantes) {
		this.participantes = participantes;
	}
	public Contato getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(Contato coordenador) {
		this.coordenador = coordenador;
	}
	
	
}
