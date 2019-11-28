package interfaces;


import java.util.ArrayList;

import entidade.*;

public interface InterfaceRepositorioContato {
		public boolean inserirContato(Contato contato);
		public boolean excluirContato(Contato contato);
		public ArrayList<Object> consultarContato(String nome);
		public int obterIndex(Contato contato);
		public boolean alterarContato(int index, Contato contato);
		
	}