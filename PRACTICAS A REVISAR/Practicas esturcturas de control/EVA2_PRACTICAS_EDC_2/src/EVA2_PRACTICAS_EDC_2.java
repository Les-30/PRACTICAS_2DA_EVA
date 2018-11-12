
import java.util.Scanner;

/*

 */

/**
 * PEÑA HERNADEZ LESLIE JOHANA 18550680
 */
public class EVA2_PRACTICAS_EDC_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("REVISAR SI UN NUMERO ES PAR O IMPAR");
       int num;
        System.out.println("TECLEA UN NUMERO");
        num = input.nextInt();
       int residuo;
       residuo = num% 2;
       if (residuo == 0)
          System.out.println( num + " es par");
       else 
          System.out.println("es impar");      
        
    }
    
}
