/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_media_for;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_15_MEDIA_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner Input = new Scanner(System.in);
        int suma = 0;
        
        
        for (int i= 1; i<=5; i++){
        System.out.println("Edad "+ i + ":");
        suma = suma + Input.nextInt();}
        
   double media = (double) suma/5;
        System.out.println("la media es " + media); 
    }
    
}
