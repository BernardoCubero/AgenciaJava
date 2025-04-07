package EXPractica;

public class Excursion extends ServicioTuristico{
	
	
	private boolean incluyeGuia = false;
	private float costeGuia;

	public Excursion(String codigo, String descripcion, String proveedor, int plazasDisponibles, float precioBase,
			String fechaInicio, boolean incluyeGuia, float costeGuia) {
		super(codigo, descripcion, proveedor, plazasDisponibles, precioBase, fechaInicio);
		this.incluyeGuia = incluyeGuia;
		this.costeGuia=costeGuia;
	}

	@Override
	public void precioFinal() {
		if(!incluyeGuia) {
			float coste = (super.getPrecioBase() * this.costeGuia) * 0.4f;
			System.out.println(coste);
		}else {
			System.out.println("No tiene contratado guia");
		}
		
	}
	

}
