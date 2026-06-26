package estructura_datos;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        /*lista de arreglos -mutables o que puedan ser
        manipulables al momento de hacer uso de el
        */
        /*
        List<TipoDato> nombreLista = new ArrayList<>();
         */
        List<String> frutas = new ArrayList<>();
        frutas.add("piña");
        frutas.add("manzana");
        frutas.add("platano");
        frutas.add("zandia");
        frutas.add("pera");
        System.out.println(frutas);

        for(int iterador = 0; iterador <= frutas.size(); iterador++) {
            System.out.println(frutas.get(iterador));
        }

    }
}
