/*
Ejercicio13: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares
de la primera , y a continuacion los elementos impares.
 */
package ejercicio13_arreglos;

import java.util.Scanner;

public class Ejercicio13_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];//creamos el arreglo de 10 elementos
        int contePares = 0, conteoImpares = 0;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();

            if (arreglo[i] % 2 == 0) {//si el numero es par
                contePares++;
            } else {//Si el numero es impar.
                conteoImpares++;
            }
        }

        //Crear los arreglos siguientes
        int par[] = new int[contePares];//Creamos el arreglo para almacenar los numero pares.
        int impar[] = new int[conteoImpares];//Creamos el arreglo para almacenar los numero Impares.

        contePares = 0;
        conteoImpares = 0;

        //Almacenamos los numeros pares en su arreglo y los impares tambien.
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {//Si el numero es par
                par[contePares] = arreglo[i];
                contePares++;
            } else {//Si el numero es impar
                impar[conteoImpares] = arreglo[i];
                conteoImpares++;
            }
        }
        System.out.print("\nArreglo pares: ");
        for (int i = 0; i < contePares; i++) {
            System.out.print(par[i] + " - ");
        }
        System.out.println();

        System.out.print("\nArreglo impares: ");
        for (int i = 0; i < conteoImpares; i++) {
            System.out.print(impar[i] + " - ");
        }
        System.out.println();
    }
}
