package ejercicios;

import java.util.Scanner;

import recursos.figuras.Triangulo_v7;

/**
 * 8.7. Copia las clases anteriores como una nueva versión de las mismas (añade
 * sufijo _v7) y realiza los siguientes cambios: • Figura2D_v7 tendrá un nuevo
 * constructor, que recibe como parámetro otro objeto de tipo Figura2D_v7 y que
 * copiará todos sus datos. • Hacer otro constructor análogo para la clase
 * Triangulo_v7. • Hay un programa que cree un Triangulo_v7 con el constructor
 * de 3 parámetros creado previamente, y otro triángulo utilizando el nuevo
 * constructor. Mostrar el área de ambos.
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Triangulo_v7 tV7 = new Triangulo_v7(4.3f, 5.3f, "escaleno");
        Triangulo_v7 tV72 = new Triangulo_v7(tV7);
        System.out.println(tV72.verDim());
        System.out.println(tV72.verEstilo());
        System.out.println("area = " + tV72.area());
        teclado.close();
    }
}
