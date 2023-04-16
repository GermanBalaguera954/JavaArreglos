/*
Ejercicio12: Leer por teclado un tabla de 10 elementos numericos enteros y una posicion
(entre 0 y 9). Eliminar el elemento situado en la posicion dada sin dejar huecos.
 */
package ejercicio12_arreglos;

import java.util.Scanner;

public class Ejercicio12_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];//creamos el arreglo de 10 elementos
        int posicion;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //pedimos la posicion en el rango de 0 a 9
        do {
            System.out.print("\nDigite una posicion entre (0y9): ");
            posicion = entrada.nextInt();
        } while (posicion < 0 || posicion > 9);

        //Eliminando el elemento de la posicion indicada
        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        System.out.println("\nEl arreglo queda de la siguiente manera: ");
        for (int i = 0; i < 9; i++) {
            System.out.println(i + ". Elemento: " + arreglo[i]);
        }
    }
}
