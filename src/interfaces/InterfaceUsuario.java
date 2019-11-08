package interfaces;

import application.Mensagem;

public interface InterfaceUsuario {
	
	public int ConstruirMenu (String opcoesMenu[]);
	
	public int ConstruirMenuAgendamento (String opcoesMenuAgendamento[]);
	public void ConstruirMenuConsulta (String opcoesMenuConsulta[]);
	public void ConstruirMenuListar (String opcoesMenuListar[]);
	public void ConstruirMenuCancelar (String opcoesMenuCancelar[]);
	public void exibirMensagem(String msg, Mensagem mensagem);
	public String EntradaDeDados();

}
