package test;

import datos.Cliente;
import datos.Evento;
import negocio.ClienteABM;
import negocio.EventoABM;

public class TestEliminarClienteDeUnEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteABM clienteABM = new ClienteABM();
		long idCliente = 9;
		
		Cliente cliente = clienteABM.traer(idCliente);
		
		EventoABM eventoABM = new EventoABM();
		long idEvento=8;
		
		Evento evento = eventoABM.traer(idEvento);
		
		try {
			evento.eliminar(cliente);
			eventoABM.modificar(evento);
			System.out.println(evento + "\n" + eventoABM.traerEventoYClientes(idEvento).getClientes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
