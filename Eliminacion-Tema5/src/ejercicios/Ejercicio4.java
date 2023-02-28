package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

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
		int tabla[] = new int[20];

		int num;

		int posicion = 0;

		Scanner key = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}

		System.out.println("El valor de la tabla actual es: ");
		System.out.println(Arrays.toString(tabla));

		System.out.println("Deme un valor: ");
		num = key.nextInt();

		while (posicion < tabla.length) {
			if (tabla[posicion] > num) {
				System.arraycopy(tabla, posicion + 1, tabla, posicion, tabla.length - posicion - 1);
				tabla = Arrays.copyOf(tabla, tabla.length - 1);
			} else {
				posicion++;
			}
		}
		System.out.println(Arrays.toString(tabla));

	}

}
