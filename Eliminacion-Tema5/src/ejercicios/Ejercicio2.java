package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	static boolean esPrimo(int numero) {
		boolean estado = true;
		if (numero <= 1) {
			estado = false;
		}

		else {
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					estado = false;
					break;
				}
			}
		}
		return estado;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numEnteros[] = new int[10];

		System.out.println("Introduce 10 números enteros: ");

		for (int i = 0; i < numEnteros.length; i++) {
			numEnteros[i] = read.nextInt();
		}
		System.out.println(Arrays.toString(numEnteros));

		int posicion = 0;
		while (posicion < numEnteros.length) {
			if (esPrimo(numEnteros[posicion])) {
				posicion++;
			}

			else {
				System.arraycopy(numEnteros, posicion + 1, numEnteros, posicion, numEnteros.length - posicion - 1);
				numEnteros = Arrays.copyOf(numEnteros, numEnteros.length - 1);
			}

		}

		System.out.println(Arrays.toString(numEnteros));

	}

}
