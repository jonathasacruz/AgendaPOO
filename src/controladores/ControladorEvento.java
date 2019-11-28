package controladores;

import repositorio.RepositorioEventoList;

import java.util.ArrayList;

import entidade.*;
import enums.TipoConsulta;
import interfaces.InterfaceRepositorio;

public class ControladorEvento {

	private InterfaceRepositorio repositorioEvento;

	public ControladorEvento() {
		repositorioEvento = RepositorioEventoList.getInstance();
	}

	public boolean existeEvento(CompromissoGeral compromisso) {

		ArrayList<Object> teste = null;
		teste = repositorioEvento.consultarCompromisso(TipoConsulta.DATA, "parametro");
		if (teste != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean inserirEvento(CompromissoGeral compromisso) {
		if (existeEvento(compromisso) == false) {
			return repositorioEvento.inserirCompromisso(compromisso);
			
		} else {
			return false;
		}

	}

	public boolean excluirEvento(CompromissoGeral compromisso) {
		if (existeEvento(compromisso) == false) {
			// Evento não existe
			return false;
		} else {
			return repositorioEvento.excluirCompromisso(compromisso);

		}
	}

	public boolean alterarEvento(CompromissoGeral compromisso) {
		if (existeEvento(compromisso) == true) {
			int index = repositorioEvento.obterIndex(compromisso);
			repositorioEvento.alterarCompromisso(index, compromisso);
			return true;
			
		} else {
			return false;
		}
	}

	public ArrayList<Object> consultarEvento(TipoConsulta tipoConsulta, String parametro) {
		return repositorioEvento.consultarCompromisso(tipoConsulta, parametro);
	}

}
