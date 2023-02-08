/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.grupo4.tarearecursividad;

/**
 *
 */
public class Ejercicio2 {
    package practicab;
import java.util.Scanner;
import static practicab.ClaseB.Total; public class PracticaB {     
    public static void main(String[] args) {
        int numero;
    // obtener la entrada del usuario
    System.out.println("Ingrese un número: ");
    Scanner input = new Scanner(System.in);
    //convertir cadena en un entero
    numero = input.nextInt();
    //llamar al metodo
    int total = Total(numero);
    System.out.println("Total de la Suma = " + total);
    //cerrar la instancia del escáner
     input.close();
    }
}
