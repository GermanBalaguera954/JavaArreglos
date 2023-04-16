/*
Ejercicio10: Crear un programa que lea por teclado una tabla de 10 numeros enteros
y desplace  N posiciones en el arreglo (N es digitado por el usuario).
 */
package ejercicio10_arreglos;

import java.util.Scanner;

public class Ejercicio10_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];//creamos el arreglo de 10 elementos
        int nPosicion, ultimo;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("\nDigite la cantidad de posiciones a desplazar: ");
        nPosicion = entrada.nextInt();

        for (int vuelta = 1; vuelta <= nPosicion; vuelta++) {
            ultimo = arreglo[9];// Guardamos el ultimo elemento del arreglo
            for (int i = 8; i >= 0; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[0] = ultimo;//Ponemos el ultimo elemento como primero
        }

        System.out.println("\nEL arreglo resultante es: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " . Elemento " + arreglo[i]);
        }
    }
}
