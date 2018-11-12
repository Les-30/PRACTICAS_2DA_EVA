/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_control_if_antro_2;
 import java.util.*;
import java.lang.Math;
/**
 *
 * @author Les
 */
public class EVA2_3_CONTROL_IF_ANTRO_2 {

  private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿Tienes tu ine?");
        boolean tieneIne;
        
        tieneIne = input.nextBoolean();
        if (tieneIne == true) {
            System.out.println("Si tiene");
        } else {
            System.out.println("No tiene");
        }
    }

}
