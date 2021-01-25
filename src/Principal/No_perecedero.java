package Principal;

public final class No_perecedero extends Producto {

	private String tipo;

	public No_perecedero(String nombre, float precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "No_perecedero [tipo=" + tipo + "]";
	}
	
	
	
}
