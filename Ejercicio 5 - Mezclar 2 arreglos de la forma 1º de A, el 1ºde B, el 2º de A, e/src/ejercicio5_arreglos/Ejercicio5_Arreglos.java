/*
Ejercicio5: Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la forma:
el primero de A, el primero de B, el segundo de A, el segundo de B, etc.
 */
package ejercicio5_arreglos;

import java.util.Scanner;

public class Ejercicio5_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a[], b[], c[];
        a = new int[10];//Arreglo a con 10 elementos.
        b = new int[10];//Arreglo a con 10 elementos.
        c = new int[20];//Arreglo a con 20 elementos.

        //Pedimos el arreglo a:        
        System.out.println("Digite el primer arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1 + ". Digite un numero: "));
            a[i] = entrada.nextInt();
        }

        //Pedimos el arreglo b:        
        System.out.println("\nDigite el segundo arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1 + ". Digite un numero: "));
            b[i] = entrada.nextInt();
        }

        //Ahora se mezclan los dos arreglos.
        //vamos a utilizar el iterador "i" para los arreglos a y b.
        //vamos a utilizar el iterador "j" para el arreglo c.
        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i];//Primero elemento del a.
            j++;
            c[j] = b[i];//Primero elemento del b.
            j++;
        }
        System.out.print("\nEl tercer arreglo es: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}
