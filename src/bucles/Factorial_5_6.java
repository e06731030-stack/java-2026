package bucles;

import java.util.Scanner;

public class Factorial_5_6 {
    public static void main(String[] args) {

        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entradaDatos.nextInt();

        int factorial = 1;
        for (int i = 1; i <= numero; i++){
            factorial *= i;
        }
        System.out.println("El factorial es: "+ factorial);
        entradaDatos.close();
    }
}
