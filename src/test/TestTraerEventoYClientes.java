package test;

import datos.Evento;
import negocio.ClienteABM;
import negocio.EventoABM;

public class TestTraerEventoYClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventoABM eventoABM = new EventoABM();
		long id = 8;
		
		Evento evento = eventoABM.traer(id);
		
		System.out.println(evento + "\n" + eventoABM.traerEventoYClientes(id).getClientes());
		
		

	}

}
