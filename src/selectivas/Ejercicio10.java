package selectivas;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        double costo;

        System.out.printf("ingrese el costo del producto");
        costo = entradaDatos.nextDouble();

        if (costo > 200){
            System.out.println("se paga en efectivo");
        }else if (costo < 200){
            System.out.println("se paga en tarjeta");
        }


        entradaDatos.close();
    }

}
