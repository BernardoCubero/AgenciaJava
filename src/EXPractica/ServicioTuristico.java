package EXPractica;

public abstract class ServicioTuristico {

	protected String codigo;
	protected String descripcion;
	protected String proveedor;
	protected int plazasDisponibles;
	protected float precioBase;
	protected String fechaIncio;

	public ServicioTuristico(String codigo, String descripcion, String proveedor, int plazasDisponibles,
			float precioBase, String fechaInicio) {

		this.codigo = codigo;
		this.descripcion = descripcion;
		this.proveedor = proveedor;
		this.plazasDisponibles = plazasDisponibles;
		this.precioBase = precioBase;
		this.fechaIncio = fechaIncio;

	}
 // clase abstract
	
	public abstract void precioFinal();
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}

	public void setPlazasDisponibles(int plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getFechaIncio() {
		return fechaIncio;
	}

	@Override
	public String toString() {
		return "ServicioTuristico Codigo: " + codigo + ", Descripcion: " + descripcion + ", Proveedor: " + proveedor
				+ ", Plazas Disponibles: " + plazasDisponibles + ", Precio Base: " + precioBase + ", Fecha Incio: "
				+ fechaIncio + " ";
	}
	
	

}
