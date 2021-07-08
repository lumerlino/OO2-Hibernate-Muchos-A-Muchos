package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.EventoDao;
import datos.Evento;

public class EventoABM {
	EventoDao dao = new EventoDao();
	
	public Evento traer(long idEvento) {
		return dao.traer(idEvento);
	}
	
	public Evento traer(String evento) {
		return dao.traer(evento);
	}
	
	public int agregar(String evento, LocalDate fecha) {
		Evento e = new Evento(evento, fecha);
		return dao.agregar(e);
	}
	
	public void modificar(Evento e) {
		dao.actualizar(e);
	}
	
	public void eliminar(Evento e) {
		dao.eliminar(e);
	}
	
	public List<Evento> traer(){
		return dao.traer();
	}
	
	public Evento traerEventoYClientes(long idEvento) {
		return dao.traerEventoYClientes(idEvento);
	}

}
