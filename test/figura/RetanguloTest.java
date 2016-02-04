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
        
        largura = -5;
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
        assertEquals("define altura falhou",altura,r1.obterAltura());
        
        altura = -5;
         r1.defineAltura(altura);
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
        Ponto2D c = r1.obterCanto();
        assertTrue("defineCanto falhou",canto.equals(c));
        
        Ponto2D canto2 = new Ponto2D(3,3);
          r1.defineCanto(canto2);
        Ponto2D c2 = r1.obterCanto();
        assertTrue("defineCanto falhou",canto2.equals(c2));    
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
    }

    /**
     * Test of obterCanto method, of class Retangulo.
     */
    @Test
    public void testObterCanto() {
        System.out.println("obterCanto");
        Ponto2D canto = new Ponto2D(2,2);
        Retangulo r1= new Retangulo();
        int esperado = 1;
        int resultado = 1;
        
        assertEquals("Falhou",esperado,resultado);
    }

    /**
     * Test of obterArea method, of class Retangulo.
     */
    @Test
    public void testObterArea() {
        System.out.println("obterArea");
        Retangulo p = new Retangulo();
        double esperado = 1.0;
        double result = p.obterArea();
        assertEquals("Falhou ",esperado, result, 0.01);
    
        
    }

    /**
     * Test of obterPerimetro method, of class Retangulo.
     */
    @Test
    public void testObterPerimetro() {
        System.out.println("obterPerimetro");
        Retangulo p = new Retangulo();
        double  esperado = 4.0;
        double result = p.obterPerimetro();
        assertEquals("falhou",esperado, result, 0.01);
       
        
    }

    /**
     * Test of toString method, of class Retangulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Retangulo r1 = new Retangulo();
        String esperado = r1.toString();
        String resultado = r1.toString();
        assertEquals("Falhou toString", esperado, resultado);
        
        
    }

    /**
     * Test of estaDentro method, of class Retangulo.
     */
    @Test
    public void testEstaDentro() {
        System.out.println("estaDentro");
        Ponto2D p1 = new Ponto2D();
        Retangulo r1 = new Retangulo();
        boolean esperado = false;
        boolean resultado = r1.estaDentro(p1);
        assertEquals("Falhou EstaDentro", esperado, resultado);
    }
    
}
