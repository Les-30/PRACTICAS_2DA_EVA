
import java.util.Scanner;

/* 
 */

/**
 * PEÑA HERNANDEZ LESLIE JOHANA . 18550680
 */
public class EVA2_PRACTICAS_EDC_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("TRIANGULOS");
        double lado1;
        double lado2;
        double lado3;
        System.out.println("TECLEA EL VALOR DEL LADO 1");
        lado1 = input.nextInt(); 
        System.out.println("TECLEA EL VALOR DEL LADO 2");
        lado2 = input.nextInt(); 
        System.out.println("TECLEA EL VALOR DEL LADO 3");
        lado3 = input.nextInt(); 
        
        if ((lado1 == lado2) && (lado2 == lado3))
            System.out.println("Es un triángulo equilatero");
        else if ((lado1 == lado2) && (!(lado2 > lado3) || (lado2 < lado3)))
            System.out.println("Es un triángulo isóceles"); 
        else
            System.out.println("Es un triángulo escaleno");
         
    }
    
}
