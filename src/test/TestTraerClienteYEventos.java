package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerClienteYEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteABM clienteABM = new ClienteABM();
		long id = 7;
		
		Cliente cliente = clienteABM.traer(id);
		
		System.out.println(cliente + "\n" + clienteABM.traerClienteYEventos(id).getEventos());
		

	}

}
