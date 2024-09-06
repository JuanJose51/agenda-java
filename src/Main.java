import javax.swing.JOptionPane;

import Logica.Agenda;
import Logica.Contacto;

public class Main {
	
	public static Agenda a = new Agenda("mi agenda");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcionMenu = 4;
		String menuPrincipal = "Menú principal\n"+
		"Ingrese la opción correspondiente:\n"+
		"1. Contactos.\n" +
		"2. Grupos.\n" +
		"3. Reuniones.\n"+
		"4. Salir";
		
		int opcionSubMenu = 0;	
		
		
		do {
			opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(null,menuPrincipal));
			String subMe = getSubMenu(opcionMenu);
			opcionSubMenu = Integer.parseInt(JOptionPane.showInputDialog(subMe));
			opcionSubmenu(opcionMenu);
		} while (opcionMenu != 4);

	}
	
	private static void opcionSubmenu(int opt) {
		switch (opt) {
		case 1: {
			OptContactos(opt);
			break;
		}
		case 2: {
			break;
		}
		default:
			break;
		}
	}
	
	private static String getSubMenu(int opt) {
		String subMenu = "";
	
		switch (opt) {
		case 1: 
			subMenu = "Ingrese un opción:\n" +
					"1. Lista de contactos\n" +
					"2. Agregar un contacto.\n" +
					"3. Actualizar contacto.\n"
					+ 
					"4. Regresar.";
			break;
		case 2: 
			subMenu = "Ingrese un opción:\n" +
					"1. Lista de grupos\n" +
					"2. Agregar un grupo.\n" +
					"3. Actualizar grupo.\n"
					+ 
					"4. Regresar.";
			
			break;
		case 3: 
			
			break;
		
		}
		
		return subMenu; 
	}
	
	public static void OptContactos(int opt) {
		switch (opt) {
		case 1:
			getListaContactos();
			break;
		case 2:
			crearContacto();
			break;
		case 3:
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
			String telefono= JOptionPane.showInputDialog("Ingrese el telefono");
			actualizarContacto(nombre, telefono);
			break;
		case 4:
			break;
			
		default:
			break;
		}
	}
	
	
	public static void getListaContactos() {
		System.out.println("Lista de contactos:");
		a.imprimirContactos();
	}
	
	public static void crearContacto() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
		String alias = JOptionPane.showInputDialog("Ingrese el alias");
		String direccion= JOptionPane.showInputDialog("Ingrese el direccion");
		String telefono= JOptionPane.showInputDialog("Ingrese el telefono");
		String email= JOptionPane.showInputDialog("Ingrese el email");
		
		Contacto c = new Contacto(nombre, alias, direccion, telefono, email);
		
		boolean estado = a.agregarContacto(c);
		String mensaje;
		
		mensaje = estado == true ? "El contacto fue agregado con exito." : "El contacto ya existe.";
		
		
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public static void actualizarContacto(String nombre,String telefono) {
		Contacto contacto = a.buscarContacto(nombre, telefono);
		
		System.out.println("Contacto a actualizar:");
		System.out.println(contacto.toString());		
		
		if(contacto != null) {
			nombre = JOptionPane.showInputDialog("Ingrese el nombre");
			String alias = JOptionPane.showInputDialog("Ingrese el alias");
			String direccion= JOptionPane.showInputDialog("Ingrese el direccion");
			telefono= JOptionPane.showInputDialog("Ingrese el telefono");
			String email= JOptionPane.showInputDialog("Ingrese el email");
			
			a.ActualizarContacto(nombre, alias, direccion, telefono, email, contacto);
		} else {
			JOptionPane.showMessageDialog(null, "El contacto no existe");
		}
		
	}
}
