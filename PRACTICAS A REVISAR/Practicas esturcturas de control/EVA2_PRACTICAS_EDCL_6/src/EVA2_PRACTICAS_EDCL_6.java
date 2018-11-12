
import java.util.Scanner;

/*
 *Progrma que solicite las cadenas de un punto (Sistema carteciano) y determine 
 * a que cuadrante peretenece 
 * Entrada: 3,4 
 * Salida: Cuadrante 1
 */

/**
 *
 * @PAOLA XOCHITL CARRILLO ORTIZ 18550693
 */
public class EVA2_PRACTICAS_EDCL_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int coorx;
        int coory;
        System.out.println("TECLEE LA COORDENADA DE X");
        coorx = input.nextInt();
       System.out.println("TECLEE LA COORDENADA DE Y");
        coory = input.nextInt();
        
        if ((coorx > 0) && (coory > 0))
           System.out.println("Cuadrante 1"); 
        else if ((coorx < 0) && (coory > 0))
           System.out.println("Cuadrante 2"); 
        else if ((coorx < 0) && (coory < 0))
           System.out.println("Cuadrante 3");
        else 
           System.out.println("Cuadrante 4");
        
    }
    
}
