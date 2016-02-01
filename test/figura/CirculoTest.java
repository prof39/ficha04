/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import primitivas.Ponto2D;

/**
 *
 * @author a12679
 */
public class CirculoTest {
    
    public CirculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of defineCentro method, of class Circulo.
     */
    @Test
    public void testDefineCentro() {
        System.out.println("defineCentro");
        Ponto2D centro = null;
        Circulo instance = new Circulo();
        instance.defineCentro(centro);
    }

    /**
     * Test of defineRaio method, of class Circulo.
     */
    @Test
    public void testDefineRaio() {
        System.out.println("defineRaio");
        int raio = 0;
        Circulo instante = new Circulo();
        instante.defineRaio(raio);
        
    }

    /**
     * Test of obterCentro method, of class Circulo.
     */
    @Test
    public void testObterCentro() {
        System.out.println("obterCentro");
        Circulo instance = new Circulo();
        Ponto2D expResult = null;
        Ponto2D result = instance.obterCentro();
        assertEquals(expResult, result);
    }

    /**
     * Test of obterRaio method, of class Circulo.
     */
    @Test
    public void testObterRaio() {
        System.out.println("obterRaio");
        Circulo instance = new Circulo();
        int expResult = 0;
        int result = instance.obterRaio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterArea method, of class Circulo.
     */
    @Test
    public void testObterArea() {
        System.out.println("obterArea");
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.obterArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterPerimetro method, of class Circulo.
     */
    @Test
    public void testObterPerimetro() {
        System.out.println("obterPerimetro");
        Circulo instance = new Circulo();
        double expResult = 0.0;
        double result = instance.obterPerimetro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Circulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Circulo instance = new Circulo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaDentro method, of class Circulo.
     */
    @Test
    public void testEstaDentro() {
        System.out.println("estaDentro");
        Ponto2D p = null;
        Circulo instance = new Circulo();
        boolean expResult = false;
        boolean result = instance.estaDentro(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
