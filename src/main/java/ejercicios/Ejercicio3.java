package ejercicios;

import java.util.Scanner;

import ejercicios.recursos.figuras.Triangulo_v2;

/**
 * 8.3. Copia las clases anteriores como una nueva versión de las mismas (añade
 * sufijo _v3) y realiza los siguientes cambios: • Añade un constructor a la
 * clase Triangulo al que se le pasan tres parámetros: estilo, alto y ancho. •
 * Se invocará al constructor por defecto de la clase base. • Modificar el
 * programa de los ejercicios anteriores para que los triángulos sean creados
 * mediante este nuevo constructor.
 */

public class Ejercicio3 {
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
