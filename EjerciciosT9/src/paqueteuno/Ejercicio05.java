/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", 
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        String inicialnombre;
        boolean bandera = true;
        while(bandera){
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            inicial = inicial.toUpperCase();
            /* Se almacena en la variable inicialArreglo las primeras 
                letras del arreglo estudiantes
                 */
            for (int indice = 0; indice < estudiantes.length; indice++) {
           
             
                inicialnombre = estudiantes[indice].substring(0, 1);
                /* 
                Comparamos con una condicion if si la inicial que ingreso 
                el usuario es la misma que la iniciales de arreglo de estudiantes
                y de lo contrario la bandera sera igual a false
                 */
                if (inicial.equals(inicialnombre)) {
                    bandera = false;
                    
        }
        
        
    }

}
   }
}
