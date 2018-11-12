/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_nested_if;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_6_NESTED_IF {
private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Teclea tu calificacion");
        int calif;
        calif = input.nextInt();
                
      
     if(calif == 100){
         System.out.println("A");}
     else{if(calif == 90){
         System.out.println("B");} 
           else{if(calif == 80){
         System.out.println("C");}
        else{if(calif == 70){
         System.out.println("D");}
         else{if(calif == 60){
         System.out.println("F");}
          else{if(calif < 60){
         System.out.println("FUERA DE RANGO");}
    }
}
}  
     }
    }
}
}