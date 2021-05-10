package ejercicios;

import java.util.Scanner;

import ejercicios.recursos.figuras.Triangulo_v2;

/**
 * 8.2. Copia las clases anteriores como una nueva versión de las mismas (añade
 * sufijo _v2) y realiza los siguientes cambios: • Ahora los atributos ancho y
 * alto serán privados. • Añade los métodos getter y setter para ambos
 * atributos. • Modifica la clase Triangulo obligados por los cambios en su
 * clase padre. • Haz una copia del programa anterior, sobre las nuevas clases
 * creadas, y comprueba que el programa creado en el ejercicio anterior sigue
 * funcionando.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Triangulo_v2 triangulo;
        System.out.println("Introduce un alto, un ancho y un estilo para el triángulo");
        triangulo = new Triangulo_v2(Float.parseFloat(teclado.nextLine()), Float.parseFloat(teclado.nextLine()), teclado.nextLine());
        System.out.println(triangulo.verDim());
        System.out.println(triangulo.verEstilo());
        System.out.println(triangulo.area());
        teclado.close();
    }
}
