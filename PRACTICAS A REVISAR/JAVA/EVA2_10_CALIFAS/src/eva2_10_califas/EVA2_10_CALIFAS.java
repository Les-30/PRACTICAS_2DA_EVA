/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_10_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
      System.out.println("Teclea la calificacion de la A a la F: ");
      String letra = Input.nextLine();
      switch (letra){
          case "A":
              System.out.println("100");
              break;
          case "B":
              System.out.println("90");
              break;
         case "C":
              System.out.println("80");
              break;     
         case "D":
              System.out.println("70");
              break;
         case "F":
              System.out.println("60");
              break;    
         default:
             System.out.println("FUERA DE RANGO");
    }
    
}
}