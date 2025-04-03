package EXPractica;

public class Hotel extends ServicioTuristico {

	private int noches;
	private float suplementoDesayuno;

	public Hotel(String codigo, String descripcion, String proveedor, int plazasDisponibles, float precioBase,
			String fechaInicio, int noches, float suplementoDesayuno) {
		super(codigo, descripcion, proveedor, plazasDisponibles, precioBase, fechaInicio);

		this.noches = noches;
		this.suplementoDesayuno = suplementoDesayuno;
	}

	@Override
	public void precioFinal() {
		
		float precioF = ((super.getPrecioBase() * this.noches) + this.suplementoDesayuno) * 1.10f;
		
		System.out.println(precioF);
	}
}
