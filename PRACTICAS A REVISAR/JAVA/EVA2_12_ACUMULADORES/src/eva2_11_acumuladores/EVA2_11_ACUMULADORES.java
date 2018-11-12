/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_acumuladores;

/**
 *
 * @author Peña Hernandez Leslie Johana 18550680
 */
public class EVA2_11_ACUMULADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //ACUMULADOR
       int suma = 0; //PUNTO DE PARTIDA
       System.out.println("VALOR DE SUMA: " + suma);
       suma = suma + 10; //0+10
        System.out.println("VALOR DE SUMA: " + suma);
        suma = suma + 10;
        System.out.println("VALOR DE SUMA: " + suma);
        
        suma += 10; // += OPERADOR DE INCREMENTO
        System.out.println("VALOR DE SUMA: " + suma);
        
        //MULTIPLICACION
        int multi =1;
        System.out.println("VALOR DE MULTI: " + multi);
        multi = multi * 5;
       System.out.println("VALOR DE MULTI: " + multi);
       multi *= 5;
       System.out.println("VALOR DE MULTI: " + multi);
       
       
       //RESTA
       int resta = 100;
       System.out.println("VALOR DE RESTA: " + resta);
       resta = resta - 5;
        System.out.println("VALOR DE RESTA " + resta);
        resta -= 5;
        System.out.println("VALOR DE RESTA " + resta);
        
        //CONTADORES
        //TIPO ESPECIAL DE ACUMULADOR
        int cont = 0;
        System.out.println("CUANTO TIENES = " + cont);
        cont = cont +1;
        System.out.println("CUANTO TIENES = " + cont);
         cont = cont +1;
        System.out.println("CUANTO TIENES = " + cont);
         cont = cont +1;
        System.out.println("CUANTO TIENES = " + cont);
        cont += 1; //INCREMENTE EN CUALQUIER VALOR , EN ESTE CASO EN 1
            System.out.println("CUANTO TIENES = " + cont);
        cont ++; //SOLAMENTE INCREMENTA EN 1
            System.out.println("CUANTO TIENES = " + cont);
            //TE CASTIGAN Y TE QUITAN 1 
            cont --;
                System.out.println("CUANTO TIENES = " + cont);
                
                String scade ="HOLA ";
                System.out.println(scade);
                scade = scade + "mundo";
                System.out.println(scade);
                
                
    }
    
}
