package Logica;

import java.util.ArrayList;
import java.util.Date;

public class Reunion {
	private String descripcion;
	private String fecha;
	private String hora;
	private ArrayList<Contacto> asistentes;
	
	
	public Reunion(String descripcion, String fecha, String hora) {
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


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
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
