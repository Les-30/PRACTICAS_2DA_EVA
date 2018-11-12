/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_dias_semana;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_9_DIAS_SEMANA {
 Scanner Input = new Scanner (System.in);
    
    public static void main(String[] args) {
      Scanner Input = new Scanner (System.in);
        int diasema;
        System.out.println("Teclea un numero del 1 al 7");
      diasema = Input.nextInt(); 
      switch (diasema){
          case 1:
              System.out.println("Domingo");
              break;
          case 2:
              System.out.println("Lunes");
              break;
          case 3:
              System.out.println("Martes");
              break;
          case 4:
              System.out.println("Miercoles");
              break;
          case 5:
              System.out.println("Jueves");
              break;
          case 6:
              System.out.println("Viernes");
              break;
          case 7:
              System.out.println("Sabado");
              break;
    }
    
}
}
