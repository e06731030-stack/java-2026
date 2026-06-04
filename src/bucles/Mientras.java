package bucles;

public class Mientras {
    public static void main(String[] args) {
        // se pide crear un algoritmo que permita imprimir los niumerosa del 1 al5

       // while (condicion) {// entonces
            // bloque de codigo o instrucciones
            // a ejecutar si es verdadero

            int contador = 0;
            while (contador <= 10){
                System.out.println(contador);
                contador= contador + 2; //forma extensa
                contador+=2; // forma corta,usando operador de asignacion
            }

    }
}
