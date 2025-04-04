package EXPractica;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoServicios implements Listable {
	Scanner teclado = new Scanner(System.in);
	ArrayList<ServicioTuristico> servicios;

	public CatalogoServicios() {
		this.servicios = new ArrayList<>();
	}

	// Metodos

	public void anadirServicios(ServicioTuristico servicio) {

		servicios.add(servicio);

	}

	public void buscarServicio(ServicioTuristico servicio) {
		
		

	}

	public void eliminarServicio(ServicioTuristico servicio) {
		System.out.println("Busca el codigo del servicio que quieres borrar");
		String codigo = teclado.next();
		for (ServicioTuristico p : servicios) {
			if (p.getCodigo().equalsIgnoreCase(codigo)) {
				servicios.remove(p);
			}
		}

	}

	public void listadoCompleto(ServicioTuristico servicio) {
		for (ServicioTuristico c : servicios) {
			System.out.println(c);
		}

	}

	@Override
	public void mostrarCatalogoconPrecios() {
		// TODO Auto-generated method stub

	}
}
