/*
Ejercicio16: Queremos desarrollar una aplicacion que nos ayude a gestionar las notas de un centro
educativo. Cada grupo o clase esta compuesto por 5 alumnos. Se pide leer la notas del primer, segundo 
y tercer trimestre de un grupo. Debemos mostrar al final: la nota medeia del grupo en cada trimestre 
y la media del alumno que se encuentra en la posicion N (N se lee por teclado).
 */
package ejercicio16_arreglos;

import java.util.Scanner;

public class Ejercicio16_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float primer[], segundo[], tercer[];
        float sumaPrimer = 0, sumaSegundo = 0, sumaTercer = 0, sumaAlumno = 0;
        float promedioPrimer, promedioSegundo, promedioTercer, promedioAlumno;
        int posicion;

        primer = new float[5];//Creamos el arreglo con 5 elementos.
        segundo = new float[5];//Creamos el arreglo con 5 elementos.
        tercer = new float[5];//Creamos el arreglo con 5 elementos.

        System.out.println("Digite las notas del primer trimestre: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno[" + i + "]: ");
            primer[i] = entrada.nextFloat();

            sumaPrimer += primer[i];//Sumamos todas las notas del primer trimestre.
        }

        System.out.println("Digite las notas del segundo trimestre: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno[" + i + "]: ");
            segundo[i] = entrada.nextFloat();

            sumaSegundo += segundo[i];//Sumamos todas las notas del primer trimestre.
        }

        System.out.println("Digite las notas del tercer trimestre: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno[" + i + "]: ");
            tercer[i] = entrada.nextFloat();

            sumaTercer += tercer[i];//Sumamos todas las notas del tercer trimestre.
        }

        //Sacamos cada uno de los promedios de los trimestres.
        promedioPrimer = sumaPrimer / 5;
        promedioSegundo = sumaSegundo / 5;
        promedioTercer = sumaTercer / 5;

        //Ahora pedimos la posicion del alumno N para sacar su promedio
        do {
            System.out.print("\nDigite la posicion del alumno entre(0y4) para sacar el promedio: ");
            posicion = entrada.nextInt();
        } while (posicion < 0 || posicion > 4);

        //Sacamos las suma de las notas del alumno.
        sumaAlumno = primer[posicion] + segundo[posicion] + tercer[posicion];
        promedioAlumno = sumaAlumno / 3;

        System.out.println("\nMostrando los datos requeridos");
        System.out.println("Promedio Primer Trimestre: " + promedioPrimer);
        System.out.println("Promedio Segundo Trimestre: " + promedioSegundo);
        System.out.println("Promedio Tercer Trimestre: " + promedioTercer);
        System.out.println("Promedio Alumno: " + promedioAlumno);
    }
}
