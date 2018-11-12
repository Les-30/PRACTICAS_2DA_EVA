
import java.util.Scanner;

/*

 */

/**
 *
 * PEÑA HERNANDEZ LESLIE JOHANA. 18550680
 */
public class EVA2_PRACTICAS_EDC_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int mate;
        int fis;
        int quim ;
        int criterio;
        System.out.println("INGRESE LOS PUNTOS DE MATE");
        mate = input.nextInt();
        System.out.println("INGRESE LOS PUNTOS DE FISICA");
        fis = input.nextInt();
        System.out.println("INGRESE LOS PUNTOS DE QUIMICA");
        quim = input.nextInt();
        criterio = mate + fis + quim;  
        
        if (((mate >= 65)&&(fis >= 55)&&(quim >= 50 ))&&(criterio >= 180)){
        System.out.println("El candidato es elegible para el curso");
        
        } else if ((mate >= 65) && (criterio > 140) && (criterio < 180)){
        System.out.println("El candidato es elegible para el curso (criterio 2)");
        }else{ 
             System.out.println("El candidato NO es elegible para el curso");
        
            
                
    }
    
}
}