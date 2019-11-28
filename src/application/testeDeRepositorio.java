package application;

import java.util.ArrayList;
import java.util.Iterator;

import entidade.Calendario;
import entidade.Endereco;
import entidade.Evento;
import enums.TipoConsulta;
import repositorio.RepositorioEventoList;

public @interface testeDeRepositorio {
//	MenuPrincipal();
		//TESTE
		Evento eventoTeste = new Evento();
		Endereco endereco = new Endereco();
		Calendario dataFim = new Calendario(2020, 2, 2, 23, 2);
		ArrayList<Object> varRetornoTeste = new ArrayList<Object>();
		
		eventoTeste.setAssunto("essa é uma Descrição do evento");
		endereco.setDescricao("Endereco teste");
		eventoTeste.setLocal(endereco);
		eventoTeste.setDataHoraFim(dataFim);
		
		//Inserir compromisso
		RepositorioEventoList.getInstance().inserirCompromisso(eventoTeste); 
		//Consultar compromisso
		varRetornoTeste = RepositorioEventoList.getInstance().consultarCompromisso(TipoConsulta.DESCRICAO, "é");
		
		for (Iterator iterator = varRetornoTeste.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			eventoTeste = (Evento)object;
			System.out.println(eventoTeste.getAssunto());
			System.out.println(eventoTeste.getDataHoraFim());
			
		}
		
		// Get Index
		System.out.println("O index do compromisso passado como parâmetro é: " + RepositorioEventoList.getInstance().obterIndex(eventoTeste));
		//Alterar compromisso
			
		eventoTeste.setAssunto("Novo Assunto");
		RepositorioEventoList.getInstance().alterarCompromisso(RepositorioEventoList.getInstance().obterIndex(eventoTeste), eventoTeste);
		
		//Consultar compromisso
				varRetornoTeste = RepositorioEventoList.getInstance().consultarCompromisso(TipoConsulta.DESCRICAO, "");
				
				for (Iterator iterator = varRetornoTeste.iterator(); iterator.hasNext();) {
					Object object = (Object) iterator.next();
					eventoTeste = (Evento)object;
					System.out.println(eventoTeste.getAssunto());
					System.out.println(eventoTeste.getDataHoraFim());
					
				}
		
		//TESTE
}
