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

	public void buscarServicioCodigo(String text) {
		// Nos indica si la lista esta vacia
		if (servicios.isEmpty()) {
			System.out.println("El catalogo esta vacio, No hay servivios que mostrar");
			
		}

		for (ServicioTuristico p : servicios) {
			if (p.getCodigo().equalsIgnoreCase(text)) {
				System.out.println(p);
				
			}
		}
		System.out.println("No se encuentró ningun servivio con el codigo " + text);

	}


	public boolean eliminarServicio(String cod) {
		
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
		return false;

	}



	@Override
	public void mostrarCatalogoconPrecios() {
		for (int i = 0; i<servicios.size(); i++){
			ServicioTuristico s = servicios.get(i);
			
		
		}
	
	}
    public void listarPorFecha() {
        // Ordenar a mano (bubble sort) por fechaInicio
    	
        for (int i = 0; i < servicios.size() - 1; i++) {
            for (int j = 0; j < servicios.size() - 1 - i; j++) {
                ServicioTuristico s1 = servicios.get(j);
                ServicioTuristico s2 = servicios.get(j + 1);
                if (s1.getFechaIncio().compareTo(s2.getFechaIncio()) > 0) {
                    // Intercambio
                    servicios.set(j, s2);
                    servicios.set(j + 1, s1);
                }
            }
        }

        mostrarCatalogoconPrecios();
    }
}

