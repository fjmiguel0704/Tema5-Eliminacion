package ejercicios;

import java.util.Arrays;

/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
 * que los almacene en un array. El programa debe eliminar todos los números
 * impares. No se debe cambiar el orden en el que están insertados los
 * elementos.
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int aleatorios[] = new int[20];

		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = (int) (Math.random() * 100);
		}

		System.out.println(Arrays.toString(aleatorios));
		
		int posicion=0;
		while (posicion<aleatorios.length) {
			if (aleatorios[posicion] % 2 == 0) {
					posicion++;
			}
			
			else {
				System.arraycopy(aleatorios, posicion+1, aleatorios, posicion, aleatorios.length -posicion- 1);
				aleatorios = Arrays.copyOf(aleatorios, aleatorios.length-1);
			}
		}
		
		System.out.println(Arrays.toString(aleatorios));

	}

}
