/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_for_11;

import java.util.Scanner;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA2_FOR_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("TECLEA UN NUMERO");
        int num;
        num = input.nextInt();
         for(int i = 1; i <=100; i--){
             if (i % num > 0)
                 System.out.println(num);   
             
             
             }
         
}
}
