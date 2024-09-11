import javax.swing.JOptionPane;

import Logica.Agenda;
import Logica.Contacto;

public class Main {
	
	public static Agenda a = new Agenda("mi agenda");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcionMenu;
		String menuPrincipal = "Menú principal\n"+
		"Ingrese la opción correspondiente:\n"+
		"1. Listar contactos.\n" +
		"2. Agregar contacto.\n" +
		"3. Actualizar contacto.\n" +
		"4. Eliminar Contacto.\n"+
		"5. Listar grupos.\n" +
		"6. Agregar grupo.\n" +
		"7. Actualizar grupo.\n" +
		"8. Eliminar grupo.\n"+
		"9. Salir";
		
		int opcionSeleccionada = 0;	
		
		
		do {
			opcionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog(null,menuPrincipal));
			opcionMenu(opcionSeleccionada);
		} while (opcionSeleccionada != 9);

	}
	
	private static void opcionMenu(int opt) {
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
	
	
	private static void getListaContactos() {
		System.out.println("Lista de contactos:");
		a.imprimirContactos();
	}
	
	private static void crearContacto() {
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
	
	private static void actualizarContacto(String nombre,String telefono) {
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
	
	
	private static void eliminarContacto() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
		String telefono= JOptionPane.showInputDialog("Ingrese el telefono");
		
		boolean estado = a.eliminarContacto(nombre, telefono);
		
		String mensaje = estado == true ? "Contacto eliminado." : "El contacto no existe.";
		
		System.out.println(mensaje);
	}
}
