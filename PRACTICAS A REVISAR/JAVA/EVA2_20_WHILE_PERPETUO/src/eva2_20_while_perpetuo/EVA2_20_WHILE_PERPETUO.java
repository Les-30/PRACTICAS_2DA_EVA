/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_while_perpetuo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author temporal2
 */
public class EVA2_20_WHILE_PERPETUO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true){
            try {
                System.out.println("SI VES ESTE MENSAJEE, SE TRABO TU PROGRAMA");
                Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                Logger.getLogger(EVA2_20_WHILE_PERPETUO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
