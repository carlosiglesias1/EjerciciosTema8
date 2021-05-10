package ejercicios;

import java.util.Scanner;

import ejercicios.recursos.figuras.Triangulo;

/**
 * 8.1. Realiza las siguientes operaciones: • Crea una clase llamada Figura2D
 * con atributos numéricos con decimales y públicos: ancho y alto y un método
 * verDim que muestre por consola el alto y el ancho en una sola línea, con dos
 * decimales. • Define una clase llamada Triángulo que es hija de Figura2D y
 * añádele una cadena llamada estilo (vale: isósceles, rectángulo, equilátero,
 * etc.), un método llamado área que devuelva la superficie del triángulo y un
 * último método llamado verEstilo que muestre por consola el valor del atributo
 * estilo. • Finalmente hacer un programa que cree un triángulo, asigne valores
 * a sus atributos y use los métodos para ver sus dimensiones, estilo y área.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Triangulo triangulo;
        System.out.println("Introduce un alto, un ancho y un estilo para el triángulo");
        triangulo = new Triangulo(Float.parseFloat(teclado.nextLine()), Float.parseFloat(teclado.nextLine()), teclado.nextLine());
        System.out.println(triangulo.verDim());
        System.out.println(triangulo.verEstilo());
        System.out.println(triangulo.area());
        teclado.close();
    }
}
