
public interface interfaceAgendamento {
	
	public void adicionarDados( String dados[], tipoAgendamento TipoAgendamento);
	public void consultarDados( String dados[], tipoConsulta TipoConsulta);
	public void editar(int selecao[]);
	public void excluir (int selecao[]);

}
