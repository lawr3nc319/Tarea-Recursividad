/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202.grupo4.tarearecursividad;

/**
 *
 * @author lawwb
 */
public class Ejercicio1 {
    
}
public static void main(String[] args) {
        String cad = JOptionPane.showInputDialog("Ingrese una oración: ");;
        char[] array = cad.toCharArray();
        array = sacarConsonantes(0, array);
        String string = String.valueOf(array);
        System.out.println(string);
        Scanner sn = new Scanner (System.in);
    }
