/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_while;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_19_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String cade = "";
        while (!cade.equals("X")) {
            System.out.println("INTRODUCE UN MENSAJE (X para salir)");
        cade =input.nextLine();
            System.out.println("TU MENSAJE: " + cade);
            
        }
    }
    
}
