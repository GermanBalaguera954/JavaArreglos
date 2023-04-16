/*
Ejercicio9: Crear un programa que lea por teclado una tabla de 10 numeros enteros y la desplace
una posicion hacia abajo: el primero pasa a ser segundo, el segundo pasa a ser tercero  y asi
sucesivamente. El ultimo pasar a ser el primero.
 */
package ejercicio9_arreglos;

import java.util.Scanner;

public class Ejercicio9_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];//creamos el arreglo de 10 elementos
        int ultimo;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        ultimo = arreglo[9]; //Guardamos el ultimo elemento.

        for (int i = 8; i >= 0; i--) {//avanzar una posicion abajo en el arreglo
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[0] = ultimo; //ponemos el ultimo elemento como el primero
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " .Numero: " + arreglo[i]);
        }
    }
}
