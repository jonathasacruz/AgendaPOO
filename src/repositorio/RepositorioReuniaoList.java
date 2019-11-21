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
	public boolean inserirCompromisso(CompromissoGeral compromisso) { //Esses testes tem que sair daqui e ir para o controlador(?)
		if (compromisso.getClass().getName()==Evento.class.getName()) {
			return this.eventos.add((Evento) compromisso);
		}else if (compromisso.getClass().getName()==Lembrete.class.getName()) {
			return this.lembretes.add((Lembrete) compromisso);
		}else if (compromisso.getClass().getName()==Reuniao.class.getName()) {
			return this.reunioes.add((Reuniao) compromisso);
		}else {
			return false;
		}

	}

	@Override
	public boolean excluirCompromisso(CompromissoGeral compromisso) {
		if (compromisso.getClass().getName()==Evento.class.getName()) {
			return this.eventos.remove((Evento) compromisso);

		}else if (compromisso.getClass().getName()==Lembrete.class.getName()) {
			return this.lembretes.remove((Lembrete) compromisso);

		}else if (compromisso.getClass().getName()==Reuniao.class.getName()) {
			return this.reunioes.remove((Reuniao) compromisso);
		}else {
			return false;
		}
	}

	@Override
	public CompromissoGeral[] consultarReuniao(tipoConsulta tipoConsulta, String parametro) {
		this.temp = new ArrayList<CompromissoGeral>();

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

		}else if(tipoConsulta == agenda.tipoConsulta.DATA) {
			for (Evento evento : eventos) {
				if (evento.getDataHoraInicio().toString().contains(parametro)) {
					temp.add(evento);
				}
			}
			for (Lembrete lembrete : lembretes) {
				if (lembrete.getDataHoraInicio().toString().contains(parametro)) {
					temp.add(lembrete);
				}
			}
			for (Reuniao reuniao: reunioes) {
				if (reuniao.getDataHoraInicio().toString().contains(parametro)) {
					temp.add(reuniao);
				}
			}

		}else if(tipoConsulta == agenda.tipoConsulta.PRIORIDADE) {
			for (Evento evento : eventos) {
				if (evento.getPrioridade().toString().contains(parametro.toUpperCase())) {
					temp.add(evento);
				}
			}
			for (Lembrete lembrete : lembretes) {
				if (lembrete.getPrioridade().toString().contains(parametro.toUpperCase())) {
					temp.add(lembrete);
				}
			}
			for (Reuniao reuniao : reunioes) {
				if (reuniao.getPrioridade().toString().contains(parametro.toUpperCase())) {
					temp.add(reuniao);
				}
			}
		}
		if (temp.isEmpty()) {
			return null;
		}else return (CompromissoGeral[]) temp.toArray();


	}

	@Override
	public boolean alterarReuniao(CompromissoGeral compromisso) {
		return false;
	}