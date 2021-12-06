
package POO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class POO {
    public static void main(String[] args) throws IOException {
   
       byte n_byte = -127; 
       byte n2_byte = 127; 
       
       System.out.println("El valor de PI es: " + Math.PI);
       System.out.println("La raiz cuadrada: " + Math.sqrt(9));
       System.out.println("La potencia es: " + Math.pow(5,3));
       System.out.println("El valor para aproximar es: " + Math.round(9.4));
       System.out.println("El numero aleatorio es: " + Math.random());
       
       BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
       
       String nombre = "";
       
       System.out.println("Escribe tu nombre porfis : ");
       
       nombre = leer.readLine();
       
       
       String respuesta = JOptionPane.showInputDialog(null, "asdasdads");
       
       int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Su edad", "ad"))
       
}
}
