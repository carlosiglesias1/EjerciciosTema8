package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import recursos.trabajadores.*;

/**
 * 8.12.• Haz un programa que cree un ArrayList de Asalariados y otro de
 * ConsultoresExternos e introduzca “a mano” empleados en ambos ArrayList. -
 * Después modificar el contenido de ambos ArrayList añadiendo las horas
 * extra/horas trabajadas respectivamente. - Fijar el importe de hora extra a 20
 * euros y la hora de consultor a 100 euros y modificar de nuevo los ArrayList
 * calculando el salario final de cada trabajador. - Finalmente, recorriendo con
 * un for-each ambos ArrayList, obtener el total que gastará la empresa en
 * salarios. - ¿Sería útil tener un ArrayList que pudiese contener instancias de
 * ambas clases?
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        ArrayList<ConsultorExterno> consultorList = new ArrayList<ConsultorExterno>();
        ArrayList<Asalariado> asalariadoList = new ArrayList<Asalariado>();
        float totalNomina = 0;
        char opcion;
        Scanner teclado = new Scanner(System.in);
        String id;
        String nombre;
        LocalDate fecha;
        do {
            opcion = teclado.nextLine().charAt(0);
            switch (opcion) {
                case 'a':
                    System.out.println("Introduce el código del  empleado:");
                    id = teclado.nextLine();
                    System.out.println("Introduce su nombre");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce la fecha de nacimiento (aaaa-dd-mm)");
                    fecha = LocalDate.parse(teclado.nextLine());
                    System.out.println("Introduce el salario base");
                    float sBase = Float.parseFloat(teclado.nextLine());
                    asalariadoList.add(new Asalariado(id, nombre, fecha, sBase));
                    asalariadoList.get(asalariadoList.size() - 1).calcularSalarioFinal(20);
                    break;
                case 'b':
                    System.out.println("Introduce el código del  empleado:");
                    id = teclado.nextLine();
                    System.out.println("Introduce su nombre");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce la fecha de nacimiento (aaaa-dd-mm)");
                    fecha = LocalDate.parse(teclado.nextLine());
                    consultorList.add(new ConsultorExterno(id, nombre, fecha));
                    System.out.println("Introduce las horas trabajadas: ");
                    consultorList.get(consultorList.size()-1).setHorasTrabajadas(Integer.parseInt(teclado.nextLine()));
                    consultorList.get(consultorList.size()-1).calcularSalarioFinal(100);
                    ;
                    break;
            }
        } while (opcion != 's');
        for (ConsultorExterno consultorExterno : consultorList) {
            totalNomina += consultorExterno.getSalarioFinal();
        }

        for (Asalariado asalariado : asalariadoList) {
            totalNomina += asalariado.getSalarioFinal();
        }

        System.out.println("El total de nominas de la empresa es de: " + totalNomina);
        teclado.close();
    }
}
