package interfaces;
import enums.TipoConsulta;
import java.util.ArrayList;

import entidade.*;

public interface InterfaceRepositorio {
		public boolean inserirCompromisso(CompromissoGeral compromisso);
		public boolean excluirCompromisso(CompromissoGeral compromisso);
		public ArrayList<Object> consultarCompromisso(TipoConsulta tipoConsulta, String parametro);
		public int obterIndex(CompromissoGeral compromisso);
		public boolean alterarCompromisso(int index, CompromissoGeral compromisso);
		
	}