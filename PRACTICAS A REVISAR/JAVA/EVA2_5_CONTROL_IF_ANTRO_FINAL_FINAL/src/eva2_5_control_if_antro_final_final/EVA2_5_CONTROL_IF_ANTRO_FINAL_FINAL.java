/*

 */
package eva2_5_control_if_antro_final_final;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA . 18550680
 */
public class EVA2_5_CONTROL_IF_ANTRO_FINAL_FINAL {

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
        if (edad >= 18 && tieneIne == true) {
            System.out.println("Diviertete");
        } else {
            System.out.println("Nel pastel");
        }
    }
}

    