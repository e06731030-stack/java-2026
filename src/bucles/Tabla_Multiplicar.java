package bucles;

public class Tabla_Multiplicar {
    public static void main(String[] args) {
        //se pide crear una algoritmo que permita realizar la tabla del 5 al 10
        int contador = 1;
        while (contador <= 10){
            System.out.println("5 x" + contador + "=" + (5 * contador));
            contador++;
        }
    }
}
