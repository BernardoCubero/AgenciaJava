package EXPractica;

import java.util.Scanner;

public class Agencia {
	
	
	public static void iniciarAplicacion() {
		Scanner teclado = new Scanner(System.in);
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
			
			switch(opc) {
			
				case 1:
					int opc2;
					do {
						
					System.out.println("Introduce que opción quieres añadir");
					System.out.println("1. Vuelo añadir tasa aeroportuaria");
					System.out.println("2. Holer añadir Suplemento Desayuno");
					System.out.println("3. Excursion añade Guia");
					System.out.println("4 Salir de las opciones");
					System.out.println("Introduce tu opción");
					opc2 = teclado.nextInt();
					switch(opc2) {
						case 1:
							System.out.println("Añadiendo tasa aerportuaria");
							break;
							
						
					}
					
					}while(opc2!=4);
					break;
			
			}
			
		}while(opc!=6);
	}
}
