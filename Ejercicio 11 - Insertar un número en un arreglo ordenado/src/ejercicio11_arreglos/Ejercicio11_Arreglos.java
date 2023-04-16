/*
Ejercicio11: Leer 5 elementos numericos que se introduciran ordenados de forma creciente
estos los guardaremos en una tabla de tamaño 10. Leer un numero N, e insertarlo en un lugar adecuado
para que la tabla continue ordenada.
 */
package ejercicio11_arreglos;

import java.util.Scanner;

public class Ejercicio11_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];//creamos el arreglo de 10 elementos
        boolean creciente = true;
        int numero, sitioNumero = 0, j = 0;

        System.out.println("Llenar el arreglo");
        do {
            //Llenando el arreglo            
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + " .Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            
            //Comprobar si el arreglo esta ordenado en forma creciente
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i + 1]) {//Creciente en forma 1 2 3 4 5
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {//Decreciente 4-3-2-1
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("\nEl arreglo no esta ordenado en forma creciente, vuelva a digitarlo\n");
            }

        } while (creciente == false);
        System.out.print("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();

        //Este es para darnos cuenta en que posicion va el numero
        while (arreglo[j] < numero && j < 5) {
            sitioNumero++;
            j++;
        }

        //Por ultimo, trasladamos una posicion el arreglo a los elementos que van detra de numero.
        for (int i = 4; i >= sitioNumero; i--) {
            arreglo[i + 1] = arreglo[i];
        }

        //Insertamos el numero que le usuario ha puesto
        arreglo[sitioNumero] = numero;
        System.out.println("\nEl arreglo queda: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}
