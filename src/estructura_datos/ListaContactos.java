package estructura_datos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaContactos {
    public static void main(String[] args) {
        // se pìde crear una lista de contactos, el cual permita preguntar cuantos
        // contactos sesea agregar y segun eso añadir y mostrar los contactos.
        Scanner entradaDatos = new Scanner(System.in);
        List<String> contactos = new ArrayList<>();
        int cantidadContacto;

        System.out.println("cuantos contactos desea agregar");
        cantidadContacto = entradaDatos.nextInt();
        entradaDatos.nextLine();

        for (int iterador = 0; iterador < cantidadContacto; iterador++){
            System.out.println("ingrese el contacto"+ (iterador + 1));
            String contacto = entradaDatos.nextLine();
            contactos.add(contacto);
        }
        System.out.println("mostrando los contactos");
        for (int iterador = 0; iterador < contactos.size(); iterador++) {
            System.out.println("Contacto " + (iterador + 1) + ": " + contactos.get(iterador));
        }
        System.out.println("Busqueda de contactos");
        System.out.println("ingrese el nombre del contacto que sesea buscar");
        String nombreContacto = entradaDatos.nextLine().toLowerCase();
        entradaDatos.close();

        if (contactos.contains(nombreContacto)){
            System.out.println("el nombre "+ nombreContacto + " si existe");
        } else{
            System.out.println("el nombre "+ nombreContacto + " no existe");
        }


    }
}
