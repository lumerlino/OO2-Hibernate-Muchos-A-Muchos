package test;

import datos.Cliente;
import datos.Evento;
import negocio.ClienteABM;
import negocio.EventoABM;

public class TestAgregarClienteAEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteABM clienteABM = new ClienteABM();
		EventoABM eventoABM = new EventoABM();
		
		long idCliente=6;
		Cliente cliente = clienteABM.traer(idCliente);
		
		long idEvento=8;
		Evento evento = eventoABM.traer(idEvento);
		
		try {
			evento.agregar(cliente);
			eventoABM.modificar(evento);
			System.out.println(evento +"\n" + eventoABM.traerEventoYClientes(idEvento).getClientes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
