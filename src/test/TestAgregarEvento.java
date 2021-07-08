package test;

import java.time.LocalDate;

import negocio.EventoABM;

public class TestAgregarEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventoABM eventoABM = new EventoABM();
		long id=0;
		
		id = eventoABM.agregar("Curso Node.js", LocalDate.of(2021, 10, 10));
		System.out.println(eventoABM.traer(id));

	}

}
