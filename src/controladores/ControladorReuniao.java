package controladores;

import java.util.ArrayList;

import entidade.CompromissoGeral;
import enums.TipoConsulta;
import interfaces.InterfaceRepositorio;
import repositorio.RepositorioReuniaoList;

public class ControladorReuniao {

	private InterfaceRepositorio repositorioReuniao;

	public ControladorReuniao() {
		repositorioReuniao = RepositorioReuniaoList.getInstance();
	}

	public boolean existeReuniao(CompromissoGeral compromisso) {

		ArrayList<Object> teste = null;
		teste = repositorioReuniao.consultarCompromisso(TipoConsulta.DATA, "parametro");
		if (teste != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean inserirReuniao(CompromissoGeral compromisso) {
		if (existeReuniao(compromisso) == false) {
			return repositorioReuniao.inserirCompromisso(compromisso);
			
		} else {
			return false;
		}

	}

	public boolean excluirReuniao(CompromissoGeral compromisso) {
		if (existeReuniao(compromisso) == false) {
			// reunião não existe
			return false;
		} else {
			return repositorioReuniao.excluirCompromisso(compromisso);

		}
	}

	public boolean alterarReuniao(CompromissoGeral compromisso) {
		if (existeReuniao(compromisso) == true) {
			int index = repositorioReuniao.obterIndex(compromisso);
			repositorioReuniao.alterarCompromisso(index, compromisso);
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Object> consultarReuniao(TipoConsulta tipoConsulta, String parametro) {
		return repositorioReuniao.consultarCompromisso(tipoConsulta, parametro);
	}

}
