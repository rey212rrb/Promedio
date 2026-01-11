package presentacion;

import logica.Logica;

import java.util.Scanner;

public class Presentacion {

        private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args){

            System.out.println("Promedio ");

            System.out.println("Cuantos numeros ingresara: ");
            int tamanio = sc.nextInt();

            int[] arreglo = new int[tamanio];

            System.out.println("Ingrese " + tamanio + " numeros: ");

            for(int i = 0; i < arreglo.length; i++){

                System.out.print("Numero " + i + ": ");
                arreglo[i] = sc.nextInt();

            }

            var promedio = Logica.media(arreglo);

            System.out.println("El primedio es: " + promedio);

        }

}

//Cambios desarrollo en la rama desarrollo-rey
