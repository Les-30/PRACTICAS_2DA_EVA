
import java.util.Scanner;

/*

 */

/**
 *
 * PEÑA HERNANDEZ LESLIE JOHANA. 18550680
 */
public class EVA2_PRACTICAS_EDC_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("TECLEA UN NUMERO");
        num = input.nextInt();
        
        if (num > 0)
            System.out.println("1");
        else if (num < 0)
            System.out.println("-1");
        else 
            System.out.println("0");
    }
    
}
