package ejercicios;

/*
 * Crea una tabla de enteros de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100.  
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		int[] tabla = new int[10];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100 + 1);
		}
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.printf("%d ", tabla[i]);
		}
	}
}
