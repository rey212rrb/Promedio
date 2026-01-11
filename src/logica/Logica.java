package logica;




/*
* cambios realizados en la rama desarrollo_Diego:Prueba
* */

public class Logica {
    public static double media(int[] arreglo){

        double suma = 0;

        for(int numero:arreglo){

            suma += numero;

        }

        if(arreglo.length > 0){

            return suma / arreglo.length;

        }else{

            return 0;

        }

    }

}


