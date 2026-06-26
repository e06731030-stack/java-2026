package estructura_datos;

import java.util.Arrays;

public class Ejemplo_Array {
    public static void main(String[] args) {
        String[] verduras = {"lechuga","zanoria","zapallo","tomate"};
        System.out.println(Arrays.toString(verduras));
        for(int iterador = 0; iterador <= verduras.length; iterador++) {
            System.out.println(verduras[iterador]);
        }
    }
}
