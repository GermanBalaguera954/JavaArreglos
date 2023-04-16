/*
Ejercicio3: Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar
la media de los numeros positivos, la media de los negativos y contar el numero de ceros.
 */
package ejercicio3_arreglos;

import java.util.Scanner;

public class Ejercicio3_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float sumaPos = 0, sumaNeg = 0, mediaPos, mediaNeg;
        int conteoPos = 0, conteoNeg = 0, conteoCeros = 0;

        System.out.println("Guardando los numeros en el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            numeros[i] = entrada.nextFloat();

            if (numeros[i] == 0) {
                conteoCeros++;
            } else if (numeros[i] > 0) {
                sumaPos += numeros[i];
                conteoPos++;
            } else {
                conteoNeg += numeros[i];
                conteoNeg++;
            }
        }
        // Media de los numeros positivos
        if (conteoPos == 0) {
            System.out.println("No se puede sacar la media de los numeros positivos: ");
        } else {
            mediaPos = sumaPos / conteoPos;
            System.out.println("La media de los numeros positivos es: " + mediaPos);
        }

        // Media de los numeros positivos
        if (conteoNeg == 0) {
            System.out.println("No se puede sacar la media de los numeros Negativos: ");
        } else {
            mediaNeg = sumaNeg / conteoNeg;
            System.out.println("La media de los numeros negativos es: " + mediaNeg);
        }

        System.out.println("La cantidad de ceros es: " + conteoCeros);
    }

}
