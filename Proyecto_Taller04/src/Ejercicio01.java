import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario."
 * @author NombreAutor Antony Solano 
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Dame base: ");
        base = tcl.nextDouble();
        System.out.println("Dame altura: ");
        altura = tcl.nextDouble();
        area = (base * altura) / 2;
        System.out.println("area: " + area);

    }
    //AQUÍ AGREGUE TODO SU CÓDIGO...
}

/***
 * EVIDENCIA DEL RUN:
 *run:
Dame base: 
7
Dame altura: 
10
area: 35.0
BUILD SUCCESSFUL (total time: 3 seconds)

 */