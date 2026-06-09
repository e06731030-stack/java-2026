package bucles;

import java.util.Scanner;

public class Menbresia_02 {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double monto = 0;
        double montototal = 0;
        String menbresia ="";

        System.out.printf("ingrese el monto de su compra, si no tiene ingrese 0");
        monto = entradaDatos.nextDouble();
        if (monto == 0 && menbresia.equals("si")){
            System.out.println("no tiene monto de compra");
        }
        while (monto != 0){
            montototal = montototal + monto;
            System.out.println("mi monto es: "+ montototal);
            System.out.println("ingrese su monto de compra");
            monto = entradaDatos.nextDouble();
        }
        entradaDatos.close();
    }
}
