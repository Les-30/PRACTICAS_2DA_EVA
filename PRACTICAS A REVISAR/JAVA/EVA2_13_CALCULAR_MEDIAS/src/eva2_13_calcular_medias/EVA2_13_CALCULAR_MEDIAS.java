/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_calcular_medias;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_13_CALCULAR_MEDIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
       int suma = 0;
        System.out.println("EDAD 1");
        suma = suma + input.nextInt();
        System.out.println("EDAD 2");
        suma = suma + input.nextInt();
        System.out.println("EDAD 3");
        suma = suma + input.nextInt();
        System.out.println("EDAD 4");
        suma = suma + input.nextInt();
        System.out.println("EDAD 5");
        suma = suma + input.nextInt();
         
        double media =(double)suma / 5;
        System.out.println("LA MEDIA DE LAS EDADES ES: " + media);
        
        
        
        
    }
    
}
