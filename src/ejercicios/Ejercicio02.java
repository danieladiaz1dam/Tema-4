package ejercicios;

/*
 * Partiendo de la tabla creada en el ejercicio 1, mostrar la suma de todos los
 * números aleatorios que se guardan en la tabla.
 */

public class Ejercicio02 {
	public static void main(String[] args) {
		int[] tabla = new int[10];
		int suma = 0;

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100 + 1);
		}

		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}

		for (int i = 0; i < tabla.length; i++) {
			System.out.printf("%d ", tabla[i]);
		}

		System.out.printf("\nSuma: %d", suma);
	}
}
