package repositorio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import agenda.tipoConsulta;
import entidade.*;
import interfaces.InterfaceRepositorio;


public class RepositorioReuniaoList implements InterfaceRepositorio{

	private List<Evento>eventos;
	private List<Lembrete>lembretes;
	private List<Reuniao>reunioes;
	private List<CompromissoGeral>temp;

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
		if (compromisso.getClass().getName()==Evento.class.getName()) {
			return this.eventos.add((Evento) compromisso);


		}else if (compromisso.getClass().getName()==Lembrete.class.getName()) {
			return this.lembretes.add((Lembrete) compromisso);

		}else {
			return this.reunioes.add((Reuniao) compromisso);
		}

	}

	@Override
	public boolean excluirCompromisso(int id) {

		return false;
	}

	@Override
	public CompromissoGeral[] consultarReuniao(tipoConsulta tipoConsulta, String parametro) {
		this.temp = new ArrayList<CompromissoGeral>();
		CompromissoGeral[] retorno;

		if (tipoConsulta == agenda.tipoConsulta.DESCRICAO) {
			for (Evento evento : eventos) {
				if (evento.getAssunto().contains(parametro)) {
					temp.add(evento);
				}
			}
			for (Lembrete lembrete : lembretes) {
				if (lembrete.getAssunto().contains(parametro)) {
					temp.add(lembrete);
				}
			}
			for (Reuniao reuniao: reunioes) {
				if (reuniao.getAssunto().contains(parametro)) {
					temp.add(reuniao);
				}
			}

		}

		if (temp.isEmpty()) {
			return null;	
		}else {
			retorno = new CompromissoGeral[temp.size()];
			for (int i = 0; i < temp.size(); i++) {
				retorno[i] = temp.get(i);
				
			}
			return retorno;
			
		}

	}






	@Override
	public boolean alterarReuniao(int id) {
		// TODO Auto-generated method stub
		return false;
	}



}
