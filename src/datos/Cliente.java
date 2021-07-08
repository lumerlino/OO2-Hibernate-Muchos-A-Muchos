package datos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import negocio.Funciones;

public class Cliente {
	private long idCliente;
	private String apellido;
	private String nombre;
	private int dni;
	private LocalDate fechaDeNacimiento;
	private boolean baja;
	private Set<Evento> eventos;
	
	public Cliente() {}
	
	public Cliente(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.baja = false;
	}

	public long getIdCliente() {
		return idCliente;
	}

	protected void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public Set<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}

	@Override
	public String toString() {
		return "\nCliente [idCliente=" + idCliente + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ ", fechaDeNacimiento=" + Funciones.traerFechaCorta(fechaDeNacimiento) + ", baja=" + baja + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
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
		Cliente other = (Cliente) obj;
		if (dni != other.dni)
			return false;
		return true;
	}
	
	public boolean agregar(Evento evento) throws Exception{ //agregar evento a la lista de eventos del cliente
		List<Evento> lista = new ArrayList<Evento>(this.eventos);
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).equals(evento)) throw new Exception ("ERROR: el evento ya esta en la lista del cliente");			
		}
		return this.eventos.add(evento);
	}
	
	public boolean eliminar (Evento evento) throws Exception{
		boolean encontrado = false;
		List<Evento> lista = new ArrayList<Evento>(this.eventos);
		for (int i=0; i<lista.size();i++) {
			if(lista.get(i).equals(evento)) encontrado=true;
		}
		if (!encontrado) throw new Exception ("ERROR: el evento no esta en lista del cliente");
		return this.eventos.remove(evento);
	}
	
	
	

}
