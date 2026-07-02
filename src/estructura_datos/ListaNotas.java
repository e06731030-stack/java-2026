package estructura_datos;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNotas {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        List<Integer> notas = new ArrayList<>();
        int cantidadNotas;

        System.out.println("cuantas notas deseas ingresar");
        cantidadNotas = entradaDatos.nextInt();
        for (int iterador = 0; iterador < cantidadNotas; iterador++){
            System.out.println("ingrese la nota: "+ (iterador + 1));
            int nota =  entradaDatos.nextInt();
            notas.add(nota);

        }
        System.out.println("mostrando notas");
        for(int iterador = 0; iterador < notas.size(); iterador++) {
            System.out.println("la nota " + (iterador +1) +"es"+ notas.get(iterador));
            int nota =  notas.get(iterador);

            if (nota >= 13){
                System.out.println("la nota" +(iterador +1)+ "es" + nota+ "aprobado");
            }else {
                System.out.println("la nota" +(iterador +1)+ "es" + nota+ "desaprobado");
            }

        }





        entradaDatos.close();

    }
}
