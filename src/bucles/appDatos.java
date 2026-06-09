package bucles;

import java.util.Scanner;

public class appDatos {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double suma = 0;
        double gasto = 0;
        String continuar="";

        while (!continuar.equals("no")){
            System.out.println("ingrese el monto del gasto");
            gasto = entradaDatos.nextDouble();
            entradaDatos.nextLine();

            suma = suma + gasto;

            System.out.println("¿desea ingresar otro gasto? (si/no)");
            continuar = entradaDatos.nextLine();
        }

        System.out.println("suma total de los gastos: $" + suma);


        entradaDatos.close();
    }
}
