/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_for15;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_FOR15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("NUMERO ENTERO POSOTIVO (MAYOR A 1)");
        int num= input.nextInt();
        boolean primo = true;
        for (int i = 2; i <num; i++) {
          //RESIDUO
          if((num % i) == 0){
              primo = false;
              break;
          }
        }
   if(primo)
            System.out.println("es primo");
   else
            System.out.println("no es primo");
    }
}

    