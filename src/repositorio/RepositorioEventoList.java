package repositorio;
import java.util.ArrayList;


import entidade.CompromissoGeral;
import entidade.Evento;
import enums.TipoConsulta;
import interfaces.InterfaceRepositorio;


public class RepositorioEventoList implements InterfaceRepositorio {

	private ArrayList<Evento> eventos;
	private ArrayList<Object> temp;
	private static RepositorioEventoList instance;

	private RepositorioEventoList() {
		super();
		this.eventos = new ArrayList<Evento>();
		this.temp = new ArrayList<Object>();

	}

	public static synchronized RepositorioEventoList getInstance() {
		if (instance == null) {
			instance = new RepositorioEventoList();
		}
		return instance;
	}

	@Override
	public boolean inserirCompromisso(CompromissoGeral compromisso) {
		return this.eventos.add((Evento) compromisso);

	}

	@Override
	public boolean excluirCompromisso(CompromissoGeral compromisso) {
		return this.eventos.remove((Evento)compromisso);
	}

	@Override
	public ArrayList<Object> consultarCompromisso(TipoConsulta tipoConsulta, String parametro) {

		switch (tipoConsulta) {
		case DATA:
			this.temp.clear();
			for (Evento evento : eventos) {
				if (evento.getDataHoraInicio().toString().contains(parametro)) {
					this.temp.add(evento);
				}
			}
			return temp;
		case DESCRICAO:
			this.temp.clear();
			for (Evento evento : eventos) {
				if (evento.getAssunto().toString().contains(parametro)) {
					this.temp.add(evento);
				}
			}
			return temp;
		case PRIORIDADE:
			this.temp.clear();
			for (Evento evento : eventos) {
				if (evento.getPrioridade().toString().contains(parametro)) {
					this.temp.add(evento);
				}
			}
			return temp;

		default:
			return temp;
		}
	}

	@Override
	public int obterIndex(CompromissoGeral compromisso) {
		return this.eventos.indexOf(compromisso); 
	}
	@Override
	public boolean alterarCompromisso(int index, CompromissoGeral compromisso) {
		this.eventos.remove(index);
		this.eventos.add(index, (Evento) compromisso);
		return this.eventos.contains(compromisso);
	}
}
