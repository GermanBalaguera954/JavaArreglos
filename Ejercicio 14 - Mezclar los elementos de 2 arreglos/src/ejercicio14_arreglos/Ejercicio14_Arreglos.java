/*
Ejercicio14: Leer dos series de 10 enteros, que estaran ordenados crecientemente. Copiar (Fusionar)
las dos tablas  en una tercera, de forma que sigan ordenadas.
 */
package ejercicio14_arreglos;

import java.util.Scanner;

public class Ejercicio14_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        boolean creciente = true;

        a = new int[10];//creamos el arreglo de 10 elementos
        b = new int[10];//creamos el arreglo de 10 elementos
        c = new int[20];//creamos el arreglo de 20 elementos

        System.out.println("Llenar el primer arreglo");
        do {
            //Pedimos el arreglo
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un numero: ");
                a[i] = entrada.nextInt();
            }

            //comprobamos si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if (a[i] < a[i + 1]) {// creciente 1-2-3-4
                    creciente = true;
                }
                if (a[i] > a[i + 1]) {//Decreciente -4-3-2-1
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("\nEl arreglo esta desordenado, vuelva a digitar: ");
            }
        } while (creciente == false);

        System.out.println("Llenar el segundo arreglo");
        do {
            //Pedimos el arreglo
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un numero: ");
                b[i] = entrada.nextInt();
            }

            //comprobamos si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if (b[i] < b[i + 1]) {// creciente 1-2-3-4
                    creciente = true;
                }
                if (b[i] > b[i + 1]) {//Decreciente -4-3-2-1
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("\nEl arreglo esta desordenado, vuelva a digitar: ");
            }
        } while (creciente == false);

        int i = 0;//Iterador i sera para el arreglo a.
        int j = 0;//Iterador j sera para el arreglo b.
        int k = 0;//Iterador k sera para el arreglo c.

        while (i < 10 && j < 10) {
            if (a[i] < b[j]) {//Si el elemento de "a" es menor que el de "b".
                c[k] = a[i]; //copiamos el elemento de a.
                i++;// Avanzamos una posicion en a               
            } else {
                c[k] = b[j];//copiamos el elemento de b.
                j++;//Avanzamos una posicion mas en b
            }
            k++;//Avanzamos una posicion en c.
        }

        //Cuando salimos de while es por que un arreglo (a o b), se ha copidado completamente.
        if (i == 10) {//Significa que ya copiamos todo el arreglo a, falta b.
            while (j < 10) {
                c[k] = b[j];//copiamos el elemento de b en c.
                j++;//Avanzamos una posicion en b.
                k++;//Avanzamos una posicion en c.
            }

        } else {//Significa que ya copiamos todo el arreglo b, fala el arreglo a
            while (i < 10) {
                c[k] = a[i];
                i++;
                k++;
            }
        }
        System.out.println("\nEl arreglo c completo es: ");
        for (k = 0; k < 20; k++) {
            System.out.print(c[k] + " - ");
        }
        System.out.println();
    }
}
