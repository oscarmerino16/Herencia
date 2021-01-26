package Principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Producto vProductos[]=new Producto[10];
		
		vProductos[0]=new Perecedero("huevos",3.25f,1); // 1 dia reduce 4 veces
		vProductos[1]=new Perecedero("leche",1.5f,2); // 2 dias reduce 3 veces
		vProductos[2]=new Perecedero("galletas",2.5f,3); // 3 dias reduce a la mitad
		vProductos[3]=new Perecedero("chocolate",0.75f,4); // 4 dias no descuento
		vProductos[4]=new No_perecedero("cepillo",3.5f,"limpieza");
		vProductos[5]=new No_perecedero("fregona",4.75f,"limpieza");
	
		
		Scanner leer=new Scanner(System.in);
		int cantidad=0;
			
		System.out.println("Cantidad de articulos");
		cantidad=leer.nextInt();
		
		
		for (Producto p : vProductos) {
			if (p!=null) {
				System.out.println(p.getNombre() + " " + p.calcular(cantidad) + "�");
			}
			
		}
		
	}

	}


