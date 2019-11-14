package application;
import java.util.Scanner;

import agenda.tipoConsulta;
import entidade.*;
import interfaces.InterfaceUsuario;
import repositorio.RepositorioReuniaoList;

public class Agenda {

	private static int opcao;
	private static InterfaceUsuario menuPrincipal = new consoleMenu();
	
	public static void main(String[] args) {
	//	MenuPrincipal();
		//TESTE
		CompromissoGeral e = new Evento();
		e.setAssunto("esse é um evento");
		RepositorioReuniaoList.getInstance().inserirCompromisso(e); 
		CompromissoGeral l = new Lembrete();
		l.setAssunto("esse é um lembrete");
		RepositorioReuniaoList.getInstance().inserirCompromisso(l); 
		CompromissoGeral r = new Reuniao();
		r.setAssunto("essa é uma reunião");
		RepositorioReuniaoList.getInstance().inserirCompromisso(r); 
		CompromissoGeral[] c = new CompromissoGeral[RepositorioReuniaoList.getInstance().consultarReuniao(tipoConsulta.DESCRICAO, "é").length];
		c = RepositorioReuniaoList.getInstance().consultarReuniao(tipoConsulta.DESCRICAO, "é");
		for (CompromissoGeral compromissoGeral : c) {
			System.out.println(compromissoGeral.getAssunto());
		}
		//TESTE
	}

	private static void MenuPrincipal() {
		
		do {
			String opcoesMenuPrincipal[] = { "Agendar Compromisso", 
					"Consultar Compromisso", 
					"Listar Compromissos",
					"Cancelar Compromisso"};
			opcao = menuPrincipal.ConstruirMenu(opcoesMenuPrincipal);

			switch (opcao) {
			case 1:
				menuAgendamento();
			case 2:
				menuConsulta();
			case 3:
				menuListar();
			case 4:
				menuCancelar();

			}
		} while (opcao != 0);

	}

	private static void menuAgendamento() {

		do {
			InterfaceUsuario menuAgendamento = new consoleMenu();
			String opcoesMenuAgendamento[] = { 	"Reunião", "Lembrete  ", "Evento    ", "Outro tipo "};
			opcao=menuAgendamento.ConstruirMenuAgendamento(opcoesMenuAgendamento);
			
			switch (opcao){
			case 1:
				// construir submenu e chamar os métodos necessários para cadastrar compromisso
			case 2:
				// cadastrarLembrete();
			case 3:
				// cadastrarEvento();
			case 4:
				// cadastrarOutroTipo();
			}
		} while (opcao != 0);

		MenuPrincipal();

	}


	public static void menuConsulta() {

		do {
			InterfaceUsuario menuConsulta = new consoleMenu();
			String opcoesMenuConsulta[] = { "=================================================",
					"             Consultar Compromisso                ",
					"=================================================", 
					"Como deseja consultar?", 
					"1. Por Data   ", "2. Pela prioridade  ", "3. Pela Descri��o    ", 
			"4. Voltar ao menu principal" };
			menuConsulta.ConstruirMenu(opcoesMenuConsulta);


			switch (opcao){
			case 1:
				// construir submenu e chamar os métodos necessários para consultar compromisso
			case 2:

			case 3:

			case 4:

			}

		} while (opcao != 0);

		MenuPrincipal();

	}

	public static void menuListar() {

		do {
			InterfaceUsuario menuListar = new consoleMenu();
			String opcoesMenuListar[] = { "=================================================",
					"              Lista de Compromissos              ",
					"=================================================",
					"                                                 ",
			"Digite 0 para voltar"};

			menuListar.ConstruirMenu(opcoesMenuListar);

			// listarTodosCompromissos(); 


		} while (opcao != 0);

		MenuPrincipal();

	}

	public static void menuCancelar() {

		do {
			InterfaceUsuario menuCancelar = new consoleMenu();
			String opcoesMenuCancelar[] = { "=================================================",
					"              Cancelar Compromisso              ",
					"=================================================",
					"                                                 ",
			"Digite 0 para voltar"};

			menuCancelar.ConstruirMenu(opcoesMenuCancelar);

			// CancelarCompromisso();
			// informar código de identificação do compromisso a ser cancelado


		} while (opcao != 0);

		MenuPrincipal();

	}
}


