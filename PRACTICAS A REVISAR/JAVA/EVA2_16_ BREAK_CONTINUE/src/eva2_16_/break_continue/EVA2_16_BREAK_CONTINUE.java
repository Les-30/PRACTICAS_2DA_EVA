/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_.break_continue;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA2_16_BREAK_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        for (int i = 1; i< 10; i++){
        System.out.println(i);
       int res= i % 5;
        if(res ==0)
            break;  //INTERRUMPE LA LOGICA DEL PROGRAMA.
    
            } 
        //CONTINUE
        //IMPRIMIR TODOS LOS NUMEROS QUE NO SEAN DIVISIBLES ENTRE 5 
        for (int i = 1; i<= 10; i++){
            System.out.println(i);
        int res= i % 5;
        if(res ==0)
            continue;
            System.out.println(i);
}
}
}