package bucles;

import java.util.Scanner;

public class App_Datos {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double gastos = 0, totalgastos =0;
        System.out.println("ingrese su gasto, si no tiene ingrese 0");
        gastos = entradaDatos.nextDouble();
        if (gastos == 0){
            System.out.println("no tienes ningun gasto");
        }
        while (gastos != 0){
            totalgastos = totalgastos + gastos;
            System.out.println("mis gastos son: "+ totalgastos);
            System.out.println("ingrese su gasto");
            gastos = entradaDatos.nextDouble();
        }
        entradaDatos.close();
    }
}
