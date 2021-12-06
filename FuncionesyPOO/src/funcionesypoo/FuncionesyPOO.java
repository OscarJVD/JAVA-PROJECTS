
package funcionesypoo;

import operaciones.Operaciones;

public class FuncionesyPOO {

 
    public static void main(String[] args) {
        
        Operaciones factorial=new Operaciones();
            
        //ENTRADA DE DATOS
        factorial.ObtenerNumeroFactorial();
        
        //test : obtener el numero ingresado
        System.out.println("El valor ingresado es: " + factorial.getValorIngresadoGeneral());
        
        int resultado = factorial.calcularFactorial(factorial.getValorIngresadoGeneral());
        
        System.out.println("El resultado del factorial es: " + resultado + " ! ");
    }
    
}
