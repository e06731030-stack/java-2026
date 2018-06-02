package selectivas;

import java.util.Scanner;

public class Anidadas {
    public static void main(String[] args) {
        //crear un algoritmo que permita evaluar si un estudiamte aprovo
        // y obtuvo una buena calificacion

        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("ingrese una calificacion");
        int calificacion = entradaDatos.nextInt();

        if (calificacion >= 13){
            System.out.println("has aprobado");
            if (calificacion >= 15);{
                System.out.println("obtuviste una buena calificacion");
            }
        }else {
            System.out.println("has reprobado el curso, sigue estudiando");
        }

        entradaDatos.close();
    }
}
