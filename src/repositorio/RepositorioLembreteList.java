package repositorio;

import java.util.ArrayList;
import entidade.CompromissoGeral;
import entidade.Lembrete;
import enums.TipoConsulta;
import interfaces.InterfaceRepositorio;

public class RepositorioLembreteList implements InterfaceRepositorio {

	private ArrayList<Lembrete> lembretes;
	private ArrayList<Object> temp;
	private static RepositorioLembreteList instance;

	private RepositorioLembreteList() {
		super();
		this.lembretes = new ArrayList<Lembrete>();
		this.temp = new ArrayList<Object>();

	}
	
	public static RepositorioLembreteList getInstance() {
		if (instance == null) {
			synchronized (RepositorioLembreteList.class) {
				if (instance == null) {
					instance = new RepositorioLembreteList();

				}
			}
		}
		return instance;
	}

	/*public static synchronized RepositorioLembreteList getInstance() {
		if (instance == null) {
			instance = new RepositorioLembreteList();
		}
		return instance;
	}
	*/

	@Override
	public boolean inserirCompromisso(CompromissoGeral compromisso) {
		this.lembretes.add((Lembrete) compromisso);
		return true;

	}

	@Override
	public boolean excluirCompromisso(CompromissoGeral compromisso) {
		this.lembretes.remove((Lembrete) compromisso);
		return true;
	}

	@Override
	public ArrayList<Object> consultarCompromisso(TipoConsulta tipoConsulta, String parametro) {

		switch (tipoConsulta) {
		case DATA:
			this.temp.clear();
			for (Lembrete lembrete : lembretes) {
				if (lembrete.getDataHoraInicio().toString().contains(parametro)) {
					this.temp.add(lembrete);

				}
			}
			return temp;
		case DESCRICAO:
			this.temp.clear();
			for (Lembrete lembrete : lembretes) {
				if (lembrete.getAssunto().toString().contains(parametro)) {
					this.temp.add(lembrete);
				}
			}
			return temp;
		case PRIORIDADE:
			this.temp.clear();
			for (Lembrete lembrete : lembretes) {
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
		return this.lembretes.indexOf(compromisso);
	}

	@Override
	public boolean alterarCompromisso(int index, CompromissoGeral compromisso) {
		this.lembretes.remove(index);
		this.lembretes.add(index, (Lembrete) compromisso);
		return this.lembretes.contains(compromisso);
	}
}