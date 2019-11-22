package interfaces;

import enums.TipoAgendamento;
import enums.TipoConsulta;
import entidade.*;

public interface InterfaceRepositorio {
		public boolean inserirCompromisso(TipoAgendamento tipoAgendamento, CompromissoGeral compromisso);
		public boolean excluirCompromisso(TipoAgendamento tipoAgendamento, CompromissoGeral compromisso);
		public CompromissoGeral[] consultarReuniao(TipoConsulta tipoConsulta, String parametro);
		public boolean alterarReuniao(TipoAgendamento tipoAgendamento, CompromissoGeral compromisso, int id);
		
	}