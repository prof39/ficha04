/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha04;

import primitivas.Ponto3D;

/**
 *
 * @author administrador
 */
public class Ficha04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ponto3D p1 = new Ponto3D(4,3,2);
        Ponto3D p2 = new Ponto3D(6,1,3);
         
        p2.distancia(p1);
        p2.equals(p1);
    }
    
}
