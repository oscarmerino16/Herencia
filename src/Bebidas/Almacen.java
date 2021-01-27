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
			for (int j = 0; j < mEstanteria.length; j++) {
				if (mEstanteria[i][j]!=null && i==1) {
					precioTotal += mEstanteria[i][j].getPrecio();
				}
			}
		}
		
		return precioTotal;
		
	}
	
	
public void addProducto() {
		
		Azucarada a = new Azucarada("951", 9, 9, "cola loca", 9, false);
		String cod=a.getId();
		boolean esta = false, para=false;
		
		
		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria.length; j++) {
				if (mEstanteria[i][j]!=null && mEstanteria[i][j].getId().equalsIgnoreCase(cod)) {
					esta=true;
					System.out.println("Tu producto ya esta en stock");
					break;
				}
			}
		}
		
		if (esta==false) {
			for (int i = 0; i < mEstanteria.length; i++) {
				for (int j = 0; j < mEstanteria.length; j++) {
					if (mEstanteria[i][j]==null) {
						mEstanteria[i][j]=a;
						System.out.println("Producto añadido");
						para=true;
						break;
					}
				}
				if (para==true) {
					break;
				}
			}
		}
		
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
String info= "";
		
		for (int i = 0; i < mEstanteria.length; i++) {
			for (int j = 0; j < mEstanteria.length; j++) {
				if (mEstanteria[i][j]!=null) {
					info += mEstanteria[i][j].toString();
				}
			}
		}
		
		return "Esto es lo que hay en el almacen \n"+info+"\n";
		
	}
	}

	


	
	
	
	

