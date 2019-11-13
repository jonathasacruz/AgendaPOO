package interfaces;

import agenda.tipoConsulta;
import entidade.*;

public interface InterfaceRepositorio {
		public boolean inserirCompromisso(CompromissoGeral compromisso);
		public boolean excluirCompromisso(int id);
		public CompromissoGeral[] consultarReuniao(tipoConsulta tipoConsulta, String parametro);
		public boolean alterarReuniao(int id);
		
	}