/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha04;

import primitivas.Linha2D;
import primitivas.Ponto2D;

/**
 *
 * @author administrador
 */
public class Ficha04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ponto2D p1 = new Ponto2D(4,3);
        Ponto2D p2 = new Ponto2D(6,1);
        Linha2D l = new Linha2D(p1,p2);
        Ponto2D p3 = new Ponto2D(5,2);
        System.out.println(l.pertence(p3));
    }
    
}
