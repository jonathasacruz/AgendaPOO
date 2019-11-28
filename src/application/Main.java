package application;

import java.util.Scanner;

import controladores.ControladorContato;
import controladores.ControladorEvento;
import controladores.ControladorLembrete;
import controladores.ControladorReuniao;
import entidade.*;
import interfaces.InterfaceUsuario;
import enums.*;

public class Main {

	public static void main(String[] args) {


		menuPrincipal();


	}

	private static void menuPrincipal() {
		Scanner input = new Scanner(System.in); 
		ControladorEvento controlEvento = new ControladorEvento();
		ControladorLembrete controlLembrete = new ControladorLembrete();
		ControladorReuniao controlReuniao = new ControladorReuniao();
		ControladorContato controlContato = new ControladorContato();
		
		Calendario calendario;
		
		int dia, mes, ano, hora, minuto;
		
		
		String[] opcoesMenu = {"Agendar Compromisso", 
				"Consultar Compromisso", 
				"Listar Compromissos",
				"Cancelar Compromisso","Cadastrar Contato"};
		String[] opcoesAgendar = new String[] {"Evento", "Lembrete", "Reuniao"};
		String[] opcoesMenuConsulta = new String[] {"Data", "Assunto"}; 
		int opcaoSelecionada;


		InterfaceUsuario menu = new consoleMenu();
		do {
			opcaoSelecionada = menu.ConstruirMenu(opcoesMenu);

			switch (opcaoSelecionada) {
			case 1: //Agendar Compromisso
				opcaoSelecionada = menu.ConstruirMenuAgendamento(opcoesAgendar);
				switch (opcaoSelecionada) {
				case 1: //Evento

					CompromissoGeral evento = new Evento();
					System.out.println("Insira o assunto do Evento: ");
					evento.setAssunto(input.nextLine());
					System.out.println("Insira data e hora do Evento: ");
					System.out.print("Dia");
					dia = input.nextInt();
					System.out.print("Mês:");
					mes = input.nextInt();
					System.out.print("Ano:");
					ano = input.nextInt();
					System.out.print("Hora");
					hora = input.nextInt();
					System.out.print("Minuto");
					minuto = input.nextInt();
					calendario = new Calendario(ano, mes, dia, hora, minuto);
					
					evento.setDataHoraInicio(calendario);
					controlEvento.inserirEvento(evento);
				
				
				case 2: //Lembrete
					
					CompromissoGeral lembrete = new Lembrete();
					System.out.println("Insira o assunto do Lembrete: ");
					lembrete.setAssunto(input.nextLine());
					System.out.println("Insira data e hora do Lembrete: ");
					System.out.print("Dia");
					dia = input.nextInt();
					System.out.print("Mês:");
					mes = input.nextInt();
					System.out.print("Ano:");
					ano = input.nextInt();
					System.out.print("Hora");
					hora = input.nextInt();
					System.out.print("Minuto");
					minuto = input.nextInt();
					calendario = new Calendario(ano, mes, dia, hora, minuto);
					lembrete.setDataHoraInicio(calendario);
					controlLembrete.inserirLembrete(lembrete);
					break;
				
				
				case 3: //Reunião
				
					CompromissoGeral reuniao = new Reuniao();
					System.out.println("Insira o assunto da Reunião: ");
					reuniao.setAssunto(input.nextLine());
					System.out.println("Insira data e hora da Reunião: ");
					System.out.print("Dia");
					dia = input.nextInt();
					System.out.print("Mês:");
					mes = input.nextInt();
					System.out.print("Ano:");
					ano = input.nextInt();
					System.out.print("Hora");
					hora = input.nextInt();
					System.out.print("Minuto");
					minuto = input.nextInt();
					calendario = new Calendario(ano, mes, dia, hora, minuto);
					reuniao.setDataHoraInicio(calendario);
					controlReuniao.inserirReuniao(reuniao);
					
					break;
				default:
					break;
				}
				opcaoSelecionada = 1000;
				break;
			case 2: //Consultar Compromisso 
				opcaoSelecionada = menu.ConstruirMenuConsulta(opcoesMenuConsulta);
				switch (opcaoSelecionada) {
				case 1:
					System.out.println("Insira data e hora do Compromisso: ");
					System.out.print("Dia");
					dia = input.nextInt();
					System.out.print("Mês:");
					mes = input.nextInt();
					System.out.print("Ano:");
					ano = input.nextInt();
					System.out.print("Hora");
					hora = input.nextInt();
					System.out.print("Minuto");
					minuto = input.nextInt();
					calendario = new Calendario(ano, mes, dia, hora, minuto);
					//controlEvento.consultarEvento(, calendario.getDataHora());
					break;
				case 2:
					
					break;
				default:
					break;
				}
				
				opcaoSelecionada = 1000;
				break;
			case 3: 
				break;
			default:
				break;
			}

		}while (opcaoSelecionada!=0);

	}
}
