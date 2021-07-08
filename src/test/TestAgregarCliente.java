package test;

import java.time.LocalDate;

import negocio.ClienteABM;

public class TestAgregarCliente {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteABM clienteABM = new ClienteABM();
		long id=0;
		
		try {
			id=clienteABM.agregar("Martinez", "Martin", 35569584, LocalDate.of(1985, 5, 15));
			System.out.println(clienteABM.traer(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
