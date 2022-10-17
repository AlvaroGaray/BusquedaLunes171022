package Ordenamientos;
import java.util.*;
public class BusquedaBinaria {

	static Scanner es =new Scanner(System.in);
	
	public static int BusquedaBinariaIterativa(int A[], int n, int buscado) {
		int indiceIzq=0;
		int indiceDer=n-1;
		
		while(indiceIzq<=indiceDer) {
			int indiceMedio=Math.round(indiceIzq+indiceDer);
			if(A[indiceMedio]==buscado){
				return indiceMedio;
			}else if(A[indiceMedio]>buscado){
				indiceDer=indiceMedio-1;
			}else if(A[indiceMedio]<buscado)
				indiceIzq=indiceMedio +1;
			
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
		
		int hallado =BusquedaBinariaIterativa(A, A.length, buscado);
		
		if(hallado != -1) {
			
			System.out.println("El valor "+ buscado + " Fue encontrado en la posicion "+ hallado);
			
		}else {
			System.out.println("El valor "+ buscado +" no fue encontrado");
		}
		
		
		
	}

}
