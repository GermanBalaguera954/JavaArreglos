/*
Ejercicio15: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe
mostrar la posicion en la que se encuentra. Si no esta, indicarlo con un mensaje.
 */
package ejercicio15_arreglos;

import java.util.Scanner;

public class Ejercicio15_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], numero;
        boolean creciente = true;

        arreglo = new int[10];//creamos arreglo con 10 elementos.

        do {
            //Pedimos el arreglo.
            System.out.println("Llenar el arreglo: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + ". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }

            //Verificar el arreglo si esta ordenado.
            for (int i = 0; i < 9; i++) {
                if (arreglo[i] < arreglo[i + 1]) {//Creciente 1-2-3-4
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {//Decreciente 4-3-2-1
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("\nEl arreglo esta desordenado, digite de nuevo:\n");
            }
        } while (creciente == false);

        //Pedimos el numero a buscar
        System.out.print("\nDigite el numero a buscar en el arreglo: ");
        numero = entrada.nextInt();

        //Buscamos el numero en el arreglo
        int i = 0;
        while (i < 10 && arreglo[i] < numero) {
            i++;
        }

        if (i == 10) {//Hemos recorrido todo el arreglo y no encontramos nada.
            System.out.println("\nNumero no encontrado");
        } else {
            if (arreglo[i] == numero) {
                System.out.println("\nNumero encontrado, en la posicion: " + i);
            } else {
                System.out.println("\nNumero encontrado");
            }
        }
    }
}
