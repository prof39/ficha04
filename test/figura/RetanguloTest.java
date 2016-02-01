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
 * @author a12983
 */
public class RetanguloTest {
    
    public RetanguloTest() {
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
     * Test of defineLargura method, of class Retangulo.
     */
    @Test
    public void testDefineLargura() {
        System.out.println("defineLargura");
        int largura = 0;
        Retangulo r1 = new Retangulo();
        r1.defineLargura(largura);
        assertEquals("defineLargura falhou", largura, r1.obterLargura());
    }

    /**
     * Test of defineAltura method, of class Retangulo.
     */
    @Test
    public void testDefineAltura() {
        System.out.println("defineAltura");
        int altura = 0;
        Retangulo r1 = new Retangulo();
        r1.defineAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
       assertEquals("define altura falhou",altura,r1.obterAltura());
    }

    /**
     * Test of defineCanto method, of class Retangulo.
     */
    @Test
    public void testDefineCanto() {
        System.out.println("defineCanto");
        Ponto2D canto = new Ponto2D(2,2);
        Retangulo r1 = new Retangulo();
        r1.defineCanto(canto);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("defineCanto falhou",canto,r1.obterCanto());
    }

    /**
     * Test of obterLargura method, of class Retangulo.
     */
    @Test
    public void testObterLargura() {
        System.out.println("obterLargura");
        Retangulo r1 = new Retangulo();
        int esperado = 1;
        int obtido = r1.obterLargura();
        assertEquals("Falhou",esperado,obtido);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of obterAltura method, of class Retangulo.
     */
    @Test
    public void testObterAltura() {
        System.out.println("obterAltura");
        Retangulo r1= new Retangulo();
        int esperado = 1;
        int resultado =r1.obterAltura();
        assertEquals("Falhou",esperado, resultado);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of obterCanto method, of class Retangulo.
     */
    @Test
    public void testObterCanto() {
        System.out.println("obterCanto");
        Retangulo instance = new Retangulo();
        Ponto2D expResult = null;
        Ponto2D result = instance.obterCanto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterArea method, of class Retangulo.
     */
    @Test
    public void testObterArea() {
        System.out.println("obterArea");
        Retangulo instance = new Retangulo();
        double expResult = 0.0;
        double result = instance.obterArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterPerimetro method, of class Retangulo.
     */
    @Test
    public void testObterPerimetro() {
        System.out.println("obterPerimetro");
        Retangulo instance = new Retangulo();
        double expResult = 0.0;
        double result = instance.obterPerimetro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Retangulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Retangulo instance = new Retangulo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaDentro method, of class Retangulo.
     */
    @Test
    public void testEstaDentro() {
        System.out.println("estaDentro");
        Ponto2D p = null;
        Retangulo instance = new Retangulo();
        boolean expResult = false;
        boolean result = instance.estaDentro(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
