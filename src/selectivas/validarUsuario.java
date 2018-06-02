package selectivas;

import java.util.Scanner;

public class validarUsuario {
    public static void main(String[] args) {
        // se pide crear un algoritmo que permita evaluar
        // el ingreso al sistema mediante el usuario y clave

        Scanner entradaDatos = new Scanner(System.in);

        System.out.printf("ingrese su usuario: ");
        String usuario = entradaDatos.nextLine();

        System.out.printf("ingrese su contraseña: ");
        String clave = entradaDatos.nextLine();

        String usurioSistema = "juan";
        String claveSistema = "12436";

        if (usuario.equalsIgnoreCase(usurioSistema)){
            System.out.println("usuario correcto");
            if (clave.equalsIgnoreCase(claveSistema)){
                System.out.println("bienvenido al sistema");
            }else{
                System.out.printf("clave incorrecta");
            }

        }else{
            System.out.printf("usuarioincorrecto");
        }

        entradaDatos.close();
    }
}
