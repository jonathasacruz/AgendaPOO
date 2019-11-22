package agenda;

import enums.TipoAgendamento;
import enums.TipoConsulta;

public interface interfaceAgendamento {
	
	public void adicionarDados( String dados[], TipoAgendamento TipoAgendamento);
	public void consultarDados( String dados[], TipoConsulta TipoConsulta);
	public void editar(int selecao[]);
	public void excluir (int selecao[]);

}
