package agenda;
import java.util.Scanner;

public class agendaMain {

	static Scanner sc = new Scanner(System.in);
	static int opcao;

	public static void main(String[] args) {
		MenuPrincipal();
	}

	public static void MenuPrincipal() {
		do {
			InterfaceUsuario menuPrincipal = new consoleMenu();

			String opcoesMenuPrincipal[] = { 
					"=================================================",
					"|     _     ____  _____  _   _  ____     _      |\r\n"
							+ "|    / \\   / ___|| ____|| \\ | ||  _ \\   / \\     |\r\n"
							+ "|   / _ \\ | |  _ |  _|  |  \\| || | | | / _ \\    |\r\n"
							+ "|  / ___ \\| |_| || |___ | |\\  || |_| |/ ___ \\   |\r\n"
							+ "| /_/   \\_\\\\____||_____||_| \\_||____//_/   \\_\\  |\r\n"
							+ "|                                               |",
					"=================================================", "                                           ",
					"1. Agendar Compromisso", "2. Consultar Compromisso", "3. Listar Compromissos",
					"4. Cancelar Compromisso", "0. Sair", 
					"                      ", 
					"Informe a op��o desejada: " };

			menuPrincipal.ConstruirMenu(opcoesMenuPrincipal);
			opcao = sc.nextInt();

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

	public static void menuAgendamento() {

		do {
			InterfaceUsuario menuAgendamento = new consoleMenu();
			String opcoesMenuAgendamento[] = { "=================================================",
											   "              Agendar Compromisso                 ",
											   	"=================================================", 
											   	"Informe o tipo do compromisso:",
											   	"1. Reuni�o   ", "2. Lembrete  ", "3. Evento    ", "4. Outro tipo ",
												"5. Voltar ao menu principal" };
			menuAgendamento.ConstruirMenu(opcoesMenuAgendamento);
			opcao = sc.nextInt();
			switch (opcao){
			case 1:
				// construir submenu e chamar os m�todos necess�rios para cadastrar compromisso
			case 2:
				// cadastrarLembrete();
			case 3:
				// cadastrarEvento();
			case 4:
				// cadastrarOutroTipo();
			}
		} while (opcao != 5);

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
			opcao = sc.nextInt();
			
			switch (opcao){
			case 1:
				// construir submenu e chamar os m�todos necess�rios para consultar compromisso
			case 2:
				
			case 3:
				
			case 4:
				
			}
			
		} while (opcao != 4);

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
			
			opcao = sc.nextInt();
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
			// informar c�digo de identifica��o do compromisso a ser cancelado
			
			opcao = sc.nextInt();
		} while (opcao != 0);

		MenuPrincipal();

	}
}


