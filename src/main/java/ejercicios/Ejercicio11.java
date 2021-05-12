package ejercicios;

import java.util.ArrayList;

import recursos.MovilPlus;
import recursos.MovilPlus_v2;

/**
 * 8.11. Usando las clases del ejercicio anterior, haz un programa que cree un
 * ArrayList de teléfonos de tipo MovilPlus. Inserta varios teléfonos y luego
 * prueba el método remove () pasándole como parámetro un objeto de tipo
 * MovilPlus. ¿Funciona? Modifica la clase con los cambios necesarios para que
 * funcione (haciendo una nueva versión).
 */

public class Ejercicio11 {
    public static void main(String[] args) {
        ArrayList <MovilPlus_v2> lMovilPlus = new ArrayList<MovilPlus_v2>();
        MovilPlus_v2 movilPlus = new MovilPlus_v2(627156849, 0.15f, 0.10f, 10f);

        lMovilPlus.add(new MovilPlus_v2(627156849, 0.15f, 0.10f, 10f));
        lMovilPlus.add(new MovilPlus_v2(627156851, 0.15f, 0.10f, 10f));
        lMovilPlus.add(new MovilPlus_v2(627162349, 0.15f, 0.10f, 10f));

        lMovilPlus.remove(movilPlus);

        for (int i = 0; i < lMovilPlus.size(); i++) {
            System.out.println(lMovilPlus.get(i));
        }
    }
}
