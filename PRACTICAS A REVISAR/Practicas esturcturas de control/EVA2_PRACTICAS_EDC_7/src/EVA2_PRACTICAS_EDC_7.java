
import java.util.Scanner;

/*

*/

/**
 * PEÑA HERNANDEZ LESLIE JOHANA. 18550680
 */
public class EVA2_PRACTICAS_EDC_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int grados;
        System.out.println("TECLEA LOS GRADOS");
        grados = input.nextInt();
        if (grados <= 0)
           System.out.println("Freezing weather");
        else if ((grados >= 0) && (grados < 10))
            System.out.println("Very Cold weather");
        else if ((grados >=10) && (grados < 20))
            System.out.println("Cold weather");
        else if ((grados >=20) && (grados < 30))
            System.out.println("Normal in Temp");
        else if ((grados >=30) && (grados < 40))
            System.out.println("Its Hot");
        else if (grados >= 40)
            System.out.println("Its Very Hot");
        

    }
    
}
