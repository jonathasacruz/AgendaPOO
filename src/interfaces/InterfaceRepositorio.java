package interfaces;

import entidade.Reuniao;

public interface InterfaceRepositorio {
		public boolean inserirReuniao(Reuniao reuniao);
		public boolean excluirReuniao(Reuniao reuniao);
		public Reuniao consultarReuniao(Reuniao reuniao);
		public boolean alterarReuniao(Reuniao reuniao);
		
	}