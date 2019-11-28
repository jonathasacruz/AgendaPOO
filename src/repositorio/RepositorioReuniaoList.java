package repositorio;
import java.util.ArrayList;


import entidade.CompromissoGeral;
import entidade.Reuniao;
import enums.TipoConsulta;
import interfaces.InterfaceRepositorio;


public class RepositorioReuniaoList implements InterfaceRepositorio {

	private ArrayList<Reuniao> reunioes;
	private ArrayList<Object> temp;
	private static RepositorioReuniaoList instance;

	private RepositorioReuniaoList() {
		super();
		this.reunioes = new ArrayList<Reuniao>();
		this.temp = new ArrayList<Object>();

	}

	public static synchronized RepositorioReuniaoList getInstance() {
		if (instance == null) {
			instance = new RepositorioReuniaoList();
		}
		return instance;
	}

	@Override
	public boolean inserirCompromisso(CompromissoGeral compromisso) {
		return this.reunioes.add((Reuniao) compromisso);

	}

	@Override
	public boolean excluirCompromisso(CompromissoGeral compromisso) {
		return this.reunioes.remove((Reuniao)compromisso);
	}

	@Override
	public ArrayList<Object> consultarCompromisso(TipoConsulta tipoConsulta, String parametro) {

		switch (tipoConsulta) {
		case DATA:
			this.temp.clear();
			for (Reuniao lembrete : reunioes) {
				if (lembrete.getDataHoraInicio().toString().contains(parametro)) {
					this.temp.add(lembrete);
				}
			}
			return temp;
		case DESCRICAO:
			this.temp.clear();
			for (Reuniao lembrete : reunioes) {
				if (lembrete.getAssunto().toString().contains(parametro)) {
					this.temp.add(lembrete);
				}
			}
			return temp;
		case PRIORIDADE:
			this.temp.clear();
			for (Reuniao lembrete : reunioes) {
				if (lembrete.getPrioridade().toString().contains(parametro)) {
					this.temp.add(lembrete);
				}
			}
			return temp;

		default:
			return temp;
		}
	}

	@Override
	public int obterIndex(CompromissoGeral compromisso) {
		return this.reunioes.indexOf(compromisso); 
	}
	@Override
	public boolean alterarCompromisso(int index, CompromissoGeral compromisso) {
		this.reunioes.remove(index);
		this.reunioes.add(index, (Reuniao) compromisso);
		return this.reunioes.contains(compromisso);
	}
}