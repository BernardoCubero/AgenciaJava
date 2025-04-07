package EXPractica;

import java.util.Scanner;

public class Agencia {

	private static CatalogoServicios catalogo = new CatalogoServicios();
	private static Scanner teclado = new Scanner(System.in);

	public static void iniciarAplicacion() {

		int opc;
		do {

			System.out.println("Este es el menu de la agencia");
			System.out.println("1. Añadir nuevo servicio");
			System.out.println("2. Buscar Servicio por codigo o descripción");
			System.out.println("3. Mostrar catálogo");
			System.out.println("4. Elimina servivio por codigo");
			System.out.println("5. Listar servicios por fecha");
			System.out.println("6. Saliendo del programa.....");
			System.out.println("Introduce tu opción");
			opc = teclado.nextInt();

			switch (opc) {

			case 1:
				agregar();
				break;
			case 2:
				buscar();
				break;
			case 3:
				catalogo.mostrarCatalogoconPrecios();
				break;
			case 4:
				eliminar();
				break;
			case 5:
				catalogo.listarPorFecha();
				break;
			case 6:
				System.out.println("Salir de la aplicacion");
			default:
				System.out.println("Opción Incorrecta..");
				System.out.println("Vuelve a introducir tu opcion");
				opc = teclado.nextInt();
			}

		} while (opc != 6);

		// Metodos
	}

	private static void agregar() {
		System.out.println("Introduce tu opción");
		System.out.println("1. Vuelo");
		System.out.println("2 . Hotel ");
		System.out.println("3 . Excusión");
		int tipo = teclado.nextInt();

		System.out.println("Codigo: ");
		String cod = teclado.next();
		System.out.println("Descipción: ");
		String des = teclado.next();
		System.out.println("Proveedor: ");
		String prov = teclado.next();
		System.out.println("Plazas disponbiles");
		int plazas = teclado.nextInt();
		System.out.println("Precio Base: ");
		float precio = teclado.nextFloat();
		System.out.println("Fecha de inicio: (YY-MM-AA");
		String fecha = teclado.next();

		ServicioTuristico s = null;
		if (tipo == 1) {
			System.out.println(" Salida: ");
			String sal = teclado.next();
			System.out.println("Llegada: ");
			String lleg = teclado.next();
			System.out.println("Tasa Aeroporturaria");
			float tasa = teclado.nextFloat();
			s = new Vuelo(cod, des, prov, plazas, precio, fecha, sal, lleg, tasa);
		} else if (tipo == 2) {
			System.out.println("Noches: ");
			int noches = teclado.nextInt();
			System.out.println("Importe Desayuno: ");
			float sup = teclado.nextFloat();
			s = new Hotel(cod, des, prov, plazas, precio, fecha, noches, sup);
		} else if (tipo == 3) {
			System.out.println("Incluye guia true /false");
			boolean guia = teclado.nextBoolean();
			System.out.println("Coste Guia: ");
			float coste = teclado.nextFloat();
			s = new Excursion(cod, des, prov, plazas, precio, fecha, guia, coste);
		}
		if (s != null)
			catalogo.anadirServicios(s);
	}

	private static void buscar() {

		System.out.println("Buscar por codigo o por texto ");
		String texto = teclado.next();
		ServicioTuristico s = catalogo.buscarServicioCodigo(texto);
		if (s != null) {
			System.out.println(s);
		} else {
			System.out.println("Buscar por descripción: ");
			catalogo.buscarServicioCodigo(texto);
		}
	}

	private static void eliminar() {
		System.out.println("Código a eliminar");
		String cod = teclado.next();
		if (catalogo.eliminarServicio(cod)) {
			System.out.println("Eliminando.....");
		} else {
			System.out.println("No enontado....");

		}
	}
}
