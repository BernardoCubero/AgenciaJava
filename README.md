## Estructura del Proyecto

El proyecto debe estar perfectamente estructurado en paquetes y todas las funcionalidades deben funcionar sin errores. No se permite el uso de conexión a internet ni de librerías externas. El fichero final será entregado comprimido en formato ZIP.

### a) Estructura Básica

-   **Proyecto:** `1DAM_Agencia_nombre_apellidos`
-   **Clase Principal:** `Inicio`
    -   `main(String[] args)`: Lanza la aplicación mediante una llamada a `Agencia.iniciarAplicacion()`.

### b) Clases de Modelo

1.  **ServicioTuristico (abstracta)**
    -   Atributos:
        -   `String codigo`
        -   `String descripcion`
        -   `String proveedor`
        -   `int plazasDisponibles`
        -   `float precioBase`
        -   `String fechaInicio`
    -   Constructores, getters, setters y `toString()`.

2.  **Vuelo (final)**
    -   Extiende de `ServicioTuristico`.
    -   Atributos adicionales:
        -   `String aeropuertoSalida`
        -   `String aeropuertoLlegada`
        -   `float tasaAeroportuaria`
    -   Cálculo del precio final: `precioBase + tasaAeroportuaria + IVA(21%)`.

3.  **Hotel**
    -   Extiende de `ServicioTuristico`.
    -   Atributos adicionales:
        -   `int noches`
        -   `float suplementoDesayuno`
    -   IVA del 10%.
    -   Cálculo del precio final: `precioBase * noches + suplementoDesayuno + IVA`.

4.  **Excursion**
    -   Extiende de `ServicioTuristico`.
    -   Atributos adicionales:
        -   `boolean incluyeGuia`
        -   `float costeGuia`
    -   IVA del 4%.
    -   Si `incluyeGuia`, se suma `costeGuia` al `precioBase`.

5.  **CatalogoServicios**
    -   Contiene `ArrayList<ServicioTuristico>`.
    -   Implementa la interfaz `Listable`.
    -   Métodos:
        -   Añadir servicios.
        -   Buscar servicios por código o descripción.
        -   Eliminar servicios.
        -   Obtener listado completo.

6.  **Interfaz Listable**
    -   Método: `mostrarCatalogoConPrecios()`
        -   Muestra en formato tabla todos los servicios (tipo, precio base, precio final, plazas disponibles).

### c) Lógica de Aplicación

-   **Clase Agencia**
    -   Contiene una única instancia estática de `CatalogoServicios`.
    -   Métodos estáticos.
        -   `iniciarAplicacion()`: Muestra el menú principal y gestiona las opciones.

### d) Menú de Usuario

1.  **Añadir nuevo servicio**
    -   Permite añadir vuelos, hoteles o excursiones, solicitando los datos necesarios.

2.  **Buscar servicio por código o descripción**
    -   Solicita un código o texto y muestra los resultados coincidentes (tipo y resumen).

3.  **Mostrar catálogo valorado**
    -   Llama a `CatalogoServicios.mostrarCatalogoConPrecios()`.

4.  **Eliminar servicio por código**
    -   Permite eliminar un servicio indicando su código.

5.  **Listar servicios ordenados por fecha**
    -   Muestra todos los servicios ordenados ascendentemente por fecha de inicio.

6.  **Salir de la aplicación**
    -   Finaliza la ejecución del programa.
