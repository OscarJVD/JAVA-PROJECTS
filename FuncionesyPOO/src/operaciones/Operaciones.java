
package operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-Vargas
 */
public class Operaciones {
    private int factorial = 1;
    private int valorIngresadoGeneral;

    public int getValorIngresadoGeneral() {
        return valorIngresadoGeneral;
    }

    public void setValorIngresadoGeneral(int valorIngresadoGeneral) {
        this.valorIngresadoGeneral = valorIngresadoGeneral;
    }
    
    //OBTIENE EL NUMERO A TRAVÉZ DE UN PANEL INTERNO DE JAVA
    public void  ObtenerNumeroFactorial(){
    
        int numeroIngresado;
        numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número para averiguarle el factorial"));
        setValorIngresadoGeneral(numeroIngresado);
    }  
    
    //aplico la regla principal del factorial de un número dado
    public int calcularFactorial(int valorEntrada){
        
        if(valorEntrada == 0 || valorEntrada ==1){
            return 1;
            
        }else{
            factorial = valorEntrada * calcularFactorial(valorEntrada - 1);
            
            //mecanismo tradicional para calcular el factorial
            for (int i = 1; i <= valorEntrada; i++) {
                
                System.out.println("test: \n" + i);
                factorial *= 1; // = factorial = factorial * 1
            }           
            
            return factorial;
        }
        
    }
        
        
    
}
