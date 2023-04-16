/*
Ejercicio7: Leer por teclado una serie de 10 numeros enteros. La aplicacion debe de indicarnos
si los numeros estan ordenados de forma creciente, decreciente o si estan desordenados.
 */
package ejercicio7_arreglos;

import java.util.Scanner;

public class Ejercicio7_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Se crea el arreglo de 10 elementos.
        boolean creciente = false, decreciente = false;

        //Se solicita el arreglo
        System.out.println("Digite el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digiete un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (arreglo[i] < arreglo[i + 1]) {//Para los datos crecientes.
                creciente = true;
            }
            if (arreglo[i] > arreglo[i + 1]) {//Para los datos decrecientes.
                decreciente = true;
            }
        }

        if (creciente == true && decreciente == false) {
            System.out.println("\nEl arreglo esta en forma creciente");
        } else if (creciente == false && decreciente == true) {
            System.out.println("\nEl arreglo esta en forma decreciente");
        } else if (creciente == true && decreciente == true) {
            System.out.println("\nEl arreglo esta desordenado");
        } else if (creciente == false && decreciente == false) {
            System.out.println("\nTodos los numeros del arreglo son iguales");
        }
    }
}
