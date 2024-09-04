import Logica.Agenda;
import Logica.Contacto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda a = new Agenda("mi agenda");
		
		System.out.println("agregamos a juan y mostramos");
		Contacto c = new Contacto("juan", "peludo", "calle 20", "321478", "FRE@GMAIL");
		
		a.agregarContacto(c);
		a.imprimirContactos();
		
		System.out.println("agregamos a juana y mostramos");
		Contacto c2 = new Contacto("juana", "peluda", "calle 30", "321842", "juana@GMAIL");
		
		a.agregarContacto(c2);
		a.imprimirContactos();
		
		System.out.println("agregamos nuevamente a juan");
		a.agregarContacto(c);
		
		a.imprimirContactos();
		
		

	}

}
