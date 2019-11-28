package controladores;

import java.util.ArrayList;
import entidade.Contato;
import interfaces.InterfaceRepositorioContato;
import repositorio.RepositorioContatoList;

public class ControladorContato {
	
	private InterfaceRepositorioContato repositorioContato;

	public ControladorContato() {
		repositorioContato = RepositorioContatoList.getInstance();
	}

	public boolean existeContato(String nome) {

		ArrayList<Object> teste = null;
		teste = repositorioContato.consultarContato(nome);
		if (teste != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean inserirContato(Contato contato) {
		if (existeContato(contato.getNome()) == false) {
			return repositorioContato.inserirContato(contato);
		} else {
			return false;
		}

	}

	public boolean excluirContato(Contato contato) {
		if (existeContato(contato.getNome()) == false) {
			// contato não existe
			return false;
		} else {
			return repositorioContato.excluirContato(contato);
		}
	}

	public boolean alterarContato(Contato contato) {
		if (existeContato(contato.getNome()) == true){
			int index = repositorioContato.obterIndex(contato);
			repositorioContato.alterarContato(index, contato);
			return true;
		} else {
			return false;
		}
	} 	

	public ArrayList<Object> consultarContato(String nome) {
		return repositorioContato.consultarContato(nome);
	}

}

