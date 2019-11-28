package controladores;

import java.util.ArrayList;

import entidade.CompromissoGeral;
import enums.TipoConsulta;
import interfaces.InterfaceRepositorio;
import repositorio.RepositorioLembreteList;

public class ControladorLembrete {

	private InterfaceRepositorio repositorioLembrete;

	public ControladorLembrete() {
		repositorioLembrete = RepositorioLembreteList.getInstance();
	}

	public boolean existeLembrete(CompromissoGeral compromisso) {

		ArrayList<Object> teste = null;
		teste = repositorioLembrete.consultarCompromisso(TipoConsulta.DESCRICAO, "parametro");
		if (teste != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean inserirLembrete(CompromissoGeral compromisso) {
		if (existeLembrete(compromisso) == false) {
			return repositorioLembrete.inserirCompromisso(compromisso);
			
		} else {
			return false;
		}

	}

	public boolean excluirLembrete(CompromissoGeral compromisso) {
		if (existeLembrete(compromisso) == false) {
			// lembrete não existe
			return false;
		} else {
			return repositorioLembrete.excluirCompromisso(compromisso);

		}
	}

	public boolean alterarLembrete(CompromissoGeral compromisso) {
		if (existeLembrete(compromisso) == true) {
			int index = repositorioLembrete.obterIndex(compromisso);
			repositorioLembrete.alterarCompromisso(index, compromisso);
			return true;
		} else {
			return false;
		}
	} 	

	public ArrayList<Object> consultarLembrete(TipoConsulta tipoConsulta, String parametro) {
		return repositorioLembrete.consultarCompromisso(tipoConsulta, parametro);
	}

}
