package ejercicios;

import recursos.MovilPlus;
import recursos.MovilPrepago;
import recursos.MovilTarifaPlana;

/**
 * 8.10. Copia la clase _MovilPrepago que te proporcionará el profesor con un
 * nombre nuevo, por ejemplo, MovilPrepago y realiza las siguientes operaciones:
 * • Crea una subclase llamada MovilPlus igual que la anterior pero que al
 * efectuar llamadas no se le aplica ningún coste por el establecimiento de
 * llamada y tiene una nueva funcionalidad llamada videollamada a la que se le
 * pasa los segundos de la videollamada y reduce el saldo de forma similar a
 * ‘navegar’. En este caso, cada segundo de llamada son 2 MB de datos (recuerda
 * que los atributos de MovilPrepago son privados, esto puede ser un problema a
 * resolver). • Crea constructor para la nueva clase, que llame al constructor
 * de la clase padre. • Sobrescribe el método toString () en la superclase para
 * que muestre el número y el saldo del móvil. • Añade una nueva subclase de
 * MovilPrepago llamada MovilTarifaPlana¸ en la que se redefine el método
 * navegar para no reducir el saldo y además en el constructor fija el coste de
 * navegación a cero. • Haz un programa que cree una instancia de MovilPrepago,
 * otra de MovilPlus y otra de MovilTarifaPlana, y realicen diversas operaciones
 * sobre los mismos: llamar, navegar, videollamar, etc. mostrando como se reduce
 * su saldo con el nuevo método toString ().
 * 
 */

public class Ejercicio10 {
    static void printTelefonos (MovilPrepago [] tPrepagos){
        for (int i = 0; i < tPrepagos.length; i++) {
            System.out.println(tPrepagos[i].toString());
        }
    }
    
    static void llamadaTelefonos (MovilPrepago [] tPrepagos, int segundos){
        for (int i = 0; i < tPrepagos.length; i++) {
            tPrepagos[i].efectuarLlamada(segundos);
        }
    }

    static void navegacionTelefonos (MovilPrepago [] tPrepagos, int mb){
        for (int i = 0; i < tPrepagos.length; i++) {
            tPrepagos[i].navegar(mb);
        }
    }
    public static void main(String[] args) {
        MovilPrepago [] telefonos = new MovilPrepago [3];
        telefonos[0] = new MovilPlus(627156849, 0.15f, 0.10f, 10f);
        telefonos[1] = new MovilPrepago(631582174, 0.15f, 0.15f, 0.10f, 10f);
        telefonos[2] = new MovilTarifaPlana(654789631, 0.15f, 0.15f, 10f);

        System.out.println("\tLlamada de 30 segundos: ");
        llamadaTelefonos(telefonos, 30);
        printTelefonos(telefonos);

        System.out.println("\n\tNavegación de 5 megaBytes: ");
        navegacionTelefonos(telefonos, 5);
        printTelefonos(telefonos);

        System.out.println("\n\tVideollamada de 50 segundos (sólo móbilPlus: ");
        MovilPlus movilPlus = new MovilPlus(telefonos[0]);
        movilPlus.videollamada(50);
        telefonos[0] = movilPlus;
        printTelefonos(telefonos);
    }
}
