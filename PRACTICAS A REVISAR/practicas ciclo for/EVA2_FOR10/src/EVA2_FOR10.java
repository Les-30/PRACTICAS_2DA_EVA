
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA2_FOR10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
       System.out.println("¿cuantas veces debo imprimir el asterisco?");
        int num;
        num= input.nextInt();
     
       int veces;
         for (veces = 1; veces <= num; veces++) {
                 System.out.println("*");
    }
    
}
}