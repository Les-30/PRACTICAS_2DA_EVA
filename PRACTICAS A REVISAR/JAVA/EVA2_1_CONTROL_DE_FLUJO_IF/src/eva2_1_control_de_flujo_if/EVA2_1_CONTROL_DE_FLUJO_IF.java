/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_control_de_flujo_if;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author Les
 */
public class EVA2_1_CONTROL_DE_FLUJO_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 Scanner input = new Scanner(System.in);

    
        System.out.println("¿Que calificacion sacaste en fundamentos de programacion?");
        double calif;
        
        calif = input.nextDouble();
        System.out.print("Tu calificacion es: ");
        System.out.println(calif);
        if (calif >= 70) {
            System.out.println("Ya pasaste");
        } else {
            System.out.print("Suerte en el repe");
        }
    }
}

    

