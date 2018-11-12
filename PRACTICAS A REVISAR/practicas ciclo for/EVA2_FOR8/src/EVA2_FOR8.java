/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA2_FOR8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("20 NUMEROS ALEATORIOS");
        for (int i = 1; i <= 20; i++) {
            double aleatorio = Math.random()* 100 + 1;
            System.out.println((int)aleatorio ); //se pone el int porque si no sale el numero decimal
        }
 
                
        
    }
    
}
