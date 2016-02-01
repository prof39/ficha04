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

    /**
     * Test of obterDeclive method, of class Linha2D.
     */
    @Test
    public void testObterDeclive() {
        System.out.println("obterDeclive");
        Linha2D l1 = new Linha2D(1,4,1,1);
        double dec = l1.obterDeclive();
        assertFalse("falhou linha",dec);
        
        
    }

    /**
     * Test of eVertical method, of class Linha2D.
     */
    @Test
    public void testEVertical() {
        System.out.println("eVertical");
        Linha2D instance = null;
        boolean expResult = false;
        boolean result = instance.eVertical();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pertence method, of class Linha2D.
     */
    @Test
    public void testPertence() {
        System.out.println("pertence");
        Ponto2D p = null;
        Linha2D instance = null;
        boolean expResult = false;
        boolean result = instance.pertence(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paralela method, of class Linha2D.
     */
    @Test
    public void testParalela() {
        System.out.println("paralela");
        Linha2D l = null;
        Linha2D instance = null;
        boolean expResult = false;
        boolean result = instance.paralela(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of perpendicular method, of class Linha2D.
     */
    @Test
    public void testPerpendicular() {
        System.out.println("perpendicular");
        Linha2D l = null;
        Linha2D instance = null;
        boolean expResult = false;
        boolean result = instance.perpendicular(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

    private void assertTrue(String falhou_numerador, double dec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertFalse(String falhou_numerador, double dec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
