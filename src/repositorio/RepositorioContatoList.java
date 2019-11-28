package repositorio;

import java.util.ArrayList;
import entidade.*;
import interfaces.InterfaceRepositorioContato;


public class RepositorioContatoList implements InterfaceRepositorioContato {

	private ArrayList<Contato> contatos;
	private ArrayList<Object> temp;
	private static RepositorioContatoList instance;

	private RepositorioContatoList() {
		super();
		this.contatos = new ArrayList<Contato>();
		this.temp = new ArrayList<Object>();

	}

	public static RepositorioContatoList getInstance() {
		if (instance == null) {
			synchronized (RepositorioContatoList.class) {
				if (instance == null) {
					instance = new RepositorioContatoList();

				}
			}
		}
		return instance;
	}
	
	/*
	   public static synchronized RepositorioContatoList getInstance() {
		if (instance == null) {
			instance = new RepositorioContatoList();
		}
		return instance;
	}
	*/

	@Override
	public boolean inserirContato(Contato contato) {
		this.contatos.add(contato);
		return true;

	}

	@Override
	public boolean excluirContato(Contato contato) {
		this.contatos.remove(contato);
		return true;
	}

	@Override
	public ArrayList<Object> consultarContato(String nome) {

			this.temp.clear();
			for (Contato contato : contatos) {
				if (contato.getNome().toString().contains(nome)) {
					this.temp.add(contato);
				}
			}
			return temp;
	}

	@Override
	public int obterIndex(Contato contato) {
		return this.contatos.indexOf(contato);
	}
	@Override
	public boolean alterarContato(int index, Contato contato) {
		this.contatos.remove(index);
		this.contatos.add(index, (Contato) contato);
		return this.contatos.contains(contato);
	}
}
