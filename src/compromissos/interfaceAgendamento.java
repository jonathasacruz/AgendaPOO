package compromissos;
import regras.TipoAgendamento;
import regras.TipoConsulta;

public interface interfaceAgendamento {
	
	public void adicionarDados (TipoAgendamento tipoAgendamento);
	public void consultarDados(TipoConsulta tipoConsulta);
	public void editar(int[] selecao);
	public void excluir(int[] selecao);
	
}
