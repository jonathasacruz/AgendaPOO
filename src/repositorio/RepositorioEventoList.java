package repositorio;
import java.util.ArrayList;
import java.util.List;

import entidade.CompromissoGeral;
import entidade.Evento;
import entidade.Lembrete;
import entidade.Reuniao;
import enums.TipoAgendamento;
import enums.TipoConsulta;
import enums.TipoPrioridade;
import interfaces.InterfaceRepositorio;


public class RepositorioEventoList implements InterfaceRepositorio {

	private List<Evento> eventos;
	private List<Evento> temp;

	private static RepositorioEventoList instance;

	private RepositorioEventoList() {
		super();
		this.eventos = new ArrayList<Evento>();
		this.temp = new ArrayList<Evento>();
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
	public CompromissoGeral[] consultarCompromisso(TipoConsulta tipoConsulta, String parametro) {
						
		switch (tipoConsulta) {
			case DATA:
				this.temp.clear();
				for (Evento evento : eventos) {
					if (evento.getDataHoraInicio().toString().contains(parametro)) {
						this.temp.add(evento);
					}
				}

				break;

			default:
				break;
			return null;
				}
	}

	@Override
	public boolean alterarCompromisso(CompromissoGeral compromisso) {
		// TODO Auto-generated method stub
		return false;
	}

















	/*
	@Override
	public boolean inserirCompromisso(TipoAgendamento tipoCompromisso, CompromissoGeral compromisso) {
		//Esses testes tem que sair daqui e ir para o controlador(?)
		if (compromisso.getClass().getName() == Evento.class.getName()) {
			return this.eventos.add((Evento) compromisso);
		} else if (compromisso.getClass().getName() == Lembrete.class.getName()) {
			return this.lembretes.add((Lembrete) compromisso);
		} else if (compromisso.getClass().getName() == Reuniao.class.getName()) {
			return this.reunioes.add((Reuniao) compromisso);
		} else {
			return false;
		}

	}

	@Override
	public boolean excluirCompromisso(TipoAgendamento tipoAgendamento, CompromissoGeral compromisso) {
		if (compromisso.getClass().getName() == Evento.class.getName()) {
			return this.eventos.remove((Evento) compromisso);

		} else if (compromisso.getClass().getName() == Lembrete.class.getName()) {
			return this.lembretes.remove((Lembrete) compromisso);

		} else if (compromisso.getClass().getName() == Reuniao.class.getName()) {
			return this.reunioes.remove((Reuniao) compromisso);
		} else {
			return false;
		}
	}

	@Override
	public CompromissoGeral[] consultarCompromisso(TipoConsulta tipoConsulta, String parametro) {
		this.temp.clear();

		switch (tipoConsulta) {
			case DATA:
				for (Evento evento : eventos) {
					if (evento.getDataHoraInicio().toString().contains(parametro)) {
						this.temp.add(evento);
					}
				}
				for (Lembrete lembrete : lembretes) {
					if (lembrete.getDataHoraInicio().toString().contains(parametro)) {
						this.temp.add(lembrete);
					}
				}
				for (Reuniao reuniao : reunioes) {
					if (reuniao.getDataHoraInicio().toString().contains(parametro)) {
						this.temp.add(reuniao);
					}
				}

			case PRIORIDADE:
				for (Evento evento : eventos) {
					if (evento.getPrioridade().toString().contains(parametro.toUpperCase())) {
						this.temp.add(evento);
					}
				}
				for (Lembrete lembrete : lembretes) {
					if (lembrete.getPrioridade().toString().contains(parametro.toUpperCase())) {
						this.temp.add(lembrete);
					}
				}
				for (Reuniao reuniao : reunioes) {
					if (reuniao.getPrioridade().toString().contains(parametro.toUpperCase())) {
						this.temp.add(reuniao);
					}
				}
				break;
			case DESCRICAO:
				for (Evento evento : eventos) {
					if (evento.getAssunto().contains(parametro)) {
						this.temp.add(evento);
					}
				}
				for (Lembrete lembrete : lembretes) {
					if (lembrete.getAssunto().contains(parametro)) {
						this.temp.add(lembrete);
					}
				}
				for (Reuniao reuniao : reunioes) {
					if (reuniao.getAssunto().contains(parametro)) {
						this.temp.add(reuniao);
					}
				}
				break;

			default:
				return null;
		}

		if (this.temp.isEmpty()){
			return null;
		}else {
			return (CompromissoGeral[]) this.temp.toArray();
		}

	}
	@Override
	public boolean alterarCompromisso(TipoAgendamento tipoAgendamento, CompromissoGeral compromisso, int id) {
		switch (tipoAgendamento) {
			case REUNIAO:
				this.reunioes.add(id, (Reuniao) compromisso);
				return this.reunioes.contains(compromisso);

				break;
			case LEMBRENTE:
				this.lembretes.add(id, (Lembrete) compromisso);
				return this.lembretes.contains(compromisso);

				break;
			case EVENTO:
				this.eventos.add(id, (Evento) compromisso);
				return this.eventos.contains(compromisso);

				break;

			default:
				throw new IllegalStateException("Unexpected value: " + tipoAgendamento);
		}

		return false;
	}*/
}