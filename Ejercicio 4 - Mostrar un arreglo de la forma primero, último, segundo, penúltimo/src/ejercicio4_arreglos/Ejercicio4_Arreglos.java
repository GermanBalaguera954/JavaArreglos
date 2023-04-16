/*
Ejercicio4: Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orden:
el primero, el ultimo, el segundo, el penultimo, el tercero, etc.
 */
package ejercicio4_arreglos;

import java.util.Scanner;

public class Ejercicio4_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10]; //Arreglo de 10 elementos

        //Pedimos arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }
        System.out.print("El resultado es: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " "); //Imprime el primero, segundo
            System.out.print(numeros[9 - i] + " "); //Imprime el ultimo, penultimo
        }
        System.out.println();
    }
}
