/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_control_if_antro;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author Les
 */
public class EVA2_2_CONTROL_IF_ANTRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Condicion para saber si entras a antro");
        System.out.println("¿Cual es tu edad?");
        double edad;
        
        edad = input.nextDouble();
        if (edad > 18) {
            System.out.println("DIVIERTETE");
        } else {
            System.out.println("VUELVE CUANDO TENGAS 18");
        }
    }
}

  
