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

	public void buscarServicioDescripcion(String text) {
		
		//Reconoce que si la lista es vacia y nos informa
		
		if (servicios.isEmpty()) {
			System.out.println("La lista esta vacia");

		}
		for (int i = 0; i < servicios.size(); i++) {
			ServicioTuristico s = servicios.get(i);
			if (s.getDescripcion().equalsIgnoreCase(text)) {
				System.out.println(s);
				return;

			}
		}
		System.out.println("No se encuentra ningun codigo con esta descripción " + text);
	}

	public void buscarServicioCodigo(String codigo) {
		// Nos indica si la lista esta vacia
		if (servicios.isEmpty()) {
			System.out.println("El catalogo esta vacio, No hay servivios que mostrar");
			return;
		}

		for (ServicioTuristico p : servicios) {
			if (p.getCodigo().equalsIgnoreCase(codigo)) {
				System.out.println(p);
				return;
			}
		}
		System.out.println("No se encuentró ningun servivio con el codigo " + codigo);

	}


	public void eliminarServicio(ServicioTuristico servicio) {
		
		//Nos indica si la lista esta vacia 
		
		if (servicios.isEmpty()) {
			System.out.println("La lista esta vacia");
		}
		System.out.println("Busca el codigo del servicio que quieres borrar");
		String codigo = teclado.next();
		for (ServicioTuristico p : servicios) {
			if (p.getCodigo().equalsIgnoreCase(codigo)) {
				servicios.remove(p);
			}
		}

	}



	@Override
	public void mostrarCatalogoconPrecios() {
		// TODO Auto-generated method stub

	}

}
