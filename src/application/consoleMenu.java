package application;
import java.util.Scanner;

import interfaces.InterfaceUsuario;

public class consoleMenu implements InterfaceUsuario {
	static Scanner sc = new Scanner(System.in);
	int i=0;

	@Override
	public int ConstruirMenu(String[] opcoesMenu) {
		System.out.println(
				  "=================================================\n" 
				+ "|     _     ____  _____  _   _  ____     _      |\r\n" 
				+ "|    / \\   / ___|| ____|| \\ | ||  _ \\   / \\     |\r\n"
				+ "|   / _ \\ | |  _ |  _|  |  \\| || | | | / _ \\    |\r\n"
				+ "|  / ___ \\| |_| || |___ | |\\  || |_| |/ ___ \\   |\r\n"
				+ "| /_/   \\_\\\\____||_____||_| \\_||____//_/   \\_\\  |\r\n"
				+ "|                                               |\n"	
				+ "=================================================\n");
		for (i=0;i<opcoesMenu.length;i++) {
			System.out.println((i+1)+". "+opcoesMenu[i]);

		}
		System.out.println("0. Sair\n\n"
				+"Informe a opção desejada: ");
		int opcao = sc.nextInt();
		sc.reset();
		return opcao;
	
	}
	
	

	/*
	@Override
	public void ConstruirMenuPrincipal(String[] opcoesMenuPrincipal) {
		for (int i = 0; i < opcoesMenuPrincipal.length; i++) {
			System.out.println(opcoesMenuPrincipal[i]);

		}
	}*/

	@Override
	public void exibirMensagem(String msg, Mensagem mensagem) {
		if (mensagem == Mensagem.AVISO) {
			System.out.println("ATENÇÃO");
		} else if (mensagem == Mensagem.ERRO) {
			System.out.println("ERRO");
		}

		System.out.println(msg);

	}

	@Override
	public int ConstruirMenuAgendamento(String[] opcoesMenuAgendamento) {
		System.out.println("=================================================\n"+
				"              Agendar Compromisso                 \n"+
				"=================================================n"+
				"Informe o tipo do compromisso:");
		
		for (i = 0; i < opcoesMenuAgendamento.length; i++) {
			System.out.println((i+1)+". "+opcoesMenuAgendamento[i]);

		}
		
		System.out.println("0. Sair\n\n"
				+"Informe a opção desejada: ");
		int opcao = sc.nextInt();
		sc.reset();
		return opcao;

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

	}

	@Override
	public String EntradaDeDados() {
		return null;



	}
}


