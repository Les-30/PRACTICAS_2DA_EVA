
import java.util.Scanner;



/**
 * PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA2_PRACTICAS_EDC_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INDICA SI LOS DOS NUMEROS INGRESADOS SON IGUALES O NO");
        Scanner input = new Scanner (System.in);
        int num1;
        int num2;
        System.out.println("Ingresa el numero 1");
        num1 = input.nextInt();
        System.out.println("Ingresa el numero 2");
        num2 = input.nextInt();
                
        
        if (num1 == num2) 
            System.out.println("son iguales");
         else 
            System.out.println("no son iguales"); 
        
    }
    
}



        
       
  
