package compromissos;
import classesAux.Calendario;
import classesAux.Endereco;
import classesAux.Contato;

public class Evento extends CompromissoGeral{
	Calendario dataHoraFim;
	Endereco local;
	Contato[] participantes;
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
	
}
