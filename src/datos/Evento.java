package datos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Evento {
	private long idEvento;
	private String evento;
	private LocalDate fecha;
	private LocalTime hora;
	private Set<Cliente> clientes;
	
	public Evento() {}

	public Evento(String evento, LocalDate fecha) {
		super();
		this.evento = evento;
		this.fecha = fecha;
	}

	public long getIdEvento() {
		return idEvento;
	}

	protected void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "\nEvento [idEvento=" + idEvento + ", evento=" + evento + ", fecha=" + fecha + ", hora=" + hora + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((evento == null) ? 0 : evento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (evento == null) {
			if (other.evento != null)
				return false;
		} else if (!evento.equals(other.evento))
			return false;
		return true;
	}
	
	public boolean agregar(Cliente cliente) throws Exception{ //agregar Cliente a la lista de clientes del Evento
		List<Cliente> lista = new ArrayList<Cliente>(this.clientes);
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).equals(cliente)) throw new Exception ("ERROR: el cliente ya esta en la lista del evento");			
		}
		return this.clientes.add(cliente);
	}
	
	public boolean eliminar (Cliente cliente) throws Exception{
		boolean encontrado = false;
		List<Cliente> lista = new ArrayList<Cliente>(this.clientes);
		for (int i=0; i<lista.size();i++) {
			if(lista.get(i).equals(cliente)) encontrado=true;
		}
		if (!encontrado) throw new Exception ("ERROR: el cliente no esta en la lista del evento");
		return this.clientes.remove(cliente);
	}
	
	

}
