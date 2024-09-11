package Logica;

import java.util.ArrayList;
import java.util.Date;

public class Reunion {
	private String descripcion;
	private Date fecha;
	private String hora;
	private ArrayList<Contacto> asistentes;
	
	
	public Reunion(String descripcion, Date fecha, String hora) {
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.hora = hora;
		this.asistentes = new ArrayList<>();
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public ArrayList<Contacto> getAsistentes() {
		return asistentes;
	}


	public void agregarAsistente(Contacto asistente) {
		this.asistentes.add(asistente);
	}
	
	
}
