package Bebidas;

import java.util.Arrays;

public class Almacen {

	private String nombre;
	
	private Bebida mEstanteria [][];

	public Almacen(String nombre) {
		super();
		this.nombre = nombre;
		this.mEstanteria = new Bebida[5][5];
		mEstanteria[0][0] = new Azucarada("1", 7.5, 5, "cocacola", 6, true);
	}
	
	public float calcularPrecioTotal() {
		
		float precioTotal=0;
		
		for (Bebida[] bebidas : mEstanteria) {
			for (Bebida bebida : bebidas) {
				if(bebida !=null) {
					precioTotal+=bebida.getPrecio();
				}
			}
		}
		return precioTotal;
		
	}
	
	public float calcularPrecioTotalMarca() {
		
		float precioTotal=0;
		
		for (Bebida[] bebidas : mEstanteria) {
			for (Bebida bebida : bebidas) {
				if((bebida !=null) && bebida.getMarca().equalsIgnoreCase("cocacola")) {
					precioTotal+=bebida.getPrecio();
				}
			}
		}
		return precioTotal;
		
	}
	
	public float calcularPrecioTotalEstanteria() {
		
		float precioTotal=0;
		
		for (int i = 0; i < mEstanteria.length; i++) {
			
		}
		
		return precioTotal;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + ", mEstanteria=" + Arrays.toString(mEstanteria) + "]";
	}

	


	
	
	
	
}
