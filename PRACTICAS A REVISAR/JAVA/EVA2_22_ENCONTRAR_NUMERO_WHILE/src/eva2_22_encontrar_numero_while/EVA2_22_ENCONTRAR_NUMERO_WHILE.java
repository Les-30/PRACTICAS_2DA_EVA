/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_encontrar_numero_while;

import java.util.Scanner;

/**
 *
 * @author peña hernandez leslie johana. 18550680.
 */
public class EVA2_22_ENCONTRAR_NUMERO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int numaleat =(int) (Math.random() * 5) + 7;
        System.out.println("Numero= " + numaleat);
        System.out.println("ADIVINA EL NUMERO");
        int num = input.nextInt();
       while(true){
           if (num == numaleat) {
               System.out.println("ADIVINASTE");
               
           }
           else
               System.out.println("valiste kk");
           break;
       }
       
    }
    
}
