package entidade;

import java.util.List;

public class Evento extends CompromissoGeral{
	private Calendario dataHoraFim;
	private Endereco local;
	private List<Contato> participantes;
	
	public String getDataHoraFim() {
		return dataHoraFim.getDataHora();
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
		return (Contato[])participantes.toArray();
	}
	public void setParticipantes(Contato participantes) {
		this.participantes.add(participantes);
	}


	public Evento() {
		super();
		this.dataHoraFim = new Calendario();
		this.local = new Endereco();
		this.participantes = null;
	}
}
