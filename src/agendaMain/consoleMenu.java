package agendaMain;

public class consoleMenu implements InterfaceUsuario {

	@Override
	public void ConstruirMenu(String[] opcoesMenu) {
		
			for (int i=0;i<opcoesMenu.length;i++) {
				System.out.println(opcoesMenu[i]);
				
		}
		
	}

	// N�O SEI SE PRECISA DE UM M�TODO PARA CADA MENU
	
	/*
	@Override
	public void ConstruirMenuPrincipal(String[] opcoesMenuPrincipal) {
		for (int i = 0; i < opcoesMenuPrincipal.length; i++) {
			System.out.println(opcoesMenuPrincipal[i]);

		}
	}

	@Override
	public void exibirMensagem(String msg, Mensagem mensagem) {
		if (mensagem == Mensagem.AVISO) {
			System.out.println("ATEN��O");
		} else if (mensagem == Mensagem.ERRO) {
			System.out.println("ERRO");
		}

		System.out.println(msg);

	}

	@Override
	public void ConstruirMenuAgendamento(String[] opcoesMenuAgendamento) {
		for (int i = 0; i < opcoesMenuAgendamento.length; i++) {
			System.out.println(opcoesMenuAgendamento[i]);

		}

	}

	@Override
	public void ConstruirMenuConsulta(String[] opcoesMenuConsulta) {
		for (int i = 0; i < opcoesMenuConsulta.length; i++) {
			System.out.println(opcoesMenuConsulta[i]);

		}

	}

	@Override
	public void ConstruirMenuListar(String[] opcoesMenuListar) {
		for (int i = 0; i < opcoesMenuListar.length; i++) {
			System.out.println(opcoesMenuListar[i]);
		}

	}

	@Override
	public void ConstruirMenuCancelar(String[] opcoesMenuCancelar) {
		for (int i = 0; i < opcoesMenuCancelar.length; i++) {
			System.out.println(opcoesMenuCancelar[i]);
		}
		*/
	}

