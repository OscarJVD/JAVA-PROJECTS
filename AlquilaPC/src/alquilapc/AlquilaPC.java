/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilapc;

import java.util.Scanner;

/**
 *
 * @author Oscar Vargas
 */
public class AlquilaPC {

    /**
     * @param args the command line arguments
     */
    static Scanner entradaDatos = new Scanner(System.in);
    static String nom;
    static int opcion = 0;
    static int equipos;
    static double domicilio;
    static int diasal;
    static int diasad;
    static double alqui;
    static String Tipo;
    static double descuentos = 0;
    static double domi = 0;
    static double diasd = 0;
    static double total = 0;

    static void Ciudad() {

    }

    static void CalcularValores() {
        descuentos = CalculoAlquilerAdicionalDto();
        alqui = CalculoAlquiler();
        diasd = CalculoAlquilerAdicional();
        
        if (opcion == 2) {
            domi = CalculoDomicilio();
        } else {
            domi = 0;
        }
        
        if (opcion == 3) {
            descuentos =  CalculoDescuento();
        } else {
            descuentos = CalculoAlquilerAdicionalDto();
        }
        
        total = diasd + alqui + domi;
        
        if (opcion == 3) {
            total = alqui + diasd - descuentos;
        }
    }

    static void Fuera() {
    }

    static double CalculoAlquilerAdicional() {
        double a;
        double b;
        a = (diasad * 35000 * equipos);
        b = (diasad * 35000 * equipos);
        b = b * 0.02;
        return (a - b);
    }

    static double CalculoAlquilerAdicionalDto() {
        double x;
        x = 35000 * equipos * diasad;
        x = x * 0.02; 
        return x;
    }

    static double CalculoAlquiler() {
        double x;
        x = 35000 * equipos * diasal;
        alqui = x;
        return x;
    }

    static double CalculoDomicilio() {
        if (opcion == 2) {
            domi = (alqui + CalculoAlquilerAdicional()) * 0.05;
        } else {
            domi = 0;
        }
        return domi;
    }

    static double CalculoDescuento() {
        double x;
        x = (alqui + diasd) * 0.05;
        return (x);
    }

    static void Encabezado() {
        //for (int i = 0; i < 100; ++i) System.out.println();
        System.out.println("\t\t\t*****SENA PRUEBAS DE SOFTWARE 2020*****");
        System.out.println("\t\t\tANALISIS Y DESARROLLO DE SISTEMAS DE INFORMACION CGMLTI\n\n");
    }

    static void TipoServicio() {
        System.out.println("\nTipos de servicios ofrecidos");
        System.out.println("[1] Dentro de la Ciudad");
        System.out.println("[2] Fuera de la ciudad");
        System.out.println("[3] Dentro del Establecimiento");
        System.out.print("Tipo de servicio tomado por el cliente  :");
        opcion = entradaDatos.nextInt();
        if (opcion == 1) {
            Tipo = "Dentro de la Ciudad";
        } else if (opcion == 2) {
            Tipo = "Fuera de la ciudad";
        } else if (opcion == 3) {
            Tipo = "Dentro del Establecimiento";
        }
    }

    static void EquiposAlquiler() {
        System.out.print("Número de equipos que desea alquilar:");
        equipos = entradaDatos.nextInt();
    }

    static void DiasAlquiler() {
        System.out.print("Número de dÝas que desea tomar el alquiler:");
        diasal = entradaDatos.nextInt();
    }

    static void DiasAdicionales() {
        System.out.print("Número de dÝas adicionales que toma el alquiler:");
        diasad = entradaDatos.nextInt();
    }

    static void DatosBasicos() {
        System.out.print("Nombre Cliente:");
        nom = entradaDatos.nextLine();
        EquiposAlquiler();
        DiasAlquiler();
        DiasAdicionales();
    }

    static void MostrarDatos() {
        System.out.println("\t\t\tA L Q U I L A P C");
        System.out.println("Nombre:" + nom);
        System.out.println("Tipo de servicio:" + Tipo);
        System.out.println("Número de Equipos:" + equipos);
        System.out.println("No. Días Iniciales:" + diasal);
        System.out.println("Valor Alquiler: $" + alqui);
        System.out.println("No. Días adicionales:" + diasad);
        System.out.println("Valor días adicionales: $" + diasd);
        System.out.println("Domicilio: $" + domi);
        System.out.println("Descuentos: $" + descuentos);
        System.out.println("Total a pagar: $" + total);
        System.out.println("Factura generada por el  S  E  N  A");
        System.out.println("Gracias por utilizar nuestros servicios...!!!");
    }

    public static void main(String[] args) {
        // TODO code apvoidplication logic here
        Encabezado();
        DatosBasicos();
        TipoServicio();
        CalcularValores();
        MostrarDatos();

    }

}