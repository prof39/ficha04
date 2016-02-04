/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a13063
 */
public class Linha2DTest {
    
    public Linha2DTest() {
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
    
    /*
    (1,1) → (4,1) (horizontal)
    (1,0) → (6,0) (horizontal)
    (2,1) → (2,4) (vertical)
    (7,1) → (7,4) (vertical)    
    (4,3) → (6,1)
    (1,2) → (4,3)
    (1,1) → (4,1) (horizontal)
    (2,1) → (2,4) (vertical)
    (5,1) → (8,4)
    (5,3) → (8,0)
    Testar linhas perpendiculares:
    (1,1) → (4,1) (horizontal)
    (1,0) → (6,0) (horizontal)
    (1,1) → (4,1) (horizontal)
    (2,1) → (2,4) (vertical)
    (5,1) → (8,4)
    (5,3) → (8,0)
    (4,3) → (6,1)
    (1,2) → (4,3)
    Testar o pertence:
    (4,3) → (6,1), ponto (5,2)
    (1,2) → (4,3), ponto (5,2)
    
    m=y1-y2/x1-x2.
    
    */

    
    /**
     * Test of obterDeclive method, of class Linha2D.
     */
    @Test
    public void testObterDeclive() {
        double m;
        System.out.println("obterDeclive");
        //(1,1) → (4,1) (horizontal)
        Linha2D l1 = new Linha2D(1,1,4,1);
        double dec = l1.obterDeclive();
        //m = (1-1)/(1-4); 
        m = 0;
        assertEquals("Declive True!",m,dec,0.01);
        
        //(1,0) → (6,0) (horizontal)
        Linha2D l2 = new Linha2D(1,0,6,0);
        dec = l2.obterDeclive();
        //m = (0-0)/(1-6); 
        m = 0;
        assertEquals("Declive True!",m,dec,0.01);
        
        //(1,2) → (4,3)
        Linha2D l4 = new Linha2D(1,2,4,3);
        dec = l4.obterDeclive();
        //m = (2-3)/(1-4); 
        m = 0.33;
        assertEquals("Declive True!",m,dec,0.01);
        
        //(1,1) → (4,1) (horizontal)
        Linha2D l5 = new Linha2D(1,1,4,1);
        dec = l5.obterDeclive();
        //m = (1-1)/(1-4); 
        m = 0;
        assertEquals("Declive True!",m,dec,0.01);
        
        //(5,1) → (8,4)
        Linha2D l6 = new Linha2D(5,1,8,4);
        dec = l6.obterDeclive();
        //m = (1-4)/(5-8); 
        m = 1;
        assertEquals("Declive True!",m,dec,0.01);
        
    }

    /**
     * Test of eVertical method, of class Linha2D.
     */
    @Test
    public void testEVertical() {
        System.out.println("eVertical");
        //(2,1) → (2,4) (vertical)
        Linha2D l1 = new Linha2D(2,1,2,4);
        boolean obtido = l1.eVertical();
        assertTrue("True!!",obtido);
        
        //(1,1) → (4,1) (horizontal)
        Linha2D l2 = new Linha2D(1,1,4,1);
        obtido = l2.eVertical();
        assertFalse("False!",obtido);
        
        //(1,2) → (4,3)
        Linha2D l3 = new Linha2D(1,2,4,3);
        obtido = l3.eVertical();
        assertFalse("False!",obtido);
    }

    /**
     * Test of pertence method, of class Linha2D.
     */
    @Test
    public void testPertence() {
        System.out.println("pertence");
        //(4,3) → (6,1), ponto (5,2)
        Linha2D l1 = new Linha2D(4,3,6,1);
        Ponto2D p1 = new Ponto2D(5,2);
        boolean pertence = l1.pertence(p1);
        assertTrue("True!",pertence);
        
        //(1,2) → (4,3), ponto (5,2)
        Linha2D l2 = new Linha2D(1,2,4,3);
        Ponto2D p2 = new Ponto2D(5,2);
        pertence = l2.pertence(p2);
        assertFalse("False!",pertence);
        
    }

    /**
     * Test of paralela method, of class Linha2D.
     */
    @Test
    public void testParalela() {
        System.out.println("paralela");
        //(1,1) → (4,1) (horizontal)
        Linha2D l1 = new Linha2D(1,1,4,1);
        boolean paralela = l1.paralela(l1);
        assertTrue("True!!",paralela);
    }

    /**
     * Test of perpendicular method, of class Linha2D.
     */
    @Test
    public void testPerpendicular() {
        System.out.println("perpendicular");
        
    }

    /**
     * Test of equal method, of class Linha2D.
     */
    @Test
    public void testEqual() {
        System.out.println("equal");
        Linha2D l = null;
        Linha2D instance = null;
        boolean expResult = false;
        boolean result = instance.equal(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
