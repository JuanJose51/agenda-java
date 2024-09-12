package Logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
	
	/*************************************************
	 *            METODOS DE CONTACTO
	 * 
	 *************************************************/
	
	
	public boolean agregarContacto(Contacto contacto) {
		boolean estado = isContactoExistente(contacto);
		if(estado == false) {
			this.contactos.add(contacto);
		}

		return !estado;
		
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
	
	public Contacto buscarContacto( String nombre, String telefono) {
		for (Contacto c : this.contactos) {			
			if(c.getNombre().equalsIgnoreCase(nombre) && c.getTelefono().equals(telefono)) {
				return c;
			}
		}
		
		return null;
	}
	
	public void ActualizarContacto(String nombre,String alias,String direccion,String telefono,String email, Contacto c) {
		c.setNombre(nombre);
		c.setAlias(alias);
		c.setDireccion(direccion);
		c.setTelefono(telefono);
		c.setEmail(email);
	}
	
	
	public boolean eliminarContacto(String nombre, String telefono) {
		Contacto c = buscarContacto(nombre, telefono);
		if(c == null) {
			return false;
		}
		
		contactos.remove(c);
		
		return true;
	} 
	/********************************
	 *      METODO DE REUNION       *
	 *                              *
	 ********************************/
	public int verificarHora() {
		int hora = -1;
		while (hora > 0 || hora <23) {
			try {
				hora=Integer.parseInt(JOptionPane.showInputDialog("ingrese la hora de la reunion(0-23)"));
			}catch(NumberFormatException e) {
				 JOptionPane.showMessageDialog(null,"Por favor, ingrese un número válido.");
				 hora = -1;
			}
			if(hora < 0 || hora >23) {
				 JOptionPane.showMessageDialog(null,"el número no esta en el rango válido.");
			}
				
		}
		return hora;
			
	}
	public int verificarMinuto() {
		
	}
			
} 
	

