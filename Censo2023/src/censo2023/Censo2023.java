/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo2023;

import Negocio.Catastro;
import Negocio.Censo;

/**
 *
 * @author Douglas
 */
public class Censo2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Catastro A = new Catastro(3);
       //A.Insertar("Douglas", 127, 0, 12, 5, 2, 0, 1, 0, 1);
       //A.Insertar("Eliana", 25, 0, 12, 5, 2, 0, 1, 0, 1);
       //A.Insertar("Eliana", 25, 0, 12, 5, 2, 0, 1, 0, 1);
       //A.Insertar("Douglas", 20, 25, 11, 120, 1, 0, 0, 0, 0, 0);
       //A.Insertar("Eliana", 31, 31, 31, 163, 1, 0, 1, 0, 1, 0);
       System.out.println(A.Mostrar(1));
    }
    
}
