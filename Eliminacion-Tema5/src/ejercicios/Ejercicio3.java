package ejercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Scanner;
	/**
	 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú 
	 * 	con distintas opciones:
			a. Mostrar valores.
			b. Eliminar valor.
			c. Salir.
		La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V 
		y eliminará todas las apariciones de V del array. El menú se repetirá indefinidamente 
		hasta que el usuario elija la opción ‘c’ que terminará el programa.

	 * @author fjmiguel
	 *
	 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int tabla [] = new int [10];
		
		System.out.println("Introduce 10 números enteros: ");
		for (int i = 0; i<tabla.length; i++) {
			tabla[i]=read.nextInt();
		}
		
		
		String opcion;
		int valorEliminar;
		do {
			System.out.println("Introduce una de las siguientes opciones: ");
			System.out.println("a. Mostrar valores");
			System.out.println("b. Eliminar valor");
			System.out.println("a. Salir");
			opcion=read.next();
			
			switch (opcion) {
			case "a":
				System.out.println(Arrays.toString(tabla));
				break;
			case "b":
				System.out.println("Introduce el valor que desea eliminar:");
				valorEliminar=read.nextInt();
				
				int indiceBorrar = Arrays.binarySearch(tabla, valorEliminar);
				
				if (indiceBorrar>=0) {
					System.arraycopy(tabla, indiceBorrar+1, tabla, indiceBorrar, tabla.length-indiceBorrar-1);
					
					tabla = Arrays.copyOf(tabla, tabla.length-1);
					
					System.out.println(Arrays.toString(tabla));
				}
				
			case "c":
				break;
				default:
					System.out.println("La opción introducida no es correcta");
				
			}
		}while (!opcion.equals("c"));
	}

}
