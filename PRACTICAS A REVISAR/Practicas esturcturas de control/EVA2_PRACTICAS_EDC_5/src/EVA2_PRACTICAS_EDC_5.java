
import java.util.Scanner;

/*
 
 */

/**
 *PEÑA HERNANDEZ LESLIE JOHANA. 18550680
 */
public class EVA2_PRACTICAS_EDC_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("TECLEA EL NUMERO 1");
        num1 = input.nextInt();
        System.out.println("TECLEA EL NUMERO 2");
        num2 = input.nextInt();
        System.out.println("TECLEA EL NUMERO 3");
        num3 = input.nextInt();

  if ((num1 > num2) && (num1 > num3))
    System.out.println("El numero 1 es el valor más grande"); 
        
else if ((num2 > num1) && (num2 > num3))
    System.out.println("El numero 2 es el valor más grande");
        
        else 
             System.out.println("El numero 3 es el valor más grande");  
    }
    
}
