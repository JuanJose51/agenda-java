package Logica;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<Contacto> integrantes;
	
	
	public Grupo(String nombre, ArrayList<Contacto> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Contacto> getIntegrantes() {
		return integrantes;
	}


	public void setIntegrantes(ArrayList<Contacto> integrantes) {
		this.integrantes = integrantes;
	}
	
	
	public void agregarIntegrante(Contacto integrante) {
		this.integrantes.add(integrante);
	}
	
	

}
