package interfaces;


import enums.TipoConsulta;
import entidade.*;

public interface InterfaceRepositorio {
		public boolean inserirCompromisso(CompromissoGeral compromisso);
		public boolean excluirCompromisso(CompromissoGeral compromisso);
		public CompromissoGeral[] consultarCompromisso(TipoConsulta tipoConsulta, String parametro);
		public boolean alterarCompromisso(CompromissoGeral compromisso);
		
	}