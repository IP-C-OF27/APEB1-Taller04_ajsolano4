
import java.util.Scanner;
/**
 * Ejercicio 02:"Generar un algoritmo que permite ingresar los gastos de tres
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los
 * hijos del padre de familia.
 * @author Antony Solano
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double gastohijo1, gastohijo2, gastohijo3, gastoTotal;
        System.out.println("Dame gasto: ");
        gastohijo1 = tcl.nextDouble();
        gastohijo2 = tcl.nextDouble();
        gastohijo3 = tcl.nextDouble();
        gastoTotal = (gastohijo1 + gastohijo2 + gastohijo3);
        System.out.println("Los gastos totales son: " + gastoTotal);
    }
}
    //AQUÍ AGREGUE TODO SU CÓDIGO...
/***
 * EVIDENCIA DEL RUN:
 * run:
Dame gasto: 
10
20
30
Los gastos totales son: 60.0
BUILD SUCCESSFUL (total time: 12 seconds)
 * Pegue aquí la evidencia de la ejecución del .java
 */