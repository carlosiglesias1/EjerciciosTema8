package ejercicios;

import java.util.Scanner;

import recursos.figuras.TrianColor_v6;

/**
 * 8.6. Copia las clases anteriores como una nueva versión de las mismas (añade
 * sufijo _v6) y realiza los siguientes cambios: • Crea una nueva clase
 * TrianColor_v6, hija de la clase Triángulo_v6 que incluye un nuevo atributo
 * privado de tipo String llamado color. • Esta nueva clase tiene un constructor
 * de 4 parámetros (alto, ancho, estilo, color), además del getter y setter de
 * color. • Haz un nuevo programa que cree un triángulo de color y llame a
 * métodos definidos en sus clases base.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        TrianColor_v6 trianColor_v6;
        float base = 0f;
        float altura = 0f;

        System.out.println("Introduce una base, una altura, un estilo y un color para el triángulo");
        try {
            base = Float.parseFloat(teclado.nextLine());
            altura = Float.parseFloat(teclado.nextLine());
            trianColor_v6 = new TrianColor_v6(base, altura, teclado.nextLine(), teclado.nextLine());
        } catch (Exception e) {
            System.out.println(e);
            trianColor_v6 = new TrianColor_v6();
        }
        System.out.println(trianColor_v6.verDim());
        System.out.println(trianColor_v6.verEstilo());
        System.out.println(trianColor_v6.getColor());
        System.out.println(trianColor_v6.area());
        teclado.close();
    }
}
