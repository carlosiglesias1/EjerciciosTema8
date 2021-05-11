package ejercicios;

import java.util.Scanner;

import recursos.figuras.Triangulo_v5;

/**
 * 8.5. Copia las clases anteriores como una nueva versión de las mismas (añade
 * sufijo _v5) y realiza los siguientes cambios: • Añade un constructor más a la
 * clase Figura2D, a este se le pasa solo un parámetro que se le asigna tanto al
 * alto como al ancho (figura igual alto que ancho). • Hacer el constructor sin
 * parámetros (ya no se crea por defecto) en este caso tanto alto como ancho
 * igual a cero. • Añade a la clase Triangulo también un constructor sin
 * parámetros, que invoque al constructor sin parámetros de la clase base
 * (aunque se hace por defecto) y que ponga el estilo a null. • Añade otro
 * constructor a la clase Triangulo, con un solo parámetro, para aquellos que
 * tienen igual alto que ancho (en este caso el estilo será ‘igualBaseAltura’).
 * • Haz un programa similar a los de ejercicios anteriores pero que use las
 * nuevas características incorporadas en este ejercicio.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Triangulo_v5 triangulo_v5;
        float base = 0f;
        float altura = 0f;

        System.out.println("Introduce una base, una altura y un estilo para el triángulo");
        try {
            base = Float.parseFloat(teclado.nextLine());
            altura = Float.parseFloat(teclado.nextLine());
            triangulo_v5 = new Triangulo_v5(base, altura, teclado.nextLine());
        } catch (Exception e) {
            System.out.println(e);
            triangulo_v5 = new Triangulo_v5();
        }
        System.out.println(triangulo_v5.verDim());
        System.out.println(triangulo_v5.verEstilo());
        System.out.println(triangulo_v5.area());
        teclado.close();
    }
}
