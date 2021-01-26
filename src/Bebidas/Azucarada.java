package Bebidas;

public final class Azucarada extends Bebida {

	private double porcentejeazucar;
	private boolean promocion;

	

	public Azucarada(String id, double litros, double precio, String marca, double porcentejeazucar,
			boolean promocion) {
		super(id, litros, precio, marca);
		this.porcentejeazucar = porcentejeazucar;
		this.promocion = promocion;
	}

	public double getPorcentejeazucar() {
		return porcentejeazucar;
	}

	public void setPorcentejeazucar(double porcentejeazucar) {
		this.porcentejeazucar = porcentejeazucar;
	}
	
	
	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public double getPrecio() {
		
		if (promocion==true) {
			return super.getPrecio()*0.9;
		}else {
		return super.getPrecio();
		}
	}

	@Override
	public String toString() {
		return "Azucarada [porcentejeazucar=" + porcentejeazucar + ", promocion=" + promocion + "]";
	}

	
	
	
	
}
