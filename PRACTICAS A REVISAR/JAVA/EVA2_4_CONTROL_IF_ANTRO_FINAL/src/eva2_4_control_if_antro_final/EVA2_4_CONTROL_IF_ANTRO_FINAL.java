/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_control_if_antro_final;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA. 18550680
 */
public class EVA2_4_CONTROL_IF_ANTRO_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    
     System.out.println("¿Cual es tu edad?");
        int edad;
        
        edad = input.nextInt();
        System.out.println("¿Tenes INE?");
        boolean tieneIne;
        
        tieneIne = input.nextBoolean();
        if (edad >= 18) {
            if (tieneIne == true) {
                System.out.println("Diviertete");
            } else {
                System.out.println("Que te vallas te dije");
            }
        } else {
            System.out.println("Regresa luego");
        }
    }
}

    
    

