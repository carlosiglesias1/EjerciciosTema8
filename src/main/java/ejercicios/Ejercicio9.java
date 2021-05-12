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
    public static void main(String[] args) {
        CuentaPlazo cPlazo;
        Scanner teclado = new Scanner (System.in);
        
        teclado.close();
    }
}
