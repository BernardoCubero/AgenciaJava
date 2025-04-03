package EXPractica;

public final class Vuelo extends ServicioTuristico {

	private String aeropuertoSalida;
	private String aeropuertoLlegada;
	private float tasaAeroportuaria;

	public Vuelo(String codigo, String descripcion, String proveedor, int plazasDisponibles, float precioBase,
			String fechaInicio, String aeropuertoSalida, String aeropuertoLlegada, float tasaAeroPortuaria) {
		super(codigo, descripcion, proveedor, plazasDisponibles, precioBase, fechaInicio);

		this.aeropuertoSalida = aeropuertoSalida;
		this.aeropuertoLlegada = aeropuertoLlegada;
		this.tasaAeroportuaria = tasaAeroportuaria;

	}
    @Override
	public void precioFinal() {
		float tasa1 = ((super.getPrecioBase() + tasaAeroportuaria) * 1.21f);
		System.out.println(tasa1);
	}

}
