package tareac;

import javax.swing.JOptionPane;
import static tareac.ClaseC.Binario;


public class TareaC {

   
    public static void main(String[] args) {
      
         int number = Integer.parseInt(JOptionPane.showInputDialog("Indique un número"));
    System.out.println("Este " + number + " es un número Binario? " + Binario(number)); 
        
    
        
    }
    
}
