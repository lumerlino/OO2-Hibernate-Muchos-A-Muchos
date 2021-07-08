package test;

import datos.Cliente;
import datos.Evento;
import negocio.ClienteABM;
import negocio.EventoABM;

public class TestEliminarEventoDeUnCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteABM clienteABM = new ClienteABM();
		long idCliente = 7;
		Cliente cliente = clienteABM.traer(idCliente);
		
		EventoABM eventoABM = new EventoABM();
		long idEvento = 6;
		Evento evento = eventoABM.traer(idEvento);
		
		try {
			cliente.eliminar(evento);
			clienteABM.modificar(cliente);
			System.out.println(cliente + "\n" + clienteABM.traerClienteYEventos(idCliente).getEventos());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
