/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_encontrar_numero;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_17_ENCONTRAR_NUMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        
        //0-->1
        //numeros entre 1 y 10
      int numaleat =(int) (Math.random() * 10) + 1;
       System.out.println("Numero =" + numaleat);
       for (int i=0; i < 3; i++){
            System.out.println("adivina el numero");
       int num= Input.nextInt();
       if(num == numaleat){
           System.out.println("GANASTE");
          break;
       
           
       }
          if(i == 2){
              System.out.println("PERDISTE");
          }      
     }
    
}
}