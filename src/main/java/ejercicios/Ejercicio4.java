package ejercicios;

import java.util.Scanner;

import ejercicios.recursos.figuras.Triangulo_v2;

/**
 * 8.4. Copia las clases anteriores como una nueva versión de las mismas (añade
 * sufijo _v4) y realiza los siguientes cambios: • Añade un constructor a la
 * clase Figura2D al que se le pasan dos parámetros: alto y ancho. ¿Funciona
 * ahora el constructor de Triangulo (creado en el ejercicio anterior)? ¿Por
 * qué? • Reescribe el constructor de Triangulo creado en el ejercicio anterior
 * para que haga uso del nuevo constructor de la clase base. • Comprueba que el
 * programa creado en el ejercicio anterior sigue funcionando. • Haz una copia
 * del programa anterior, sobre las nuevas clases creadas, y comprueba que sigue
 * funcionando.
 */

public class Ejercicio4 {
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
