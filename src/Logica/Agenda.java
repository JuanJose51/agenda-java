package Logica;

import java.util.ArrayList;

public class Agenda {
	private String nombre;
	private ArrayList<Contacto> contactos;
	private ArrayList<Grupo> grupos;
	private ArrayList<Reunion> reuniones;
	
	
	public Agenda(String nombre) {
		this.nombre = nombre;
		this.contactos = new ArrayList<>();
		this.grupos = new ArrayList<>();
		this.reuniones = new ArrayList<>();
	}
	
	
	public void agregarContacto(Contacto contacto) {
		if(isContactoExistente(contacto) == false) {
			this.contactos.add(contacto);			
		}
	}
	
	public void imprimirContactos() {
		for (Contacto c : this.contactos) {
			System.out.println(c.toString());
		}
	}
	
	private boolean isContactoExistente(Contacto contacto) {
		for (Contacto c : this.contactos) {
			String nombre = contacto.getNombre();
			String telefono = contacto.getTelefono();
			
			if(c.getNombre().equalsIgnoreCase(nombre) && c.getTelefono().equals(telefono)) {
				return true;
			}
		}
		
		return false;
	}
	

}
