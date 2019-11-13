package repositorio;
import java.util.ArrayList;
import java.util.List;

import agenda.tipoConsulta;
import entidade.*;
import interfaces.InterfaceRepositorio;


public class RepositorioReuniaoList implements InterfaceRepositorio{

	private List<Evento>eventos;
	private List<Lembrete>lembretes;
	private List<Reuniao>reunioes;
	
	private static RepositorioReuniaoList instance;

	private RepositorioReuniaoList() {
		super();
		this.eventos = new ArrayList<Evento>();
		this.lembretes = new ArrayList<Lembrete>();
		this.reunioes = new ArrayList<Reuniao>();
	}

	public static synchronized RepositorioReuniaoList getInstance() {
		if(instance == null) {
			instance = new RepositorioReuniaoList();

		}
		return instance;
	}


	@Override
	public boolean inserirCompromisso(CompromissoGeral compromisso) {
		System.out.println(compromisso.getClass().getName()==Evento.class.getName());
		return false;
	}

	@Override
	public boolean excluirCompromisso(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CompromissoGeral[] consultarReuniao(tipoConsulta tipoConsulta, String parametro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alterarReuniao(int id) {
		// TODO Auto-generated method stub
		return false;
	}



}
