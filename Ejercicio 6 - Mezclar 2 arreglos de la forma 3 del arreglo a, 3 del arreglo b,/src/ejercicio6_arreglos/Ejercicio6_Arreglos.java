/*
Ejercicio6: Leer los datos correspondientes a dos tablas de 12 elementos numericos, y mezclarlos en
una tercera tabla de forma: 3 de la tabla A, 3 de la tabla B, otros 3 de la tabla A, otros 3 de la
tabla B, etc.
 */
package ejercicio6_arreglos;

import java.util.Scanner;

public class Ejercicio6_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        int i, j;

        a = new int[12];//Arreglo de 12 elementos.
        b = new int[12];//Arreglo de 12 elementos.
        c = new int[24];//Arreglo de 24 elementos.

        //Solicitamo el arreglo a.        
        System.out.println("Digite el primer arreglo");
        for (i = 0; i < 12; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            a[i] = entrada.nextInt();
        }

        //Solicitamo el arreglo b.        
        System.out.println("\nDigite el primer arreglo");
        for (i = 0; i < 12; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            b[i] = entrada.nextInt();
        }

        //Se mezcla los arreglos a[] y b[].
        //El iterador "i" se utiliza para los arreglos a y b.
        //El iterador "j" se utiliza para el arreglo c.
        i = 0;
        j = 0;

        while (i < 12) {
            //Copiar los tres elementos de a[].
            for (int k = 0; k < 3; k++) {
                c[j] = a[i + k];
                j++;
            }
            //Copiar los tres elementos de b[].
            for (int k = 0; k < 3; k++) {
                c[j] = b[i + k];
                j++;
            }
            i += 3;
        }

        System.out.println("\nEl arreglo resultante es: ");
        for (i = 0; i < 24; i++) {
            System.out.print(c[i] + " - ");
        }
        System.out.println();
    }
}
