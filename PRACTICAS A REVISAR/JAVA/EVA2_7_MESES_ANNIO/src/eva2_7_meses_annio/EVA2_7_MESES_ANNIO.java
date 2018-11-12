/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_meses_annio;
 import java.util.*;
import java.lang.Math;
/**
 *
 * @author temporal2
 */
public class EVA2_7_MESES_ANNIO {
private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    System.out.print("Teclea un numero del 1 al 12");
        int mes = input.nextInt();
        if (mes == 1) 
       System.out.println("Enero");
        else 
       if (mes == 2) 
        System.out.println("Febrero");
        else 
       if (mes == 3) 
        System.out.print("Marzo");
         else 
        if (mes == 4) 
        System.out.println("Abril");
         else 
         if (mes == 5) 
        System.out.println("Mayo");
         else 
         if (mes == 6) 
         System.out.println("Junio");
        else 
         if (mes == 7)
        System.out.println("Julio");
        else 
        if (mes == 8) 
         System.out.println("Agosto");
          else 
         if (mes == 9) 
         System.out.println("Septiembre");
          else 
          if (mes == 10) 
         System.out.println("Octubre");
          else 
        if (mes == 11) 
         System.out.println("Noviembre");
          else 
          if (mes == 12) 
        System.out.println("Diciembre");
        else 
         if (mes > 12) 
         System.out.println("Valor fuera de rango");
   
    }
}    