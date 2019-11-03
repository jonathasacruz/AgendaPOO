package agendaMain;
import compromissos.interfaceAgendamento;
import regras.TipoAgendamento;
import regras.TipoConsulta;

public class agendamento implements interfaceAgendamento {
	String msg;
	@Override
	public void adicionarDados(TipoAgendamento tipoAgendamento) {
		switch (tipoAgendamento) {
		case EVENTO:
			
			break;

		case LEMBRENTE:

			break;

		case REUNIAO:

			break;


		default:
			break;
		}
		
	}

	@Override
	public void consultarDados(TipoConsulta tipoConsulta) {
		// implementar métodos para consultar
		
	}

	@Override
	public void editar(int[] selecao) {
		// implementar métodos para editar
	}

	@Override
	public void excluir(int[] selecao) {
		// implementar métodos para excluir
		
	}

}
