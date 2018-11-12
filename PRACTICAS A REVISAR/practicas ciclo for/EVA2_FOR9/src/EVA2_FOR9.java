/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PEÑA HERNADNEZ LESLIE JOHANA 18550680
 */
public class EVA2_FOR9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "+");
            total += i;
        }
       
        System.out.println(" LA SUMA DA UN TOTAL DE  " + total);
        
    }
    
}
