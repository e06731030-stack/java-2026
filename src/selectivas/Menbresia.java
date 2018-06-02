package selectivas;

import java.util.Scanner;

public class Menbresia {
    public static void main(String[] args) {
        // se pide crear un algoritmo para una tienda que quiere aplicar descuentos a sus clientes
        //si la conpra >= a 500 y el cliente tiene una menbresia obtiene el 20% de descuento si no
        // tiene obtienbe el 10% y si no cumple nunguno no tiene descuento

        Scanner entradaDatos = new Scanner(System.in);

        System.out.printf("ingrese el monto de su compra: ");
        double montocompra = entradaDatos.nextDouble();

        System.out.printf("¿tienes menbresia? si o no: ");
        String menbresia = entradaDatos.nextLine();

        if (montocompra >= 500){
            System.out.println("usuario correcto");
            if (menbresia.equalsIgnoreCase("si")){
                double descuento = montocompra * 1.20;
                descuento = montocompra - descuento;
                System.out.println("tu descuento es el 20% " + descuento);
            }else{
                double descuento = montocompra * 1.10;
                descuento = montocompra - descuento;
                System.out.println("tu descuento es el 20% " + descuento);
            }

        }else{
            System.out.printf("no tienes descuento");
        }

        entradaDatos.close();
    }
}
