package ejercicios;

import java.util.Scanner;

import recursos.CuentaPlazo;

/**
 * 8.9. Copia la clase _CuentaCorriente que te proporcionará el profesor con un
 * nombre nuevo, por ejemplo, CuentaCorriente y realiza las siguientes
 * operaciones: • Crea una clase hija llamada CuentaPlazo igual que la anterior,
 * pero sin comisiones. Además, tiene un nuevo atributo, que es la fecha de
 * creación. • Esta nueva clase ya no permitirá que haya subclases de ella. •
 * Crea constructor para la nueva clase que incorpore la inicialización de la
 * fecha de creación al día en curso. • Sobrescribe el método retirar () para
 * que no que no calcule comisiones. Revisa los modificadores de acceso de
 * atributos y quizás tengas que crear algún getter/setter. • Haz un programa
 * que cree inicialmente una cuenta a plazo y luego, mediante un menú, permita
 * ingresar, retirar y consultar el saldo.
 */

public class Ejercicio9 {
    static void prompt (){
        System.out.println("i: ingresar\nr: retirar\nv: ver saldo\ne: salir");
    }
    public static void main(String[] args) {
        CuentaPlazo cPlazo;
        Scanner teclado = new Scanner(System.in);
        char opcion;
        System.out.println("Crea una nueva cuenta");
        cPlazo = new CuentaPlazo(teclado.nextLine());
        do {
            prompt();
            opcion = teclado.nextLine().charAt(0);
            switch (opcion) {
                case 'i':
                    System.out.println("Ingresar dinero: ");
                    cPlazo.ingresar(Float.parseFloat(teclado.nextLine()));
                    break;
                case 'r':
                    System.out.println("Retirar dinero: ");
                    if(cPlazo.retirar(Float.parseFloat(teclado.nextLine())))
                        System.out.println("Recoja su dinero");
                    else
                        System.out.println("No se ha podido realizar la operacion");
                    break;
                case 'v':
                    System.out.println(cPlazo.getSaldo());
                    break;
                case 'e':
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 'e');
        teclado.close();
    }
}
