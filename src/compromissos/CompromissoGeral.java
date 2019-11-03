package compromissos;

import classesAux.Calendario;
import regras.TipoPrioridade;

public abstract class CompromissoGeral {
	Calendario dataHoraInicio;
	Calendario alarme;
	String assunto;
	Boolean alarmeAtivo;
	TipoPrioridade prioridade;
	
}
