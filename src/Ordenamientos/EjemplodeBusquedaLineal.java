package Ordenamientos;
import java.util.*;
public class EjemplodeBusquedaLineal {

	static Scanner es =new Scanner(System.in);
	
	 public static int busquedaLineal(int A[], int n, int buscado) {
		//String Array[] = new String[tamaño];
		int indice=0;
		while (indice < n) {
			if(A[indice] == buscado) {
				return indice;
			}
			indice++;
		}
		
		return -1;
	 }  
	
	public static void main(String[] args) {
		
		
		System.out.println("Ingrese el tamanho del Arreglo");
		int n=es.nextInt();
		int A[]=new int[n]; 
		
		System.out.println("Ingrese Los elementos del Arreglo");
		for(int i=0;i<n; i++) {
			
			System.out.println("Elemento ["+ i +"] =");
			A[i]=es.nextInt();
			
			
		}
		
		System.out.println("Que numero Buscara?");
		int buscado=es.nextInt();
		
		int hallado =busquedaLineal(A, A.length, buscado);
		
		if(hallado != -1) {
			
			System.out.println("El valor "+ buscado + " Fue encontrado en la posicion "+ hallado);
			
		}else {
			System.out.println("El valor "+ buscado +" no fue encontrado");
		}
		
		
	}

}
