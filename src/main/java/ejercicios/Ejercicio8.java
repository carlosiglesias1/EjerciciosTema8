package ejercicios;

import java.util.ArrayList;
import java.util.Random;

import recursos.figuras.Rectangulo_v8;

/**
 * 8.8. Copia las clases anteriores como una nueva versión de las mismas (añade
 * sufijo _v8) y realiza los siguientes cambios: • Añadir a la clase Figura2D_v8
 * un atributo privado llamado nombre de tipo String. • Añadir el getter/setter
 * de ese campo y modificar los constructores de dicha clase para incorporar
 * como parámetro el nombre de la figura (en el constructor por defecto se le
 * asignará valor null). • Modificar la clase hija y nieta para incluir el
 * nombre en constructores. • Crear una nueva clase hija de Figura2D_v8 llamada
 * Rectangulo_v8 con constructor con tres parámetros (alto, ancho, nombre),
 * constructor con dos parámetros (alto igual a ancho y nombre) y un método que
 * devuelve boolean llamado esCuadrado(). • Hacer un programa que cree un
 * ArrayList con 4 rectángulos, algunos cuadrados y otros no, y cuente cuantos
 * hay cuadrados.s
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList <Rectangulo_v8> list = new ArrayList<Rectangulo_v8>();
        int value = 0;
        int cuadrado = 0;
        int rectangulo = 0;

        for (int i = 0; i < 4; i++) {
            value = random.nextInt(19)+1;
            if (value % 2 == 0)
                list.add(new Rectangulo_v8(4.3f, "cuadrado"));
            else
                list.add(new Rectangulo_v8(random.nextFloat(), random.nextFloat(), "rectangulo"));
        }

        for (int i = 0; i < list.size(); i++) {
           if  (list.get(i).esCuadrado())
                cuadrado++;
            else
                rectangulo++;
        }

        System.out.println("Hay "+cuadrado+" cuadrado(s)");
        System.out.println("Hay "+rectangulo+" rectángulo(s)");
    }
}
