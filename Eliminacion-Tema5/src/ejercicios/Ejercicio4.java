package ejercicios;

import java.util.Arrays;

/**
 * Escribir un programa que genere 20 números enteros aleatorios entre 0 y 10 y
 * los almacene en una tabla. A continuación, debe solicitar al usuario un
 * número entero. El programa debe eliminar de la tabla todos los números que
 * sean mayores que un número dado. La tabla no está ordenada ni hay que
 * ordenarla.
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		int tabla [] = new int [20];
		
		for (int i = 0; i<tabla.length; i++) {
			tabla[i] = (int) (Math.random()*10);
		}
		
		System.out.println(Arrays.toString(tabla));
	}

}
